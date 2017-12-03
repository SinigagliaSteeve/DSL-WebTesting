/*
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.imta.renaud.ssinigaglia.webDsl.Program
import fr.imta.renaud.ssinigaglia.webDsl.Action
import fr.imta.renaud.ssinigaglia.webDsl.GoAction
import org.eclipse.emf.common.util.EList
import fr.imta.renaud.ssinigaglia.webDsl.Selection
import fr.imta.renaud.ssinigaglia.webDsl.CallProcedure
import fr.imta.renaud.ssinigaglia.webDsl.LinkButtonSelection
import fr.imta.renaud.ssinigaglia.webDsl.PageSelection
import fr.imta.renaud.ssinigaglia.webDsl.ComboboxSelection
import fr.imta.renaud.ssinigaglia.webDsl.CheckboxSelection
import fr.imta.renaud.ssinigaglia.webDsl.GeneralSelection
import fr.imta.renaud.ssinigaglia.webDsl.SetAction
import fr.imta.renaud.ssinigaglia.webDsl.StoreAction
import fr.imta.renaud.ssinigaglia.webDsl.Core
import fr.imta.renaud.ssinigaglia.webDsl.Attribute
import java.util.HashMap
import fr.imta.renaud.ssinigaglia.webDsl.AssertContains
import fr.imta.renaud.ssinigaglia.webDsl.AssertEquals

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class WebDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		fsa.generateFile('SeleniumTest.java', 
			resource.contents.filter(Program).head.generateProgram
		)
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))


	}
	
	def generateProgram(Program m) '''
	
		public class SeleniumTest {
			
			private static ChromeDriverService service;
			    private WebDriver driver;
			
			    @BeforeClass
			    public static void createAndStartService() throws IOException {
			        String exePath = "C:\\Users\\Steeve\\Work\\EMN\\FIL_2018\\DSL\\chromedriver.exe";
			
			        service = new ChromeDriverService.Builder()
			                .usingDriverExecutable(new File(exePath))
			                .usingAnyFreePort()
			                .build();
			        service.start();
			    }
			
			    @AfterClass
			    public static void createAndStopService() {
			        service.stop();
			    }
			
			    @Before
			    public void createDriver() {
			        driver = new RemoteWebDriver(service.getUrl(),
			                DesiredCapabilities.�m.cores.get(0).browser�()); // TODO Attention, faudrait voir comment g�rer cet appel si on veut g�n�rer plusieurs tests
			    }
			
			    @After
			    public void quitDriver() {
			        driver.quit();
			    }
			    
			private void scrollTo(int y) {
			        y = y - 100;
			        StringBuilder stringBuilder = new StringBuilder("window.scrollTo(0,");
			        stringBuilder.append(y)
			                .append(")");
			
			        JavascriptExecutor jse = (JavascriptExecutor) driver;
			        jse.executeScript(stringBuilder.toString());
			    }
			
			private WebElement findVisibleOne(By by) {
			    List<WebElement> elements = driver.findElements(by);
			    for (WebElement element : elements) {
			        if (element.isDisplayed()) {
			            return element;
			        }
			    }
			    return null;
			 }
			
			�FOR proc : m.procedures�
				
			�ENDFOR�
			
			�FOR core : m.cores�
				�core.generateTest(m.cores.indexOf(core))�
			�ENDFOR�
		}
	
	'''	
	
	def generateTest(Core core, int i) '''
		@Test
		public void �core.name�() {
			�FOR action : core.actions�
				�action.createAction(core.actions.indexOf(action))�
			�ENDFOR�
		}
	'''
	
	dispatch def createAction(GoAction action, int i) '''
		driver.get("�action.url�");
	'''

	dispatch def createAction(LinkButtonSelection action, int i) '''
		�val selection = action.typeSelection�
		�val htmlElem = getTypeHtmlElement(action.typeElement)�
		�var attType = ""�
		�var attValue = ""�
		�IF selection.attribute !== null�
			//�attType = getTypeAttribute(selection.attribute)�
			//�attValue = if (selection.value !== null) selection.value else selection.^var.name�
		�ELSE�
			//Faire quelque chose si c'est PARENT/FIRST/...
		�ENDIF�
		�val xpathval = if(attType !== "text") "@"+attType else attType+"()" �
		WebElement �htmlElem��i� = findVisibleOne(By.xpath("//�htmlElem�[�xpathval�='�attValue�']"));
		this.scrollTo(�htmlElem��i�.getLocation().y);
		�for (generalAction : action.generalActions) generalAction.createAction(i)�
		�FOR click : action.clicks�
			�htmlElem��i�.click();
		�ENDFOR�
	'''
	
	dispatch def createAction(GeneralSelection action, int i) '''
	'''
	
	dispatch def createAction(CheckboxSelection action, int i) '''
	'''
	
	dispatch def createAction(ComboboxSelection action, int i) '''
	'''
	
	dispatch def createAction(PageSelection action, int i) '''
		�FOR sa : action.storeActions�
			�sa.createAction(i)�
		�ENDFOR�
		�FOR a : action.assertions�
			�a.createAssert()�
		�ENDFOR�
	'''
	
	dispatch def createAssert(AssertContains assert)'''
		�val attValue = assert.value�
		�IF assert.attribute !== null�
			�val htmlElem = getTypeHtmlElement(assert.htmlElement.getName())�
			�val attType = getTypeAttribute(assert.attribute)�
			�val xpathval = if(attType !== "text") "@"+attType else attType+"()" �
			Assert.assertNotNull(findVisibleOne(By.xpath("//�htmlElem�[�xpathval�='�attValue�']")));
		�ELSE�
			Assert.assertNotNull(findVisibleOne(By.xpath("//*[contains(text(), '�attValue�')]"));
		�ENDIF�
	'''
	
	dispatch def createAssert(AssertEquals assert)'''
		
	'''
	
	dispatch def createAction(SetAction action, int i) '''
	'''
	
	dispatch def createAction(StoreAction action, int i) '''
	'''
	
	dispatch def createAction(CallProcedure action, int i) '''
	'''
	
	def getTypeAttribute(Attribute att) {
		switch att.getName {
			case "ID" : return "id"
			case "LABEL" : return "text"
			case "CLASS" : return "class"
			case "ALT" : return "alt"
			case "VALUE" : return "value"
			case "HREF" : return "href"
			case "TITLE" : return "title"
		}
	}
	
	def getTypeHtmlElement(String elem) {
		switch elem {
			case "DIV" : return "div"
			case "LINK" : return "a"
			case "BUTTON" : return "button"
			case "SEARCH_FIELD" : return "input"
			case "CHECKBOX" : return "input"
			case "COMBO_BOX" : return "select"
			case "PAGE" : return "body"
			case "IMAGE" : return "img"
		}
	}
	
	
	
	//override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
	//	fsa.generateFile('Main.java',
	//		resource.contents.filter(Calendar).head.generateCalendar
	//	)

	//}
	
	//def generateCalendar(Calendar c) '''
	//	public class Main {
	//		public static void main(String[] args) {
	//		Calendar calendar = new Calendar();
//
//			�FOR e : c.events�
//				�e.generateEvent(c.events.indexOf(e))�
//			�ENDFOR� 
//
//				System.out.println(calendar.toString());
//			}
//		}
//	'''
//	
//	
//	def generateEvent(Event e, int i) '''
//		Event event�i� = new Event();
//		event�i�.setName("�e.name�");
//		event�i�.setDate(�e.on�);
//		event�i�.setStartTime("�e.from�");
//		event�i�.setEndTime("�e.to�");
//		event�i�.setLocation("�e.at�");
//		
//	
//	'''
	
	
}
