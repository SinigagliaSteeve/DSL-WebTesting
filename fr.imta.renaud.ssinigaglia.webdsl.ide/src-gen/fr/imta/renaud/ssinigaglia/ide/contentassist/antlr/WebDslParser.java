/*
 * generated by Xtext 2.12.0
 */
package fr.imta.renaud.ssinigaglia.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.imta.renaud.ssinigaglia.ide.contentassist.antlr.internal.InternalWebDslParser;
import fr.imta.renaud.ssinigaglia.services.WebDslGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class WebDslParser extends AbstractContentAssistParser {

	@Inject
	private WebDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalWebDslParser createParser() {
		InternalWebDslParser result = new InternalWebDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
					put(grammarAccess.getSelectionAccess().getAlternatives(), "rule__Selection__Alternatives");
					put(grammarAccess.getLinkButtonSelectionAccess().getTypeElementAlternatives_0_0(), "rule__LinkButtonSelection__TypeElementAlternatives_0_0");
					put(grammarAccess.getLinkButtonSelectionAccess().getAlternatives_3(), "rule__LinkButtonSelection__Alternatives_3");
					put(grammarAccess.getGeneralSelectionAccess().getTypeElementAlternatives_0_0(), "rule__GeneralSelection__TypeElementAlternatives_0_0");
					put(grammarAccess.getCheckboxSelectionAccess().getActionAlternatives_3_0(), "rule__CheckboxSelection__ActionAlternatives_3_0");
					put(grammarAccess.getPageSelectionAccess().getAlternatives_2(), "rule__PageSelection__Alternatives_2");
					put(grammarAccess.getGeneralActionAccess().getAlternatives(), "rule__GeneralAction__Alternatives");
					put(grammarAccess.getStoreActionAccess().getAlternatives_2(), "rule__StoreAction__Alternatives_2");
					put(grammarAccess.getSetActionAccess().getAlternatives_3(), "rule__SetAction__Alternatives_3");
					put(grammarAccess.getTypeSelectionAccess().getAlternatives(), "rule__TypeSelection__Alternatives");
					put(grammarAccess.getTypeSelectionAccess().getAlternatives_0_2(), "rule__TypeSelection__Alternatives_0_2");
					put(grammarAccess.getAssertAccess().getAlternatives_1(), "rule__Assert__Alternatives_1");
					put(grammarAccess.getAssertContainsAccess().getAlternatives_1(), "rule__AssertContains__Alternatives_1");
					put(grammarAccess.getAssertContainsAccess().getAlternatives_3(), "rule__AssertContains__Alternatives_3");
					put(grammarAccess.getComparableAccess().getAlternatives(), "rule__Comparable__Alternatives");
					put(grammarAccess.getBrowserAccess().getAlternatives(), "rule__Browser__Alternatives");
					put(grammarAccess.getHtmlElementAccess().getAlternatives(), "rule__HtmlElement__Alternatives");
					put(grammarAccess.getAttributeAccess().getAlternatives(), "rule__Attribute__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getCoreAccess().getGroup(), "rule__Core__Group__0");
					put(grammarAccess.getProcedureAccess().getGroup(), "rule__Procedure__Group__0");
					put(grammarAccess.getCallProcedureAccess().getGroup(), "rule__CallProcedure__Group__0");
					put(grammarAccess.getGoActionAccess().getGroup(), "rule__GoAction__Group__0");
					put(grammarAccess.getLinkButtonSelectionAccess().getGroup(), "rule__LinkButtonSelection__Group__0");
					put(grammarAccess.getGeneralSelectionAccess().getGroup(), "rule__GeneralSelection__Group__0");
					put(grammarAccess.getCheckboxSelectionAccess().getGroup(), "rule__CheckboxSelection__Group__0");
					put(grammarAccess.getComboboxSelectionAccess().getGroup(), "rule__ComboboxSelection__Group__0");
					put(grammarAccess.getComboboxSelectionAccess().getGroup_3(), "rule__ComboboxSelection__Group_3__0");
					put(grammarAccess.getPageSelectionAccess().getGroup(), "rule__PageSelection__Group__0");
					put(grammarAccess.getStoreActionAccess().getGroup(), "rule__StoreAction__Group__0");
					put(grammarAccess.getCountActionAccess().getGroup(), "rule__CountAction__Group__0");
					put(grammarAccess.getSetActionAccess().getGroup(), "rule__SetAction__Group__0");
					put(grammarAccess.getTypeSelectionAccess().getGroup_0(), "rule__TypeSelection__Group_0__0");
					put(grammarAccess.getAssertAccess().getGroup(), "rule__Assert__Group__0");
					put(grammarAccess.getAssertContainsAccess().getGroup(), "rule__AssertContains__Group__0");
					put(grammarAccess.getAssertContainsAccess().getGroup_1_0(), "rule__AssertContains__Group_1_0__0");
					put(grammarAccess.getAssertEqualsAccess().getGroup(), "rule__AssertEquals__Group__0");
					put(grammarAccess.getComparableAccess().getGroup_0(), "rule__Comparable__Group_0__0");
					put(grammarAccess.getComparableAccess().getGroup_1(), "rule__Comparable__Group_1__0");
					put(grammarAccess.getProgramAccess().getProceduresAssignment_0(), "rule__Program__ProceduresAssignment_0");
					put(grammarAccess.getProgramAccess().getCoresAssignment_1(), "rule__Program__CoresAssignment_1");
					put(grammarAccess.getCoreAccess().getNameAssignment_1(), "rule__Core__NameAssignment_1");
					put(grammarAccess.getCoreAccess().getBrowserAssignment_4(), "rule__Core__BrowserAssignment_4");
					put(grammarAccess.getCoreAccess().getActionsAssignment_5(), "rule__Core__ActionsAssignment_5");
					put(grammarAccess.getProcedureAccess().getNameAssignment_1(), "rule__Procedure__NameAssignment_1");
					put(grammarAccess.getProcedureAccess().getVarAssignment_3(), "rule__Procedure__VarAssignment_3");
					put(grammarAccess.getProcedureAccess().getActionsAssignment_5(), "rule__Procedure__ActionsAssignment_5");
					put(grammarAccess.getCallProcedureAccess().getRefAssignment_1(), "rule__CallProcedure__RefAssignment_1");
					put(grammarAccess.getCallProcedureAccess().getArgAssignment_3(), "rule__CallProcedure__ArgAssignment_3");
					put(grammarAccess.getGoActionAccess().getUrlAssignment_1(), "rule__GoAction__UrlAssignment_1");
					put(grammarAccess.getLinkButtonSelectionAccess().getTypeElementAssignment_0(), "rule__LinkButtonSelection__TypeElementAssignment_0");
					put(grammarAccess.getLinkButtonSelectionAccess().getTypeSelectionAssignment_1(), "rule__LinkButtonSelection__TypeSelectionAssignment_1");
					put(grammarAccess.getLinkButtonSelectionAccess().getGeneralActionsAssignment_3_0(), "rule__LinkButtonSelection__GeneralActionsAssignment_3_0");
					put(grammarAccess.getLinkButtonSelectionAccess().getClicksAssignment_3_1(), "rule__LinkButtonSelection__ClicksAssignment_3_1");
					put(grammarAccess.getGeneralSelectionAccess().getTypeElementAssignment_0(), "rule__GeneralSelection__TypeElementAssignment_0");
					put(grammarAccess.getGeneralSelectionAccess().getTypeSelectionAssignment_1(), "rule__GeneralSelection__TypeSelectionAssignment_1");
					put(grammarAccess.getGeneralSelectionAccess().getGeneralActionsAssignment_3(), "rule__GeneralSelection__GeneralActionsAssignment_3");
					put(grammarAccess.getCheckboxSelectionAccess().getTypeElementAssignment_0(), "rule__CheckboxSelection__TypeElementAssignment_0");
					put(grammarAccess.getCheckboxSelectionAccess().getTypeSelectionAssignment_1(), "rule__CheckboxSelection__TypeSelectionAssignment_1");
					put(grammarAccess.getCheckboxSelectionAccess().getActionAssignment_3(), "rule__CheckboxSelection__ActionAssignment_3");
					put(grammarAccess.getComboboxSelectionAccess().getTypeElementAssignment_0(), "rule__ComboboxSelection__TypeElementAssignment_0");
					put(grammarAccess.getComboboxSelectionAccess().getTypeSelectionAssignment_1(), "rule__ComboboxSelection__TypeSelectionAssignment_1");
					put(grammarAccess.getComboboxSelectionAccess().getValuesAssignment_3_1(), "rule__ComboboxSelection__ValuesAssignment_3_1");
					put(grammarAccess.getPageSelectionAccess().getTypeElementAssignment_0(), "rule__PageSelection__TypeElementAssignment_0");
					put(grammarAccess.getPageSelectionAccess().getStoreActionsAssignment_2_0(), "rule__PageSelection__StoreActionsAssignment_2_0");
					put(grammarAccess.getPageSelectionAccess().getAssertionsAssignment_2_1(), "rule__PageSelection__AssertionsAssignment_2_1");
					put(grammarAccess.getStoreActionAccess().getValAssignment_2_0(), "rule__StoreAction__ValAssignment_2_0");
					put(grammarAccess.getStoreActionAccess().getCountAssignment_2_1(), "rule__StoreAction__CountAssignment_2_1");
					put(grammarAccess.getStoreActionAccess().getVarAssignment_5(), "rule__StoreAction__VarAssignment_5");
					put(grammarAccess.getCountActionAccess().getHtmlElementAssignment_1(), "rule__CountAction__HtmlElementAssignment_1");
					put(grammarAccess.getCountActionAccess().getTypeSelectionAssignment_2(), "rule__CountAction__TypeSelectionAssignment_2");
					put(grammarAccess.getVarAccess().getNameAssignment(), "rule__Var__NameAssignment");
					put(grammarAccess.getSetActionAccess().getAttributeAssignment_1(), "rule__SetAction__AttributeAssignment_1");
					put(grammarAccess.getSetActionAccess().getValueAssignment_3_0(), "rule__SetAction__ValueAssignment_3_0");
					put(grammarAccess.getSetActionAccess().getVarAssignment_3_1(), "rule__SetAction__VarAssignment_3_1");
					put(grammarAccess.getTypeSelectionAccess().getAttributeAssignment_0_0(), "rule__TypeSelection__AttributeAssignment_0_0");
					put(grammarAccess.getTypeSelectionAccess().getValueAssignment_0_2_0(), "rule__TypeSelection__ValueAssignment_0_2_0");
					put(grammarAccess.getTypeSelectionAccess().getVarAssignment_0_2_1(), "rule__TypeSelection__VarAssignment_0_2_1");
					put(grammarAccess.getAssertContainsAccess().getHtmlElementAssignment_1_0_0(), "rule__AssertContains__HtmlElementAssignment_1_0_0");
					put(grammarAccess.getAssertContainsAccess().getAttributeAssignment_1_0_1(), "rule__AssertContains__AttributeAssignment_1_0_1");
					put(grammarAccess.getAssertContainsAccess().getTextAssignment_1_1(), "rule__AssertContains__TextAssignment_1_1");
					put(grammarAccess.getAssertContainsAccess().getValueAssignment_3_0(), "rule__AssertContains__ValueAssignment_3_0");
					put(grammarAccess.getAssertContainsAccess().getVarAssignment_3_1(), "rule__AssertContains__VarAssignment_3_1");
					put(grammarAccess.getAssertEqualsAccess().getC1Assignment_0(), "rule__AssertEquals__C1Assignment_0");
					put(grammarAccess.getAssertEqualsAccess().getC2Assignment_2(), "rule__AssertEquals__C2Assignment_2");
					put(grammarAccess.getComparableAccess().getVarAssignment_0_1(), "rule__Comparable__VarAssignment_0_1");
					put(grammarAccess.getComparableAccess().getHtmlElementAssignment_1_1(), "rule__Comparable__HtmlElementAssignment_1_1");
					put(grammarAccess.getComparableAccess().getAttributeAssignment_1_2(), "rule__Comparable__AttributeAssignment_1_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public WebDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WebDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
