package fr.imta.renaud.ssinigaglia.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.imta.renaud.ssinigaglia.services.WebDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWebDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LINK'", "'BUTTON'", "'click'", "'SEARCH_FIELD'", "'DIV'", "'A'", "'check'", "'uncheck'", "'PARENT'", "'FIRST'", "'LAST'", "'ALL'", "'TEXT'", "'chrome'", "'firefox'", "'safari'", "'edge'", "'ie'", "'CHECKBOX'", "'COMBO_BOX'", "'IMAGE'", "'LABEL'", "'ID'", "'CLASS'", "'ALT'", "'VALUE'", "'HREF'", "'TITLE'", "'open_browser'", "'go'", "'{'", "'}'", "'select'", "'PAGE'", "'store'", "'()'", "'in'", "'set'", "':'", "'verify'", "'contains'", "'equals'", "'VAR:'", "'('", "')'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalWebDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWebDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWebDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWebDsl.g"; }


    	private WebDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(WebDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalWebDsl.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalWebDsl.g:54:1: ( ruleProgram EOF )
            // InternalWebDsl.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalWebDsl.g:62:1: ruleProgram : ( ( rule__Program__CoreAssignment ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:66:2: ( ( ( rule__Program__CoreAssignment ) ) )
            // InternalWebDsl.g:67:2: ( ( rule__Program__CoreAssignment ) )
            {
            // InternalWebDsl.g:67:2: ( ( rule__Program__CoreAssignment ) )
            // InternalWebDsl.g:68:3: ( rule__Program__CoreAssignment )
            {
             before(grammarAccess.getProgramAccess().getCoreAssignment()); 
            // InternalWebDsl.g:69:3: ( rule__Program__CoreAssignment )
            // InternalWebDsl.g:69:4: rule__Program__CoreAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Program__CoreAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getCoreAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleCore"
    // InternalWebDsl.g:78:1: entryRuleCore : ruleCore EOF ;
    public final void entryRuleCore() throws RecognitionException {
        try {
            // InternalWebDsl.g:79:1: ( ruleCore EOF )
            // InternalWebDsl.g:80:1: ruleCore EOF
            {
             before(grammarAccess.getCoreRule()); 
            pushFollow(FOLLOW_1);
            ruleCore();

            state._fsp--;

             after(grammarAccess.getCoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCore"


    // $ANTLR start "ruleCore"
    // InternalWebDsl.g:87:1: ruleCore : ( ( rule__Core__Group__0 ) ) ;
    public final void ruleCore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:91:2: ( ( ( rule__Core__Group__0 ) ) )
            // InternalWebDsl.g:92:2: ( ( rule__Core__Group__0 ) )
            {
            // InternalWebDsl.g:92:2: ( ( rule__Core__Group__0 ) )
            // InternalWebDsl.g:93:3: ( rule__Core__Group__0 )
            {
             before(grammarAccess.getCoreAccess().getGroup()); 
            // InternalWebDsl.g:94:3: ( rule__Core__Group__0 )
            // InternalWebDsl.g:94:4: rule__Core__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Core__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCore"


    // $ANTLR start "entryRuleAction"
    // InternalWebDsl.g:103:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalWebDsl.g:104:1: ( ruleAction EOF )
            // InternalWebDsl.g:105:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalWebDsl.g:112:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:116:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalWebDsl.g:117:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalWebDsl.g:117:2: ( ( rule__Action__Alternatives ) )
            // InternalWebDsl.g:118:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalWebDsl.g:119:3: ( rule__Action__Alternatives )
            // InternalWebDsl.g:119:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleGoAction"
    // InternalWebDsl.g:128:1: entryRuleGoAction : ruleGoAction EOF ;
    public final void entryRuleGoAction() throws RecognitionException {
        try {
            // InternalWebDsl.g:129:1: ( ruleGoAction EOF )
            // InternalWebDsl.g:130:1: ruleGoAction EOF
            {
             before(grammarAccess.getGoActionRule()); 
            pushFollow(FOLLOW_1);
            ruleGoAction();

            state._fsp--;

             after(grammarAccess.getGoActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoAction"


    // $ANTLR start "ruleGoAction"
    // InternalWebDsl.g:137:1: ruleGoAction : ( ( rule__GoAction__Group__0 ) ) ;
    public final void ruleGoAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:141:2: ( ( ( rule__GoAction__Group__0 ) ) )
            // InternalWebDsl.g:142:2: ( ( rule__GoAction__Group__0 ) )
            {
            // InternalWebDsl.g:142:2: ( ( rule__GoAction__Group__0 ) )
            // InternalWebDsl.g:143:3: ( rule__GoAction__Group__0 )
            {
             before(grammarAccess.getGoActionAccess().getGroup()); 
            // InternalWebDsl.g:144:3: ( rule__GoAction__Group__0 )
            // InternalWebDsl.g:144:4: rule__GoAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoAction"


    // $ANTLR start "entryRuleSelection"
    // InternalWebDsl.g:153:1: entryRuleSelection : ruleSelection EOF ;
    public final void entryRuleSelection() throws RecognitionException {
        try {
            // InternalWebDsl.g:154:1: ( ruleSelection EOF )
            // InternalWebDsl.g:155:1: ruleSelection EOF
            {
             before(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSelectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // InternalWebDsl.g:162:1: ruleSelection : ( ( rule__Selection__Alternatives ) ) ;
    public final void ruleSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:166:2: ( ( ( rule__Selection__Alternatives ) ) )
            // InternalWebDsl.g:167:2: ( ( rule__Selection__Alternatives ) )
            {
            // InternalWebDsl.g:167:2: ( ( rule__Selection__Alternatives ) )
            // InternalWebDsl.g:168:3: ( rule__Selection__Alternatives )
            {
             before(grammarAccess.getSelectionAccess().getAlternatives()); 
            // InternalWebDsl.g:169:3: ( rule__Selection__Alternatives )
            // InternalWebDsl.g:169:4: rule__Selection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleLinkButtonSelection"
    // InternalWebDsl.g:178:1: entryRuleLinkButtonSelection : ruleLinkButtonSelection EOF ;
    public final void entryRuleLinkButtonSelection() throws RecognitionException {
        try {
            // InternalWebDsl.g:179:1: ( ruleLinkButtonSelection EOF )
            // InternalWebDsl.g:180:1: ruleLinkButtonSelection EOF
            {
             before(grammarAccess.getLinkButtonSelectionRule()); 
            pushFollow(FOLLOW_1);
            ruleLinkButtonSelection();

            state._fsp--;

             after(grammarAccess.getLinkButtonSelectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinkButtonSelection"


    // $ANTLR start "ruleLinkButtonSelection"
    // InternalWebDsl.g:187:1: ruleLinkButtonSelection : ( ( rule__LinkButtonSelection__Group__0 ) ) ;
    public final void ruleLinkButtonSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:191:2: ( ( ( rule__LinkButtonSelection__Group__0 ) ) )
            // InternalWebDsl.g:192:2: ( ( rule__LinkButtonSelection__Group__0 ) )
            {
            // InternalWebDsl.g:192:2: ( ( rule__LinkButtonSelection__Group__0 ) )
            // InternalWebDsl.g:193:3: ( rule__LinkButtonSelection__Group__0 )
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getGroup()); 
            // InternalWebDsl.g:194:3: ( rule__LinkButtonSelection__Group__0 )
            // InternalWebDsl.g:194:4: rule__LinkButtonSelection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinkButtonSelection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkButtonSelectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkButtonSelection"


    // $ANTLR start "entryRuleGeneralSelection"
    // InternalWebDsl.g:203:1: entryRuleGeneralSelection : ruleGeneralSelection EOF ;
    public final void entryRuleGeneralSelection() throws RecognitionException {
        try {
            // InternalWebDsl.g:204:1: ( ruleGeneralSelection EOF )
            // InternalWebDsl.g:205:1: ruleGeneralSelection EOF
            {
             before(grammarAccess.getGeneralSelectionRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralSelection();

            state._fsp--;

             after(grammarAccess.getGeneralSelectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneralSelection"


    // $ANTLR start "ruleGeneralSelection"
    // InternalWebDsl.g:212:1: ruleGeneralSelection : ( ( rule__GeneralSelection__Group__0 ) ) ;
    public final void ruleGeneralSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:216:2: ( ( ( rule__GeneralSelection__Group__0 ) ) )
            // InternalWebDsl.g:217:2: ( ( rule__GeneralSelection__Group__0 ) )
            {
            // InternalWebDsl.g:217:2: ( ( rule__GeneralSelection__Group__0 ) )
            // InternalWebDsl.g:218:3: ( rule__GeneralSelection__Group__0 )
            {
             before(grammarAccess.getGeneralSelectionAccess().getGroup()); 
            // InternalWebDsl.g:219:3: ( rule__GeneralSelection__Group__0 )
            // InternalWebDsl.g:219:4: rule__GeneralSelection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralSelection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralSelectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralSelection"


    // $ANTLR start "entryRuleCheckboxSelection"
    // InternalWebDsl.g:228:1: entryRuleCheckboxSelection : ruleCheckboxSelection EOF ;
    public final void entryRuleCheckboxSelection() throws RecognitionException {
        try {
            // InternalWebDsl.g:229:1: ( ruleCheckboxSelection EOF )
            // InternalWebDsl.g:230:1: ruleCheckboxSelection EOF
            {
             before(grammarAccess.getCheckboxSelectionRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckboxSelection();

            state._fsp--;

             after(grammarAccess.getCheckboxSelectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckboxSelection"


    // $ANTLR start "ruleCheckboxSelection"
    // InternalWebDsl.g:237:1: ruleCheckboxSelection : ( ( rule__CheckboxSelection__Group__0 ) ) ;
    public final void ruleCheckboxSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:241:2: ( ( ( rule__CheckboxSelection__Group__0 ) ) )
            // InternalWebDsl.g:242:2: ( ( rule__CheckboxSelection__Group__0 ) )
            {
            // InternalWebDsl.g:242:2: ( ( rule__CheckboxSelection__Group__0 ) )
            // InternalWebDsl.g:243:3: ( rule__CheckboxSelection__Group__0 )
            {
             before(grammarAccess.getCheckboxSelectionAccess().getGroup()); 
            // InternalWebDsl.g:244:3: ( rule__CheckboxSelection__Group__0 )
            // InternalWebDsl.g:244:4: rule__CheckboxSelection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxSelection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxSelectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckboxSelection"


    // $ANTLR start "entryRuleComboboxSelection"
    // InternalWebDsl.g:253:1: entryRuleComboboxSelection : ruleComboboxSelection EOF ;
    public final void entryRuleComboboxSelection() throws RecognitionException {
        try {
            // InternalWebDsl.g:254:1: ( ruleComboboxSelection EOF )
            // InternalWebDsl.g:255:1: ruleComboboxSelection EOF
            {
             before(grammarAccess.getComboboxSelectionRule()); 
            pushFollow(FOLLOW_1);
            ruleComboboxSelection();

            state._fsp--;

             after(grammarAccess.getComboboxSelectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComboboxSelection"


    // $ANTLR start "ruleComboboxSelection"
    // InternalWebDsl.g:262:1: ruleComboboxSelection : ( ( rule__ComboboxSelection__Group__0 ) ) ;
    public final void ruleComboboxSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:266:2: ( ( ( rule__ComboboxSelection__Group__0 ) ) )
            // InternalWebDsl.g:267:2: ( ( rule__ComboboxSelection__Group__0 ) )
            {
            // InternalWebDsl.g:267:2: ( ( rule__ComboboxSelection__Group__0 ) )
            // InternalWebDsl.g:268:3: ( rule__ComboboxSelection__Group__0 )
            {
             before(grammarAccess.getComboboxSelectionAccess().getGroup()); 
            // InternalWebDsl.g:269:3: ( rule__ComboboxSelection__Group__0 )
            // InternalWebDsl.g:269:4: rule__ComboboxSelection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComboboxSelection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComboboxSelectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComboboxSelection"


    // $ANTLR start "entryRulePageSelection"
    // InternalWebDsl.g:278:1: entryRulePageSelection : rulePageSelection EOF ;
    public final void entryRulePageSelection() throws RecognitionException {
        try {
            // InternalWebDsl.g:279:1: ( rulePageSelection EOF )
            // InternalWebDsl.g:280:1: rulePageSelection EOF
            {
             before(grammarAccess.getPageSelectionRule()); 
            pushFollow(FOLLOW_1);
            rulePageSelection();

            state._fsp--;

             after(grammarAccess.getPageSelectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePageSelection"


    // $ANTLR start "rulePageSelection"
    // InternalWebDsl.g:287:1: rulePageSelection : ( ( rule__PageSelection__Group__0 ) ) ;
    public final void rulePageSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:291:2: ( ( ( rule__PageSelection__Group__0 ) ) )
            // InternalWebDsl.g:292:2: ( ( rule__PageSelection__Group__0 ) )
            {
            // InternalWebDsl.g:292:2: ( ( rule__PageSelection__Group__0 ) )
            // InternalWebDsl.g:293:3: ( rule__PageSelection__Group__0 )
            {
             before(grammarAccess.getPageSelectionAccess().getGroup()); 
            // InternalWebDsl.g:294:3: ( rule__PageSelection__Group__0 )
            // InternalWebDsl.g:294:4: rule__PageSelection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PageSelection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageSelectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageSelection"


    // $ANTLR start "entryRuleGeneralAction"
    // InternalWebDsl.g:303:1: entryRuleGeneralAction : ruleGeneralAction EOF ;
    public final void entryRuleGeneralAction() throws RecognitionException {
        try {
            // InternalWebDsl.g:304:1: ( ruleGeneralAction EOF )
            // InternalWebDsl.g:305:1: ruleGeneralAction EOF
            {
             before(grammarAccess.getGeneralActionRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralAction();

            state._fsp--;

             after(grammarAccess.getGeneralActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneralAction"


    // $ANTLR start "ruleGeneralAction"
    // InternalWebDsl.g:312:1: ruleGeneralAction : ( ( rule__GeneralAction__Alternatives ) ) ;
    public final void ruleGeneralAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:316:2: ( ( ( rule__GeneralAction__Alternatives ) ) )
            // InternalWebDsl.g:317:2: ( ( rule__GeneralAction__Alternatives ) )
            {
            // InternalWebDsl.g:317:2: ( ( rule__GeneralAction__Alternatives ) )
            // InternalWebDsl.g:318:3: ( rule__GeneralAction__Alternatives )
            {
             before(grammarAccess.getGeneralActionAccess().getAlternatives()); 
            // InternalWebDsl.g:319:3: ( rule__GeneralAction__Alternatives )
            // InternalWebDsl.g:319:4: rule__GeneralAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GeneralAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGeneralActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralAction"


    // $ANTLR start "entryRuleStoreAction"
    // InternalWebDsl.g:328:1: entryRuleStoreAction : ruleStoreAction EOF ;
    public final void entryRuleStoreAction() throws RecognitionException {
        try {
            // InternalWebDsl.g:329:1: ( ruleStoreAction EOF )
            // InternalWebDsl.g:330:1: ruleStoreAction EOF
            {
             before(grammarAccess.getStoreActionRule()); 
            pushFollow(FOLLOW_1);
            ruleStoreAction();

            state._fsp--;

             after(grammarAccess.getStoreActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStoreAction"


    // $ANTLR start "ruleStoreAction"
    // InternalWebDsl.g:337:1: ruleStoreAction : ( ( rule__StoreAction__Group__0 ) ) ;
    public final void ruleStoreAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:341:2: ( ( ( rule__StoreAction__Group__0 ) ) )
            // InternalWebDsl.g:342:2: ( ( rule__StoreAction__Group__0 ) )
            {
            // InternalWebDsl.g:342:2: ( ( rule__StoreAction__Group__0 ) )
            // InternalWebDsl.g:343:3: ( rule__StoreAction__Group__0 )
            {
             before(grammarAccess.getStoreActionAccess().getGroup()); 
            // InternalWebDsl.g:344:3: ( rule__StoreAction__Group__0 )
            // InternalWebDsl.g:344:4: rule__StoreAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StoreAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoreActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStoreAction"


    // $ANTLR start "entryRuleVar"
    // InternalWebDsl.g:353:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalWebDsl.g:354:1: ( ruleVar EOF )
            // InternalWebDsl.g:355:1: ruleVar EOF
            {
             before(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalWebDsl.g:362:1: ruleVar : ( ( rule__Var__NameAssignment ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:366:2: ( ( ( rule__Var__NameAssignment ) ) )
            // InternalWebDsl.g:367:2: ( ( rule__Var__NameAssignment ) )
            {
            // InternalWebDsl.g:367:2: ( ( rule__Var__NameAssignment ) )
            // InternalWebDsl.g:368:3: ( rule__Var__NameAssignment )
            {
             before(grammarAccess.getVarAccess().getNameAssignment()); 
            // InternalWebDsl.g:369:3: ( rule__Var__NameAssignment )
            // InternalWebDsl.g:369:4: rule__Var__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Var__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleSetAction"
    // InternalWebDsl.g:378:1: entryRuleSetAction : ruleSetAction EOF ;
    public final void entryRuleSetAction() throws RecognitionException {
        try {
            // InternalWebDsl.g:379:1: ( ruleSetAction EOF )
            // InternalWebDsl.g:380:1: ruleSetAction EOF
            {
             before(grammarAccess.getSetActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSetAction();

            state._fsp--;

             after(grammarAccess.getSetActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetAction"


    // $ANTLR start "ruleSetAction"
    // InternalWebDsl.g:387:1: ruleSetAction : ( ( rule__SetAction__Group__0 ) ) ;
    public final void ruleSetAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:391:2: ( ( ( rule__SetAction__Group__0 ) ) )
            // InternalWebDsl.g:392:2: ( ( rule__SetAction__Group__0 ) )
            {
            // InternalWebDsl.g:392:2: ( ( rule__SetAction__Group__0 ) )
            // InternalWebDsl.g:393:3: ( rule__SetAction__Group__0 )
            {
             before(grammarAccess.getSetActionAccess().getGroup()); 
            // InternalWebDsl.g:394:3: ( rule__SetAction__Group__0 )
            // InternalWebDsl.g:394:4: rule__SetAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetAction"


    // $ANTLR start "entryRuleTypeSelection"
    // InternalWebDsl.g:403:1: entryRuleTypeSelection : ruleTypeSelection EOF ;
    public final void entryRuleTypeSelection() throws RecognitionException {
        try {
            // InternalWebDsl.g:404:1: ( ruleTypeSelection EOF )
            // InternalWebDsl.g:405:1: ruleTypeSelection EOF
            {
             before(grammarAccess.getTypeSelectionRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeSelection();

            state._fsp--;

             after(grammarAccess.getTypeSelectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeSelection"


    // $ANTLR start "ruleTypeSelection"
    // InternalWebDsl.g:412:1: ruleTypeSelection : ( ( rule__TypeSelection__Alternatives ) ) ;
    public final void ruleTypeSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:416:2: ( ( ( rule__TypeSelection__Alternatives ) ) )
            // InternalWebDsl.g:417:2: ( ( rule__TypeSelection__Alternatives ) )
            {
            // InternalWebDsl.g:417:2: ( ( rule__TypeSelection__Alternatives ) )
            // InternalWebDsl.g:418:3: ( rule__TypeSelection__Alternatives )
            {
             before(grammarAccess.getTypeSelectionAccess().getAlternatives()); 
            // InternalWebDsl.g:419:3: ( rule__TypeSelection__Alternatives )
            // InternalWebDsl.g:419:4: rule__TypeSelection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeSelection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeSelectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeSelection"


    // $ANTLR start "entryRuleAssert"
    // InternalWebDsl.g:428:1: entryRuleAssert : ruleAssert EOF ;
    public final void entryRuleAssert() throws RecognitionException {
        try {
            // InternalWebDsl.g:429:1: ( ruleAssert EOF )
            // InternalWebDsl.g:430:1: ruleAssert EOF
            {
             before(grammarAccess.getAssertRule()); 
            pushFollow(FOLLOW_1);
            ruleAssert();

            state._fsp--;

             after(grammarAccess.getAssertRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssert"


    // $ANTLR start "ruleAssert"
    // InternalWebDsl.g:437:1: ruleAssert : ( ( rule__Assert__Group__0 ) ) ;
    public final void ruleAssert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:441:2: ( ( ( rule__Assert__Group__0 ) ) )
            // InternalWebDsl.g:442:2: ( ( rule__Assert__Group__0 ) )
            {
            // InternalWebDsl.g:442:2: ( ( rule__Assert__Group__0 ) )
            // InternalWebDsl.g:443:3: ( rule__Assert__Group__0 )
            {
             before(grammarAccess.getAssertAccess().getGroup()); 
            // InternalWebDsl.g:444:3: ( rule__Assert__Group__0 )
            // InternalWebDsl.g:444:4: rule__Assert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assert__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssertAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssert"


    // $ANTLR start "entryRuleAssertContains"
    // InternalWebDsl.g:453:1: entryRuleAssertContains : ruleAssertContains EOF ;
    public final void entryRuleAssertContains() throws RecognitionException {
        try {
            // InternalWebDsl.g:454:1: ( ruleAssertContains EOF )
            // InternalWebDsl.g:455:1: ruleAssertContains EOF
            {
             before(grammarAccess.getAssertContainsRule()); 
            pushFollow(FOLLOW_1);
            ruleAssertContains();

            state._fsp--;

             after(grammarAccess.getAssertContainsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssertContains"


    // $ANTLR start "ruleAssertContains"
    // InternalWebDsl.g:462:1: ruleAssertContains : ( ( rule__AssertContains__Group__0 ) ) ;
    public final void ruleAssertContains() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:466:2: ( ( ( rule__AssertContains__Group__0 ) ) )
            // InternalWebDsl.g:467:2: ( ( rule__AssertContains__Group__0 ) )
            {
            // InternalWebDsl.g:467:2: ( ( rule__AssertContains__Group__0 ) )
            // InternalWebDsl.g:468:3: ( rule__AssertContains__Group__0 )
            {
             before(grammarAccess.getAssertContainsAccess().getGroup()); 
            // InternalWebDsl.g:469:3: ( rule__AssertContains__Group__0 )
            // InternalWebDsl.g:469:4: rule__AssertContains__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssertContains__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssertContainsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssertContains"


    // $ANTLR start "entryRuleAssertEquals"
    // InternalWebDsl.g:478:1: entryRuleAssertEquals : ruleAssertEquals EOF ;
    public final void entryRuleAssertEquals() throws RecognitionException {
        try {
            // InternalWebDsl.g:479:1: ( ruleAssertEquals EOF )
            // InternalWebDsl.g:480:1: ruleAssertEquals EOF
            {
             before(grammarAccess.getAssertEqualsRule()); 
            pushFollow(FOLLOW_1);
            ruleAssertEquals();

            state._fsp--;

             after(grammarAccess.getAssertEqualsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssertEquals"


    // $ANTLR start "ruleAssertEquals"
    // InternalWebDsl.g:487:1: ruleAssertEquals : ( ( rule__AssertEquals__Group__0 ) ) ;
    public final void ruleAssertEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:491:2: ( ( ( rule__AssertEquals__Group__0 ) ) )
            // InternalWebDsl.g:492:2: ( ( rule__AssertEquals__Group__0 ) )
            {
            // InternalWebDsl.g:492:2: ( ( rule__AssertEquals__Group__0 ) )
            // InternalWebDsl.g:493:3: ( rule__AssertEquals__Group__0 )
            {
             before(grammarAccess.getAssertEqualsAccess().getGroup()); 
            // InternalWebDsl.g:494:3: ( rule__AssertEquals__Group__0 )
            // InternalWebDsl.g:494:4: rule__AssertEquals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssertEquals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssertEqualsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssertEquals"


    // $ANTLR start "entryRuleComparable"
    // InternalWebDsl.g:503:1: entryRuleComparable : ruleComparable EOF ;
    public final void entryRuleComparable() throws RecognitionException {
        try {
            // InternalWebDsl.g:504:1: ( ruleComparable EOF )
            // InternalWebDsl.g:505:1: ruleComparable EOF
            {
             before(grammarAccess.getComparableRule()); 
            pushFollow(FOLLOW_1);
            ruleComparable();

            state._fsp--;

             after(grammarAccess.getComparableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparable"


    // $ANTLR start "ruleComparable"
    // InternalWebDsl.g:512:1: ruleComparable : ( ( rule__Comparable__Alternatives ) ) ;
    public final void ruleComparable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:516:2: ( ( ( rule__Comparable__Alternatives ) ) )
            // InternalWebDsl.g:517:2: ( ( rule__Comparable__Alternatives ) )
            {
            // InternalWebDsl.g:517:2: ( ( rule__Comparable__Alternatives ) )
            // InternalWebDsl.g:518:3: ( rule__Comparable__Alternatives )
            {
             before(grammarAccess.getComparableAccess().getAlternatives()); 
            // InternalWebDsl.g:519:3: ( rule__Comparable__Alternatives )
            // InternalWebDsl.g:519:4: rule__Comparable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comparable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparable"


    // $ANTLR start "ruleBrowser"
    // InternalWebDsl.g:528:1: ruleBrowser : ( ( rule__Browser__Alternatives ) ) ;
    public final void ruleBrowser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:532:1: ( ( ( rule__Browser__Alternatives ) ) )
            // InternalWebDsl.g:533:2: ( ( rule__Browser__Alternatives ) )
            {
            // InternalWebDsl.g:533:2: ( ( rule__Browser__Alternatives ) )
            // InternalWebDsl.g:534:3: ( rule__Browser__Alternatives )
            {
             before(grammarAccess.getBrowserAccess().getAlternatives()); 
            // InternalWebDsl.g:535:3: ( rule__Browser__Alternatives )
            // InternalWebDsl.g:535:4: rule__Browser__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Browser__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBrowserAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBrowser"


    // $ANTLR start "ruleHtmlElement"
    // InternalWebDsl.g:544:1: ruleHtmlElement : ( ( rule__HtmlElement__Alternatives ) ) ;
    public final void ruleHtmlElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:548:1: ( ( ( rule__HtmlElement__Alternatives ) ) )
            // InternalWebDsl.g:549:2: ( ( rule__HtmlElement__Alternatives ) )
            {
            // InternalWebDsl.g:549:2: ( ( rule__HtmlElement__Alternatives ) )
            // InternalWebDsl.g:550:3: ( rule__HtmlElement__Alternatives )
            {
             before(grammarAccess.getHtmlElementAccess().getAlternatives()); 
            // InternalWebDsl.g:551:3: ( rule__HtmlElement__Alternatives )
            // InternalWebDsl.g:551:4: rule__HtmlElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HtmlElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHtmlElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHtmlElement"


    // $ANTLR start "ruleAttribute"
    // InternalWebDsl.g:560:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:564:1: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalWebDsl.g:565:2: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalWebDsl.g:565:2: ( ( rule__Attribute__Alternatives ) )
            // InternalWebDsl.g:566:3: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // InternalWebDsl.g:567:3: ( rule__Attribute__Alternatives )
            // InternalWebDsl.g:567:4: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalWebDsl.g:575:1: rule__Action__Alternatives : ( ( ( rule__Action__GoActionAssignment_0 ) ) | ( ( rule__Action__SelectionAssignment_1 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:579:1: ( ( ( rule__Action__GoActionAssignment_0 ) ) | ( ( rule__Action__SelectionAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==40) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=14 && LA1_0<=16)||(LA1_0>=29 && LA1_0<=30)||LA1_0==44) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalWebDsl.g:580:2: ( ( rule__Action__GoActionAssignment_0 ) )
                    {
                    // InternalWebDsl.g:580:2: ( ( rule__Action__GoActionAssignment_0 ) )
                    // InternalWebDsl.g:581:3: ( rule__Action__GoActionAssignment_0 )
                    {
                     before(grammarAccess.getActionAccess().getGoActionAssignment_0()); 
                    // InternalWebDsl.g:582:3: ( rule__Action__GoActionAssignment_0 )
                    // InternalWebDsl.g:582:4: rule__Action__GoActionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__GoActionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGoActionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:586:2: ( ( rule__Action__SelectionAssignment_1 ) )
                    {
                    // InternalWebDsl.g:586:2: ( ( rule__Action__SelectionAssignment_1 ) )
                    // InternalWebDsl.g:587:3: ( rule__Action__SelectionAssignment_1 )
                    {
                     before(grammarAccess.getActionAccess().getSelectionAssignment_1()); 
                    // InternalWebDsl.g:588:3: ( rule__Action__SelectionAssignment_1 )
                    // InternalWebDsl.g:588:4: rule__Action__SelectionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__SelectionAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getSelectionAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Selection__Alternatives"
    // InternalWebDsl.g:596:1: rule__Selection__Alternatives : ( ( ( rule__Selection__LinkButtonSelectionAssignment_0 ) ) | ( ( rule__Selection__GeneralSelectionAssignment_1 ) ) | ( ( rule__Selection__CheckboxSelectionAssignment_2 ) ) | ( ( rule__Selection__ComboboxSelectionAssignment_3 ) ) | ( ( rule__Selection__PageSelectionAssignment_4 ) ) );
    public final void rule__Selection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:600:1: ( ( ( rule__Selection__LinkButtonSelectionAssignment_0 ) ) | ( ( rule__Selection__GeneralSelectionAssignment_1 ) ) | ( ( rule__Selection__CheckboxSelectionAssignment_2 ) ) | ( ( rule__Selection__ComboboxSelectionAssignment_3 ) ) | ( ( rule__Selection__PageSelectionAssignment_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt2=1;
                }
                break;
            case 14:
            case 15:
            case 16:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case 44:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalWebDsl.g:601:2: ( ( rule__Selection__LinkButtonSelectionAssignment_0 ) )
                    {
                    // InternalWebDsl.g:601:2: ( ( rule__Selection__LinkButtonSelectionAssignment_0 ) )
                    // InternalWebDsl.g:602:3: ( rule__Selection__LinkButtonSelectionAssignment_0 )
                    {
                     before(grammarAccess.getSelectionAccess().getLinkButtonSelectionAssignment_0()); 
                    // InternalWebDsl.g:603:3: ( rule__Selection__LinkButtonSelectionAssignment_0 )
                    // InternalWebDsl.g:603:4: rule__Selection__LinkButtonSelectionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selection__LinkButtonSelectionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectionAccess().getLinkButtonSelectionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:607:2: ( ( rule__Selection__GeneralSelectionAssignment_1 ) )
                    {
                    // InternalWebDsl.g:607:2: ( ( rule__Selection__GeneralSelectionAssignment_1 ) )
                    // InternalWebDsl.g:608:3: ( rule__Selection__GeneralSelectionAssignment_1 )
                    {
                     before(grammarAccess.getSelectionAccess().getGeneralSelectionAssignment_1()); 
                    // InternalWebDsl.g:609:3: ( rule__Selection__GeneralSelectionAssignment_1 )
                    // InternalWebDsl.g:609:4: rule__Selection__GeneralSelectionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selection__GeneralSelectionAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectionAccess().getGeneralSelectionAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:613:2: ( ( rule__Selection__CheckboxSelectionAssignment_2 ) )
                    {
                    // InternalWebDsl.g:613:2: ( ( rule__Selection__CheckboxSelectionAssignment_2 ) )
                    // InternalWebDsl.g:614:3: ( rule__Selection__CheckboxSelectionAssignment_2 )
                    {
                     before(grammarAccess.getSelectionAccess().getCheckboxSelectionAssignment_2()); 
                    // InternalWebDsl.g:615:3: ( rule__Selection__CheckboxSelectionAssignment_2 )
                    // InternalWebDsl.g:615:4: rule__Selection__CheckboxSelectionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selection__CheckboxSelectionAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectionAccess().getCheckboxSelectionAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:619:2: ( ( rule__Selection__ComboboxSelectionAssignment_3 ) )
                    {
                    // InternalWebDsl.g:619:2: ( ( rule__Selection__ComboboxSelectionAssignment_3 ) )
                    // InternalWebDsl.g:620:3: ( rule__Selection__ComboboxSelectionAssignment_3 )
                    {
                     before(grammarAccess.getSelectionAccess().getComboboxSelectionAssignment_3()); 
                    // InternalWebDsl.g:621:3: ( rule__Selection__ComboboxSelectionAssignment_3 )
                    // InternalWebDsl.g:621:4: rule__Selection__ComboboxSelectionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selection__ComboboxSelectionAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectionAccess().getComboboxSelectionAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:625:2: ( ( rule__Selection__PageSelectionAssignment_4 ) )
                    {
                    // InternalWebDsl.g:625:2: ( ( rule__Selection__PageSelectionAssignment_4 ) )
                    // InternalWebDsl.g:626:3: ( rule__Selection__PageSelectionAssignment_4 )
                    {
                     before(grammarAccess.getSelectionAccess().getPageSelectionAssignment_4()); 
                    // InternalWebDsl.g:627:3: ( rule__Selection__PageSelectionAssignment_4 )
                    // InternalWebDsl.g:627:4: rule__Selection__PageSelectionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selection__PageSelectionAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectionAccess().getPageSelectionAssignment_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Alternatives"


    // $ANTLR start "rule__LinkButtonSelection__Alternatives_0"
    // InternalWebDsl.g:635:1: rule__LinkButtonSelection__Alternatives_0 : ( ( 'LINK' ) | ( 'BUTTON' ) );
    public final void rule__LinkButtonSelection__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:639:1: ( ( 'LINK' ) | ( 'BUTTON' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalWebDsl.g:640:2: ( 'LINK' )
                    {
                    // InternalWebDsl.g:640:2: ( 'LINK' )
                    // InternalWebDsl.g:641:3: 'LINK'
                    {
                     before(grammarAccess.getLinkButtonSelectionAccess().getLINKKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getLinkButtonSelectionAccess().getLINKKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:646:2: ( 'BUTTON' )
                    {
                    // InternalWebDsl.g:646:2: ( 'BUTTON' )
                    // InternalWebDsl.g:647:3: 'BUTTON'
                    {
                     before(grammarAccess.getLinkButtonSelectionAccess().getBUTTONKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getLinkButtonSelectionAccess().getBUTTONKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkButtonSelection__Alternatives_0"


    // $ANTLR start "rule__LinkButtonSelection__Alternatives_3"
    // InternalWebDsl.g:656:1: rule__LinkButtonSelection__Alternatives_3 : ( ( ( rule__LinkButtonSelection__GeneralActionsAssignment_3_0 ) ) | ( 'click' ) );
    public final void rule__LinkButtonSelection__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:660:1: ( ( ( rule__LinkButtonSelection__GeneralActionsAssignment_3_0 ) ) | ( 'click' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=12)||(LA4_0>=14 && LA4_0<=16)||(LA4_0>=29 && LA4_0<=30)||(LA4_0>=44 && LA4_0<=45)||LA4_0==48) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalWebDsl.g:661:2: ( ( rule__LinkButtonSelection__GeneralActionsAssignment_3_0 ) )
                    {
                    // InternalWebDsl.g:661:2: ( ( rule__LinkButtonSelection__GeneralActionsAssignment_3_0 ) )
                    // InternalWebDsl.g:662:3: ( rule__LinkButtonSelection__GeneralActionsAssignment_3_0 )
                    {
                     before(grammarAccess.getLinkButtonSelectionAccess().getGeneralActionsAssignment_3_0()); 
                    // InternalWebDsl.g:663:3: ( rule__LinkButtonSelection__GeneralActionsAssignment_3_0 )
                    // InternalWebDsl.g:663:4: rule__LinkButtonSelection__GeneralActionsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinkButtonSelection__GeneralActionsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkButtonSelectionAccess().getGeneralActionsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:667:2: ( 'click' )
                    {
                    // InternalWebDsl.g:667:2: ( 'click' )
                    // InternalWebDsl.g:668:3: 'click'
                    {
                     before(grammarAccess.getLinkButtonSelectionAccess().getClickKeyword_3_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getLinkButtonSelectionAccess().getClickKeyword_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkButtonSelection__Alternatives_3"


    // $ANTLR start "rule__GeneralSelection__Alternatives_0"
    // InternalWebDsl.g:677:1: rule__GeneralSelection__Alternatives_0 : ( ( 'SEARCH_FIELD' ) | ( 'DIV' ) | ( 'A' ) );
    public final void rule__GeneralSelection__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:681:1: ( ( 'SEARCH_FIELD' ) | ( 'DIV' ) | ( 'A' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWebDsl.g:682:2: ( 'SEARCH_FIELD' )
                    {
                    // InternalWebDsl.g:682:2: ( 'SEARCH_FIELD' )
                    // InternalWebDsl.g:683:3: 'SEARCH_FIELD'
                    {
                     before(grammarAccess.getGeneralSelectionAccess().getSEARCH_FIELDKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getGeneralSelectionAccess().getSEARCH_FIELDKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:688:2: ( 'DIV' )
                    {
                    // InternalWebDsl.g:688:2: ( 'DIV' )
                    // InternalWebDsl.g:689:3: 'DIV'
                    {
                     before(grammarAccess.getGeneralSelectionAccess().getDIVKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getGeneralSelectionAccess().getDIVKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:694:2: ( 'A' )
                    {
                    // InternalWebDsl.g:694:2: ( 'A' )
                    // InternalWebDsl.g:695:3: 'A'
                    {
                     before(grammarAccess.getGeneralSelectionAccess().getAKeyword_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getGeneralSelectionAccess().getAKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralSelection__Alternatives_0"


    // $ANTLR start "rule__CheckboxSelection__Alternatives_3"
    // InternalWebDsl.g:704:1: rule__CheckboxSelection__Alternatives_3 : ( ( ( rule__CheckboxSelection__GeneralActionsAssignment_3_0 ) ) | ( 'check' ) | ( 'uncheck' ) );
    public final void rule__CheckboxSelection__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:708:1: ( ( ( rule__CheckboxSelection__GeneralActionsAssignment_3_0 ) ) | ( 'check' ) | ( 'uncheck' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 29:
            case 30:
            case 44:
            case 45:
            case 48:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalWebDsl.g:709:2: ( ( rule__CheckboxSelection__GeneralActionsAssignment_3_0 ) )
                    {
                    // InternalWebDsl.g:709:2: ( ( rule__CheckboxSelection__GeneralActionsAssignment_3_0 ) )
                    // InternalWebDsl.g:710:3: ( rule__CheckboxSelection__GeneralActionsAssignment_3_0 )
                    {
                     before(grammarAccess.getCheckboxSelectionAccess().getGeneralActionsAssignment_3_0()); 
                    // InternalWebDsl.g:711:3: ( rule__CheckboxSelection__GeneralActionsAssignment_3_0 )
                    // InternalWebDsl.g:711:4: rule__CheckboxSelection__GeneralActionsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CheckboxSelection__GeneralActionsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckboxSelectionAccess().getGeneralActionsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:715:2: ( 'check' )
                    {
                    // InternalWebDsl.g:715:2: ( 'check' )
                    // InternalWebDsl.g:716:3: 'check'
                    {
                     before(grammarAccess.getCheckboxSelectionAccess().getCheckKeyword_3_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCheckboxSelectionAccess().getCheckKeyword_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:721:2: ( 'uncheck' )
                    {
                    // InternalWebDsl.g:721:2: ( 'uncheck' )
                    // InternalWebDsl.g:722:3: 'uncheck'
                    {
                     before(grammarAccess.getCheckboxSelectionAccess().getUncheckKeyword_3_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCheckboxSelectionAccess().getUncheckKeyword_3_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSelection__Alternatives_3"


    // $ANTLR start "rule__ComboboxSelection__Alternatives_3"
    // InternalWebDsl.g:731:1: rule__ComboboxSelection__Alternatives_3 : ( ( ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 ) ) | ( ( rule__ComboboxSelection__Group_3_1__0 ) ) );
    public final void rule__ComboboxSelection__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:735:1: ( ( ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 ) ) | ( ( rule__ComboboxSelection__Group_3_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=12)||(LA7_0>=14 && LA7_0<=16)||(LA7_0>=29 && LA7_0<=30)||(LA7_0>=44 && LA7_0<=45)||LA7_0==48) ) {
                alt7=1;
            }
            else if ( (LA7_0==43) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalWebDsl.g:736:2: ( ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 ) )
                    {
                    // InternalWebDsl.g:736:2: ( ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 ) )
                    // InternalWebDsl.g:737:3: ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 )
                    {
                     before(grammarAccess.getComboboxSelectionAccess().getGeneralActionsAssignment_3_0()); 
                    // InternalWebDsl.g:738:3: ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 )
                    // InternalWebDsl.g:738:4: rule__ComboboxSelection__GeneralActionsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComboboxSelection__GeneralActionsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComboboxSelectionAccess().getGeneralActionsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:742:2: ( ( rule__ComboboxSelection__Group_3_1__0 ) )
                    {
                    // InternalWebDsl.g:742:2: ( ( rule__ComboboxSelection__Group_3_1__0 ) )
                    // InternalWebDsl.g:743:3: ( rule__ComboboxSelection__Group_3_1__0 )
                    {
                     before(grammarAccess.getComboboxSelectionAccess().getGroup_3_1()); 
                    // InternalWebDsl.g:744:3: ( rule__ComboboxSelection__Group_3_1__0 )
                    // InternalWebDsl.g:744:4: rule__ComboboxSelection__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComboboxSelection__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComboboxSelectionAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__Alternatives_3"


    // $ANTLR start "rule__PageSelection__Alternatives_2"
    // InternalWebDsl.g:752:1: rule__PageSelection__Alternatives_2 : ( ( ( rule__PageSelection__StoreActionAssignment_2_0 ) ) | ( ( rule__PageSelection__AssertionAssignment_2_1 ) ) );
    public final void rule__PageSelection__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:756:1: ( ( ( rule__PageSelection__StoreActionAssignment_2_0 ) ) | ( ( rule__PageSelection__AssertionAssignment_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==45) ) {
                alt8=1;
            }
            else if ( (LA8_0==50) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalWebDsl.g:757:2: ( ( rule__PageSelection__StoreActionAssignment_2_0 ) )
                    {
                    // InternalWebDsl.g:757:2: ( ( rule__PageSelection__StoreActionAssignment_2_0 ) )
                    // InternalWebDsl.g:758:3: ( rule__PageSelection__StoreActionAssignment_2_0 )
                    {
                     before(grammarAccess.getPageSelectionAccess().getStoreActionAssignment_2_0()); 
                    // InternalWebDsl.g:759:3: ( rule__PageSelection__StoreActionAssignment_2_0 )
                    // InternalWebDsl.g:759:4: rule__PageSelection__StoreActionAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PageSelection__StoreActionAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPageSelectionAccess().getStoreActionAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:763:2: ( ( rule__PageSelection__AssertionAssignment_2_1 ) )
                    {
                    // InternalWebDsl.g:763:2: ( ( rule__PageSelection__AssertionAssignment_2_1 ) )
                    // InternalWebDsl.g:764:3: ( rule__PageSelection__AssertionAssignment_2_1 )
                    {
                     before(grammarAccess.getPageSelectionAccess().getAssertionAssignment_2_1()); 
                    // InternalWebDsl.g:765:3: ( rule__PageSelection__AssertionAssignment_2_1 )
                    // InternalWebDsl.g:765:4: rule__PageSelection__AssertionAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PageSelection__AssertionAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPageSelectionAccess().getAssertionAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageSelection__Alternatives_2"


    // $ANTLR start "rule__GeneralAction__Alternatives"
    // InternalWebDsl.g:773:1: rule__GeneralAction__Alternatives : ( ( ( rule__GeneralAction__SetActionAssignment_0 ) ) | ( ( rule__GeneralAction__StoreActionAssignment_1 ) ) | ( ( rule__GeneralAction__SelectionAssignment_2 ) ) );
    public final void rule__GeneralAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:777:1: ( ( ( rule__GeneralAction__SetActionAssignment_0 ) ) | ( ( rule__GeneralAction__StoreActionAssignment_1 ) ) | ( ( rule__GeneralAction__SelectionAssignment_2 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt9=1;
                }
                break;
            case 45:
                {
                alt9=2;
                }
                break;
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 29:
            case 30:
            case 44:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalWebDsl.g:778:2: ( ( rule__GeneralAction__SetActionAssignment_0 ) )
                    {
                    // InternalWebDsl.g:778:2: ( ( rule__GeneralAction__SetActionAssignment_0 ) )
                    // InternalWebDsl.g:779:3: ( rule__GeneralAction__SetActionAssignment_0 )
                    {
                     before(grammarAccess.getGeneralActionAccess().getSetActionAssignment_0()); 
                    // InternalWebDsl.g:780:3: ( rule__GeneralAction__SetActionAssignment_0 )
                    // InternalWebDsl.g:780:4: rule__GeneralAction__SetActionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralAction__SetActionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGeneralActionAccess().getSetActionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:784:2: ( ( rule__GeneralAction__StoreActionAssignment_1 ) )
                    {
                    // InternalWebDsl.g:784:2: ( ( rule__GeneralAction__StoreActionAssignment_1 ) )
                    // InternalWebDsl.g:785:3: ( rule__GeneralAction__StoreActionAssignment_1 )
                    {
                     before(grammarAccess.getGeneralActionAccess().getStoreActionAssignment_1()); 
                    // InternalWebDsl.g:786:3: ( rule__GeneralAction__StoreActionAssignment_1 )
                    // InternalWebDsl.g:786:4: rule__GeneralAction__StoreActionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralAction__StoreActionAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGeneralActionAccess().getStoreActionAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:790:2: ( ( rule__GeneralAction__SelectionAssignment_2 ) )
                    {
                    // InternalWebDsl.g:790:2: ( ( rule__GeneralAction__SelectionAssignment_2 ) )
                    // InternalWebDsl.g:791:3: ( rule__GeneralAction__SelectionAssignment_2 )
                    {
                     before(grammarAccess.getGeneralActionAccess().getSelectionAssignment_2()); 
                    // InternalWebDsl.g:792:3: ( rule__GeneralAction__SelectionAssignment_2 )
                    // InternalWebDsl.g:792:4: rule__GeneralAction__SelectionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralAction__SelectionAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getGeneralActionAccess().getSelectionAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralAction__Alternatives"


    // $ANTLR start "rule__TypeSelection__Alternatives"
    // InternalWebDsl.g:800:1: rule__TypeSelection__Alternatives : ( ( ( rule__TypeSelection__Group_0__0 ) ) | ( 'PARENT' ) | ( 'FIRST' ) | ( 'LAST' ) | ( 'ALL' ) );
    public final void rule__TypeSelection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:804:1: ( ( ( rule__TypeSelection__Group_0__0 ) ) | ( 'PARENT' ) | ( 'FIRST' ) | ( 'LAST' ) | ( 'ALL' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            case 21:
                {
                alt10=4;
                }
                break;
            case 22:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalWebDsl.g:805:2: ( ( rule__TypeSelection__Group_0__0 ) )
                    {
                    // InternalWebDsl.g:805:2: ( ( rule__TypeSelection__Group_0__0 ) )
                    // InternalWebDsl.g:806:3: ( rule__TypeSelection__Group_0__0 )
                    {
                     before(grammarAccess.getTypeSelectionAccess().getGroup_0()); 
                    // InternalWebDsl.g:807:3: ( rule__TypeSelection__Group_0__0 )
                    // InternalWebDsl.g:807:4: rule__TypeSelection__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeSelection__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeSelectionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:811:2: ( 'PARENT' )
                    {
                    // InternalWebDsl.g:811:2: ( 'PARENT' )
                    // InternalWebDsl.g:812:3: 'PARENT'
                    {
                     before(grammarAccess.getTypeSelectionAccess().getPARENTKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTypeSelectionAccess().getPARENTKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:817:2: ( 'FIRST' )
                    {
                    // InternalWebDsl.g:817:2: ( 'FIRST' )
                    // InternalWebDsl.g:818:3: 'FIRST'
                    {
                     before(grammarAccess.getTypeSelectionAccess().getFIRSTKeyword_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getTypeSelectionAccess().getFIRSTKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:823:2: ( 'LAST' )
                    {
                    // InternalWebDsl.g:823:2: ( 'LAST' )
                    // InternalWebDsl.g:824:3: 'LAST'
                    {
                     before(grammarAccess.getTypeSelectionAccess().getLASTKeyword_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getTypeSelectionAccess().getLASTKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:829:2: ( 'ALL' )
                    {
                    // InternalWebDsl.g:829:2: ( 'ALL' )
                    // InternalWebDsl.g:830:3: 'ALL'
                    {
                     before(grammarAccess.getTypeSelectionAccess().getALLKeyword_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getTypeSelectionAccess().getALLKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSelection__Alternatives"


    // $ANTLR start "rule__Assert__Alternatives_1"
    // InternalWebDsl.g:839:1: rule__Assert__Alternatives_1 : ( ( ( rule__Assert__AssertContainAssignment_1_0 ) ) | ( ( rule__Assert__AssertEqualsAssignment_1_1 ) ) );
    public final void rule__Assert__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:843:1: ( ( ( rule__Assert__AssertContainAssignment_1_0 ) ) | ( ( rule__Assert__AssertEqualsAssignment_1_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==51) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING||(LA11_0>=53 && LA11_0<=54)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalWebDsl.g:844:2: ( ( rule__Assert__AssertContainAssignment_1_0 ) )
                    {
                    // InternalWebDsl.g:844:2: ( ( rule__Assert__AssertContainAssignment_1_0 ) )
                    // InternalWebDsl.g:845:3: ( rule__Assert__AssertContainAssignment_1_0 )
                    {
                     before(grammarAccess.getAssertAccess().getAssertContainAssignment_1_0()); 
                    // InternalWebDsl.g:846:3: ( rule__Assert__AssertContainAssignment_1_0 )
                    // InternalWebDsl.g:846:4: rule__Assert__AssertContainAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assert__AssertContainAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssertAccess().getAssertContainAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:850:2: ( ( rule__Assert__AssertEqualsAssignment_1_1 ) )
                    {
                    // InternalWebDsl.g:850:2: ( ( rule__Assert__AssertEqualsAssignment_1_1 ) )
                    // InternalWebDsl.g:851:3: ( rule__Assert__AssertEqualsAssignment_1_1 )
                    {
                     before(grammarAccess.getAssertAccess().getAssertEqualsAssignment_1_1()); 
                    // InternalWebDsl.g:852:3: ( rule__Assert__AssertEqualsAssignment_1_1 )
                    // InternalWebDsl.g:852:4: rule__Assert__AssertEqualsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assert__AssertEqualsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssertAccess().getAssertEqualsAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Alternatives_1"


    // $ANTLR start "rule__AssertContains__Alternatives_1"
    // InternalWebDsl.g:860:1: rule__AssertContains__Alternatives_1 : ( ( ( rule__AssertContains__Group_1_0__0 ) ) | ( 'TEXT' ) );
    public final void rule__AssertContains__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:864:1: ( ( ( rule__AssertContains__Group_1_0__0 ) ) | ( 'TEXT' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=12)||(LA12_0>=15 && LA12_0<=16)||(LA12_0>=29 && LA12_0<=31)) ) {
                alt12=1;
            }
            else if ( (LA12_0==23) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalWebDsl.g:865:2: ( ( rule__AssertContains__Group_1_0__0 ) )
                    {
                    // InternalWebDsl.g:865:2: ( ( rule__AssertContains__Group_1_0__0 ) )
                    // InternalWebDsl.g:866:3: ( rule__AssertContains__Group_1_0__0 )
                    {
                     before(grammarAccess.getAssertContainsAccess().getGroup_1_0()); 
                    // InternalWebDsl.g:867:3: ( rule__AssertContains__Group_1_0__0 )
                    // InternalWebDsl.g:867:4: rule__AssertContains__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssertContains__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssertContainsAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:871:2: ( 'TEXT' )
                    {
                    // InternalWebDsl.g:871:2: ( 'TEXT' )
                    // InternalWebDsl.g:872:3: 'TEXT'
                    {
                     before(grammarAccess.getAssertContainsAccess().getTEXTKeyword_1_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAssertContainsAccess().getTEXTKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Alternatives_1"


    // $ANTLR start "rule__Comparable__Alternatives"
    // InternalWebDsl.g:881:1: rule__Comparable__Alternatives : ( ( ( rule__Comparable__Group_0__0 ) ) | ( ( rule__Comparable__Group_1__0 ) ) | ( RULE_STRING ) );
    public final void rule__Comparable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:885:1: ( ( ( rule__Comparable__Group_0__0 ) ) | ( ( rule__Comparable__Group_1__0 ) ) | ( RULE_STRING ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt13=1;
                }
                break;
            case 54:
                {
                alt13=2;
                }
                break;
            case RULE_STRING:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalWebDsl.g:886:2: ( ( rule__Comparable__Group_0__0 ) )
                    {
                    // InternalWebDsl.g:886:2: ( ( rule__Comparable__Group_0__0 ) )
                    // InternalWebDsl.g:887:3: ( rule__Comparable__Group_0__0 )
                    {
                     before(grammarAccess.getComparableAccess().getGroup_0()); 
                    // InternalWebDsl.g:888:3: ( rule__Comparable__Group_0__0 )
                    // InternalWebDsl.g:888:4: rule__Comparable__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparable__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparableAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:892:2: ( ( rule__Comparable__Group_1__0 ) )
                    {
                    // InternalWebDsl.g:892:2: ( ( rule__Comparable__Group_1__0 ) )
                    // InternalWebDsl.g:893:3: ( rule__Comparable__Group_1__0 )
                    {
                     before(grammarAccess.getComparableAccess().getGroup_1()); 
                    // InternalWebDsl.g:894:3: ( rule__Comparable__Group_1__0 )
                    // InternalWebDsl.g:894:4: rule__Comparable__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparable__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparableAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:898:2: ( RULE_STRING )
                    {
                    // InternalWebDsl.g:898:2: ( RULE_STRING )
                    // InternalWebDsl.g:899:3: RULE_STRING
                    {
                     before(grammarAccess.getComparableAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getComparableAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparable__Alternatives"


    // $ANTLR start "rule__Browser__Alternatives"
    // InternalWebDsl.g:908:1: rule__Browser__Alternatives : ( ( ( 'chrome' ) ) | ( ( 'firefox' ) ) | ( ( 'safari' ) ) | ( ( 'edge' ) ) | ( ( 'ie' ) ) );
    public final void rule__Browser__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:912:1: ( ( ( 'chrome' ) ) | ( ( 'firefox' ) ) | ( ( 'safari' ) ) | ( ( 'edge' ) ) | ( ( 'ie' ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt14=1;
                }
                break;
            case 25:
                {
                alt14=2;
                }
                break;
            case 26:
                {
                alt14=3;
                }
                break;
            case 27:
                {
                alt14=4;
                }
                break;
            case 28:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalWebDsl.g:913:2: ( ( 'chrome' ) )
                    {
                    // InternalWebDsl.g:913:2: ( ( 'chrome' ) )
                    // InternalWebDsl.g:914:3: ( 'chrome' )
                    {
                     before(grammarAccess.getBrowserAccess().getCHROMEEnumLiteralDeclaration_0()); 
                    // InternalWebDsl.g:915:3: ( 'chrome' )
                    // InternalWebDsl.g:915:4: 'chrome'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getCHROMEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:919:2: ( ( 'firefox' ) )
                    {
                    // InternalWebDsl.g:919:2: ( ( 'firefox' ) )
                    // InternalWebDsl.g:920:3: ( 'firefox' )
                    {
                     before(grammarAccess.getBrowserAccess().getFIREFOXEnumLiteralDeclaration_1()); 
                    // InternalWebDsl.g:921:3: ( 'firefox' )
                    // InternalWebDsl.g:921:4: 'firefox'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getFIREFOXEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:925:2: ( ( 'safari' ) )
                    {
                    // InternalWebDsl.g:925:2: ( ( 'safari' ) )
                    // InternalWebDsl.g:926:3: ( 'safari' )
                    {
                     before(grammarAccess.getBrowserAccess().getSAFARIEnumLiteralDeclaration_2()); 
                    // InternalWebDsl.g:927:3: ( 'safari' )
                    // InternalWebDsl.g:927:4: 'safari'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getSAFARIEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:931:2: ( ( 'edge' ) )
                    {
                    // InternalWebDsl.g:931:2: ( ( 'edge' ) )
                    // InternalWebDsl.g:932:3: ( 'edge' )
                    {
                     before(grammarAccess.getBrowserAccess().getEDGEEnumLiteralDeclaration_3()); 
                    // InternalWebDsl.g:933:3: ( 'edge' )
                    // InternalWebDsl.g:933:4: 'edge'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getEDGEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:937:2: ( ( 'ie' ) )
                    {
                    // InternalWebDsl.g:937:2: ( ( 'ie' ) )
                    // InternalWebDsl.g:938:3: ( 'ie' )
                    {
                     before(grammarAccess.getBrowserAccess().getIEEnumLiteralDeclaration_4()); 
                    // InternalWebDsl.g:939:3: ( 'ie' )
                    // InternalWebDsl.g:939:4: 'ie'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getIEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser__Alternatives"


    // $ANTLR start "rule__HtmlElement__Alternatives"
    // InternalWebDsl.g:947:1: rule__HtmlElement__Alternatives : ( ( ( 'LINK' ) ) | ( ( 'BUTTON' ) ) | ( ( 'CHECKBOX' ) ) | ( ( 'COMBO_BOX' ) ) | ( ( 'DIV' ) ) | ( ( 'IMAGE' ) ) | ( ( 'A' ) ) );
    public final void rule__HtmlElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:951:1: ( ( ( 'LINK' ) ) | ( ( 'BUTTON' ) ) | ( ( 'CHECKBOX' ) ) | ( ( 'COMBO_BOX' ) ) | ( ( 'DIV' ) ) | ( ( 'IMAGE' ) ) | ( ( 'A' ) ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt15=1;
                }
                break;
            case 12:
                {
                alt15=2;
                }
                break;
            case 29:
                {
                alt15=3;
                }
                break;
            case 30:
                {
                alt15=4;
                }
                break;
            case 15:
                {
                alt15=5;
                }
                break;
            case 31:
                {
                alt15=6;
                }
                break;
            case 16:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalWebDsl.g:952:2: ( ( 'LINK' ) )
                    {
                    // InternalWebDsl.g:952:2: ( ( 'LINK' ) )
                    // InternalWebDsl.g:953:3: ( 'LINK' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getLINKEnumLiteralDeclaration_0()); 
                    // InternalWebDsl.g:954:3: ( 'LINK' )
                    // InternalWebDsl.g:954:4: 'LINK'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getLINKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:958:2: ( ( 'BUTTON' ) )
                    {
                    // InternalWebDsl.g:958:2: ( ( 'BUTTON' ) )
                    // InternalWebDsl.g:959:3: ( 'BUTTON' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getBUTTONEnumLiteralDeclaration_1()); 
                    // InternalWebDsl.g:960:3: ( 'BUTTON' )
                    // InternalWebDsl.g:960:4: 'BUTTON'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getBUTTONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:964:2: ( ( 'CHECKBOX' ) )
                    {
                    // InternalWebDsl.g:964:2: ( ( 'CHECKBOX' ) )
                    // InternalWebDsl.g:965:3: ( 'CHECKBOX' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getCHECKBOXEnumLiteralDeclaration_2()); 
                    // InternalWebDsl.g:966:3: ( 'CHECKBOX' )
                    // InternalWebDsl.g:966:4: 'CHECKBOX'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getCHECKBOXEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:970:2: ( ( 'COMBO_BOX' ) )
                    {
                    // InternalWebDsl.g:970:2: ( ( 'COMBO_BOX' ) )
                    // InternalWebDsl.g:971:3: ( 'COMBO_BOX' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getCOMBOBOXEnumLiteralDeclaration_3()); 
                    // InternalWebDsl.g:972:3: ( 'COMBO_BOX' )
                    // InternalWebDsl.g:972:4: 'COMBO_BOX'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getCOMBOBOXEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:976:2: ( ( 'DIV' ) )
                    {
                    // InternalWebDsl.g:976:2: ( ( 'DIV' ) )
                    // InternalWebDsl.g:977:3: ( 'DIV' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getDIVEnumLiteralDeclaration_4()); 
                    // InternalWebDsl.g:978:3: ( 'DIV' )
                    // InternalWebDsl.g:978:4: 'DIV'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getDIVEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWebDsl.g:982:2: ( ( 'IMAGE' ) )
                    {
                    // InternalWebDsl.g:982:2: ( ( 'IMAGE' ) )
                    // InternalWebDsl.g:983:3: ( 'IMAGE' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getIMAGEEnumLiteralDeclaration_5()); 
                    // InternalWebDsl.g:984:3: ( 'IMAGE' )
                    // InternalWebDsl.g:984:4: 'IMAGE'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getIMAGEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalWebDsl.g:988:2: ( ( 'A' ) )
                    {
                    // InternalWebDsl.g:988:2: ( ( 'A' ) )
                    // InternalWebDsl.g:989:3: ( 'A' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getAEnumLiteralDeclaration_6()); 
                    // InternalWebDsl.g:990:3: ( 'A' )
                    // InternalWebDsl.g:990:4: 'A'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getAEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlElement__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives"
    // InternalWebDsl.g:998:1: rule__Attribute__Alternatives : ( ( ( 'LABEL' ) ) | ( ( 'ID' ) ) | ( ( 'CLASS' ) ) | ( ( 'ALT' ) ) | ( ( 'VALUE' ) ) | ( ( 'HREF' ) ) | ( ( 'TITLE' ) ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1002:1: ( ( ( 'LABEL' ) ) | ( ( 'ID' ) ) | ( ( 'CLASS' ) ) | ( ( 'ALT' ) ) | ( ( 'VALUE' ) ) | ( ( 'HREF' ) ) | ( ( 'TITLE' ) ) )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                alt16=2;
                }
                break;
            case 34:
                {
                alt16=3;
                }
                break;
            case 35:
                {
                alt16=4;
                }
                break;
            case 36:
                {
                alt16=5;
                }
                break;
            case 37:
                {
                alt16=6;
                }
                break;
            case 38:
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalWebDsl.g:1003:2: ( ( 'LABEL' ) )
                    {
                    // InternalWebDsl.g:1003:2: ( ( 'LABEL' ) )
                    // InternalWebDsl.g:1004:3: ( 'LABEL' )
                    {
                     before(grammarAccess.getAttributeAccess().getLABELEnumLiteralDeclaration_0()); 
                    // InternalWebDsl.g:1005:3: ( 'LABEL' )
                    // InternalWebDsl.g:1005:4: 'LABEL'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getLABELEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1009:2: ( ( 'ID' ) )
                    {
                    // InternalWebDsl.g:1009:2: ( ( 'ID' ) )
                    // InternalWebDsl.g:1010:3: ( 'ID' )
                    {
                     before(grammarAccess.getAttributeAccess().getIDEnumLiteralDeclaration_1()); 
                    // InternalWebDsl.g:1011:3: ( 'ID' )
                    // InternalWebDsl.g:1011:4: 'ID'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getIDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1015:2: ( ( 'CLASS' ) )
                    {
                    // InternalWebDsl.g:1015:2: ( ( 'CLASS' ) )
                    // InternalWebDsl.g:1016:3: ( 'CLASS' )
                    {
                     before(grammarAccess.getAttributeAccess().getCLASSEnumLiteralDeclaration_2()); 
                    // InternalWebDsl.g:1017:3: ( 'CLASS' )
                    // InternalWebDsl.g:1017:4: 'CLASS'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getCLASSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1021:2: ( ( 'ALT' ) )
                    {
                    // InternalWebDsl.g:1021:2: ( ( 'ALT' ) )
                    // InternalWebDsl.g:1022:3: ( 'ALT' )
                    {
                     before(grammarAccess.getAttributeAccess().getALTEnumLiteralDeclaration_3()); 
                    // InternalWebDsl.g:1023:3: ( 'ALT' )
                    // InternalWebDsl.g:1023:4: 'ALT'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getALTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1027:2: ( ( 'VALUE' ) )
                    {
                    // InternalWebDsl.g:1027:2: ( ( 'VALUE' ) )
                    // InternalWebDsl.g:1028:3: ( 'VALUE' )
                    {
                     before(grammarAccess.getAttributeAccess().getVALUEEnumLiteralDeclaration_4()); 
                    // InternalWebDsl.g:1029:3: ( 'VALUE' )
                    // InternalWebDsl.g:1029:4: 'VALUE'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getVALUEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWebDsl.g:1033:2: ( ( 'HREF' ) )
                    {
                    // InternalWebDsl.g:1033:2: ( ( 'HREF' ) )
                    // InternalWebDsl.g:1034:3: ( 'HREF' )
                    {
                     before(grammarAccess.getAttributeAccess().getHREFEnumLiteralDeclaration_5()); 
                    // InternalWebDsl.g:1035:3: ( 'HREF' )
                    // InternalWebDsl.g:1035:4: 'HREF'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getHREFEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalWebDsl.g:1039:2: ( ( 'TITLE' ) )
                    {
                    // InternalWebDsl.g:1039:2: ( ( 'TITLE' ) )
                    // InternalWebDsl.g:1040:3: ( 'TITLE' )
                    {
                     before(grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_6()); 
                    // InternalWebDsl.g:1041:3: ( 'TITLE' )
                    // InternalWebDsl.g:1041:4: 'TITLE'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__Core__Group__0"
    // InternalWebDsl.g:1049:1: rule__Core__Group__0 : rule__Core__Group__0__Impl rule__Core__Group__1 ;
    public final void rule__Core__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1053:1: ( rule__Core__Group__0__Impl rule__Core__Group__1 )
            // InternalWebDsl.g:1054:2: rule__Core__Group__0__Impl rule__Core__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Core__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Core__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Core__Group__0"


    // $ANTLR start "rule__Core__Group__0__Impl"
    // InternalWebDsl.g:1061:1: rule__Core__Group__0__Impl : ( 'open_browser' ) ;
    public final void rule__Core__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1065:1: ( ( 'open_browser' ) )
            // InternalWebDsl.g:1066:1: ( 'open_browser' )
            {
            // InternalWebDsl.g:1066:1: ( 'open_browser' )
            // InternalWebDsl.g:1067:2: 'open_browser'
            {
             before(grammarAccess.getCoreAccess().getOpen_browserKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCoreAccess().getOpen_browserKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Core__Group__0__Impl"


    // $ANTLR start "rule__Core__Group__1"
    // InternalWebDsl.g:1076:1: rule__Core__Group__1 : rule__Core__Group__1__Impl rule__Core__Group__2 ;
    public final void rule__Core__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1080:1: ( rule__Core__Group__1__Impl rule__Core__Group__2 )
            // InternalWebDsl.g:1081:2: rule__Core__Group__1__Impl rule__Core__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Core__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Core__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Core__Group__1"


    // $ANTLR start "rule__Core__Group__1__Impl"
    // InternalWebDsl.g:1088:1: rule__Core__Group__1__Impl : ( ( rule__Core__NameAssignment_1 ) ) ;
    public final void rule__Core__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1092:1: ( ( ( rule__Core__NameAssignment_1 ) ) )
            // InternalWebDsl.g:1093:1: ( ( rule__Core__NameAssignment_1 ) )
            {
            // InternalWebDsl.g:1093:1: ( ( rule__Core__NameAssignment_1 ) )
            // InternalWebDsl.g:1094:2: ( rule__Core__NameAssignment_1 )
            {
             before(grammarAccess.getCoreAccess().getNameAssignment_1()); 
            // InternalWebDsl.g:1095:2: ( rule__Core__NameAssignment_1 )
            // InternalWebDsl.g:1095:3: rule__Core__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Core__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoreAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Core__Group__1__Impl"


    // $ANTLR start "rule__Core__Group__2"
    // InternalWebDsl.g:1103:1: rule__Core__Group__2 : rule__Core__Group__2__Impl ;
    public final void rule__Core__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1107:1: ( rule__Core__Group__2__Impl )
            // InternalWebDsl.g:1108:2: rule__Core__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Core__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Core__Group__2"


    // $ANTLR start "rule__Core__Group__2__Impl"
    // InternalWebDsl.g:1114:1: rule__Core__Group__2__Impl : ( ( rule__Core__ActionsAssignment_2 )* ) ;
    public final void rule__Core__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1118:1: ( ( ( rule__Core__ActionsAssignment_2 )* ) )
            // InternalWebDsl.g:1119:1: ( ( rule__Core__ActionsAssignment_2 )* )
            {
            // InternalWebDsl.g:1119:1: ( ( rule__Core__ActionsAssignment_2 )* )
            // InternalWebDsl.g:1120:2: ( rule__Core__ActionsAssignment_2 )*
            {
             before(grammarAccess.getCoreAccess().getActionsAssignment_2()); 
            // InternalWebDsl.g:1121:2: ( rule__Core__ActionsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=11 && LA17_0<=12)||(LA17_0>=14 && LA17_0<=16)||(LA17_0>=29 && LA17_0<=30)||LA17_0==40||LA17_0==44) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalWebDsl.g:1121:3: rule__Core__ActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Core__ActionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCoreAccess().getActionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Core__Group__2__Impl"


    // $ANTLR start "rule__GoAction__Group__0"
    // InternalWebDsl.g:1130:1: rule__GoAction__Group__0 : rule__GoAction__Group__0__Impl rule__GoAction__Group__1 ;
    public final void rule__GoAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1134:1: ( rule__GoAction__Group__0__Impl rule__GoAction__Group__1 )
            // InternalWebDsl.g:1135:2: rule__GoAction__Group__0__Impl rule__GoAction__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__GoAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoAction__Group__0"


    // $ANTLR start "rule__GoAction__Group__0__Impl"
    // InternalWebDsl.g:1142:1: rule__GoAction__Group__0__Impl : ( 'go' ) ;
    public final void rule__GoAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1146:1: ( ( 'go' ) )
            // InternalWebDsl.g:1147:1: ( 'go' )
            {
            // InternalWebDsl.g:1147:1: ( 'go' )
            // InternalWebDsl.g:1148:2: 'go'
            {
             before(grammarAccess.getGoActionAccess().getGoKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGoActionAccess().getGoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoAction__Group__0__Impl"


    // $ANTLR start "rule__GoAction__Group__1"
    // InternalWebDsl.g:1157:1: rule__GoAction__Group__1 : rule__GoAction__Group__1__Impl ;
    public final void rule__GoAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1161:1: ( rule__GoAction__Group__1__Impl )
            // InternalWebDsl.g:1162:2: rule__GoAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoAction__Group__1"


    // $ANTLR start "rule__GoAction__Group__1__Impl"
    // InternalWebDsl.g:1168:1: rule__GoAction__Group__1__Impl : ( ( rule__GoAction__NameAssignment_1 ) ) ;
    public final void rule__GoAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1172:1: ( ( ( rule__GoAction__NameAssignment_1 ) ) )
            // InternalWebDsl.g:1173:1: ( ( rule__GoAction__NameAssignment_1 ) )
            {
            // InternalWebDsl.g:1173:1: ( ( rule__GoAction__NameAssignment_1 ) )
            // InternalWebDsl.g:1174:2: ( rule__GoAction__NameAssignment_1 )
            {
             before(grammarAccess.getGoActionAccess().getNameAssignment_1()); 
            // InternalWebDsl.g:1175:2: ( rule__GoAction__NameAssignment_1 )
            // InternalWebDsl.g:1175:3: rule__GoAction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GoAction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoAction__Group__1__Impl"


    // $ANTLR start "rule__LinkButtonSelection__Group__0"
    // InternalWebDsl.g:1184:1: rule__LinkButtonSelection__Group__0 : rule__LinkButtonSelection__Group__0__Impl rule__LinkButtonSelection__Group__1 ;
    public final void rule__LinkButtonSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1188:1: ( rule__LinkButtonSelection__Group__0__Impl rule__LinkButtonSelection__Group__1 )
            // InternalWebDsl.g:1189:2: rule__LinkButtonSelection__Group__0__Impl rule__LinkButtonSelection__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LinkButtonSelection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkButtonSelection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkButtonSelection__Group__0"


    // $ANTLR start "rule__LinkButtonSelection__Group__0__Impl"
    // InternalWebDsl.g:1196:1: rule__LinkButtonSelection__Group__0__Impl : ( ( rule__LinkButtonSelection__Alternatives_0 ) ) ;
    public final void rule__LinkButtonSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1200:1: ( ( ( rule__LinkButtonSelection__Alternatives_0 ) ) )
            // InternalWebDsl.g:1201:1: ( ( rule__LinkButtonSelection__Alternatives_0 ) )
            {
            // InternalWebDsl.g:1201:1: ( ( rule__LinkButtonSelection__Alternatives_0 ) )
            // InternalWebDsl.g:1202:2: ( rule__LinkButtonSelection__Alternatives_0 )
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getAlternatives_0()); 
            // InternalWebDsl.g:1203:2: ( rule__LinkButtonSelection__Alternatives_0 )
            // InternalWebDsl.g:1203:3: rule__LinkButtonSelection__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__LinkButtonSelection__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getLinkButtonSelectionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkButtonSelection__Group__0__Impl"


    // $ANTLR start "rule__LinkButtonSelection__Group__1"
    // InternalWebDsl.g:1211:1: rule__LinkButtonSelection__Group__1 : rule__LinkButtonSelection__Group__1__Impl rule__LinkButtonSelection__Group__2 ;
    public final void rule__LinkButtonSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1215:1: ( rule__LinkButtonSelection__Group__1__Impl rule__LinkButtonSelection__Group__2 )
            // InternalWebDsl.g:1216:2: rule__LinkButtonSelection__Group__1__Impl rule__LinkButtonSelection__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__LinkButtonSelection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkButtonSelection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkButtonSelection__Group__1"


    // $ANTLR start "rule__LinkButtonSelection__Group__1__Impl"
    // InternalWebDsl.g:1223:1: rule__LinkButtonSelection__Group__1__Impl : ( ( rule__LinkButtonSelection__TypeSelectionAssignment_1 ) ) ;
    public final void rule__LinkButtonSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1227:1: ( ( ( rule__LinkButtonSelection__TypeSelectionAssignment_1 ) ) )
            // InternalWebDsl.g:1228:1: ( ( rule__LinkButtonSelection__TypeSelectionAssignment_1 ) )
            {
            // InternalWebDsl.g:1228:1: ( ( rule__LinkButtonSelection__TypeSelectionAssignment_1 ) )
            // InternalWebDsl.g:1229:2: ( rule__LinkButtonSelection__TypeSelectionAssignment_1 )
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getTypeSelectionAssignment_1()); 
            // InternalWebDsl.g:1230:2: ( rule__LinkButtonSelection__TypeSelectionAssignment_1 )
            // InternalWebDsl.g:1230:3: rule__LinkButtonSelection__TypeSelectionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LinkButtonSelection__TypeSelectionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkButtonSelectionAccess().getTypeSelectionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkButtonSelection__Group__1__Impl"


    // $ANTLR start "rule__LinkButtonSelection__Group__2"
    // InternalWebDsl.g:1238:1: rule__LinkButtonSelection__Group__2 : rule__LinkButtonSelection__Group__2__Impl rule__LinkButtonSelection__Group__3 ;
    public final void rule__LinkButtonSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1242:1: ( rule__LinkButtonSelection__Group__2__Impl rule__LinkButtonSelection__Group__3 )
            // InternalWebDsl.g:1243:2: rule__LinkButtonSelection__Group__2__Impl rule__LinkButtonSelection__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__LinkButtonSelection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkButtonSelection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkButtonSelection__Group__2"


    // $ANTLR start "rule__LinkButtonSelection__Group__2__Impl"
    // InternalWebDsl.g:1250:1: rule__LinkButtonSelection__Group__2__Impl : ( '{' ) ;
    public final void rule__LinkButtonSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1254:1: ( ( '{' ) )
            // InternalWebDsl.g:1255:1: ( '{' )
            {
            // InternalWebDsl.g:1255:1: ( '{' )
            // InternalWebDsl.g:1256:2: '{'
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLinkButtonSelectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkButtonSelection__Group__2__Impl"


    // $ANTLR start "rule__LinkButtonSelection__Group__3"
    // InternalWebDsl.g:1265:1: rule__LinkButtonSelection__Group__3 : rule__LinkButtonSelection__Group__3__Impl rule__LinkButtonSelection__Group__4 ;
    public final void rule__LinkButtonSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1269:1: ( rule__LinkButtonSelection__Group__3__Impl rule__LinkButtonSelection__Group__4 )
            // InternalWebDsl.g:1270:2: rule__LinkButtonSelection__Group__3__Impl rule__LinkButtonSelection__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__LinkButtonSelection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkButtonSelection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkButtonSelection__Group__3"


    // $ANTLR start "rule__LinkButtonSelection__Group__3__Impl"
    // InternalWebDsl.g:1277:1: rule__LinkButtonSelection__Group__3__Impl : ( ( rule__LinkButtonSelection__Alternatives_3 )* ) ;
    public final void rule__LinkButtonSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1281:1: ( ( ( rule__LinkButtonSelection__Alternatives_3 )* ) )
            // InternalWebDsl.g:1282:1: ( ( rule__LinkButtonSelection__Alternatives_3 )* )
            {
            // InternalWebDsl.g:1282:1: ( ( rule__LinkButtonSelection__Alternatives_3 )* )
            // InternalWebDsl.g:1283:2: ( rule__LinkButtonSelection__Alternatives_3 )*
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getAlternatives_3()); 
            // InternalWebDsl.g:1284:2: ( rule__LinkButtonSelection__Alternatives_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=11 && LA18_0<=16)||(LA18_0>=29 && LA18_0<=30)||(LA18_0>=44 && LA18_0<=45)||LA18_0==48) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalWebDsl.g:1284:3: rule__LinkButtonSelection__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__LinkButtonSelection__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getLinkButtonSelectionAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkButtonSelection__Group__3__Impl"


    // $ANTLR start "rule__LinkButtonSelection__Group__4"
    // InternalWebDsl.g:1292:1: rule__LinkButtonSelection__Group__4 : rule__LinkButtonSelection__Group__4__Impl ;
    public final void rule__LinkButtonSelection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1296:1: ( rule__LinkButtonSelection__Group__4__Impl )
            // InternalWebDsl.g:1297:2: rule__LinkButtonSelection__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkButtonSelection__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkButtonSelection__Group__4"


    // $ANTLR start "rule__LinkButtonSelection__Group__4__Impl"
    // InternalWebDsl.g:1303:1: rule__LinkButtonSelection__Group__4__Impl : ( '}' ) ;
    public final void rule__LinkButtonSelection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1307:1: ( ( '}' ) )
            // InternalWebDsl.g:1308:1: ( '}' )
            {
            // InternalWebDsl.g:1308:1: ( '}' )
            // InternalWebDsl.g:1309:2: '}'
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLinkButtonSelectionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkButtonSelection__Group__4__Impl"


    // $ANTLR start "rule__GeneralSelection__Group__0"
    // InternalWebDsl.g:1319:1: rule__GeneralSelection__Group__0 : rule__GeneralSelection__Group__0__Impl rule__GeneralSelection__Group__1 ;
    public final void rule__GeneralSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1323:1: ( rule__GeneralSelection__Group__0__Impl rule__GeneralSelection__Group__1 )
            // InternalWebDsl.g:1324:2: rule__GeneralSelection__Group__0__Impl rule__GeneralSelection__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__GeneralSelection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralSelection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralSelection__Group__0"


    // $ANTLR start "rule__GeneralSelection__Group__0__Impl"
    // InternalWebDsl.g:1331:1: rule__GeneralSelection__Group__0__Impl : ( ( rule__GeneralSelection__Alternatives_0 ) ) ;
    public final void rule__GeneralSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1335:1: ( ( ( rule__GeneralSelection__Alternatives_0 ) ) )
            // InternalWebDsl.g:1336:1: ( ( rule__GeneralSelection__Alternatives_0 ) )
            {
            // InternalWebDsl.g:1336:1: ( ( rule__GeneralSelection__Alternatives_0 ) )
            // InternalWebDsl.g:1337:2: ( rule__GeneralSelection__Alternatives_0 )
            {
             before(grammarAccess.getGeneralSelectionAccess().getAlternatives_0()); 
            // InternalWebDsl.g:1338:2: ( rule__GeneralSelection__Alternatives_0 )
            // InternalWebDsl.g:1338:3: rule__GeneralSelection__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralSelection__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralSelectionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralSelection__Group__0__Impl"


    // $ANTLR start "rule__GeneralSelection__Group__1"
    // InternalWebDsl.g:1346:1: rule__GeneralSelection__Group__1 : rule__GeneralSelection__Group__1__Impl rule__GeneralSelection__Group__2 ;
    public final void rule__GeneralSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1350:1: ( rule__GeneralSelection__Group__1__Impl rule__GeneralSelection__Group__2 )
            // InternalWebDsl.g:1351:2: rule__GeneralSelection__Group__1__Impl rule__GeneralSelection__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__GeneralSelection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralSelection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralSelection__Group__1"


    // $ANTLR start "rule__GeneralSelection__Group__1__Impl"
    // InternalWebDsl.g:1358:1: rule__GeneralSelection__Group__1__Impl : ( ( rule__GeneralSelection__TypeSelectionAssignment_1 ) ) ;
    public final void rule__GeneralSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1362:1: ( ( ( rule__GeneralSelection__TypeSelectionAssignment_1 ) ) )
            // InternalWebDsl.g:1363:1: ( ( rule__GeneralSelection__TypeSelectionAssignment_1 ) )
            {
            // InternalWebDsl.g:1363:1: ( ( rule__GeneralSelection__TypeSelectionAssignment_1 ) )
            // InternalWebDsl.g:1364:2: ( rule__GeneralSelection__TypeSelectionAssignment_1 )
            {
             before(grammarAccess.getGeneralSelectionAccess().getTypeSelectionAssignment_1()); 
            // InternalWebDsl.g:1365:2: ( rule__GeneralSelection__TypeSelectionAssignment_1 )
            // InternalWebDsl.g:1365:3: rule__GeneralSelection__TypeSelectionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralSelection__TypeSelectionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralSelectionAccess().getTypeSelectionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralSelection__Group__1__Impl"


    // $ANTLR start "rule__GeneralSelection__Group__2"
    // InternalWebDsl.g:1373:1: rule__GeneralSelection__Group__2 : rule__GeneralSelection__Group__2__Impl rule__GeneralSelection__Group__3 ;
    public final void rule__GeneralSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1377:1: ( rule__GeneralSelection__Group__2__Impl rule__GeneralSelection__Group__3 )
            // InternalWebDsl.g:1378:2: rule__GeneralSelection__Group__2__Impl rule__GeneralSelection__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__GeneralSelection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralSelection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralSelection__Group__2"


    // $ANTLR start "rule__GeneralSelection__Group__2__Impl"
    // InternalWebDsl.g:1385:1: rule__GeneralSelection__Group__2__Impl : ( '{' ) ;
    public final void rule__GeneralSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1389:1: ( ( '{' ) )
            // InternalWebDsl.g:1390:1: ( '{' )
            {
            // InternalWebDsl.g:1390:1: ( '{' )
            // InternalWebDsl.g:1391:2: '{'
            {
             before(grammarAccess.getGeneralSelectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getGeneralSelectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralSelection__Group__2__Impl"


    // $ANTLR start "rule__GeneralSelection__Group__3"
    // InternalWebDsl.g:1400:1: rule__GeneralSelection__Group__3 : rule__GeneralSelection__Group__3__Impl rule__GeneralSelection__Group__4 ;
    public final void rule__GeneralSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1404:1: ( rule__GeneralSelection__Group__3__Impl rule__GeneralSelection__Group__4 )
            // InternalWebDsl.g:1405:2: rule__GeneralSelection__Group__3__Impl rule__GeneralSelection__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__GeneralSelection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralSelection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralSelection__Group__3"


    // $ANTLR start "rule__GeneralSelection__Group__3__Impl"
    // InternalWebDsl.g:1412:1: rule__GeneralSelection__Group__3__Impl : ( ( rule__GeneralSelection__GeneralActionsAssignment_3 )* ) ;
    public final void rule__GeneralSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1416:1: ( ( ( rule__GeneralSelection__GeneralActionsAssignment_3 )* ) )
            // InternalWebDsl.g:1417:1: ( ( rule__GeneralSelection__GeneralActionsAssignment_3 )* )
            {
            // InternalWebDsl.g:1417:1: ( ( rule__GeneralSelection__GeneralActionsAssignment_3 )* )
            // InternalWebDsl.g:1418:2: ( rule__GeneralSelection__GeneralActionsAssignment_3 )*
            {
             before(grammarAccess.getGeneralSelectionAccess().getGeneralActionsAssignment_3()); 
            // InternalWebDsl.g:1419:2: ( rule__GeneralSelection__GeneralActionsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=11 && LA19_0<=12)||(LA19_0>=14 && LA19_0<=16)||(LA19_0>=29 && LA19_0<=30)||(LA19_0>=44 && LA19_0<=45)||LA19_0==48) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalWebDsl.g:1419:3: rule__GeneralSelection__GeneralActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__GeneralSelection__GeneralActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getGeneralSelectionAccess().getGeneralActionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralSelection__Group__3__Impl"


    // $ANTLR start "rule__GeneralSelection__Group__4"
    // InternalWebDsl.g:1427:1: rule__GeneralSelection__Group__4 : rule__GeneralSelection__Group__4__Impl ;
    public final void rule__GeneralSelection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1431:1: ( rule__GeneralSelection__Group__4__Impl )
            // InternalWebDsl.g:1432:2: rule__GeneralSelection__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralSelection__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralSelection__Group__4"


    // $ANTLR start "rule__GeneralSelection__Group__4__Impl"
    // InternalWebDsl.g:1438:1: rule__GeneralSelection__Group__4__Impl : ( '}' ) ;
    public final void rule__GeneralSelection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1442:1: ( ( '}' ) )
            // InternalWebDsl.g:1443:1: ( '}' )
            {
            // InternalWebDsl.g:1443:1: ( '}' )
            // InternalWebDsl.g:1444:2: '}'
            {
             before(grammarAccess.getGeneralSelectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getGeneralSelectionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralSelection__Group__4__Impl"


    // $ANTLR start "rule__CheckboxSelection__Group__0"
    // InternalWebDsl.g:1454:1: rule__CheckboxSelection__Group__0 : rule__CheckboxSelection__Group__0__Impl rule__CheckboxSelection__Group__1 ;
    public final void rule__CheckboxSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1458:1: ( rule__CheckboxSelection__Group__0__Impl rule__CheckboxSelection__Group__1 )
            // InternalWebDsl.g:1459:2: rule__CheckboxSelection__Group__0__Impl rule__CheckboxSelection__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CheckboxSelection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckboxSelection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSelection__Group__0"


    // $ANTLR start "rule__CheckboxSelection__Group__0__Impl"
    // InternalWebDsl.g:1466:1: rule__CheckboxSelection__Group__0__Impl : ( 'CHECKBOX' ) ;
    public final void rule__CheckboxSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1470:1: ( ( 'CHECKBOX' ) )
            // InternalWebDsl.g:1471:1: ( 'CHECKBOX' )
            {
            // InternalWebDsl.g:1471:1: ( 'CHECKBOX' )
            // InternalWebDsl.g:1472:2: 'CHECKBOX'
            {
             before(grammarAccess.getCheckboxSelectionAccess().getCHECKBOXKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCheckboxSelectionAccess().getCHECKBOXKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSelection__Group__0__Impl"


    // $ANTLR start "rule__CheckboxSelection__Group__1"
    // InternalWebDsl.g:1481:1: rule__CheckboxSelection__Group__1 : rule__CheckboxSelection__Group__1__Impl rule__CheckboxSelection__Group__2 ;
    public final void rule__CheckboxSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1485:1: ( rule__CheckboxSelection__Group__1__Impl rule__CheckboxSelection__Group__2 )
            // InternalWebDsl.g:1486:2: rule__CheckboxSelection__Group__1__Impl rule__CheckboxSelection__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CheckboxSelection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckboxSelection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSelection__Group__1"


    // $ANTLR start "rule__CheckboxSelection__Group__1__Impl"
    // InternalWebDsl.g:1493:1: rule__CheckboxSelection__Group__1__Impl : ( ( rule__CheckboxSelection__TypeSelectionAssignment_1 ) ) ;
    public final void rule__CheckboxSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1497:1: ( ( ( rule__CheckboxSelection__TypeSelectionAssignment_1 ) ) )
            // InternalWebDsl.g:1498:1: ( ( rule__CheckboxSelection__TypeSelectionAssignment_1 ) )
            {
            // InternalWebDsl.g:1498:1: ( ( rule__CheckboxSelection__TypeSelectionAssignment_1 ) )
            // InternalWebDsl.g:1499:2: ( rule__CheckboxSelection__TypeSelectionAssignment_1 )
            {
             before(grammarAccess.getCheckboxSelectionAccess().getTypeSelectionAssignment_1()); 
            // InternalWebDsl.g:1500:2: ( rule__CheckboxSelection__TypeSelectionAssignment_1 )
            // InternalWebDsl.g:1500:3: rule__CheckboxSelection__TypeSelectionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxSelection__TypeSelectionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxSelectionAccess().getTypeSelectionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSelection__Group__1__Impl"


    // $ANTLR start "rule__CheckboxSelection__Group__2"
    // InternalWebDsl.g:1508:1: rule__CheckboxSelection__Group__2 : rule__CheckboxSelection__Group__2__Impl rule__CheckboxSelection__Group__3 ;
    public final void rule__CheckboxSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1512:1: ( rule__CheckboxSelection__Group__2__Impl rule__CheckboxSelection__Group__3 )
            // InternalWebDsl.g:1513:2: rule__CheckboxSelection__Group__2__Impl rule__CheckboxSelection__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__CheckboxSelection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckboxSelection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSelection__Group__2"


    // $ANTLR start "rule__CheckboxSelection__Group__2__Impl"
    // InternalWebDsl.g:1520:1: rule__CheckboxSelection__Group__2__Impl : ( '{' ) ;
    public final void rule__CheckboxSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1524:1: ( ( '{' ) )
            // InternalWebDsl.g:1525:1: ( '{' )
            {
            // InternalWebDsl.g:1525:1: ( '{' )
            // InternalWebDsl.g:1526:2: '{'
            {
             before(grammarAccess.getCheckboxSelectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCheckboxSelectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSelection__Group__2__Impl"


    // $ANTLR start "rule__CheckboxSelection__Group__3"
    // InternalWebDsl.g:1535:1: rule__CheckboxSelection__Group__3 : rule__CheckboxSelection__Group__3__Impl rule__CheckboxSelection__Group__4 ;
    public final void rule__CheckboxSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1539:1: ( rule__CheckboxSelection__Group__3__Impl rule__CheckboxSelection__Group__4 )
            // InternalWebDsl.g:1540:2: rule__CheckboxSelection__Group__3__Impl rule__CheckboxSelection__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__CheckboxSelection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckboxSelection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSelection__Group__3"


    // $ANTLR start "rule__CheckboxSelection__Group__3__Impl"
    // InternalWebDsl.g:1547:1: rule__CheckboxSelection__Group__3__Impl : ( ( rule__CheckboxSelection__Alternatives_3 )* ) ;
    public final void rule__CheckboxSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1551:1: ( ( ( rule__CheckboxSelection__Alternatives_3 )* ) )
            // InternalWebDsl.g:1552:1: ( ( rule__CheckboxSelection__Alternatives_3 )* )
            {
            // InternalWebDsl.g:1552:1: ( ( rule__CheckboxSelection__Alternatives_3 )* )
            // InternalWebDsl.g:1553:2: ( rule__CheckboxSelection__Alternatives_3 )*
            {
             before(grammarAccess.getCheckboxSelectionAccess().getAlternatives_3()); 
            // InternalWebDsl.g:1554:2: ( rule__CheckboxSelection__Alternatives_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=11 && LA20_0<=12)||(LA20_0>=14 && LA20_0<=18)||(LA20_0>=29 && LA20_0<=30)||(LA20_0>=44 && LA20_0<=45)||LA20_0==48) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalWebDsl.g:1554:3: rule__CheckboxSelection__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__CheckboxSelection__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getCheckboxSelectionAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSelection__Group__3__Impl"


    // $ANTLR start "rule__CheckboxSelection__Group__4"
    // InternalWebDsl.g:1562:1: rule__CheckboxSelection__Group__4 : rule__CheckboxSelection__Group__4__Impl ;
    public final void rule__CheckboxSelection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1566:1: ( rule__CheckboxSelection__Group__4__Impl )
            // InternalWebDsl.g:1567:2: rule__CheckboxSelection__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxSelection__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSelection__Group__4"


    // $ANTLR start "rule__CheckboxSelection__Group__4__Impl"
    // InternalWebDsl.g:1573:1: rule__CheckboxSelection__Group__4__Impl : ( '}' ) ;
    public final void rule__CheckboxSelection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1577:1: ( ( '}' ) )
            // InternalWebDsl.g:1578:1: ( '}' )
            {
            // InternalWebDsl.g:1578:1: ( '}' )
            // InternalWebDsl.g:1579:2: '}'
            {
             before(grammarAccess.getCheckboxSelectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCheckboxSelectionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSelection__Group__4__Impl"


    // $ANTLR start "rule__ComboboxSelection__Group__0"
    // InternalWebDsl.g:1589:1: rule__ComboboxSelection__Group__0 : rule__ComboboxSelection__Group__0__Impl rule__ComboboxSelection__Group__1 ;
    public final void rule__ComboboxSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1593:1: ( rule__ComboboxSelection__Group__0__Impl rule__ComboboxSelection__Group__1 )
            // InternalWebDsl.g:1594:2: rule__ComboboxSelection__Group__0__Impl rule__ComboboxSelection__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ComboboxSelection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComboboxSelection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__Group__0"


    // $ANTLR start "rule__ComboboxSelection__Group__0__Impl"
    // InternalWebDsl.g:1601:1: rule__ComboboxSelection__Group__0__Impl : ( 'COMBO_BOX' ) ;
    public final void rule__ComboboxSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1605:1: ( ( 'COMBO_BOX' ) )
            // InternalWebDsl.g:1606:1: ( 'COMBO_BOX' )
            {
            // InternalWebDsl.g:1606:1: ( 'COMBO_BOX' )
            // InternalWebDsl.g:1607:2: 'COMBO_BOX'
            {
             before(grammarAccess.getComboboxSelectionAccess().getCOMBO_BOXKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComboboxSelectionAccess().getCOMBO_BOXKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__Group__0__Impl"


    // $ANTLR start "rule__ComboboxSelection__Group__1"
    // InternalWebDsl.g:1616:1: rule__ComboboxSelection__Group__1 : rule__ComboboxSelection__Group__1__Impl rule__ComboboxSelection__Group__2 ;
    public final void rule__ComboboxSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1620:1: ( rule__ComboboxSelection__Group__1__Impl rule__ComboboxSelection__Group__2 )
            // InternalWebDsl.g:1621:2: rule__ComboboxSelection__Group__1__Impl rule__ComboboxSelection__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ComboboxSelection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComboboxSelection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__Group__1"


    // $ANTLR start "rule__ComboboxSelection__Group__1__Impl"
    // InternalWebDsl.g:1628:1: rule__ComboboxSelection__Group__1__Impl : ( ( rule__ComboboxSelection__TypeSelectionAssignment_1 ) ) ;
    public final void rule__ComboboxSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1632:1: ( ( ( rule__ComboboxSelection__TypeSelectionAssignment_1 ) ) )
            // InternalWebDsl.g:1633:1: ( ( rule__ComboboxSelection__TypeSelectionAssignment_1 ) )
            {
            // InternalWebDsl.g:1633:1: ( ( rule__ComboboxSelection__TypeSelectionAssignment_1 ) )
            // InternalWebDsl.g:1634:2: ( rule__ComboboxSelection__TypeSelectionAssignment_1 )
            {
             before(grammarAccess.getComboboxSelectionAccess().getTypeSelectionAssignment_1()); 
            // InternalWebDsl.g:1635:2: ( rule__ComboboxSelection__TypeSelectionAssignment_1 )
            // InternalWebDsl.g:1635:3: rule__ComboboxSelection__TypeSelectionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComboboxSelection__TypeSelectionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComboboxSelectionAccess().getTypeSelectionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__Group__1__Impl"


    // $ANTLR start "rule__ComboboxSelection__Group__2"
    // InternalWebDsl.g:1643:1: rule__ComboboxSelection__Group__2 : rule__ComboboxSelection__Group__2__Impl rule__ComboboxSelection__Group__3 ;
    public final void rule__ComboboxSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1647:1: ( rule__ComboboxSelection__Group__2__Impl rule__ComboboxSelection__Group__3 )
            // InternalWebDsl.g:1648:2: rule__ComboboxSelection__Group__2__Impl rule__ComboboxSelection__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ComboboxSelection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComboboxSelection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__Group__2"


    // $ANTLR start "rule__ComboboxSelection__Group__2__Impl"
    // InternalWebDsl.g:1655:1: rule__ComboboxSelection__Group__2__Impl : ( '{' ) ;
    public final void rule__ComboboxSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1659:1: ( ( '{' ) )
            // InternalWebDsl.g:1660:1: ( '{' )
            {
            // InternalWebDsl.g:1660:1: ( '{' )
            // InternalWebDsl.g:1661:2: '{'
            {
             before(grammarAccess.getComboboxSelectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getComboboxSelectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__Group__2__Impl"


    // $ANTLR start "rule__ComboboxSelection__Group__3"
    // InternalWebDsl.g:1670:1: rule__ComboboxSelection__Group__3 : rule__ComboboxSelection__Group__3__Impl rule__ComboboxSelection__Group__4 ;
    public final void rule__ComboboxSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1674:1: ( rule__ComboboxSelection__Group__3__Impl rule__ComboboxSelection__Group__4 )
            // InternalWebDsl.g:1675:2: rule__ComboboxSelection__Group__3__Impl rule__ComboboxSelection__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ComboboxSelection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComboboxSelection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__Group__3"


    // $ANTLR start "rule__ComboboxSelection__Group__3__Impl"
    // InternalWebDsl.g:1682:1: rule__ComboboxSelection__Group__3__Impl : ( ( rule__ComboboxSelection__Alternatives_3 )* ) ;
    public final void rule__ComboboxSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1686:1: ( ( ( rule__ComboboxSelection__Alternatives_3 )* ) )
            // InternalWebDsl.g:1687:1: ( ( rule__ComboboxSelection__Alternatives_3 )* )
            {
            // InternalWebDsl.g:1687:1: ( ( rule__ComboboxSelection__Alternatives_3 )* )
            // InternalWebDsl.g:1688:2: ( rule__ComboboxSelection__Alternatives_3 )*
            {
             before(grammarAccess.getComboboxSelectionAccess().getAlternatives_3()); 
            // InternalWebDsl.g:1689:2: ( rule__ComboboxSelection__Alternatives_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=11 && LA21_0<=12)||(LA21_0>=14 && LA21_0<=16)||(LA21_0>=29 && LA21_0<=30)||(LA21_0>=43 && LA21_0<=45)||LA21_0==48) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalWebDsl.g:1689:3: rule__ComboboxSelection__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ComboboxSelection__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getComboboxSelectionAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__Group__3__Impl"


    // $ANTLR start "rule__ComboboxSelection__Group__4"
    // InternalWebDsl.g:1697:1: rule__ComboboxSelection__Group__4 : rule__ComboboxSelection__Group__4__Impl ;
    public final void rule__ComboboxSelection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1701:1: ( rule__ComboboxSelection__Group__4__Impl )
            // InternalWebDsl.g:1702:2: rule__ComboboxSelection__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComboboxSelection__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__Group__4"


    // $ANTLR start "rule__ComboboxSelection__Group__4__Impl"
    // InternalWebDsl.g:1708:1: rule__ComboboxSelection__Group__4__Impl : ( '}' ) ;
    public final void rule__ComboboxSelection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1712:1: ( ( '}' ) )
            // InternalWebDsl.g:1713:1: ( '}' )
            {
            // InternalWebDsl.g:1713:1: ( '}' )
            // InternalWebDsl.g:1714:2: '}'
            {
             before(grammarAccess.getComboboxSelectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getComboboxSelectionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__Group__4__Impl"


    // $ANTLR start "rule__ComboboxSelection__Group_3_1__0"
    // InternalWebDsl.g:1724:1: rule__ComboboxSelection__Group_3_1__0 : rule__ComboboxSelection__Group_3_1__0__Impl rule__ComboboxSelection__Group_3_1__1 ;
    public final void rule__ComboboxSelection__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1728:1: ( rule__ComboboxSelection__Group_3_1__0__Impl rule__ComboboxSelection__Group_3_1__1 )
            // InternalWebDsl.g:1729:2: rule__ComboboxSelection__Group_3_1__0__Impl rule__ComboboxSelection__Group_3_1__1
            {
            pushFollow(FOLLOW_6);
            rule__ComboboxSelection__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComboboxSelection__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__Group_3_1__0"


    // $ANTLR start "rule__ComboboxSelection__Group_3_1__0__Impl"
    // InternalWebDsl.g:1736:1: rule__ComboboxSelection__Group_3_1__0__Impl : ( 'select' ) ;
    public final void rule__ComboboxSelection__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1740:1: ( ( 'select' ) )
            // InternalWebDsl.g:1741:1: ( 'select' )
            {
            // InternalWebDsl.g:1741:1: ( 'select' )
            // InternalWebDsl.g:1742:2: 'select'
            {
             before(grammarAccess.getComboboxSelectionAccess().getSelectKeyword_3_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getComboboxSelectionAccess().getSelectKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__Group_3_1__0__Impl"


    // $ANTLR start "rule__ComboboxSelection__Group_3_1__1"
    // InternalWebDsl.g:1751:1: rule__ComboboxSelection__Group_3_1__1 : rule__ComboboxSelection__Group_3_1__1__Impl ;
    public final void rule__ComboboxSelection__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1755:1: ( rule__ComboboxSelection__Group_3_1__1__Impl )
            // InternalWebDsl.g:1756:2: rule__ComboboxSelection__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComboboxSelection__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__Group_3_1__1"


    // $ANTLR start "rule__ComboboxSelection__Group_3_1__1__Impl"
    // InternalWebDsl.g:1762:1: rule__ComboboxSelection__Group_3_1__1__Impl : ( RULE_STRING ) ;
    public final void rule__ComboboxSelection__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1766:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:1767:1: ( RULE_STRING )
            {
            // InternalWebDsl.g:1767:1: ( RULE_STRING )
            // InternalWebDsl.g:1768:2: RULE_STRING
            {
             before(grammarAccess.getComboboxSelectionAccess().getSTRINGTerminalRuleCall_3_1_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComboboxSelectionAccess().getSTRINGTerminalRuleCall_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__Group_3_1__1__Impl"


    // $ANTLR start "rule__PageSelection__Group__0"
    // InternalWebDsl.g:1778:1: rule__PageSelection__Group__0 : rule__PageSelection__Group__0__Impl rule__PageSelection__Group__1 ;
    public final void rule__PageSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1782:1: ( rule__PageSelection__Group__0__Impl rule__PageSelection__Group__1 )
            // InternalWebDsl.g:1783:2: rule__PageSelection__Group__0__Impl rule__PageSelection__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__PageSelection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageSelection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageSelection__Group__0"


    // $ANTLR start "rule__PageSelection__Group__0__Impl"
    // InternalWebDsl.g:1790:1: rule__PageSelection__Group__0__Impl : ( 'PAGE' ) ;
    public final void rule__PageSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1794:1: ( ( 'PAGE' ) )
            // InternalWebDsl.g:1795:1: ( 'PAGE' )
            {
            // InternalWebDsl.g:1795:1: ( 'PAGE' )
            // InternalWebDsl.g:1796:2: 'PAGE'
            {
             before(grammarAccess.getPageSelectionAccess().getPAGEKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPageSelectionAccess().getPAGEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageSelection__Group__0__Impl"


    // $ANTLR start "rule__PageSelection__Group__1"
    // InternalWebDsl.g:1805:1: rule__PageSelection__Group__1 : rule__PageSelection__Group__1__Impl rule__PageSelection__Group__2 ;
    public final void rule__PageSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1809:1: ( rule__PageSelection__Group__1__Impl rule__PageSelection__Group__2 )
            // InternalWebDsl.g:1810:2: rule__PageSelection__Group__1__Impl rule__PageSelection__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__PageSelection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageSelection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageSelection__Group__1"


    // $ANTLR start "rule__PageSelection__Group__1__Impl"
    // InternalWebDsl.g:1817:1: rule__PageSelection__Group__1__Impl : ( '{' ) ;
    public final void rule__PageSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1821:1: ( ( '{' ) )
            // InternalWebDsl.g:1822:1: ( '{' )
            {
            // InternalWebDsl.g:1822:1: ( '{' )
            // InternalWebDsl.g:1823:2: '{'
            {
             before(grammarAccess.getPageSelectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPageSelectionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageSelection__Group__1__Impl"


    // $ANTLR start "rule__PageSelection__Group__2"
    // InternalWebDsl.g:1832:1: rule__PageSelection__Group__2 : rule__PageSelection__Group__2__Impl rule__PageSelection__Group__3 ;
    public final void rule__PageSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1836:1: ( rule__PageSelection__Group__2__Impl rule__PageSelection__Group__3 )
            // InternalWebDsl.g:1837:2: rule__PageSelection__Group__2__Impl rule__PageSelection__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__PageSelection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageSelection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageSelection__Group__2"


    // $ANTLR start "rule__PageSelection__Group__2__Impl"
    // InternalWebDsl.g:1844:1: rule__PageSelection__Group__2__Impl : ( ( rule__PageSelection__Alternatives_2 )* ) ;
    public final void rule__PageSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1848:1: ( ( ( rule__PageSelection__Alternatives_2 )* ) )
            // InternalWebDsl.g:1849:1: ( ( rule__PageSelection__Alternatives_2 )* )
            {
            // InternalWebDsl.g:1849:1: ( ( rule__PageSelection__Alternatives_2 )* )
            // InternalWebDsl.g:1850:2: ( rule__PageSelection__Alternatives_2 )*
            {
             before(grammarAccess.getPageSelectionAccess().getAlternatives_2()); 
            // InternalWebDsl.g:1851:2: ( rule__PageSelection__Alternatives_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==45||LA22_0==50) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalWebDsl.g:1851:3: rule__PageSelection__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__PageSelection__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPageSelectionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageSelection__Group__2__Impl"


    // $ANTLR start "rule__PageSelection__Group__3"
    // InternalWebDsl.g:1859:1: rule__PageSelection__Group__3 : rule__PageSelection__Group__3__Impl ;
    public final void rule__PageSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1863:1: ( rule__PageSelection__Group__3__Impl )
            // InternalWebDsl.g:1864:2: rule__PageSelection__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PageSelection__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageSelection__Group__3"


    // $ANTLR start "rule__PageSelection__Group__3__Impl"
    // InternalWebDsl.g:1870:1: rule__PageSelection__Group__3__Impl : ( '}' ) ;
    public final void rule__PageSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1874:1: ( ( '}' ) )
            // InternalWebDsl.g:1875:1: ( '}' )
            {
            // InternalWebDsl.g:1875:1: ( '}' )
            // InternalWebDsl.g:1876:2: '}'
            {
             before(grammarAccess.getPageSelectionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPageSelectionAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageSelection__Group__3__Impl"


    // $ANTLR start "rule__StoreAction__Group__0"
    // InternalWebDsl.g:1886:1: rule__StoreAction__Group__0 : rule__StoreAction__Group__0__Impl rule__StoreAction__Group__1 ;
    public final void rule__StoreAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1890:1: ( rule__StoreAction__Group__0__Impl rule__StoreAction__Group__1 )
            // InternalWebDsl.g:1891:2: rule__StoreAction__Group__0__Impl rule__StoreAction__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__StoreAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreAction__Group__0"


    // $ANTLR start "rule__StoreAction__Group__0__Impl"
    // InternalWebDsl.g:1898:1: rule__StoreAction__Group__0__Impl : ( 'store' ) ;
    public final void rule__StoreAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1902:1: ( ( 'store' ) )
            // InternalWebDsl.g:1903:1: ( 'store' )
            {
            // InternalWebDsl.g:1903:1: ( 'store' )
            // InternalWebDsl.g:1904:2: 'store'
            {
             before(grammarAccess.getStoreActionAccess().getStoreKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getStoreActionAccess().getStoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreAction__Group__0__Impl"


    // $ANTLR start "rule__StoreAction__Group__1"
    // InternalWebDsl.g:1913:1: rule__StoreAction__Group__1 : rule__StoreAction__Group__1__Impl rule__StoreAction__Group__2 ;
    public final void rule__StoreAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1917:1: ( rule__StoreAction__Group__1__Impl rule__StoreAction__Group__2 )
            // InternalWebDsl.g:1918:2: rule__StoreAction__Group__1__Impl rule__StoreAction__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__StoreAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreAction__Group__1"


    // $ANTLR start "rule__StoreAction__Group__1__Impl"
    // InternalWebDsl.g:1925:1: rule__StoreAction__Group__1__Impl : ( '()' ) ;
    public final void rule__StoreAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1929:1: ( ( '()' ) )
            // InternalWebDsl.g:1930:1: ( '()' )
            {
            // InternalWebDsl.g:1930:1: ( '()' )
            // InternalWebDsl.g:1931:2: '()'
            {
             before(grammarAccess.getStoreActionAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getStoreActionAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreAction__Group__1__Impl"


    // $ANTLR start "rule__StoreAction__Group__2"
    // InternalWebDsl.g:1940:1: rule__StoreAction__Group__2 : rule__StoreAction__Group__2__Impl rule__StoreAction__Group__3 ;
    public final void rule__StoreAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1944:1: ( rule__StoreAction__Group__2__Impl rule__StoreAction__Group__3 )
            // InternalWebDsl.g:1945:2: rule__StoreAction__Group__2__Impl rule__StoreAction__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__StoreAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreAction__Group__2"


    // $ANTLR start "rule__StoreAction__Group__2__Impl"
    // InternalWebDsl.g:1952:1: rule__StoreAction__Group__2__Impl : ( 'in' ) ;
    public final void rule__StoreAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1956:1: ( ( 'in' ) )
            // InternalWebDsl.g:1957:1: ( 'in' )
            {
            // InternalWebDsl.g:1957:1: ( 'in' )
            // InternalWebDsl.g:1958:2: 'in'
            {
             before(grammarAccess.getStoreActionAccess().getInKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getStoreActionAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreAction__Group__2__Impl"


    // $ANTLR start "rule__StoreAction__Group__3"
    // InternalWebDsl.g:1967:1: rule__StoreAction__Group__3 : rule__StoreAction__Group__3__Impl ;
    public final void rule__StoreAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1971:1: ( rule__StoreAction__Group__3__Impl )
            // InternalWebDsl.g:1972:2: rule__StoreAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoreAction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreAction__Group__3"


    // $ANTLR start "rule__StoreAction__Group__3__Impl"
    // InternalWebDsl.g:1978:1: rule__StoreAction__Group__3__Impl : ( ( rule__StoreAction__VarAssignment_3 ) ) ;
    public final void rule__StoreAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1982:1: ( ( ( rule__StoreAction__VarAssignment_3 ) ) )
            // InternalWebDsl.g:1983:1: ( ( rule__StoreAction__VarAssignment_3 ) )
            {
            // InternalWebDsl.g:1983:1: ( ( rule__StoreAction__VarAssignment_3 ) )
            // InternalWebDsl.g:1984:2: ( rule__StoreAction__VarAssignment_3 )
            {
             before(grammarAccess.getStoreActionAccess().getVarAssignment_3()); 
            // InternalWebDsl.g:1985:2: ( rule__StoreAction__VarAssignment_3 )
            // InternalWebDsl.g:1985:3: rule__StoreAction__VarAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StoreAction__VarAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStoreActionAccess().getVarAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreAction__Group__3__Impl"


    // $ANTLR start "rule__SetAction__Group__0"
    // InternalWebDsl.g:1994:1: rule__SetAction__Group__0 : rule__SetAction__Group__0__Impl rule__SetAction__Group__1 ;
    public final void rule__SetAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1998:1: ( rule__SetAction__Group__0__Impl rule__SetAction__Group__1 )
            // InternalWebDsl.g:1999:2: rule__SetAction__Group__0__Impl rule__SetAction__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__SetAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAction__Group__0"


    // $ANTLR start "rule__SetAction__Group__0__Impl"
    // InternalWebDsl.g:2006:1: rule__SetAction__Group__0__Impl : ( 'set' ) ;
    public final void rule__SetAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2010:1: ( ( 'set' ) )
            // InternalWebDsl.g:2011:1: ( 'set' )
            {
            // InternalWebDsl.g:2011:1: ( 'set' )
            // InternalWebDsl.g:2012:2: 'set'
            {
             before(grammarAccess.getSetActionAccess().getSetKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSetActionAccess().getSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAction__Group__0__Impl"


    // $ANTLR start "rule__SetAction__Group__1"
    // InternalWebDsl.g:2021:1: rule__SetAction__Group__1 : rule__SetAction__Group__1__Impl rule__SetAction__Group__2 ;
    public final void rule__SetAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2025:1: ( rule__SetAction__Group__1__Impl rule__SetAction__Group__2 )
            // InternalWebDsl.g:2026:2: rule__SetAction__Group__1__Impl rule__SetAction__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__SetAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAction__Group__1"


    // $ANTLR start "rule__SetAction__Group__1__Impl"
    // InternalWebDsl.g:2033:1: rule__SetAction__Group__1__Impl : ( ( rule__SetAction__AttributeAssignment_1 ) ) ;
    public final void rule__SetAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2037:1: ( ( ( rule__SetAction__AttributeAssignment_1 ) ) )
            // InternalWebDsl.g:2038:1: ( ( rule__SetAction__AttributeAssignment_1 ) )
            {
            // InternalWebDsl.g:2038:1: ( ( rule__SetAction__AttributeAssignment_1 ) )
            // InternalWebDsl.g:2039:2: ( rule__SetAction__AttributeAssignment_1 )
            {
             before(grammarAccess.getSetActionAccess().getAttributeAssignment_1()); 
            // InternalWebDsl.g:2040:2: ( rule__SetAction__AttributeAssignment_1 )
            // InternalWebDsl.g:2040:3: rule__SetAction__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SetAction__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetActionAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAction__Group__1__Impl"


    // $ANTLR start "rule__SetAction__Group__2"
    // InternalWebDsl.g:2048:1: rule__SetAction__Group__2 : rule__SetAction__Group__2__Impl rule__SetAction__Group__3 ;
    public final void rule__SetAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2052:1: ( rule__SetAction__Group__2__Impl rule__SetAction__Group__3 )
            // InternalWebDsl.g:2053:2: rule__SetAction__Group__2__Impl rule__SetAction__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SetAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAction__Group__2"


    // $ANTLR start "rule__SetAction__Group__2__Impl"
    // InternalWebDsl.g:2060:1: rule__SetAction__Group__2__Impl : ( ':' ) ;
    public final void rule__SetAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2064:1: ( ( ':' ) )
            // InternalWebDsl.g:2065:1: ( ':' )
            {
            // InternalWebDsl.g:2065:1: ( ':' )
            // InternalWebDsl.g:2066:2: ':'
            {
             before(grammarAccess.getSetActionAccess().getColonKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSetActionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAction__Group__2__Impl"


    // $ANTLR start "rule__SetAction__Group__3"
    // InternalWebDsl.g:2075:1: rule__SetAction__Group__3 : rule__SetAction__Group__3__Impl ;
    public final void rule__SetAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2079:1: ( rule__SetAction__Group__3__Impl )
            // InternalWebDsl.g:2080:2: rule__SetAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetAction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAction__Group__3"


    // $ANTLR start "rule__SetAction__Group__3__Impl"
    // InternalWebDsl.g:2086:1: rule__SetAction__Group__3__Impl : ( ( rule__SetAction__ValueAssignment_3 ) ) ;
    public final void rule__SetAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2090:1: ( ( ( rule__SetAction__ValueAssignment_3 ) ) )
            // InternalWebDsl.g:2091:1: ( ( rule__SetAction__ValueAssignment_3 ) )
            {
            // InternalWebDsl.g:2091:1: ( ( rule__SetAction__ValueAssignment_3 ) )
            // InternalWebDsl.g:2092:2: ( rule__SetAction__ValueAssignment_3 )
            {
             before(grammarAccess.getSetActionAccess().getValueAssignment_3()); 
            // InternalWebDsl.g:2093:2: ( rule__SetAction__ValueAssignment_3 )
            // InternalWebDsl.g:2093:3: rule__SetAction__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SetAction__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSetActionAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAction__Group__3__Impl"


    // $ANTLR start "rule__TypeSelection__Group_0__0"
    // InternalWebDsl.g:2102:1: rule__TypeSelection__Group_0__0 : rule__TypeSelection__Group_0__0__Impl rule__TypeSelection__Group_0__1 ;
    public final void rule__TypeSelection__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2106:1: ( rule__TypeSelection__Group_0__0__Impl rule__TypeSelection__Group_0__1 )
            // InternalWebDsl.g:2107:2: rule__TypeSelection__Group_0__0__Impl rule__TypeSelection__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__TypeSelection__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeSelection__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSelection__Group_0__0"


    // $ANTLR start "rule__TypeSelection__Group_0__0__Impl"
    // InternalWebDsl.g:2114:1: rule__TypeSelection__Group_0__0__Impl : ( ( rule__TypeSelection__AttributeAssignment_0_0 ) ) ;
    public final void rule__TypeSelection__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2118:1: ( ( ( rule__TypeSelection__AttributeAssignment_0_0 ) ) )
            // InternalWebDsl.g:2119:1: ( ( rule__TypeSelection__AttributeAssignment_0_0 ) )
            {
            // InternalWebDsl.g:2119:1: ( ( rule__TypeSelection__AttributeAssignment_0_0 ) )
            // InternalWebDsl.g:2120:2: ( rule__TypeSelection__AttributeAssignment_0_0 )
            {
             before(grammarAccess.getTypeSelectionAccess().getAttributeAssignment_0_0()); 
            // InternalWebDsl.g:2121:2: ( rule__TypeSelection__AttributeAssignment_0_0 )
            // InternalWebDsl.g:2121:3: rule__TypeSelection__AttributeAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeSelection__AttributeAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeSelectionAccess().getAttributeAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSelection__Group_0__0__Impl"


    // $ANTLR start "rule__TypeSelection__Group_0__1"
    // InternalWebDsl.g:2129:1: rule__TypeSelection__Group_0__1 : rule__TypeSelection__Group_0__1__Impl rule__TypeSelection__Group_0__2 ;
    public final void rule__TypeSelection__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2133:1: ( rule__TypeSelection__Group_0__1__Impl rule__TypeSelection__Group_0__2 )
            // InternalWebDsl.g:2134:2: rule__TypeSelection__Group_0__1__Impl rule__TypeSelection__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__TypeSelection__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeSelection__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSelection__Group_0__1"


    // $ANTLR start "rule__TypeSelection__Group_0__1__Impl"
    // InternalWebDsl.g:2141:1: rule__TypeSelection__Group_0__1__Impl : ( ':' ) ;
    public final void rule__TypeSelection__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2145:1: ( ( ':' ) )
            // InternalWebDsl.g:2146:1: ( ':' )
            {
            // InternalWebDsl.g:2146:1: ( ':' )
            // InternalWebDsl.g:2147:2: ':'
            {
             before(grammarAccess.getTypeSelectionAccess().getColonKeyword_0_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTypeSelectionAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSelection__Group_0__1__Impl"


    // $ANTLR start "rule__TypeSelection__Group_0__2"
    // InternalWebDsl.g:2156:1: rule__TypeSelection__Group_0__2 : rule__TypeSelection__Group_0__2__Impl ;
    public final void rule__TypeSelection__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2160:1: ( rule__TypeSelection__Group_0__2__Impl )
            // InternalWebDsl.g:2161:2: rule__TypeSelection__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeSelection__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSelection__Group_0__2"


    // $ANTLR start "rule__TypeSelection__Group_0__2__Impl"
    // InternalWebDsl.g:2167:1: rule__TypeSelection__Group_0__2__Impl : ( ( rule__TypeSelection__ValueAssignment_0_2 ) ) ;
    public final void rule__TypeSelection__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2171:1: ( ( ( rule__TypeSelection__ValueAssignment_0_2 ) ) )
            // InternalWebDsl.g:2172:1: ( ( rule__TypeSelection__ValueAssignment_0_2 ) )
            {
            // InternalWebDsl.g:2172:1: ( ( rule__TypeSelection__ValueAssignment_0_2 ) )
            // InternalWebDsl.g:2173:2: ( rule__TypeSelection__ValueAssignment_0_2 )
            {
             before(grammarAccess.getTypeSelectionAccess().getValueAssignment_0_2()); 
            // InternalWebDsl.g:2174:2: ( rule__TypeSelection__ValueAssignment_0_2 )
            // InternalWebDsl.g:2174:3: rule__TypeSelection__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__TypeSelection__ValueAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeSelectionAccess().getValueAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSelection__Group_0__2__Impl"


    // $ANTLR start "rule__Assert__Group__0"
    // InternalWebDsl.g:2183:1: rule__Assert__Group__0 : rule__Assert__Group__0__Impl rule__Assert__Group__1 ;
    public final void rule__Assert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2187:1: ( rule__Assert__Group__0__Impl rule__Assert__Group__1 )
            // InternalWebDsl.g:2188:2: rule__Assert__Group__0__Impl rule__Assert__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Assert__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assert__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group__0"


    // $ANTLR start "rule__Assert__Group__0__Impl"
    // InternalWebDsl.g:2195:1: rule__Assert__Group__0__Impl : ( 'verify' ) ;
    public final void rule__Assert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2199:1: ( ( 'verify' ) )
            // InternalWebDsl.g:2200:1: ( 'verify' )
            {
            // InternalWebDsl.g:2200:1: ( 'verify' )
            // InternalWebDsl.g:2201:2: 'verify'
            {
             before(grammarAccess.getAssertAccess().getVerifyKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAssertAccess().getVerifyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group__0__Impl"


    // $ANTLR start "rule__Assert__Group__1"
    // InternalWebDsl.g:2210:1: rule__Assert__Group__1 : rule__Assert__Group__1__Impl ;
    public final void rule__Assert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2214:1: ( rule__Assert__Group__1__Impl )
            // InternalWebDsl.g:2215:2: rule__Assert__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assert__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group__1"


    // $ANTLR start "rule__Assert__Group__1__Impl"
    // InternalWebDsl.g:2221:1: rule__Assert__Group__1__Impl : ( ( rule__Assert__Alternatives_1 ) ) ;
    public final void rule__Assert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2225:1: ( ( ( rule__Assert__Alternatives_1 ) ) )
            // InternalWebDsl.g:2226:1: ( ( rule__Assert__Alternatives_1 ) )
            {
            // InternalWebDsl.g:2226:1: ( ( rule__Assert__Alternatives_1 ) )
            // InternalWebDsl.g:2227:2: ( rule__Assert__Alternatives_1 )
            {
             before(grammarAccess.getAssertAccess().getAlternatives_1()); 
            // InternalWebDsl.g:2228:2: ( rule__Assert__Alternatives_1 )
            // InternalWebDsl.g:2228:3: rule__Assert__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Assert__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group__1__Impl"


    // $ANTLR start "rule__AssertContains__Group__0"
    // InternalWebDsl.g:2237:1: rule__AssertContains__Group__0 : rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 ;
    public final void rule__AssertContains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2241:1: ( rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 )
            // InternalWebDsl.g:2242:2: rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__AssertContains__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertContains__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__0"


    // $ANTLR start "rule__AssertContains__Group__0__Impl"
    // InternalWebDsl.g:2249:1: rule__AssertContains__Group__0__Impl : ( 'contains' ) ;
    public final void rule__AssertContains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2253:1: ( ( 'contains' ) )
            // InternalWebDsl.g:2254:1: ( 'contains' )
            {
            // InternalWebDsl.g:2254:1: ( 'contains' )
            // InternalWebDsl.g:2255:2: 'contains'
            {
             before(grammarAccess.getAssertContainsAccess().getContainsKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAssertContainsAccess().getContainsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__0__Impl"


    // $ANTLR start "rule__AssertContains__Group__1"
    // InternalWebDsl.g:2264:1: rule__AssertContains__Group__1 : rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 ;
    public final void rule__AssertContains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2268:1: ( rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 )
            // InternalWebDsl.g:2269:2: rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__AssertContains__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertContains__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__1"


    // $ANTLR start "rule__AssertContains__Group__1__Impl"
    // InternalWebDsl.g:2276:1: rule__AssertContains__Group__1__Impl : ( ( rule__AssertContains__Alternatives_1 ) ) ;
    public final void rule__AssertContains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2280:1: ( ( ( rule__AssertContains__Alternatives_1 ) ) )
            // InternalWebDsl.g:2281:1: ( ( rule__AssertContains__Alternatives_1 ) )
            {
            // InternalWebDsl.g:2281:1: ( ( rule__AssertContains__Alternatives_1 ) )
            // InternalWebDsl.g:2282:2: ( rule__AssertContains__Alternatives_1 )
            {
             before(grammarAccess.getAssertContainsAccess().getAlternatives_1()); 
            // InternalWebDsl.g:2283:2: ( rule__AssertContains__Alternatives_1 )
            // InternalWebDsl.g:2283:3: rule__AssertContains__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__AssertContains__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertContainsAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__1__Impl"


    // $ANTLR start "rule__AssertContains__Group__2"
    // InternalWebDsl.g:2291:1: rule__AssertContains__Group__2 : rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 ;
    public final void rule__AssertContains__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2295:1: ( rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 )
            // InternalWebDsl.g:2296:2: rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AssertContains__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertContains__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__2"


    // $ANTLR start "rule__AssertContains__Group__2__Impl"
    // InternalWebDsl.g:2303:1: rule__AssertContains__Group__2__Impl : ( ':' ) ;
    public final void rule__AssertContains__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2307:1: ( ( ':' ) )
            // InternalWebDsl.g:2308:1: ( ':' )
            {
            // InternalWebDsl.g:2308:1: ( ':' )
            // InternalWebDsl.g:2309:2: ':'
            {
             before(grammarAccess.getAssertContainsAccess().getColonKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAssertContainsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__2__Impl"


    // $ANTLR start "rule__AssertContains__Group__3"
    // InternalWebDsl.g:2318:1: rule__AssertContains__Group__3 : rule__AssertContains__Group__3__Impl ;
    public final void rule__AssertContains__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2322:1: ( rule__AssertContains__Group__3__Impl )
            // InternalWebDsl.g:2323:2: rule__AssertContains__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssertContains__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__3"


    // $ANTLR start "rule__AssertContains__Group__3__Impl"
    // InternalWebDsl.g:2329:1: rule__AssertContains__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__AssertContains__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2333:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:2334:1: ( RULE_STRING )
            {
            // InternalWebDsl.g:2334:1: ( RULE_STRING )
            // InternalWebDsl.g:2335:2: RULE_STRING
            {
             before(grammarAccess.getAssertContainsAccess().getSTRINGTerminalRuleCall_3()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssertContainsAccess().getSTRINGTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group__3__Impl"


    // $ANTLR start "rule__AssertContains__Group_1_0__0"
    // InternalWebDsl.g:2345:1: rule__AssertContains__Group_1_0__0 : rule__AssertContains__Group_1_0__0__Impl rule__AssertContains__Group_1_0__1 ;
    public final void rule__AssertContains__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2349:1: ( rule__AssertContains__Group_1_0__0__Impl rule__AssertContains__Group_1_0__1 )
            // InternalWebDsl.g:2350:2: rule__AssertContains__Group_1_0__0__Impl rule__AssertContains__Group_1_0__1
            {
            pushFollow(FOLLOW_21);
            rule__AssertContains__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertContains__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group_1_0__0"


    // $ANTLR start "rule__AssertContains__Group_1_0__0__Impl"
    // InternalWebDsl.g:2357:1: rule__AssertContains__Group_1_0__0__Impl : ( ( rule__AssertContains__HtmlElementAssignment_1_0_0 ) ) ;
    public final void rule__AssertContains__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2361:1: ( ( ( rule__AssertContains__HtmlElementAssignment_1_0_0 ) ) )
            // InternalWebDsl.g:2362:1: ( ( rule__AssertContains__HtmlElementAssignment_1_0_0 ) )
            {
            // InternalWebDsl.g:2362:1: ( ( rule__AssertContains__HtmlElementAssignment_1_0_0 ) )
            // InternalWebDsl.g:2363:2: ( rule__AssertContains__HtmlElementAssignment_1_0_0 )
            {
             before(grammarAccess.getAssertContainsAccess().getHtmlElementAssignment_1_0_0()); 
            // InternalWebDsl.g:2364:2: ( rule__AssertContains__HtmlElementAssignment_1_0_0 )
            // InternalWebDsl.g:2364:3: rule__AssertContains__HtmlElementAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AssertContains__HtmlElementAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertContainsAccess().getHtmlElementAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group_1_0__0__Impl"


    // $ANTLR start "rule__AssertContains__Group_1_0__1"
    // InternalWebDsl.g:2372:1: rule__AssertContains__Group_1_0__1 : rule__AssertContains__Group_1_0__1__Impl ;
    public final void rule__AssertContains__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2376:1: ( rule__AssertContains__Group_1_0__1__Impl )
            // InternalWebDsl.g:2377:2: rule__AssertContains__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssertContains__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group_1_0__1"


    // $ANTLR start "rule__AssertContains__Group_1_0__1__Impl"
    // InternalWebDsl.g:2383:1: rule__AssertContains__Group_1_0__1__Impl : ( ( rule__AssertContains__AttributeAssignment_1_0_1 ) ) ;
    public final void rule__AssertContains__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2387:1: ( ( ( rule__AssertContains__AttributeAssignment_1_0_1 ) ) )
            // InternalWebDsl.g:2388:1: ( ( rule__AssertContains__AttributeAssignment_1_0_1 ) )
            {
            // InternalWebDsl.g:2388:1: ( ( rule__AssertContains__AttributeAssignment_1_0_1 ) )
            // InternalWebDsl.g:2389:2: ( rule__AssertContains__AttributeAssignment_1_0_1 )
            {
             before(grammarAccess.getAssertContainsAccess().getAttributeAssignment_1_0_1()); 
            // InternalWebDsl.g:2390:2: ( rule__AssertContains__AttributeAssignment_1_0_1 )
            // InternalWebDsl.g:2390:3: rule__AssertContains__AttributeAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AssertContains__AttributeAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertContainsAccess().getAttributeAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__Group_1_0__1__Impl"


    // $ANTLR start "rule__AssertEquals__Group__0"
    // InternalWebDsl.g:2399:1: rule__AssertEquals__Group__0 : rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 ;
    public final void rule__AssertEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2403:1: ( rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 )
            // InternalWebDsl.g:2404:2: rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__AssertEquals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertEquals__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__Group__0"


    // $ANTLR start "rule__AssertEquals__Group__0__Impl"
    // InternalWebDsl.g:2411:1: rule__AssertEquals__Group__0__Impl : ( ( rule__AssertEquals__C1Assignment_0 ) ) ;
    public final void rule__AssertEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2415:1: ( ( ( rule__AssertEquals__C1Assignment_0 ) ) )
            // InternalWebDsl.g:2416:1: ( ( rule__AssertEquals__C1Assignment_0 ) )
            {
            // InternalWebDsl.g:2416:1: ( ( rule__AssertEquals__C1Assignment_0 ) )
            // InternalWebDsl.g:2417:2: ( rule__AssertEquals__C1Assignment_0 )
            {
             before(grammarAccess.getAssertEqualsAccess().getC1Assignment_0()); 
            // InternalWebDsl.g:2418:2: ( rule__AssertEquals__C1Assignment_0 )
            // InternalWebDsl.g:2418:3: rule__AssertEquals__C1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AssertEquals__C1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertEqualsAccess().getC1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__Group__0__Impl"


    // $ANTLR start "rule__AssertEquals__Group__1"
    // InternalWebDsl.g:2426:1: rule__AssertEquals__Group__1 : rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 ;
    public final void rule__AssertEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2430:1: ( rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 )
            // InternalWebDsl.g:2431:2: rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__AssertEquals__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertEquals__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__Group__1"


    // $ANTLR start "rule__AssertEquals__Group__1__Impl"
    // InternalWebDsl.g:2438:1: rule__AssertEquals__Group__1__Impl : ( 'equals' ) ;
    public final void rule__AssertEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2442:1: ( ( 'equals' ) )
            // InternalWebDsl.g:2443:1: ( 'equals' )
            {
            // InternalWebDsl.g:2443:1: ( 'equals' )
            // InternalWebDsl.g:2444:2: 'equals'
            {
             before(grammarAccess.getAssertEqualsAccess().getEqualsKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAssertEqualsAccess().getEqualsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__Group__1__Impl"


    // $ANTLR start "rule__AssertEquals__Group__2"
    // InternalWebDsl.g:2453:1: rule__AssertEquals__Group__2 : rule__AssertEquals__Group__2__Impl ;
    public final void rule__AssertEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2457:1: ( rule__AssertEquals__Group__2__Impl )
            // InternalWebDsl.g:2458:2: rule__AssertEquals__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssertEquals__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__Group__2"


    // $ANTLR start "rule__AssertEquals__Group__2__Impl"
    // InternalWebDsl.g:2464:1: rule__AssertEquals__Group__2__Impl : ( ( rule__AssertEquals__C2Assignment_2 ) ) ;
    public final void rule__AssertEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2468:1: ( ( ( rule__AssertEquals__C2Assignment_2 ) ) )
            // InternalWebDsl.g:2469:1: ( ( rule__AssertEquals__C2Assignment_2 ) )
            {
            // InternalWebDsl.g:2469:1: ( ( rule__AssertEquals__C2Assignment_2 ) )
            // InternalWebDsl.g:2470:2: ( rule__AssertEquals__C2Assignment_2 )
            {
             before(grammarAccess.getAssertEqualsAccess().getC2Assignment_2()); 
            // InternalWebDsl.g:2471:2: ( rule__AssertEquals__C2Assignment_2 )
            // InternalWebDsl.g:2471:3: rule__AssertEquals__C2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AssertEquals__C2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssertEqualsAccess().getC2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__Group__2__Impl"


    // $ANTLR start "rule__Comparable__Group_0__0"
    // InternalWebDsl.g:2480:1: rule__Comparable__Group_0__0 : rule__Comparable__Group_0__0__Impl rule__Comparable__Group_0__1 ;
    public final void rule__Comparable__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2484:1: ( rule__Comparable__Group_0__0__Impl rule__Comparable__Group_0__1 )
            // InternalWebDsl.g:2485:2: rule__Comparable__Group_0__0__Impl rule__Comparable__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Comparable__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparable__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparable__Group_0__0"


    // $ANTLR start "rule__Comparable__Group_0__0__Impl"
    // InternalWebDsl.g:2492:1: rule__Comparable__Group_0__0__Impl : ( 'VAR:' ) ;
    public final void rule__Comparable__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2496:1: ( ( 'VAR:' ) )
            // InternalWebDsl.g:2497:1: ( 'VAR:' )
            {
            // InternalWebDsl.g:2497:1: ( 'VAR:' )
            // InternalWebDsl.g:2498:2: 'VAR:'
            {
             before(grammarAccess.getComparableAccess().getVARKeyword_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getComparableAccess().getVARKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparable__Group_0__0__Impl"


    // $ANTLR start "rule__Comparable__Group_0__1"
    // InternalWebDsl.g:2507:1: rule__Comparable__Group_0__1 : rule__Comparable__Group_0__1__Impl ;
    public final void rule__Comparable__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2511:1: ( rule__Comparable__Group_0__1__Impl )
            // InternalWebDsl.g:2512:2: rule__Comparable__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparable__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparable__Group_0__1"


    // $ANTLR start "rule__Comparable__Group_0__1__Impl"
    // InternalWebDsl.g:2518:1: rule__Comparable__Group_0__1__Impl : ( RULE_STRING ) ;
    public final void rule__Comparable__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2522:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:2523:1: ( RULE_STRING )
            {
            // InternalWebDsl.g:2523:1: ( RULE_STRING )
            // InternalWebDsl.g:2524:2: RULE_STRING
            {
             before(grammarAccess.getComparableAccess().getSTRINGTerminalRuleCall_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComparableAccess().getSTRINGTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparable__Group_0__1__Impl"


    // $ANTLR start "rule__Comparable__Group_1__0"
    // InternalWebDsl.g:2534:1: rule__Comparable__Group_1__0 : rule__Comparable__Group_1__0__Impl rule__Comparable__Group_1__1 ;
    public final void rule__Comparable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2538:1: ( rule__Comparable__Group_1__0__Impl rule__Comparable__Group_1__1 )
            // InternalWebDsl.g:2539:2: rule__Comparable__Group_1__0__Impl rule__Comparable__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__Comparable__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparable__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparable__Group_1__0"


    // $ANTLR start "rule__Comparable__Group_1__0__Impl"
    // InternalWebDsl.g:2546:1: rule__Comparable__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Comparable__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2550:1: ( ( '(' ) )
            // InternalWebDsl.g:2551:1: ( '(' )
            {
            // InternalWebDsl.g:2551:1: ( '(' )
            // InternalWebDsl.g:2552:2: '('
            {
             before(grammarAccess.getComparableAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getComparableAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparable__Group_1__0__Impl"


    // $ANTLR start "rule__Comparable__Group_1__1"
    // InternalWebDsl.g:2561:1: rule__Comparable__Group_1__1 : rule__Comparable__Group_1__1__Impl rule__Comparable__Group_1__2 ;
    public final void rule__Comparable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2565:1: ( rule__Comparable__Group_1__1__Impl rule__Comparable__Group_1__2 )
            // InternalWebDsl.g:2566:2: rule__Comparable__Group_1__1__Impl rule__Comparable__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__Comparable__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparable__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparable__Group_1__1"


    // $ANTLR start "rule__Comparable__Group_1__1__Impl"
    // InternalWebDsl.g:2573:1: rule__Comparable__Group_1__1__Impl : ( ( rule__Comparable__HtmlElementAssignment_1_1 ) ) ;
    public final void rule__Comparable__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2577:1: ( ( ( rule__Comparable__HtmlElementAssignment_1_1 ) ) )
            // InternalWebDsl.g:2578:1: ( ( rule__Comparable__HtmlElementAssignment_1_1 ) )
            {
            // InternalWebDsl.g:2578:1: ( ( rule__Comparable__HtmlElementAssignment_1_1 ) )
            // InternalWebDsl.g:2579:2: ( rule__Comparable__HtmlElementAssignment_1_1 )
            {
             before(grammarAccess.getComparableAccess().getHtmlElementAssignment_1_1()); 
            // InternalWebDsl.g:2580:2: ( rule__Comparable__HtmlElementAssignment_1_1 )
            // InternalWebDsl.g:2580:3: rule__Comparable__HtmlElementAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparable__HtmlElementAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparableAccess().getHtmlElementAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparable__Group_1__1__Impl"


    // $ANTLR start "rule__Comparable__Group_1__2"
    // InternalWebDsl.g:2588:1: rule__Comparable__Group_1__2 : rule__Comparable__Group_1__2__Impl rule__Comparable__Group_1__3 ;
    public final void rule__Comparable__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2592:1: ( rule__Comparable__Group_1__2__Impl rule__Comparable__Group_1__3 )
            // InternalWebDsl.g:2593:2: rule__Comparable__Group_1__2__Impl rule__Comparable__Group_1__3
            {
            pushFollow(FOLLOW_27);
            rule__Comparable__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparable__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparable__Group_1__2"


    // $ANTLR start "rule__Comparable__Group_1__2__Impl"
    // InternalWebDsl.g:2600:1: rule__Comparable__Group_1__2__Impl : ( ( rule__Comparable__AttributeAssignment_1_2 ) ) ;
    public final void rule__Comparable__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2604:1: ( ( ( rule__Comparable__AttributeAssignment_1_2 ) ) )
            // InternalWebDsl.g:2605:1: ( ( rule__Comparable__AttributeAssignment_1_2 ) )
            {
            // InternalWebDsl.g:2605:1: ( ( rule__Comparable__AttributeAssignment_1_2 ) )
            // InternalWebDsl.g:2606:2: ( rule__Comparable__AttributeAssignment_1_2 )
            {
             before(grammarAccess.getComparableAccess().getAttributeAssignment_1_2()); 
            // InternalWebDsl.g:2607:2: ( rule__Comparable__AttributeAssignment_1_2 )
            // InternalWebDsl.g:2607:3: rule__Comparable__AttributeAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparable__AttributeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparableAccess().getAttributeAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparable__Group_1__2__Impl"


    // $ANTLR start "rule__Comparable__Group_1__3"
    // InternalWebDsl.g:2615:1: rule__Comparable__Group_1__3 : rule__Comparable__Group_1__3__Impl ;
    public final void rule__Comparable__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2619:1: ( rule__Comparable__Group_1__3__Impl )
            // InternalWebDsl.g:2620:2: rule__Comparable__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparable__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparable__Group_1__3"


    // $ANTLR start "rule__Comparable__Group_1__3__Impl"
    // InternalWebDsl.g:2626:1: rule__Comparable__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Comparable__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2630:1: ( ( ')' ) )
            // InternalWebDsl.g:2631:1: ( ')' )
            {
            // InternalWebDsl.g:2631:1: ( ')' )
            // InternalWebDsl.g:2632:2: ')'
            {
             before(grammarAccess.getComparableAccess().getRightParenthesisKeyword_1_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getComparableAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparable__Group_1__3__Impl"


    // $ANTLR start "rule__Program__CoreAssignment"
    // InternalWebDsl.g:2642:1: rule__Program__CoreAssignment : ( ruleCore ) ;
    public final void rule__Program__CoreAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2646:1: ( ( ruleCore ) )
            // InternalWebDsl.g:2647:2: ( ruleCore )
            {
            // InternalWebDsl.g:2647:2: ( ruleCore )
            // InternalWebDsl.g:2648:3: ruleCore
            {
             before(grammarAccess.getProgramAccess().getCoreCoreParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCore();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getCoreCoreParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__CoreAssignment"


    // $ANTLR start "rule__Core__NameAssignment_1"
    // InternalWebDsl.g:2657:1: rule__Core__NameAssignment_1 : ( ruleBrowser ) ;
    public final void rule__Core__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2661:1: ( ( ruleBrowser ) )
            // InternalWebDsl.g:2662:2: ( ruleBrowser )
            {
            // InternalWebDsl.g:2662:2: ( ruleBrowser )
            // InternalWebDsl.g:2663:3: ruleBrowser
            {
             before(grammarAccess.getCoreAccess().getNameBrowserEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBrowser();

            state._fsp--;

             after(grammarAccess.getCoreAccess().getNameBrowserEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Core__NameAssignment_1"


    // $ANTLR start "rule__Core__ActionsAssignment_2"
    // InternalWebDsl.g:2672:1: rule__Core__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__Core__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2676:1: ( ( ruleAction ) )
            // InternalWebDsl.g:2677:2: ( ruleAction )
            {
            // InternalWebDsl.g:2677:2: ( ruleAction )
            // InternalWebDsl.g:2678:3: ruleAction
            {
             before(grammarAccess.getCoreAccess().getActionsActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getCoreAccess().getActionsActionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Core__ActionsAssignment_2"


    // $ANTLR start "rule__Action__GoActionAssignment_0"
    // InternalWebDsl.g:2687:1: rule__Action__GoActionAssignment_0 : ( ruleGoAction ) ;
    public final void rule__Action__GoActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2691:1: ( ( ruleGoAction ) )
            // InternalWebDsl.g:2692:2: ( ruleGoAction )
            {
            // InternalWebDsl.g:2692:2: ( ruleGoAction )
            // InternalWebDsl.g:2693:3: ruleGoAction
            {
             before(grammarAccess.getActionAccess().getGoActionGoActionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGoAction();

            state._fsp--;

             after(grammarAccess.getActionAccess().getGoActionGoActionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__GoActionAssignment_0"


    // $ANTLR start "rule__Action__SelectionAssignment_1"
    // InternalWebDsl.g:2702:1: rule__Action__SelectionAssignment_1 : ( ruleSelection ) ;
    public final void rule__Action__SelectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2706:1: ( ( ruleSelection ) )
            // InternalWebDsl.g:2707:2: ( ruleSelection )
            {
            // InternalWebDsl.g:2707:2: ( ruleSelection )
            // InternalWebDsl.g:2708:3: ruleSelection
            {
             before(grammarAccess.getActionAccess().getSelectionSelectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getActionAccess().getSelectionSelectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__SelectionAssignment_1"


    // $ANTLR start "rule__GoAction__NameAssignment_1"
    // InternalWebDsl.g:2717:1: rule__GoAction__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GoAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2721:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:2722:2: ( RULE_STRING )
            {
            // InternalWebDsl.g:2722:2: ( RULE_STRING )
            // InternalWebDsl.g:2723:3: RULE_STRING
            {
             before(grammarAccess.getGoActionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoActionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoAction__NameAssignment_1"


    // $ANTLR start "rule__Selection__LinkButtonSelectionAssignment_0"
    // InternalWebDsl.g:2732:1: rule__Selection__LinkButtonSelectionAssignment_0 : ( ruleLinkButtonSelection ) ;
    public final void rule__Selection__LinkButtonSelectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2736:1: ( ( ruleLinkButtonSelection ) )
            // InternalWebDsl.g:2737:2: ( ruleLinkButtonSelection )
            {
            // InternalWebDsl.g:2737:2: ( ruleLinkButtonSelection )
            // InternalWebDsl.g:2738:3: ruleLinkButtonSelection
            {
             before(grammarAccess.getSelectionAccess().getLinkButtonSelectionLinkButtonSelectionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLinkButtonSelection();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getLinkButtonSelectionLinkButtonSelectionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__LinkButtonSelectionAssignment_0"


    // $ANTLR start "rule__Selection__GeneralSelectionAssignment_1"
    // InternalWebDsl.g:2747:1: rule__Selection__GeneralSelectionAssignment_1 : ( ruleGeneralSelection ) ;
    public final void rule__Selection__GeneralSelectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2751:1: ( ( ruleGeneralSelection ) )
            // InternalWebDsl.g:2752:2: ( ruleGeneralSelection )
            {
            // InternalWebDsl.g:2752:2: ( ruleGeneralSelection )
            // InternalWebDsl.g:2753:3: ruleGeneralSelection
            {
             before(grammarAccess.getSelectionAccess().getGeneralSelectionGeneralSelectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneralSelection();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getGeneralSelectionGeneralSelectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__GeneralSelectionAssignment_1"


    // $ANTLR start "rule__Selection__CheckboxSelectionAssignment_2"
    // InternalWebDsl.g:2762:1: rule__Selection__CheckboxSelectionAssignment_2 : ( ruleCheckboxSelection ) ;
    public final void rule__Selection__CheckboxSelectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2766:1: ( ( ruleCheckboxSelection ) )
            // InternalWebDsl.g:2767:2: ( ruleCheckboxSelection )
            {
            // InternalWebDsl.g:2767:2: ( ruleCheckboxSelection )
            // InternalWebDsl.g:2768:3: ruleCheckboxSelection
            {
             before(grammarAccess.getSelectionAccess().getCheckboxSelectionCheckboxSelectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCheckboxSelection();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getCheckboxSelectionCheckboxSelectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__CheckboxSelectionAssignment_2"


    // $ANTLR start "rule__Selection__ComboboxSelectionAssignment_3"
    // InternalWebDsl.g:2777:1: rule__Selection__ComboboxSelectionAssignment_3 : ( ruleComboboxSelection ) ;
    public final void rule__Selection__ComboboxSelectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2781:1: ( ( ruleComboboxSelection ) )
            // InternalWebDsl.g:2782:2: ( ruleComboboxSelection )
            {
            // InternalWebDsl.g:2782:2: ( ruleComboboxSelection )
            // InternalWebDsl.g:2783:3: ruleComboboxSelection
            {
             before(grammarAccess.getSelectionAccess().getComboboxSelectionComboboxSelectionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComboboxSelection();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getComboboxSelectionComboboxSelectionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__ComboboxSelectionAssignment_3"


    // $ANTLR start "rule__Selection__PageSelectionAssignment_4"
    // InternalWebDsl.g:2792:1: rule__Selection__PageSelectionAssignment_4 : ( rulePageSelection ) ;
    public final void rule__Selection__PageSelectionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2796:1: ( ( rulePageSelection ) )
            // InternalWebDsl.g:2797:2: ( rulePageSelection )
            {
            // InternalWebDsl.g:2797:2: ( rulePageSelection )
            // InternalWebDsl.g:2798:3: rulePageSelection
            {
             before(grammarAccess.getSelectionAccess().getPageSelectionPageSelectionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePageSelection();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getPageSelectionPageSelectionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__PageSelectionAssignment_4"


    // $ANTLR start "rule__LinkButtonSelection__TypeSelectionAssignment_1"
    // InternalWebDsl.g:2807:1: rule__LinkButtonSelection__TypeSelectionAssignment_1 : ( ruleTypeSelection ) ;
    public final void rule__LinkButtonSelection__TypeSelectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2811:1: ( ( ruleTypeSelection ) )
            // InternalWebDsl.g:2812:2: ( ruleTypeSelection )
            {
            // InternalWebDsl.g:2812:2: ( ruleTypeSelection )
            // InternalWebDsl.g:2813:3: ruleTypeSelection
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeSelection();

            state._fsp--;

             after(grammarAccess.getLinkButtonSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkButtonSelection__TypeSelectionAssignment_1"


    // $ANTLR start "rule__LinkButtonSelection__GeneralActionsAssignment_3_0"
    // InternalWebDsl.g:2822:1: rule__LinkButtonSelection__GeneralActionsAssignment_3_0 : ( ruleGeneralAction ) ;
    public final void rule__LinkButtonSelection__GeneralActionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2826:1: ( ( ruleGeneralAction ) )
            // InternalWebDsl.g:2827:2: ( ruleGeneralAction )
            {
            // InternalWebDsl.g:2827:2: ( ruleGeneralAction )
            // InternalWebDsl.g:2828:3: ruleGeneralAction
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneralAction();

            state._fsp--;

             after(grammarAccess.getLinkButtonSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkButtonSelection__GeneralActionsAssignment_3_0"


    // $ANTLR start "rule__GeneralSelection__TypeSelectionAssignment_1"
    // InternalWebDsl.g:2837:1: rule__GeneralSelection__TypeSelectionAssignment_1 : ( ruleTypeSelection ) ;
    public final void rule__GeneralSelection__TypeSelectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2841:1: ( ( ruleTypeSelection ) )
            // InternalWebDsl.g:2842:2: ( ruleTypeSelection )
            {
            // InternalWebDsl.g:2842:2: ( ruleTypeSelection )
            // InternalWebDsl.g:2843:3: ruleTypeSelection
            {
             before(grammarAccess.getGeneralSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeSelection();

            state._fsp--;

             after(grammarAccess.getGeneralSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralSelection__TypeSelectionAssignment_1"


    // $ANTLR start "rule__GeneralSelection__GeneralActionsAssignment_3"
    // InternalWebDsl.g:2852:1: rule__GeneralSelection__GeneralActionsAssignment_3 : ( ruleGeneralAction ) ;
    public final void rule__GeneralSelection__GeneralActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2856:1: ( ( ruleGeneralAction ) )
            // InternalWebDsl.g:2857:2: ( ruleGeneralAction )
            {
            // InternalWebDsl.g:2857:2: ( ruleGeneralAction )
            // InternalWebDsl.g:2858:3: ruleGeneralAction
            {
             before(grammarAccess.getGeneralSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneralAction();

            state._fsp--;

             after(grammarAccess.getGeneralSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralSelection__GeneralActionsAssignment_3"


    // $ANTLR start "rule__CheckboxSelection__TypeSelectionAssignment_1"
    // InternalWebDsl.g:2867:1: rule__CheckboxSelection__TypeSelectionAssignment_1 : ( ruleTypeSelection ) ;
    public final void rule__CheckboxSelection__TypeSelectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2871:1: ( ( ruleTypeSelection ) )
            // InternalWebDsl.g:2872:2: ( ruleTypeSelection )
            {
            // InternalWebDsl.g:2872:2: ( ruleTypeSelection )
            // InternalWebDsl.g:2873:3: ruleTypeSelection
            {
             before(grammarAccess.getCheckboxSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeSelection();

            state._fsp--;

             after(grammarAccess.getCheckboxSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSelection__TypeSelectionAssignment_1"


    // $ANTLR start "rule__CheckboxSelection__GeneralActionsAssignment_3_0"
    // InternalWebDsl.g:2882:1: rule__CheckboxSelection__GeneralActionsAssignment_3_0 : ( ruleGeneralAction ) ;
    public final void rule__CheckboxSelection__GeneralActionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2886:1: ( ( ruleGeneralAction ) )
            // InternalWebDsl.g:2887:2: ( ruleGeneralAction )
            {
            // InternalWebDsl.g:2887:2: ( ruleGeneralAction )
            // InternalWebDsl.g:2888:3: ruleGeneralAction
            {
             before(grammarAccess.getCheckboxSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneralAction();

            state._fsp--;

             after(grammarAccess.getCheckboxSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSelection__GeneralActionsAssignment_3_0"


    // $ANTLR start "rule__ComboboxSelection__TypeSelectionAssignment_1"
    // InternalWebDsl.g:2897:1: rule__ComboboxSelection__TypeSelectionAssignment_1 : ( ruleTypeSelection ) ;
    public final void rule__ComboboxSelection__TypeSelectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2901:1: ( ( ruleTypeSelection ) )
            // InternalWebDsl.g:2902:2: ( ruleTypeSelection )
            {
            // InternalWebDsl.g:2902:2: ( ruleTypeSelection )
            // InternalWebDsl.g:2903:3: ruleTypeSelection
            {
             before(grammarAccess.getComboboxSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeSelection();

            state._fsp--;

             after(grammarAccess.getComboboxSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__TypeSelectionAssignment_1"


    // $ANTLR start "rule__ComboboxSelection__GeneralActionsAssignment_3_0"
    // InternalWebDsl.g:2912:1: rule__ComboboxSelection__GeneralActionsAssignment_3_0 : ( ruleGeneralAction ) ;
    public final void rule__ComboboxSelection__GeneralActionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2916:1: ( ( ruleGeneralAction ) )
            // InternalWebDsl.g:2917:2: ( ruleGeneralAction )
            {
            // InternalWebDsl.g:2917:2: ( ruleGeneralAction )
            // InternalWebDsl.g:2918:3: ruleGeneralAction
            {
             before(grammarAccess.getComboboxSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneralAction();

            state._fsp--;

             after(grammarAccess.getComboboxSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboboxSelection__GeneralActionsAssignment_3_0"


    // $ANTLR start "rule__PageSelection__StoreActionAssignment_2_0"
    // InternalWebDsl.g:2927:1: rule__PageSelection__StoreActionAssignment_2_0 : ( ruleStoreAction ) ;
    public final void rule__PageSelection__StoreActionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2931:1: ( ( ruleStoreAction ) )
            // InternalWebDsl.g:2932:2: ( ruleStoreAction )
            {
            // InternalWebDsl.g:2932:2: ( ruleStoreAction )
            // InternalWebDsl.g:2933:3: ruleStoreAction
            {
             before(grammarAccess.getPageSelectionAccess().getStoreActionStoreActionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStoreAction();

            state._fsp--;

             after(grammarAccess.getPageSelectionAccess().getStoreActionStoreActionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageSelection__StoreActionAssignment_2_0"


    // $ANTLR start "rule__PageSelection__AssertionAssignment_2_1"
    // InternalWebDsl.g:2942:1: rule__PageSelection__AssertionAssignment_2_1 : ( ruleAssert ) ;
    public final void rule__PageSelection__AssertionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2946:1: ( ( ruleAssert ) )
            // InternalWebDsl.g:2947:2: ( ruleAssert )
            {
            // InternalWebDsl.g:2947:2: ( ruleAssert )
            // InternalWebDsl.g:2948:3: ruleAssert
            {
             before(grammarAccess.getPageSelectionAccess().getAssertionAssertParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssert();

            state._fsp--;

             after(grammarAccess.getPageSelectionAccess().getAssertionAssertParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageSelection__AssertionAssignment_2_1"


    // $ANTLR start "rule__GeneralAction__SetActionAssignment_0"
    // InternalWebDsl.g:2957:1: rule__GeneralAction__SetActionAssignment_0 : ( ruleSetAction ) ;
    public final void rule__GeneralAction__SetActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2961:1: ( ( ruleSetAction ) )
            // InternalWebDsl.g:2962:2: ( ruleSetAction )
            {
            // InternalWebDsl.g:2962:2: ( ruleSetAction )
            // InternalWebDsl.g:2963:3: ruleSetAction
            {
             before(grammarAccess.getGeneralActionAccess().getSetActionSetActionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSetAction();

            state._fsp--;

             after(grammarAccess.getGeneralActionAccess().getSetActionSetActionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralAction__SetActionAssignment_0"


    // $ANTLR start "rule__GeneralAction__StoreActionAssignment_1"
    // InternalWebDsl.g:2972:1: rule__GeneralAction__StoreActionAssignment_1 : ( ruleStoreAction ) ;
    public final void rule__GeneralAction__StoreActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2976:1: ( ( ruleStoreAction ) )
            // InternalWebDsl.g:2977:2: ( ruleStoreAction )
            {
            // InternalWebDsl.g:2977:2: ( ruleStoreAction )
            // InternalWebDsl.g:2978:3: ruleStoreAction
            {
             before(grammarAccess.getGeneralActionAccess().getStoreActionStoreActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStoreAction();

            state._fsp--;

             after(grammarAccess.getGeneralActionAccess().getStoreActionStoreActionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralAction__StoreActionAssignment_1"


    // $ANTLR start "rule__GeneralAction__SelectionAssignment_2"
    // InternalWebDsl.g:2987:1: rule__GeneralAction__SelectionAssignment_2 : ( ruleSelection ) ;
    public final void rule__GeneralAction__SelectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2991:1: ( ( ruleSelection ) )
            // InternalWebDsl.g:2992:2: ( ruleSelection )
            {
            // InternalWebDsl.g:2992:2: ( ruleSelection )
            // InternalWebDsl.g:2993:3: ruleSelection
            {
             before(grammarAccess.getGeneralActionAccess().getSelectionSelectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getGeneralActionAccess().getSelectionSelectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralAction__SelectionAssignment_2"


    // $ANTLR start "rule__StoreAction__VarAssignment_3"
    // InternalWebDsl.g:3002:1: rule__StoreAction__VarAssignment_3 : ( ruleVar ) ;
    public final void rule__StoreAction__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3006:1: ( ( ruleVar ) )
            // InternalWebDsl.g:3007:2: ( ruleVar )
            {
            // InternalWebDsl.g:3007:2: ( ruleVar )
            // InternalWebDsl.g:3008:3: ruleVar
            {
             before(grammarAccess.getStoreActionAccess().getVarVarParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getStoreActionAccess().getVarVarParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreAction__VarAssignment_3"


    // $ANTLR start "rule__Var__NameAssignment"
    // InternalWebDsl.g:3017:1: rule__Var__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Var__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3021:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:3022:2: ( RULE_STRING )
            {
            // InternalWebDsl.g:3022:2: ( RULE_STRING )
            // InternalWebDsl.g:3023:3: RULE_STRING
            {
             before(grammarAccess.getVarAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__NameAssignment"


    // $ANTLR start "rule__SetAction__AttributeAssignment_1"
    // InternalWebDsl.g:3032:1: rule__SetAction__AttributeAssignment_1 : ( ruleAttribute ) ;
    public final void rule__SetAction__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3036:1: ( ( ruleAttribute ) )
            // InternalWebDsl.g:3037:2: ( ruleAttribute )
            {
            // InternalWebDsl.g:3037:2: ( ruleAttribute )
            // InternalWebDsl.g:3038:3: ruleAttribute
            {
             before(grammarAccess.getSetActionAccess().getAttributeAttributeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSetActionAccess().getAttributeAttributeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAction__AttributeAssignment_1"


    // $ANTLR start "rule__SetAction__ValueAssignment_3"
    // InternalWebDsl.g:3047:1: rule__SetAction__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SetAction__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3051:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:3052:2: ( RULE_STRING )
            {
            // InternalWebDsl.g:3052:2: ( RULE_STRING )
            // InternalWebDsl.g:3053:3: RULE_STRING
            {
             before(grammarAccess.getSetActionAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSetActionAccess().getValueSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAction__ValueAssignment_3"


    // $ANTLR start "rule__TypeSelection__AttributeAssignment_0_0"
    // InternalWebDsl.g:3062:1: rule__TypeSelection__AttributeAssignment_0_0 : ( ruleAttribute ) ;
    public final void rule__TypeSelection__AttributeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3066:1: ( ( ruleAttribute ) )
            // InternalWebDsl.g:3067:2: ( ruleAttribute )
            {
            // InternalWebDsl.g:3067:2: ( ruleAttribute )
            // InternalWebDsl.g:3068:3: ruleAttribute
            {
             before(grammarAccess.getTypeSelectionAccess().getAttributeAttributeEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getTypeSelectionAccess().getAttributeAttributeEnumRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSelection__AttributeAssignment_0_0"


    // $ANTLR start "rule__TypeSelection__ValueAssignment_0_2"
    // InternalWebDsl.g:3077:1: rule__TypeSelection__ValueAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__TypeSelection__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3081:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:3082:2: ( RULE_STRING )
            {
            // InternalWebDsl.g:3082:2: ( RULE_STRING )
            // InternalWebDsl.g:3083:3: RULE_STRING
            {
             before(grammarAccess.getTypeSelectionAccess().getValueSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypeSelectionAccess().getValueSTRINGTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSelection__ValueAssignment_0_2"


    // $ANTLR start "rule__Assert__AssertContainAssignment_1_0"
    // InternalWebDsl.g:3092:1: rule__Assert__AssertContainAssignment_1_0 : ( ruleAssertContains ) ;
    public final void rule__Assert__AssertContainAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3096:1: ( ( ruleAssertContains ) )
            // InternalWebDsl.g:3097:2: ( ruleAssertContains )
            {
            // InternalWebDsl.g:3097:2: ( ruleAssertContains )
            // InternalWebDsl.g:3098:3: ruleAssertContains
            {
             before(grammarAccess.getAssertAccess().getAssertContainAssertContainsParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertContains();

            state._fsp--;

             after(grammarAccess.getAssertAccess().getAssertContainAssertContainsParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__AssertContainAssignment_1_0"


    // $ANTLR start "rule__Assert__AssertEqualsAssignment_1_1"
    // InternalWebDsl.g:3107:1: rule__Assert__AssertEqualsAssignment_1_1 : ( ruleAssertEquals ) ;
    public final void rule__Assert__AssertEqualsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3111:1: ( ( ruleAssertEquals ) )
            // InternalWebDsl.g:3112:2: ( ruleAssertEquals )
            {
            // InternalWebDsl.g:3112:2: ( ruleAssertEquals )
            // InternalWebDsl.g:3113:3: ruleAssertEquals
            {
             before(grammarAccess.getAssertAccess().getAssertEqualsAssertEqualsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertEquals();

            state._fsp--;

             after(grammarAccess.getAssertAccess().getAssertEqualsAssertEqualsParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__AssertEqualsAssignment_1_1"


    // $ANTLR start "rule__AssertContains__HtmlElementAssignment_1_0_0"
    // InternalWebDsl.g:3122:1: rule__AssertContains__HtmlElementAssignment_1_0_0 : ( ruleHtmlElement ) ;
    public final void rule__AssertContains__HtmlElementAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3126:1: ( ( ruleHtmlElement ) )
            // InternalWebDsl.g:3127:2: ( ruleHtmlElement )
            {
            // InternalWebDsl.g:3127:2: ( ruleHtmlElement )
            // InternalWebDsl.g:3128:3: ruleHtmlElement
            {
             before(grammarAccess.getAssertContainsAccess().getHtmlElementHtmlElementEnumRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHtmlElement();

            state._fsp--;

             after(grammarAccess.getAssertContainsAccess().getHtmlElementHtmlElementEnumRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__HtmlElementAssignment_1_0_0"


    // $ANTLR start "rule__AssertContains__AttributeAssignment_1_0_1"
    // InternalWebDsl.g:3137:1: rule__AssertContains__AttributeAssignment_1_0_1 : ( ruleAttribute ) ;
    public final void rule__AssertContains__AttributeAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3141:1: ( ( ruleAttribute ) )
            // InternalWebDsl.g:3142:2: ( ruleAttribute )
            {
            // InternalWebDsl.g:3142:2: ( ruleAttribute )
            // InternalWebDsl.g:3143:3: ruleAttribute
            {
             before(grammarAccess.getAssertContainsAccess().getAttributeAttributeEnumRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAssertContainsAccess().getAttributeAttributeEnumRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertContains__AttributeAssignment_1_0_1"


    // $ANTLR start "rule__AssertEquals__C1Assignment_0"
    // InternalWebDsl.g:3152:1: rule__AssertEquals__C1Assignment_0 : ( ruleComparable ) ;
    public final void rule__AssertEquals__C1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3156:1: ( ( ruleComparable ) )
            // InternalWebDsl.g:3157:2: ( ruleComparable )
            {
            // InternalWebDsl.g:3157:2: ( ruleComparable )
            // InternalWebDsl.g:3158:3: ruleComparable
            {
             before(grammarAccess.getAssertEqualsAccess().getC1ComparableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComparable();

            state._fsp--;

             after(grammarAccess.getAssertEqualsAccess().getC1ComparableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__C1Assignment_0"


    // $ANTLR start "rule__AssertEquals__C2Assignment_2"
    // InternalWebDsl.g:3167:1: rule__AssertEquals__C2Assignment_2 : ( ruleComparable ) ;
    public final void rule__AssertEquals__C2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3171:1: ( ( ruleComparable ) )
            // InternalWebDsl.g:3172:2: ( ruleComparable )
            {
            // InternalWebDsl.g:3172:2: ( ruleComparable )
            // InternalWebDsl.g:3173:3: ruleComparable
            {
             before(grammarAccess.getAssertEqualsAccess().getC2ComparableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparable();

            state._fsp--;

             after(grammarAccess.getAssertEqualsAccess().getC2ComparableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertEquals__C2Assignment_2"


    // $ANTLR start "rule__Comparable__HtmlElementAssignment_1_1"
    // InternalWebDsl.g:3182:1: rule__Comparable__HtmlElementAssignment_1_1 : ( ruleHtmlElement ) ;
    public final void rule__Comparable__HtmlElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3186:1: ( ( ruleHtmlElement ) )
            // InternalWebDsl.g:3187:2: ( ruleHtmlElement )
            {
            // InternalWebDsl.g:3187:2: ( ruleHtmlElement )
            // InternalWebDsl.g:3188:3: ruleHtmlElement
            {
             before(grammarAccess.getComparableAccess().getHtmlElementHtmlElementEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHtmlElement();

            state._fsp--;

             after(grammarAccess.getComparableAccess().getHtmlElementHtmlElementEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparable__HtmlElementAssignment_1_1"


    // $ANTLR start "rule__Comparable__AttributeAssignment_1_2"
    // InternalWebDsl.g:3197:1: rule__Comparable__AttributeAssignment_1_2 : ( ruleAttribute ) ;
    public final void rule__Comparable__AttributeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3201:1: ( ( ruleAttribute ) )
            // InternalWebDsl.g:3202:2: ( ruleAttribute )
            {
            // InternalWebDsl.g:3202:2: ( ruleAttribute )
            // InternalWebDsl.g:3203:3: ruleAttribute
            {
             before(grammarAccess.getComparableAccess().getAttributeAttributeEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getComparableAccess().getAttributeAttributeEnumRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparable__AttributeAssignment_1_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000011006001D800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000011006001D802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000007F00780000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000135006001F800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000131006001F802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000135006001D800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000131006001D802L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000135006007D800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000131006007D802L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00013D006001D800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000139006001D802L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004240000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0004200000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0068000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000E0819800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000E0019800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0080000000000000L});

}