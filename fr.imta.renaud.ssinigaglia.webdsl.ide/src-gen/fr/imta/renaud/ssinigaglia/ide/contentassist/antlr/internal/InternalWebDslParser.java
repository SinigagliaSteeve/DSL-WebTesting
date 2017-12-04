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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LINK'", "'BUTTON'", "'IMAGE'", "'SEARCH_FIELD'", "'DIV'", "'check'", "'uncheck'", "'PARENT'", "'FIRST'", "'LAST'", "'ALL'", "'chrome'", "'firefox'", "'safari'", "'edge'", "'ie'", "'CHECKBOX'", "'COMBO_BOX'", "'A'", "'LABEL'", "'ID'", "'CLASS'", "'ALT'", "'VALUE'", "'HREF'", "'TITLE'", "'NAME'", "'test'", "'{'", "'open_browser'", "'}'", "'PROCEDURE'", "'('", "'){'", "'PROC:'", "')'", "'go'", "'select'", "'store'", "'in'", "'count'", "'set'", "':'", "'verify'", "'contains'", "'equals'", "'VAR:'", "'click'", "'PAGE'", "'TEXT'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
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
    // InternalWebDsl.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalWebDsl.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalWebDsl.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalWebDsl.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalWebDsl.g:69:3: ( rule__Program__Group__0 )
            // InternalWebDsl.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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


    // $ANTLR start "entryRuleProcedure"
    // InternalWebDsl.g:103:1: entryRuleProcedure : ruleProcedure EOF ;
    public final void entryRuleProcedure() throws RecognitionException {
        try {
            // InternalWebDsl.g:104:1: ( ruleProcedure EOF )
            // InternalWebDsl.g:105:1: ruleProcedure EOF
            {
             before(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getProcedureRule()); 
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
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalWebDsl.g:112:1: ruleProcedure : ( ( rule__Procedure__Group__0 ) ) ;
    public final void ruleProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:116:2: ( ( ( rule__Procedure__Group__0 ) ) )
            // InternalWebDsl.g:117:2: ( ( rule__Procedure__Group__0 ) )
            {
            // InternalWebDsl.g:117:2: ( ( rule__Procedure__Group__0 ) )
            // InternalWebDsl.g:118:3: ( rule__Procedure__Group__0 )
            {
             before(grammarAccess.getProcedureAccess().getGroup()); 
            // InternalWebDsl.g:119:3: ( rule__Procedure__Group__0 )
            // InternalWebDsl.g:119:4: rule__Procedure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getGroup()); 

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
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleAction"
    // InternalWebDsl.g:128:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalWebDsl.g:129:1: ( ruleAction EOF )
            // InternalWebDsl.g:130:1: ruleAction EOF
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
    // InternalWebDsl.g:137:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:141:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalWebDsl.g:142:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalWebDsl.g:142:2: ( ( rule__Action__Alternatives ) )
            // InternalWebDsl.g:143:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalWebDsl.g:144:3: ( rule__Action__Alternatives )
            // InternalWebDsl.g:144:4: rule__Action__Alternatives
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


    // $ANTLR start "entryRuleCallProcedure"
    // InternalWebDsl.g:153:1: entryRuleCallProcedure : ruleCallProcedure EOF ;
    public final void entryRuleCallProcedure() throws RecognitionException {
        try {
            // InternalWebDsl.g:154:1: ( ruleCallProcedure EOF )
            // InternalWebDsl.g:155:1: ruleCallProcedure EOF
            {
             before(grammarAccess.getCallProcedureRule()); 
            pushFollow(FOLLOW_1);
            ruleCallProcedure();

            state._fsp--;

             after(grammarAccess.getCallProcedureRule()); 
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
    // $ANTLR end "entryRuleCallProcedure"


    // $ANTLR start "ruleCallProcedure"
    // InternalWebDsl.g:162:1: ruleCallProcedure : ( ( rule__CallProcedure__Group__0 ) ) ;
    public final void ruleCallProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:166:2: ( ( ( rule__CallProcedure__Group__0 ) ) )
            // InternalWebDsl.g:167:2: ( ( rule__CallProcedure__Group__0 ) )
            {
            // InternalWebDsl.g:167:2: ( ( rule__CallProcedure__Group__0 ) )
            // InternalWebDsl.g:168:3: ( rule__CallProcedure__Group__0 )
            {
             before(grammarAccess.getCallProcedureAccess().getGroup()); 
            // InternalWebDsl.g:169:3: ( rule__CallProcedure__Group__0 )
            // InternalWebDsl.g:169:4: rule__CallProcedure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallProcedureAccess().getGroup()); 

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
    // $ANTLR end "ruleCallProcedure"


    // $ANTLR start "entryRuleGoAction"
    // InternalWebDsl.g:178:1: entryRuleGoAction : ruleGoAction EOF ;
    public final void entryRuleGoAction() throws RecognitionException {
        try {
            // InternalWebDsl.g:179:1: ( ruleGoAction EOF )
            // InternalWebDsl.g:180:1: ruleGoAction EOF
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
    // InternalWebDsl.g:187:1: ruleGoAction : ( ( rule__GoAction__Group__0 ) ) ;
    public final void ruleGoAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:191:2: ( ( ( rule__GoAction__Group__0 ) ) )
            // InternalWebDsl.g:192:2: ( ( rule__GoAction__Group__0 ) )
            {
            // InternalWebDsl.g:192:2: ( ( rule__GoAction__Group__0 ) )
            // InternalWebDsl.g:193:3: ( rule__GoAction__Group__0 )
            {
             before(grammarAccess.getGoActionAccess().getGroup()); 
            // InternalWebDsl.g:194:3: ( rule__GoAction__Group__0 )
            // InternalWebDsl.g:194:4: rule__GoAction__Group__0
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
    // InternalWebDsl.g:203:1: entryRuleSelection : ruleSelection EOF ;
    public final void entryRuleSelection() throws RecognitionException {
        try {
            // InternalWebDsl.g:204:1: ( ruleSelection EOF )
            // InternalWebDsl.g:205:1: ruleSelection EOF
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
    // InternalWebDsl.g:212:1: ruleSelection : ( ( rule__Selection__Alternatives ) ) ;
    public final void ruleSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:216:2: ( ( ( rule__Selection__Alternatives ) ) )
            // InternalWebDsl.g:217:2: ( ( rule__Selection__Alternatives ) )
            {
            // InternalWebDsl.g:217:2: ( ( rule__Selection__Alternatives ) )
            // InternalWebDsl.g:218:3: ( rule__Selection__Alternatives )
            {
             before(grammarAccess.getSelectionAccess().getAlternatives()); 
            // InternalWebDsl.g:219:3: ( rule__Selection__Alternatives )
            // InternalWebDsl.g:219:4: rule__Selection__Alternatives
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
    // InternalWebDsl.g:228:1: entryRuleLinkButtonSelection : ruleLinkButtonSelection EOF ;
    public final void entryRuleLinkButtonSelection() throws RecognitionException {
        try {
            // InternalWebDsl.g:229:1: ( ruleLinkButtonSelection EOF )
            // InternalWebDsl.g:230:1: ruleLinkButtonSelection EOF
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
    // InternalWebDsl.g:237:1: ruleLinkButtonSelection : ( ( rule__LinkButtonSelection__Group__0 ) ) ;
    public final void ruleLinkButtonSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:241:2: ( ( ( rule__LinkButtonSelection__Group__0 ) ) )
            // InternalWebDsl.g:242:2: ( ( rule__LinkButtonSelection__Group__0 ) )
            {
            // InternalWebDsl.g:242:2: ( ( rule__LinkButtonSelection__Group__0 ) )
            // InternalWebDsl.g:243:3: ( rule__LinkButtonSelection__Group__0 )
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getGroup()); 
            // InternalWebDsl.g:244:3: ( rule__LinkButtonSelection__Group__0 )
            // InternalWebDsl.g:244:4: rule__LinkButtonSelection__Group__0
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
    // InternalWebDsl.g:253:1: entryRuleGeneralSelection : ruleGeneralSelection EOF ;
    public final void entryRuleGeneralSelection() throws RecognitionException {
        try {
            // InternalWebDsl.g:254:1: ( ruleGeneralSelection EOF )
            // InternalWebDsl.g:255:1: ruleGeneralSelection EOF
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
    // InternalWebDsl.g:262:1: ruleGeneralSelection : ( ( rule__GeneralSelection__Group__0 ) ) ;
    public final void ruleGeneralSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:266:2: ( ( ( rule__GeneralSelection__Group__0 ) ) )
            // InternalWebDsl.g:267:2: ( ( rule__GeneralSelection__Group__0 ) )
            {
            // InternalWebDsl.g:267:2: ( ( rule__GeneralSelection__Group__0 ) )
            // InternalWebDsl.g:268:3: ( rule__GeneralSelection__Group__0 )
            {
             before(grammarAccess.getGeneralSelectionAccess().getGroup()); 
            // InternalWebDsl.g:269:3: ( rule__GeneralSelection__Group__0 )
            // InternalWebDsl.g:269:4: rule__GeneralSelection__Group__0
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
    // InternalWebDsl.g:278:1: entryRuleCheckboxSelection : ruleCheckboxSelection EOF ;
    public final void entryRuleCheckboxSelection() throws RecognitionException {
        try {
            // InternalWebDsl.g:279:1: ( ruleCheckboxSelection EOF )
            // InternalWebDsl.g:280:1: ruleCheckboxSelection EOF
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
    // InternalWebDsl.g:287:1: ruleCheckboxSelection : ( ( rule__CheckboxSelection__Group__0 ) ) ;
    public final void ruleCheckboxSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:291:2: ( ( ( rule__CheckboxSelection__Group__0 ) ) )
            // InternalWebDsl.g:292:2: ( ( rule__CheckboxSelection__Group__0 ) )
            {
            // InternalWebDsl.g:292:2: ( ( rule__CheckboxSelection__Group__0 ) )
            // InternalWebDsl.g:293:3: ( rule__CheckboxSelection__Group__0 )
            {
             before(grammarAccess.getCheckboxSelectionAccess().getGroup()); 
            // InternalWebDsl.g:294:3: ( rule__CheckboxSelection__Group__0 )
            // InternalWebDsl.g:294:4: rule__CheckboxSelection__Group__0
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
    // InternalWebDsl.g:303:1: entryRuleComboboxSelection : ruleComboboxSelection EOF ;
    public final void entryRuleComboboxSelection() throws RecognitionException {
        try {
            // InternalWebDsl.g:304:1: ( ruleComboboxSelection EOF )
            // InternalWebDsl.g:305:1: ruleComboboxSelection EOF
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
    // InternalWebDsl.g:312:1: ruleComboboxSelection : ( ( rule__ComboboxSelection__Group__0 ) ) ;
    public final void ruleComboboxSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:316:2: ( ( ( rule__ComboboxSelection__Group__0 ) ) )
            // InternalWebDsl.g:317:2: ( ( rule__ComboboxSelection__Group__0 ) )
            {
            // InternalWebDsl.g:317:2: ( ( rule__ComboboxSelection__Group__0 ) )
            // InternalWebDsl.g:318:3: ( rule__ComboboxSelection__Group__0 )
            {
             before(grammarAccess.getComboboxSelectionAccess().getGroup()); 
            // InternalWebDsl.g:319:3: ( rule__ComboboxSelection__Group__0 )
            // InternalWebDsl.g:319:4: rule__ComboboxSelection__Group__0
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
    // InternalWebDsl.g:328:1: entryRulePageSelection : rulePageSelection EOF ;
    public final void entryRulePageSelection() throws RecognitionException {
        try {
            // InternalWebDsl.g:329:1: ( rulePageSelection EOF )
            // InternalWebDsl.g:330:1: rulePageSelection EOF
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
    // InternalWebDsl.g:337:1: rulePageSelection : ( ( rule__PageSelection__Group__0 ) ) ;
    public final void rulePageSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:341:2: ( ( ( rule__PageSelection__Group__0 ) ) )
            // InternalWebDsl.g:342:2: ( ( rule__PageSelection__Group__0 ) )
            {
            // InternalWebDsl.g:342:2: ( ( rule__PageSelection__Group__0 ) )
            // InternalWebDsl.g:343:3: ( rule__PageSelection__Group__0 )
            {
             before(grammarAccess.getPageSelectionAccess().getGroup()); 
            // InternalWebDsl.g:344:3: ( rule__PageSelection__Group__0 )
            // InternalWebDsl.g:344:4: rule__PageSelection__Group__0
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
    // InternalWebDsl.g:353:1: entryRuleGeneralAction : ruleGeneralAction EOF ;
    public final void entryRuleGeneralAction() throws RecognitionException {
        try {
            // InternalWebDsl.g:354:1: ( ruleGeneralAction EOF )
            // InternalWebDsl.g:355:1: ruleGeneralAction EOF
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
    // InternalWebDsl.g:362:1: ruleGeneralAction : ( ( rule__GeneralAction__Alternatives ) ) ;
    public final void ruleGeneralAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:366:2: ( ( ( rule__GeneralAction__Alternatives ) ) )
            // InternalWebDsl.g:367:2: ( ( rule__GeneralAction__Alternatives ) )
            {
            // InternalWebDsl.g:367:2: ( ( rule__GeneralAction__Alternatives ) )
            // InternalWebDsl.g:368:3: ( rule__GeneralAction__Alternatives )
            {
             before(grammarAccess.getGeneralActionAccess().getAlternatives()); 
            // InternalWebDsl.g:369:3: ( rule__GeneralAction__Alternatives )
            // InternalWebDsl.g:369:4: rule__GeneralAction__Alternatives
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
    // InternalWebDsl.g:378:1: entryRuleStoreAction : ruleStoreAction EOF ;
    public final void entryRuleStoreAction() throws RecognitionException {
        try {
            // InternalWebDsl.g:379:1: ( ruleStoreAction EOF )
            // InternalWebDsl.g:380:1: ruleStoreAction EOF
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
    // InternalWebDsl.g:387:1: ruleStoreAction : ( ( rule__StoreAction__Group__0 ) ) ;
    public final void ruleStoreAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:391:2: ( ( ( rule__StoreAction__Group__0 ) ) )
            // InternalWebDsl.g:392:2: ( ( rule__StoreAction__Group__0 ) )
            {
            // InternalWebDsl.g:392:2: ( ( rule__StoreAction__Group__0 ) )
            // InternalWebDsl.g:393:3: ( rule__StoreAction__Group__0 )
            {
             before(grammarAccess.getStoreActionAccess().getGroup()); 
            // InternalWebDsl.g:394:3: ( rule__StoreAction__Group__0 )
            // InternalWebDsl.g:394:4: rule__StoreAction__Group__0
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


    // $ANTLR start "entryRuleCountAction"
    // InternalWebDsl.g:403:1: entryRuleCountAction : ruleCountAction EOF ;
    public final void entryRuleCountAction() throws RecognitionException {
        try {
            // InternalWebDsl.g:404:1: ( ruleCountAction EOF )
            // InternalWebDsl.g:405:1: ruleCountAction EOF
            {
             before(grammarAccess.getCountActionRule()); 
            pushFollow(FOLLOW_1);
            ruleCountAction();

            state._fsp--;

             after(grammarAccess.getCountActionRule()); 
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
    // $ANTLR end "entryRuleCountAction"


    // $ANTLR start "ruleCountAction"
    // InternalWebDsl.g:412:1: ruleCountAction : ( ( rule__CountAction__Group__0 ) ) ;
    public final void ruleCountAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:416:2: ( ( ( rule__CountAction__Group__0 ) ) )
            // InternalWebDsl.g:417:2: ( ( rule__CountAction__Group__0 ) )
            {
            // InternalWebDsl.g:417:2: ( ( rule__CountAction__Group__0 ) )
            // InternalWebDsl.g:418:3: ( rule__CountAction__Group__0 )
            {
             before(grammarAccess.getCountActionAccess().getGroup()); 
            // InternalWebDsl.g:419:3: ( rule__CountAction__Group__0 )
            // InternalWebDsl.g:419:4: rule__CountAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CountAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountActionAccess().getGroup()); 

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
    // $ANTLR end "ruleCountAction"


    // $ANTLR start "entryRuleVar"
    // InternalWebDsl.g:428:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalWebDsl.g:429:1: ( ruleVar EOF )
            // InternalWebDsl.g:430:1: ruleVar EOF
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
    // InternalWebDsl.g:437:1: ruleVar : ( ( rule__Var__NameAssignment ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:441:2: ( ( ( rule__Var__NameAssignment ) ) )
            // InternalWebDsl.g:442:2: ( ( rule__Var__NameAssignment ) )
            {
            // InternalWebDsl.g:442:2: ( ( rule__Var__NameAssignment ) )
            // InternalWebDsl.g:443:3: ( rule__Var__NameAssignment )
            {
             before(grammarAccess.getVarAccess().getNameAssignment()); 
            // InternalWebDsl.g:444:3: ( rule__Var__NameAssignment )
            // InternalWebDsl.g:444:4: rule__Var__NameAssignment
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
    // InternalWebDsl.g:453:1: entryRuleSetAction : ruleSetAction EOF ;
    public final void entryRuleSetAction() throws RecognitionException {
        try {
            // InternalWebDsl.g:454:1: ( ruleSetAction EOF )
            // InternalWebDsl.g:455:1: ruleSetAction EOF
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
    // InternalWebDsl.g:462:1: ruleSetAction : ( ( rule__SetAction__Group__0 ) ) ;
    public final void ruleSetAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:466:2: ( ( ( rule__SetAction__Group__0 ) ) )
            // InternalWebDsl.g:467:2: ( ( rule__SetAction__Group__0 ) )
            {
            // InternalWebDsl.g:467:2: ( ( rule__SetAction__Group__0 ) )
            // InternalWebDsl.g:468:3: ( rule__SetAction__Group__0 )
            {
             before(grammarAccess.getSetActionAccess().getGroup()); 
            // InternalWebDsl.g:469:3: ( rule__SetAction__Group__0 )
            // InternalWebDsl.g:469:4: rule__SetAction__Group__0
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
    // InternalWebDsl.g:478:1: entryRuleTypeSelection : ruleTypeSelection EOF ;
    public final void entryRuleTypeSelection() throws RecognitionException {
        try {
            // InternalWebDsl.g:479:1: ( ruleTypeSelection EOF )
            // InternalWebDsl.g:480:1: ruleTypeSelection EOF
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
    // InternalWebDsl.g:487:1: ruleTypeSelection : ( ( rule__TypeSelection__Alternatives ) ) ;
    public final void ruleTypeSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:491:2: ( ( ( rule__TypeSelection__Alternatives ) ) )
            // InternalWebDsl.g:492:2: ( ( rule__TypeSelection__Alternatives ) )
            {
            // InternalWebDsl.g:492:2: ( ( rule__TypeSelection__Alternatives ) )
            // InternalWebDsl.g:493:3: ( rule__TypeSelection__Alternatives )
            {
             before(grammarAccess.getTypeSelectionAccess().getAlternatives()); 
            // InternalWebDsl.g:494:3: ( rule__TypeSelection__Alternatives )
            // InternalWebDsl.g:494:4: rule__TypeSelection__Alternatives
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
    // InternalWebDsl.g:503:1: entryRuleAssert : ruleAssert EOF ;
    public final void entryRuleAssert() throws RecognitionException {
        try {
            // InternalWebDsl.g:504:1: ( ruleAssert EOF )
            // InternalWebDsl.g:505:1: ruleAssert EOF
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
    // InternalWebDsl.g:512:1: ruleAssert : ( ( rule__Assert__Group__0 ) ) ;
    public final void ruleAssert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:516:2: ( ( ( rule__Assert__Group__0 ) ) )
            // InternalWebDsl.g:517:2: ( ( rule__Assert__Group__0 ) )
            {
            // InternalWebDsl.g:517:2: ( ( rule__Assert__Group__0 ) )
            // InternalWebDsl.g:518:3: ( rule__Assert__Group__0 )
            {
             before(grammarAccess.getAssertAccess().getGroup()); 
            // InternalWebDsl.g:519:3: ( rule__Assert__Group__0 )
            // InternalWebDsl.g:519:4: rule__Assert__Group__0
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
    // InternalWebDsl.g:528:1: entryRuleAssertContains : ruleAssertContains EOF ;
    public final void entryRuleAssertContains() throws RecognitionException {
        try {
            // InternalWebDsl.g:529:1: ( ruleAssertContains EOF )
            // InternalWebDsl.g:530:1: ruleAssertContains EOF
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
    // InternalWebDsl.g:537:1: ruleAssertContains : ( ( rule__AssertContains__Group__0 ) ) ;
    public final void ruleAssertContains() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:541:2: ( ( ( rule__AssertContains__Group__0 ) ) )
            // InternalWebDsl.g:542:2: ( ( rule__AssertContains__Group__0 ) )
            {
            // InternalWebDsl.g:542:2: ( ( rule__AssertContains__Group__0 ) )
            // InternalWebDsl.g:543:3: ( rule__AssertContains__Group__0 )
            {
             before(grammarAccess.getAssertContainsAccess().getGroup()); 
            // InternalWebDsl.g:544:3: ( rule__AssertContains__Group__0 )
            // InternalWebDsl.g:544:4: rule__AssertContains__Group__0
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
    // InternalWebDsl.g:553:1: entryRuleAssertEquals : ruleAssertEquals EOF ;
    public final void entryRuleAssertEquals() throws RecognitionException {
        try {
            // InternalWebDsl.g:554:1: ( ruleAssertEquals EOF )
            // InternalWebDsl.g:555:1: ruleAssertEquals EOF
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
    // InternalWebDsl.g:562:1: ruleAssertEquals : ( ( rule__AssertEquals__Group__0 ) ) ;
    public final void ruleAssertEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:566:2: ( ( ( rule__AssertEquals__Group__0 ) ) )
            // InternalWebDsl.g:567:2: ( ( rule__AssertEquals__Group__0 ) )
            {
            // InternalWebDsl.g:567:2: ( ( rule__AssertEquals__Group__0 ) )
            // InternalWebDsl.g:568:3: ( rule__AssertEquals__Group__0 )
            {
             before(grammarAccess.getAssertEqualsAccess().getGroup()); 
            // InternalWebDsl.g:569:3: ( rule__AssertEquals__Group__0 )
            // InternalWebDsl.g:569:4: rule__AssertEquals__Group__0
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
    // InternalWebDsl.g:578:1: entryRuleComparable : ruleComparable EOF ;
    public final void entryRuleComparable() throws RecognitionException {
        try {
            // InternalWebDsl.g:579:1: ( ruleComparable EOF )
            // InternalWebDsl.g:580:1: ruleComparable EOF
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
    // InternalWebDsl.g:587:1: ruleComparable : ( ( rule__Comparable__Alternatives ) ) ;
    public final void ruleComparable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:591:2: ( ( ( rule__Comparable__Alternatives ) ) )
            // InternalWebDsl.g:592:2: ( ( rule__Comparable__Alternatives ) )
            {
            // InternalWebDsl.g:592:2: ( ( rule__Comparable__Alternatives ) )
            // InternalWebDsl.g:593:3: ( rule__Comparable__Alternatives )
            {
             before(grammarAccess.getComparableAccess().getAlternatives()); 
            // InternalWebDsl.g:594:3: ( rule__Comparable__Alternatives )
            // InternalWebDsl.g:594:4: rule__Comparable__Alternatives
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
    // InternalWebDsl.g:603:1: ruleBrowser : ( ( rule__Browser__Alternatives ) ) ;
    public final void ruleBrowser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:607:1: ( ( ( rule__Browser__Alternatives ) ) )
            // InternalWebDsl.g:608:2: ( ( rule__Browser__Alternatives ) )
            {
            // InternalWebDsl.g:608:2: ( ( rule__Browser__Alternatives ) )
            // InternalWebDsl.g:609:3: ( rule__Browser__Alternatives )
            {
             before(grammarAccess.getBrowserAccess().getAlternatives()); 
            // InternalWebDsl.g:610:3: ( rule__Browser__Alternatives )
            // InternalWebDsl.g:610:4: rule__Browser__Alternatives
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
    // InternalWebDsl.g:619:1: ruleHtmlElement : ( ( rule__HtmlElement__Alternatives ) ) ;
    public final void ruleHtmlElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:623:1: ( ( ( rule__HtmlElement__Alternatives ) ) )
            // InternalWebDsl.g:624:2: ( ( rule__HtmlElement__Alternatives ) )
            {
            // InternalWebDsl.g:624:2: ( ( rule__HtmlElement__Alternatives ) )
            // InternalWebDsl.g:625:3: ( rule__HtmlElement__Alternatives )
            {
             before(grammarAccess.getHtmlElementAccess().getAlternatives()); 
            // InternalWebDsl.g:626:3: ( rule__HtmlElement__Alternatives )
            // InternalWebDsl.g:626:4: rule__HtmlElement__Alternatives
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
    // InternalWebDsl.g:635:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:639:1: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalWebDsl.g:640:2: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalWebDsl.g:640:2: ( ( rule__Attribute__Alternatives ) )
            // InternalWebDsl.g:641:3: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // InternalWebDsl.g:642:3: ( rule__Attribute__Alternatives )
            // InternalWebDsl.g:642:4: rule__Attribute__Alternatives
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
    // InternalWebDsl.g:650:1: rule__Action__Alternatives : ( ( ruleGoAction ) | ( ruleSelection ) | ( ruleCallProcedure ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:654:1: ( ( ruleGoAction ) | ( ruleSelection ) | ( ruleCallProcedure ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt1=1;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 27:
            case 28:
            case 59:
                {
                alt1=2;
                }
                break;
            case 45:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalWebDsl.g:655:2: ( ruleGoAction )
                    {
                    // InternalWebDsl.g:655:2: ( ruleGoAction )
                    // InternalWebDsl.g:656:3: ruleGoAction
                    {
                     before(grammarAccess.getActionAccess().getGoActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGoAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getGoActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:661:2: ( ruleSelection )
                    {
                    // InternalWebDsl.g:661:2: ( ruleSelection )
                    // InternalWebDsl.g:662:3: ruleSelection
                    {
                     before(grammarAccess.getActionAccess().getSelectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSelection();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getSelectionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:667:2: ( ruleCallProcedure )
                    {
                    // InternalWebDsl.g:667:2: ( ruleCallProcedure )
                    // InternalWebDsl.g:668:3: ruleCallProcedure
                    {
                     before(grammarAccess.getActionAccess().getCallProcedureParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCallProcedure();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getCallProcedureParserRuleCall_2()); 

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
    // InternalWebDsl.g:677:1: rule__Selection__Alternatives : ( ( ruleLinkButtonSelection ) | ( ruleGeneralSelection ) | ( ruleCheckboxSelection ) | ( ruleComboboxSelection ) | ( rulePageSelection ) );
    public final void rule__Selection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:681:1: ( ( ruleLinkButtonSelection ) | ( ruleGeneralSelection ) | ( ruleCheckboxSelection ) | ( ruleComboboxSelection ) | ( rulePageSelection ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
            case 15:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 28:
                {
                alt2=4;
                }
                break;
            case 59:
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
                    // InternalWebDsl.g:682:2: ( ruleLinkButtonSelection )
                    {
                    // InternalWebDsl.g:682:2: ( ruleLinkButtonSelection )
                    // InternalWebDsl.g:683:3: ruleLinkButtonSelection
                    {
                     before(grammarAccess.getSelectionAccess().getLinkButtonSelectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLinkButtonSelection();

                    state._fsp--;

                     after(grammarAccess.getSelectionAccess().getLinkButtonSelectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:688:2: ( ruleGeneralSelection )
                    {
                    // InternalWebDsl.g:688:2: ( ruleGeneralSelection )
                    // InternalWebDsl.g:689:3: ruleGeneralSelection
                    {
                     before(grammarAccess.getSelectionAccess().getGeneralSelectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralSelection();

                    state._fsp--;

                     after(grammarAccess.getSelectionAccess().getGeneralSelectionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:694:2: ( ruleCheckboxSelection )
                    {
                    // InternalWebDsl.g:694:2: ( ruleCheckboxSelection )
                    // InternalWebDsl.g:695:3: ruleCheckboxSelection
                    {
                     before(grammarAccess.getSelectionAccess().getCheckboxSelectionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCheckboxSelection();

                    state._fsp--;

                     after(grammarAccess.getSelectionAccess().getCheckboxSelectionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:700:2: ( ruleComboboxSelection )
                    {
                    // InternalWebDsl.g:700:2: ( ruleComboboxSelection )
                    // InternalWebDsl.g:701:3: ruleComboboxSelection
                    {
                     before(grammarAccess.getSelectionAccess().getComboboxSelectionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleComboboxSelection();

                    state._fsp--;

                     after(grammarAccess.getSelectionAccess().getComboboxSelectionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:706:2: ( rulePageSelection )
                    {
                    // InternalWebDsl.g:706:2: ( rulePageSelection )
                    // InternalWebDsl.g:707:3: rulePageSelection
                    {
                     before(grammarAccess.getSelectionAccess().getPageSelectionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePageSelection();

                    state._fsp--;

                     after(grammarAccess.getSelectionAccess().getPageSelectionParserRuleCall_4()); 

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


    // $ANTLR start "rule__LinkButtonSelection__TypeElementAlternatives_0_0"
    // InternalWebDsl.g:716:1: rule__LinkButtonSelection__TypeElementAlternatives_0_0 : ( ( 'LINK' ) | ( 'BUTTON' ) | ( 'IMAGE' ) );
    public final void rule__LinkButtonSelection__TypeElementAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:720:1: ( ( 'LINK' ) | ( 'BUTTON' ) | ( 'IMAGE' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalWebDsl.g:721:2: ( 'LINK' )
                    {
                    // InternalWebDsl.g:721:2: ( 'LINK' )
                    // InternalWebDsl.g:722:3: 'LINK'
                    {
                     before(grammarAccess.getLinkButtonSelectionAccess().getTypeElementLINKKeyword_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getLinkButtonSelectionAccess().getTypeElementLINKKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:727:2: ( 'BUTTON' )
                    {
                    // InternalWebDsl.g:727:2: ( 'BUTTON' )
                    // InternalWebDsl.g:728:3: 'BUTTON'
                    {
                     before(grammarAccess.getLinkButtonSelectionAccess().getTypeElementBUTTONKeyword_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getLinkButtonSelectionAccess().getTypeElementBUTTONKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:733:2: ( 'IMAGE' )
                    {
                    // InternalWebDsl.g:733:2: ( 'IMAGE' )
                    // InternalWebDsl.g:734:3: 'IMAGE'
                    {
                     before(grammarAccess.getLinkButtonSelectionAccess().getTypeElementIMAGEKeyword_0_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getLinkButtonSelectionAccess().getTypeElementIMAGEKeyword_0_0_2()); 

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
    // $ANTLR end "rule__LinkButtonSelection__TypeElementAlternatives_0_0"


    // $ANTLR start "rule__LinkButtonSelection__Alternatives_3"
    // InternalWebDsl.g:743:1: rule__LinkButtonSelection__Alternatives_3 : ( ( ( rule__LinkButtonSelection__GeneralActionsAssignment_3_0 ) ) | ( ( rule__LinkButtonSelection__ClicksAssignment_3_1 ) ) );
    public final void rule__LinkButtonSelection__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:747:1: ( ( ( rule__LinkButtonSelection__GeneralActionsAssignment_3_0 ) ) | ( ( rule__LinkButtonSelection__ClicksAssignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=15)||(LA4_0>=27 && LA4_0<=28)||LA4_0==49||LA4_0==52||LA4_0==59) ) {
                alt4=1;
            }
            else if ( (LA4_0==58) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalWebDsl.g:748:2: ( ( rule__LinkButtonSelection__GeneralActionsAssignment_3_0 ) )
                    {
                    // InternalWebDsl.g:748:2: ( ( rule__LinkButtonSelection__GeneralActionsAssignment_3_0 ) )
                    // InternalWebDsl.g:749:3: ( rule__LinkButtonSelection__GeneralActionsAssignment_3_0 )
                    {
                     before(grammarAccess.getLinkButtonSelectionAccess().getGeneralActionsAssignment_3_0()); 
                    // InternalWebDsl.g:750:3: ( rule__LinkButtonSelection__GeneralActionsAssignment_3_0 )
                    // InternalWebDsl.g:750:4: rule__LinkButtonSelection__GeneralActionsAssignment_3_0
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
                    // InternalWebDsl.g:754:2: ( ( rule__LinkButtonSelection__ClicksAssignment_3_1 ) )
                    {
                    // InternalWebDsl.g:754:2: ( ( rule__LinkButtonSelection__ClicksAssignment_3_1 ) )
                    // InternalWebDsl.g:755:3: ( rule__LinkButtonSelection__ClicksAssignment_3_1 )
                    {
                     before(grammarAccess.getLinkButtonSelectionAccess().getClicksAssignment_3_1()); 
                    // InternalWebDsl.g:756:3: ( rule__LinkButtonSelection__ClicksAssignment_3_1 )
                    // InternalWebDsl.g:756:4: rule__LinkButtonSelection__ClicksAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinkButtonSelection__ClicksAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkButtonSelectionAccess().getClicksAssignment_3_1()); 

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


    // $ANTLR start "rule__GeneralSelection__TypeElementAlternatives_0_0"
    // InternalWebDsl.g:764:1: rule__GeneralSelection__TypeElementAlternatives_0_0 : ( ( 'SEARCH_FIELD' ) | ( 'DIV' ) );
    public final void rule__GeneralSelection__TypeElementAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:768:1: ( ( 'SEARCH_FIELD' ) | ( 'DIV' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalWebDsl.g:769:2: ( 'SEARCH_FIELD' )
                    {
                    // InternalWebDsl.g:769:2: ( 'SEARCH_FIELD' )
                    // InternalWebDsl.g:770:3: 'SEARCH_FIELD'
                    {
                     before(grammarAccess.getGeneralSelectionAccess().getTypeElementSEARCH_FIELDKeyword_0_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getGeneralSelectionAccess().getTypeElementSEARCH_FIELDKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:775:2: ( 'DIV' )
                    {
                    // InternalWebDsl.g:775:2: ( 'DIV' )
                    // InternalWebDsl.g:776:3: 'DIV'
                    {
                     before(grammarAccess.getGeneralSelectionAccess().getTypeElementDIVKeyword_0_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getGeneralSelectionAccess().getTypeElementDIVKeyword_0_0_1()); 

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
    // $ANTLR end "rule__GeneralSelection__TypeElementAlternatives_0_0"


    // $ANTLR start "rule__CheckboxSelection__Alternatives_3"
    // InternalWebDsl.g:785:1: rule__CheckboxSelection__Alternatives_3 : ( ( ( rule__CheckboxSelection__GeneralActionsAssignment_3_0 ) ) | ( 'check' ) | ( 'uncheck' ) );
    public final void rule__CheckboxSelection__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:789:1: ( ( ( rule__CheckboxSelection__GeneralActionsAssignment_3_0 ) ) | ( 'check' ) | ( 'uncheck' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 27:
            case 28:
            case 49:
            case 52:
            case 59:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
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
                    // InternalWebDsl.g:790:2: ( ( rule__CheckboxSelection__GeneralActionsAssignment_3_0 ) )
                    {
                    // InternalWebDsl.g:790:2: ( ( rule__CheckboxSelection__GeneralActionsAssignment_3_0 ) )
                    // InternalWebDsl.g:791:3: ( rule__CheckboxSelection__GeneralActionsAssignment_3_0 )
                    {
                     before(grammarAccess.getCheckboxSelectionAccess().getGeneralActionsAssignment_3_0()); 
                    // InternalWebDsl.g:792:3: ( rule__CheckboxSelection__GeneralActionsAssignment_3_0 )
                    // InternalWebDsl.g:792:4: rule__CheckboxSelection__GeneralActionsAssignment_3_0
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
                    // InternalWebDsl.g:796:2: ( 'check' )
                    {
                    // InternalWebDsl.g:796:2: ( 'check' )
                    // InternalWebDsl.g:797:3: 'check'
                    {
                     before(grammarAccess.getCheckboxSelectionAccess().getCheckKeyword_3_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCheckboxSelectionAccess().getCheckKeyword_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:802:2: ( 'uncheck' )
                    {
                    // InternalWebDsl.g:802:2: ( 'uncheck' )
                    // InternalWebDsl.g:803:3: 'uncheck'
                    {
                     before(grammarAccess.getCheckboxSelectionAccess().getUncheckKeyword_3_2()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalWebDsl.g:812:1: rule__ComboboxSelection__Alternatives_3 : ( ( ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 ) ) | ( ( rule__ComboboxSelection__Group_3_1__0 ) ) );
    public final void rule__ComboboxSelection__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:816:1: ( ( ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 ) ) | ( ( rule__ComboboxSelection__Group_3_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=15)||(LA7_0>=27 && LA7_0<=28)||LA7_0==49||LA7_0==52||LA7_0==59) ) {
                alt7=1;
            }
            else if ( (LA7_0==48) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalWebDsl.g:817:2: ( ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 ) )
                    {
                    // InternalWebDsl.g:817:2: ( ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 ) )
                    // InternalWebDsl.g:818:3: ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 )
                    {
                     before(grammarAccess.getComboboxSelectionAccess().getGeneralActionsAssignment_3_0()); 
                    // InternalWebDsl.g:819:3: ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 )
                    // InternalWebDsl.g:819:4: rule__ComboboxSelection__GeneralActionsAssignment_3_0
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
                    // InternalWebDsl.g:823:2: ( ( rule__ComboboxSelection__Group_3_1__0 ) )
                    {
                    // InternalWebDsl.g:823:2: ( ( rule__ComboboxSelection__Group_3_1__0 ) )
                    // InternalWebDsl.g:824:3: ( rule__ComboboxSelection__Group_3_1__0 )
                    {
                     before(grammarAccess.getComboboxSelectionAccess().getGroup_3_1()); 
                    // InternalWebDsl.g:825:3: ( rule__ComboboxSelection__Group_3_1__0 )
                    // InternalWebDsl.g:825:4: rule__ComboboxSelection__Group_3_1__0
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
    // InternalWebDsl.g:833:1: rule__PageSelection__Alternatives_2 : ( ( ( rule__PageSelection__StoreActionsAssignment_2_0 ) ) | ( ( rule__PageSelection__AssertionsAssignment_2_1 ) ) );
    public final void rule__PageSelection__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:837:1: ( ( ( rule__PageSelection__StoreActionsAssignment_2_0 ) ) | ( ( rule__PageSelection__AssertionsAssignment_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==49) ) {
                alt8=1;
            }
            else if ( (LA8_0==54) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalWebDsl.g:838:2: ( ( rule__PageSelection__StoreActionsAssignment_2_0 ) )
                    {
                    // InternalWebDsl.g:838:2: ( ( rule__PageSelection__StoreActionsAssignment_2_0 ) )
                    // InternalWebDsl.g:839:3: ( rule__PageSelection__StoreActionsAssignment_2_0 )
                    {
                     before(grammarAccess.getPageSelectionAccess().getStoreActionsAssignment_2_0()); 
                    // InternalWebDsl.g:840:3: ( rule__PageSelection__StoreActionsAssignment_2_0 )
                    // InternalWebDsl.g:840:4: rule__PageSelection__StoreActionsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PageSelection__StoreActionsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPageSelectionAccess().getStoreActionsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:844:2: ( ( rule__PageSelection__AssertionsAssignment_2_1 ) )
                    {
                    // InternalWebDsl.g:844:2: ( ( rule__PageSelection__AssertionsAssignment_2_1 ) )
                    // InternalWebDsl.g:845:3: ( rule__PageSelection__AssertionsAssignment_2_1 )
                    {
                     before(grammarAccess.getPageSelectionAccess().getAssertionsAssignment_2_1()); 
                    // InternalWebDsl.g:846:3: ( rule__PageSelection__AssertionsAssignment_2_1 )
                    // InternalWebDsl.g:846:4: rule__PageSelection__AssertionsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PageSelection__AssertionsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPageSelectionAccess().getAssertionsAssignment_2_1()); 

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
    // InternalWebDsl.g:854:1: rule__GeneralAction__Alternatives : ( ( ruleSetAction ) | ( ruleStoreAction ) | ( ruleSelection ) );
    public final void rule__GeneralAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:858:1: ( ( ruleSetAction ) | ( ruleStoreAction ) | ( ruleSelection ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt9=1;
                }
                break;
            case 49:
                {
                alt9=2;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 27:
            case 28:
            case 59:
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
                    // InternalWebDsl.g:859:2: ( ruleSetAction )
                    {
                    // InternalWebDsl.g:859:2: ( ruleSetAction )
                    // InternalWebDsl.g:860:3: ruleSetAction
                    {
                     before(grammarAccess.getGeneralActionAccess().getSetActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSetAction();

                    state._fsp--;

                     after(grammarAccess.getGeneralActionAccess().getSetActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:865:2: ( ruleStoreAction )
                    {
                    // InternalWebDsl.g:865:2: ( ruleStoreAction )
                    // InternalWebDsl.g:866:3: ruleStoreAction
                    {
                     before(grammarAccess.getGeneralActionAccess().getStoreActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStoreAction();

                    state._fsp--;

                     after(grammarAccess.getGeneralActionAccess().getStoreActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:871:2: ( ruleSelection )
                    {
                    // InternalWebDsl.g:871:2: ( ruleSelection )
                    // InternalWebDsl.g:872:3: ruleSelection
                    {
                     before(grammarAccess.getGeneralActionAccess().getSelectionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSelection();

                    state._fsp--;

                     after(grammarAccess.getGeneralActionAccess().getSelectionParserRuleCall_2()); 

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


    // $ANTLR start "rule__StoreAction__Alternatives_2"
    // InternalWebDsl.g:881:1: rule__StoreAction__Alternatives_2 : ( ( ( rule__StoreAction__ValAssignment_2_0 ) ) | ( ( rule__StoreAction__CountAssignment_2_1 ) ) );
    public final void rule__StoreAction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:885:1: ( ( ( rule__StoreAction__ValAssignment_2_0 ) ) | ( ( rule__StoreAction__CountAssignment_2_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=30 && LA10_0<=37)) ) {
                alt10=1;
            }
            else if ( (LA10_0==51) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalWebDsl.g:886:2: ( ( rule__StoreAction__ValAssignment_2_0 ) )
                    {
                    // InternalWebDsl.g:886:2: ( ( rule__StoreAction__ValAssignment_2_0 ) )
                    // InternalWebDsl.g:887:3: ( rule__StoreAction__ValAssignment_2_0 )
                    {
                     before(grammarAccess.getStoreActionAccess().getValAssignment_2_0()); 
                    // InternalWebDsl.g:888:3: ( rule__StoreAction__ValAssignment_2_0 )
                    // InternalWebDsl.g:888:4: rule__StoreAction__ValAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StoreAction__ValAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStoreActionAccess().getValAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:892:2: ( ( rule__StoreAction__CountAssignment_2_1 ) )
                    {
                    // InternalWebDsl.g:892:2: ( ( rule__StoreAction__CountAssignment_2_1 ) )
                    // InternalWebDsl.g:893:3: ( rule__StoreAction__CountAssignment_2_1 )
                    {
                     before(grammarAccess.getStoreActionAccess().getCountAssignment_2_1()); 
                    // InternalWebDsl.g:894:3: ( rule__StoreAction__CountAssignment_2_1 )
                    // InternalWebDsl.g:894:4: rule__StoreAction__CountAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StoreAction__CountAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStoreActionAccess().getCountAssignment_2_1()); 

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
    // $ANTLR end "rule__StoreAction__Alternatives_2"


    // $ANTLR start "rule__TypeSelection__Alternatives"
    // InternalWebDsl.g:902:1: rule__TypeSelection__Alternatives : ( ( ( rule__TypeSelection__Group_0__0 ) ) | ( 'PARENT' ) | ( 'FIRST' ) | ( 'LAST' ) | ( 'ALL' ) );
    public final void rule__TypeSelection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:906:1: ( ( ( rule__TypeSelection__Group_0__0 ) ) | ( 'PARENT' ) | ( 'FIRST' ) | ( 'LAST' ) | ( 'ALL' ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                {
                alt11=1;
                }
                break;
            case 18:
                {
                alt11=2;
                }
                break;
            case 19:
                {
                alt11=3;
                }
                break;
            case 20:
                {
                alt11=4;
                }
                break;
            case 21:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalWebDsl.g:907:2: ( ( rule__TypeSelection__Group_0__0 ) )
                    {
                    // InternalWebDsl.g:907:2: ( ( rule__TypeSelection__Group_0__0 ) )
                    // InternalWebDsl.g:908:3: ( rule__TypeSelection__Group_0__0 )
                    {
                     before(grammarAccess.getTypeSelectionAccess().getGroup_0()); 
                    // InternalWebDsl.g:909:3: ( rule__TypeSelection__Group_0__0 )
                    // InternalWebDsl.g:909:4: rule__TypeSelection__Group_0__0
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
                    // InternalWebDsl.g:913:2: ( 'PARENT' )
                    {
                    // InternalWebDsl.g:913:2: ( 'PARENT' )
                    // InternalWebDsl.g:914:3: 'PARENT'
                    {
                     before(grammarAccess.getTypeSelectionAccess().getPARENTKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTypeSelectionAccess().getPARENTKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:919:2: ( 'FIRST' )
                    {
                    // InternalWebDsl.g:919:2: ( 'FIRST' )
                    // InternalWebDsl.g:920:3: 'FIRST'
                    {
                     before(grammarAccess.getTypeSelectionAccess().getFIRSTKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTypeSelectionAccess().getFIRSTKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:925:2: ( 'LAST' )
                    {
                    // InternalWebDsl.g:925:2: ( 'LAST' )
                    // InternalWebDsl.g:926:3: 'LAST'
                    {
                     before(grammarAccess.getTypeSelectionAccess().getLASTKeyword_3()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getTypeSelectionAccess().getLASTKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:931:2: ( 'ALL' )
                    {
                    // InternalWebDsl.g:931:2: ( 'ALL' )
                    // InternalWebDsl.g:932:3: 'ALL'
                    {
                     before(grammarAccess.getTypeSelectionAccess().getALLKeyword_4()); 
                    match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__TypeSelection__Alternatives_0_2"
    // InternalWebDsl.g:941:1: rule__TypeSelection__Alternatives_0_2 : ( ( ( rule__TypeSelection__ValueAssignment_0_2_0 ) ) | ( ( rule__TypeSelection__VarAssignment_0_2_1 ) ) );
    public final void rule__TypeSelection__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:945:1: ( ( ( rule__TypeSelection__ValueAssignment_0_2_0 ) ) | ( ( rule__TypeSelection__VarAssignment_0_2_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalWebDsl.g:946:2: ( ( rule__TypeSelection__ValueAssignment_0_2_0 ) )
                    {
                    // InternalWebDsl.g:946:2: ( ( rule__TypeSelection__ValueAssignment_0_2_0 ) )
                    // InternalWebDsl.g:947:3: ( rule__TypeSelection__ValueAssignment_0_2_0 )
                    {
                     before(grammarAccess.getTypeSelectionAccess().getValueAssignment_0_2_0()); 
                    // InternalWebDsl.g:948:3: ( rule__TypeSelection__ValueAssignment_0_2_0 )
                    // InternalWebDsl.g:948:4: rule__TypeSelection__ValueAssignment_0_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeSelection__ValueAssignment_0_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeSelectionAccess().getValueAssignment_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:952:2: ( ( rule__TypeSelection__VarAssignment_0_2_1 ) )
                    {
                    // InternalWebDsl.g:952:2: ( ( rule__TypeSelection__VarAssignment_0_2_1 ) )
                    // InternalWebDsl.g:953:3: ( rule__TypeSelection__VarAssignment_0_2_1 )
                    {
                     before(grammarAccess.getTypeSelectionAccess().getVarAssignment_0_2_1()); 
                    // InternalWebDsl.g:954:3: ( rule__TypeSelection__VarAssignment_0_2_1 )
                    // InternalWebDsl.g:954:4: rule__TypeSelection__VarAssignment_0_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeSelection__VarAssignment_0_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeSelectionAccess().getVarAssignment_0_2_1()); 

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
    // $ANTLR end "rule__TypeSelection__Alternatives_0_2"


    // $ANTLR start "rule__Assert__Alternatives_1"
    // InternalWebDsl.g:962:1: rule__Assert__Alternatives_1 : ( ( ruleAssertContains ) | ( ruleAssertEquals ) );
    public final void rule__Assert__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:966:1: ( ( ruleAssertContains ) | ( ruleAssertEquals ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==55) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING||LA13_0==43||LA13_0==57) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalWebDsl.g:967:2: ( ruleAssertContains )
                    {
                    // InternalWebDsl.g:967:2: ( ruleAssertContains )
                    // InternalWebDsl.g:968:3: ruleAssertContains
                    {
                     before(grammarAccess.getAssertAccess().getAssertContainsParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAssertContains();

                    state._fsp--;

                     after(grammarAccess.getAssertAccess().getAssertContainsParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:973:2: ( ruleAssertEquals )
                    {
                    // InternalWebDsl.g:973:2: ( ruleAssertEquals )
                    // InternalWebDsl.g:974:3: ruleAssertEquals
                    {
                     before(grammarAccess.getAssertAccess().getAssertEqualsParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssertEquals();

                    state._fsp--;

                     after(grammarAccess.getAssertAccess().getAssertEqualsParserRuleCall_1_1()); 

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
    // InternalWebDsl.g:983:1: rule__AssertContains__Alternatives_1 : ( ( ( rule__AssertContains__Group_1_0__0 ) ) | ( ( rule__AssertContains__TextAssignment_1_1 ) ) );
    public final void rule__AssertContains__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:987:1: ( ( ( rule__AssertContains__Group_1_0__0 ) ) | ( ( rule__AssertContains__TextAssignment_1_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=13)||LA14_0==15||(LA14_0>=27 && LA14_0<=29)) ) {
                alt14=1;
            }
            else if ( (LA14_0==60) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalWebDsl.g:988:2: ( ( rule__AssertContains__Group_1_0__0 ) )
                    {
                    // InternalWebDsl.g:988:2: ( ( rule__AssertContains__Group_1_0__0 ) )
                    // InternalWebDsl.g:989:3: ( rule__AssertContains__Group_1_0__0 )
                    {
                     before(grammarAccess.getAssertContainsAccess().getGroup_1_0()); 
                    // InternalWebDsl.g:990:3: ( rule__AssertContains__Group_1_0__0 )
                    // InternalWebDsl.g:990:4: rule__AssertContains__Group_1_0__0
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
                    // InternalWebDsl.g:994:2: ( ( rule__AssertContains__TextAssignment_1_1 ) )
                    {
                    // InternalWebDsl.g:994:2: ( ( rule__AssertContains__TextAssignment_1_1 ) )
                    // InternalWebDsl.g:995:3: ( rule__AssertContains__TextAssignment_1_1 )
                    {
                     before(grammarAccess.getAssertContainsAccess().getTextAssignment_1_1()); 
                    // InternalWebDsl.g:996:3: ( rule__AssertContains__TextAssignment_1_1 )
                    // InternalWebDsl.g:996:4: rule__AssertContains__TextAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssertContains__TextAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssertContainsAccess().getTextAssignment_1_1()); 

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
    // InternalWebDsl.g:1004:1: rule__Comparable__Alternatives : ( ( ( rule__Comparable__Group_0__0 ) ) | ( ( rule__Comparable__Group_1__0 ) ) | ( RULE_STRING ) );
    public final void rule__Comparable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1008:1: ( ( ( rule__Comparable__Group_0__0 ) ) | ( ( rule__Comparable__Group_1__0 ) ) | ( RULE_STRING ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt15=1;
                }
                break;
            case 43:
                {
                alt15=2;
                }
                break;
            case RULE_STRING:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalWebDsl.g:1009:2: ( ( rule__Comparable__Group_0__0 ) )
                    {
                    // InternalWebDsl.g:1009:2: ( ( rule__Comparable__Group_0__0 ) )
                    // InternalWebDsl.g:1010:3: ( rule__Comparable__Group_0__0 )
                    {
                     before(grammarAccess.getComparableAccess().getGroup_0()); 
                    // InternalWebDsl.g:1011:3: ( rule__Comparable__Group_0__0 )
                    // InternalWebDsl.g:1011:4: rule__Comparable__Group_0__0
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
                    // InternalWebDsl.g:1015:2: ( ( rule__Comparable__Group_1__0 ) )
                    {
                    // InternalWebDsl.g:1015:2: ( ( rule__Comparable__Group_1__0 ) )
                    // InternalWebDsl.g:1016:3: ( rule__Comparable__Group_1__0 )
                    {
                     before(grammarAccess.getComparableAccess().getGroup_1()); 
                    // InternalWebDsl.g:1017:3: ( rule__Comparable__Group_1__0 )
                    // InternalWebDsl.g:1017:4: rule__Comparable__Group_1__0
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
                    // InternalWebDsl.g:1021:2: ( RULE_STRING )
                    {
                    // InternalWebDsl.g:1021:2: ( RULE_STRING )
                    // InternalWebDsl.g:1022:3: RULE_STRING
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
    // InternalWebDsl.g:1031:1: rule__Browser__Alternatives : ( ( ( 'chrome' ) ) | ( ( 'firefox' ) ) | ( ( 'safari' ) ) | ( ( 'edge' ) ) | ( ( 'ie' ) ) );
    public final void rule__Browser__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1035:1: ( ( ( 'chrome' ) ) | ( ( 'firefox' ) ) | ( ( 'safari' ) ) | ( ( 'edge' ) ) | ( ( 'ie' ) ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt16=1;
                }
                break;
            case 23:
                {
                alt16=2;
                }
                break;
            case 24:
                {
                alt16=3;
                }
                break;
            case 25:
                {
                alt16=4;
                }
                break;
            case 26:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalWebDsl.g:1036:2: ( ( 'chrome' ) )
                    {
                    // InternalWebDsl.g:1036:2: ( ( 'chrome' ) )
                    // InternalWebDsl.g:1037:3: ( 'chrome' )
                    {
                     before(grammarAccess.getBrowserAccess().getCHROMEEnumLiteralDeclaration_0()); 
                    // InternalWebDsl.g:1038:3: ( 'chrome' )
                    // InternalWebDsl.g:1038:4: 'chrome'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getCHROMEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1042:2: ( ( 'firefox' ) )
                    {
                    // InternalWebDsl.g:1042:2: ( ( 'firefox' ) )
                    // InternalWebDsl.g:1043:3: ( 'firefox' )
                    {
                     before(grammarAccess.getBrowserAccess().getFIREFOXEnumLiteralDeclaration_1()); 
                    // InternalWebDsl.g:1044:3: ( 'firefox' )
                    // InternalWebDsl.g:1044:4: 'firefox'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getFIREFOXEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1048:2: ( ( 'safari' ) )
                    {
                    // InternalWebDsl.g:1048:2: ( ( 'safari' ) )
                    // InternalWebDsl.g:1049:3: ( 'safari' )
                    {
                     before(grammarAccess.getBrowserAccess().getSAFARIEnumLiteralDeclaration_2()); 
                    // InternalWebDsl.g:1050:3: ( 'safari' )
                    // InternalWebDsl.g:1050:4: 'safari'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getSAFARIEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1054:2: ( ( 'edge' ) )
                    {
                    // InternalWebDsl.g:1054:2: ( ( 'edge' ) )
                    // InternalWebDsl.g:1055:3: ( 'edge' )
                    {
                     before(grammarAccess.getBrowserAccess().getEDGEEnumLiteralDeclaration_3()); 
                    // InternalWebDsl.g:1056:3: ( 'edge' )
                    // InternalWebDsl.g:1056:4: 'edge'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getEDGEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1060:2: ( ( 'ie' ) )
                    {
                    // InternalWebDsl.g:1060:2: ( ( 'ie' ) )
                    // InternalWebDsl.g:1061:3: ( 'ie' )
                    {
                     before(grammarAccess.getBrowserAccess().getIEEnumLiteralDeclaration_4()); 
                    // InternalWebDsl.g:1062:3: ( 'ie' )
                    // InternalWebDsl.g:1062:4: 'ie'
                    {
                    match(input,26,FOLLOW_2); 

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
    // InternalWebDsl.g:1070:1: rule__HtmlElement__Alternatives : ( ( ( 'LINK' ) ) | ( ( 'BUTTON' ) ) | ( ( 'CHECKBOX' ) ) | ( ( 'COMBO_BOX' ) ) | ( ( 'DIV' ) ) | ( ( 'IMAGE' ) ) | ( ( 'A' ) ) );
    public final void rule__HtmlElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1074:1: ( ( ( 'LINK' ) ) | ( ( 'BUTTON' ) ) | ( ( 'CHECKBOX' ) ) | ( ( 'COMBO_BOX' ) ) | ( ( 'DIV' ) ) | ( ( 'IMAGE' ) ) | ( ( 'A' ) ) )
            int alt17=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt17=1;
                }
                break;
            case 12:
                {
                alt17=2;
                }
                break;
            case 27:
                {
                alt17=3;
                }
                break;
            case 28:
                {
                alt17=4;
                }
                break;
            case 15:
                {
                alt17=5;
                }
                break;
            case 13:
                {
                alt17=6;
                }
                break;
            case 29:
                {
                alt17=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalWebDsl.g:1075:2: ( ( 'LINK' ) )
                    {
                    // InternalWebDsl.g:1075:2: ( ( 'LINK' ) )
                    // InternalWebDsl.g:1076:3: ( 'LINK' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getLINKEnumLiteralDeclaration_0()); 
                    // InternalWebDsl.g:1077:3: ( 'LINK' )
                    // InternalWebDsl.g:1077:4: 'LINK'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getLINKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1081:2: ( ( 'BUTTON' ) )
                    {
                    // InternalWebDsl.g:1081:2: ( ( 'BUTTON' ) )
                    // InternalWebDsl.g:1082:3: ( 'BUTTON' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getBUTTONEnumLiteralDeclaration_1()); 
                    // InternalWebDsl.g:1083:3: ( 'BUTTON' )
                    // InternalWebDsl.g:1083:4: 'BUTTON'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getBUTTONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1087:2: ( ( 'CHECKBOX' ) )
                    {
                    // InternalWebDsl.g:1087:2: ( ( 'CHECKBOX' ) )
                    // InternalWebDsl.g:1088:3: ( 'CHECKBOX' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getCHECKBOXEnumLiteralDeclaration_2()); 
                    // InternalWebDsl.g:1089:3: ( 'CHECKBOX' )
                    // InternalWebDsl.g:1089:4: 'CHECKBOX'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getCHECKBOXEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1093:2: ( ( 'COMBO_BOX' ) )
                    {
                    // InternalWebDsl.g:1093:2: ( ( 'COMBO_BOX' ) )
                    // InternalWebDsl.g:1094:3: ( 'COMBO_BOX' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getCOMBOBOXEnumLiteralDeclaration_3()); 
                    // InternalWebDsl.g:1095:3: ( 'COMBO_BOX' )
                    // InternalWebDsl.g:1095:4: 'COMBO_BOX'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getCOMBOBOXEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1099:2: ( ( 'DIV' ) )
                    {
                    // InternalWebDsl.g:1099:2: ( ( 'DIV' ) )
                    // InternalWebDsl.g:1100:3: ( 'DIV' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getDIVEnumLiteralDeclaration_4()); 
                    // InternalWebDsl.g:1101:3: ( 'DIV' )
                    // InternalWebDsl.g:1101:4: 'DIV'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getDIVEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWebDsl.g:1105:2: ( ( 'IMAGE' ) )
                    {
                    // InternalWebDsl.g:1105:2: ( ( 'IMAGE' ) )
                    // InternalWebDsl.g:1106:3: ( 'IMAGE' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getIMAGEEnumLiteralDeclaration_5()); 
                    // InternalWebDsl.g:1107:3: ( 'IMAGE' )
                    // InternalWebDsl.g:1107:4: 'IMAGE'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getIMAGEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalWebDsl.g:1111:2: ( ( 'A' ) )
                    {
                    // InternalWebDsl.g:1111:2: ( ( 'A' ) )
                    // InternalWebDsl.g:1112:3: ( 'A' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getAEnumLiteralDeclaration_6()); 
                    // InternalWebDsl.g:1113:3: ( 'A' )
                    // InternalWebDsl.g:1113:4: 'A'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalWebDsl.g:1121:1: rule__Attribute__Alternatives : ( ( ( 'LABEL' ) ) | ( ( 'ID' ) ) | ( ( 'CLASS' ) ) | ( ( 'ALT' ) ) | ( ( 'VALUE' ) ) | ( ( 'HREF' ) ) | ( ( 'TITLE' ) ) | ( ( 'NAME' ) ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1125:1: ( ( ( 'LABEL' ) ) | ( ( 'ID' ) ) | ( ( 'CLASS' ) ) | ( ( 'ALT' ) ) | ( ( 'VALUE' ) ) | ( ( 'HREF' ) ) | ( ( 'TITLE' ) ) | ( ( 'NAME' ) ) )
            int alt18=8;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt18=1;
                }
                break;
            case 31:
                {
                alt18=2;
                }
                break;
            case 32:
                {
                alt18=3;
                }
                break;
            case 33:
                {
                alt18=4;
                }
                break;
            case 34:
                {
                alt18=5;
                }
                break;
            case 35:
                {
                alt18=6;
                }
                break;
            case 36:
                {
                alt18=7;
                }
                break;
            case 37:
                {
                alt18=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalWebDsl.g:1126:2: ( ( 'LABEL' ) )
                    {
                    // InternalWebDsl.g:1126:2: ( ( 'LABEL' ) )
                    // InternalWebDsl.g:1127:3: ( 'LABEL' )
                    {
                     before(grammarAccess.getAttributeAccess().getLABELEnumLiteralDeclaration_0()); 
                    // InternalWebDsl.g:1128:3: ( 'LABEL' )
                    // InternalWebDsl.g:1128:4: 'LABEL'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getLABELEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1132:2: ( ( 'ID' ) )
                    {
                    // InternalWebDsl.g:1132:2: ( ( 'ID' ) )
                    // InternalWebDsl.g:1133:3: ( 'ID' )
                    {
                     before(grammarAccess.getAttributeAccess().getIDEnumLiteralDeclaration_1()); 
                    // InternalWebDsl.g:1134:3: ( 'ID' )
                    // InternalWebDsl.g:1134:4: 'ID'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getIDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1138:2: ( ( 'CLASS' ) )
                    {
                    // InternalWebDsl.g:1138:2: ( ( 'CLASS' ) )
                    // InternalWebDsl.g:1139:3: ( 'CLASS' )
                    {
                     before(grammarAccess.getAttributeAccess().getCLASSEnumLiteralDeclaration_2()); 
                    // InternalWebDsl.g:1140:3: ( 'CLASS' )
                    // InternalWebDsl.g:1140:4: 'CLASS'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getCLASSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1144:2: ( ( 'ALT' ) )
                    {
                    // InternalWebDsl.g:1144:2: ( ( 'ALT' ) )
                    // InternalWebDsl.g:1145:3: ( 'ALT' )
                    {
                     before(grammarAccess.getAttributeAccess().getALTEnumLiteralDeclaration_3()); 
                    // InternalWebDsl.g:1146:3: ( 'ALT' )
                    // InternalWebDsl.g:1146:4: 'ALT'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getALTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1150:2: ( ( 'VALUE' ) )
                    {
                    // InternalWebDsl.g:1150:2: ( ( 'VALUE' ) )
                    // InternalWebDsl.g:1151:3: ( 'VALUE' )
                    {
                     before(grammarAccess.getAttributeAccess().getVALUEEnumLiteralDeclaration_4()); 
                    // InternalWebDsl.g:1152:3: ( 'VALUE' )
                    // InternalWebDsl.g:1152:4: 'VALUE'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getVALUEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWebDsl.g:1156:2: ( ( 'HREF' ) )
                    {
                    // InternalWebDsl.g:1156:2: ( ( 'HREF' ) )
                    // InternalWebDsl.g:1157:3: ( 'HREF' )
                    {
                     before(grammarAccess.getAttributeAccess().getHREFEnumLiteralDeclaration_5()); 
                    // InternalWebDsl.g:1158:3: ( 'HREF' )
                    // InternalWebDsl.g:1158:4: 'HREF'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getHREFEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalWebDsl.g:1162:2: ( ( 'TITLE' ) )
                    {
                    // InternalWebDsl.g:1162:2: ( ( 'TITLE' ) )
                    // InternalWebDsl.g:1163:3: ( 'TITLE' )
                    {
                     before(grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_6()); 
                    // InternalWebDsl.g:1164:3: ( 'TITLE' )
                    // InternalWebDsl.g:1164:4: 'TITLE'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalWebDsl.g:1168:2: ( ( 'NAME' ) )
                    {
                    // InternalWebDsl.g:1168:2: ( ( 'NAME' ) )
                    // InternalWebDsl.g:1169:3: ( 'NAME' )
                    {
                     before(grammarAccess.getAttributeAccess().getNAMEEnumLiteralDeclaration_7()); 
                    // InternalWebDsl.g:1170:3: ( 'NAME' )
                    // InternalWebDsl.g:1170:4: 'NAME'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getNAMEEnumLiteralDeclaration_7()); 

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


    // $ANTLR start "rule__Program__Group__0"
    // InternalWebDsl.g:1178:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1182:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalWebDsl.g:1183:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

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
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalWebDsl.g:1190:1: rule__Program__Group__0__Impl : ( ( rule__Program__ProceduresAssignment_0 )* ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1194:1: ( ( ( rule__Program__ProceduresAssignment_0 )* ) )
            // InternalWebDsl.g:1195:1: ( ( rule__Program__ProceduresAssignment_0 )* )
            {
            // InternalWebDsl.g:1195:1: ( ( rule__Program__ProceduresAssignment_0 )* )
            // InternalWebDsl.g:1196:2: ( rule__Program__ProceduresAssignment_0 )*
            {
             before(grammarAccess.getProgramAccess().getProceduresAssignment_0()); 
            // InternalWebDsl.g:1197:2: ( rule__Program__ProceduresAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==42) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalWebDsl.g:1197:3: rule__Program__ProceduresAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__ProceduresAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getProceduresAssignment_0()); 

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
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalWebDsl.g:1205:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1209:1: ( rule__Program__Group__1__Impl )
            // InternalWebDsl.g:1210:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__1__Impl();

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
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalWebDsl.g:1216:1: rule__Program__Group__1__Impl : ( ( rule__Program__CoresAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1220:1: ( ( ( rule__Program__CoresAssignment_1 )* ) )
            // InternalWebDsl.g:1221:1: ( ( rule__Program__CoresAssignment_1 )* )
            {
            // InternalWebDsl.g:1221:1: ( ( rule__Program__CoresAssignment_1 )* )
            // InternalWebDsl.g:1222:2: ( rule__Program__CoresAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getCoresAssignment_1()); 
            // InternalWebDsl.g:1223:2: ( rule__Program__CoresAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalWebDsl.g:1223:3: rule__Program__CoresAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__CoresAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getCoresAssignment_1()); 

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
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Core__Group__0"
    // InternalWebDsl.g:1232:1: rule__Core__Group__0 : rule__Core__Group__0__Impl rule__Core__Group__1 ;
    public final void rule__Core__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1236:1: ( rule__Core__Group__0__Impl rule__Core__Group__1 )
            // InternalWebDsl.g:1237:2: rule__Core__Group__0__Impl rule__Core__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalWebDsl.g:1244:1: rule__Core__Group__0__Impl : ( 'test' ) ;
    public final void rule__Core__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1248:1: ( ( 'test' ) )
            // InternalWebDsl.g:1249:1: ( 'test' )
            {
            // InternalWebDsl.g:1249:1: ( 'test' )
            // InternalWebDsl.g:1250:2: 'test'
            {
             before(grammarAccess.getCoreAccess().getTestKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCoreAccess().getTestKeyword_0()); 

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
    // InternalWebDsl.g:1259:1: rule__Core__Group__1 : rule__Core__Group__1__Impl rule__Core__Group__2 ;
    public final void rule__Core__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1263:1: ( rule__Core__Group__1__Impl rule__Core__Group__2 )
            // InternalWebDsl.g:1264:2: rule__Core__Group__1__Impl rule__Core__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalWebDsl.g:1271:1: rule__Core__Group__1__Impl : ( ( rule__Core__NameAssignment_1 ) ) ;
    public final void rule__Core__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1275:1: ( ( ( rule__Core__NameAssignment_1 ) ) )
            // InternalWebDsl.g:1276:1: ( ( rule__Core__NameAssignment_1 ) )
            {
            // InternalWebDsl.g:1276:1: ( ( rule__Core__NameAssignment_1 ) )
            // InternalWebDsl.g:1277:2: ( rule__Core__NameAssignment_1 )
            {
             before(grammarAccess.getCoreAccess().getNameAssignment_1()); 
            // InternalWebDsl.g:1278:2: ( rule__Core__NameAssignment_1 )
            // InternalWebDsl.g:1278:3: rule__Core__NameAssignment_1
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
    // InternalWebDsl.g:1286:1: rule__Core__Group__2 : rule__Core__Group__2__Impl rule__Core__Group__3 ;
    public final void rule__Core__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1290:1: ( rule__Core__Group__2__Impl rule__Core__Group__3 )
            // InternalWebDsl.g:1291:2: rule__Core__Group__2__Impl rule__Core__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Core__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Core__Group__3();

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
    // InternalWebDsl.g:1298:1: rule__Core__Group__2__Impl : ( '{' ) ;
    public final void rule__Core__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1302:1: ( ( '{' ) )
            // InternalWebDsl.g:1303:1: ( '{' )
            {
            // InternalWebDsl.g:1303:1: ( '{' )
            // InternalWebDsl.g:1304:2: '{'
            {
             before(grammarAccess.getCoreAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCoreAccess().getLeftCurlyBracketKeyword_2()); 

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


    // $ANTLR start "rule__Core__Group__3"
    // InternalWebDsl.g:1313:1: rule__Core__Group__3 : rule__Core__Group__3__Impl rule__Core__Group__4 ;
    public final void rule__Core__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1317:1: ( rule__Core__Group__3__Impl rule__Core__Group__4 )
            // InternalWebDsl.g:1318:2: rule__Core__Group__3__Impl rule__Core__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Core__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Core__Group__4();

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
    // $ANTLR end "rule__Core__Group__3"


    // $ANTLR start "rule__Core__Group__3__Impl"
    // InternalWebDsl.g:1325:1: rule__Core__Group__3__Impl : ( 'open_browser' ) ;
    public final void rule__Core__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1329:1: ( ( 'open_browser' ) )
            // InternalWebDsl.g:1330:1: ( 'open_browser' )
            {
            // InternalWebDsl.g:1330:1: ( 'open_browser' )
            // InternalWebDsl.g:1331:2: 'open_browser'
            {
             before(grammarAccess.getCoreAccess().getOpen_browserKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCoreAccess().getOpen_browserKeyword_3()); 

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
    // $ANTLR end "rule__Core__Group__3__Impl"


    // $ANTLR start "rule__Core__Group__4"
    // InternalWebDsl.g:1340:1: rule__Core__Group__4 : rule__Core__Group__4__Impl rule__Core__Group__5 ;
    public final void rule__Core__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1344:1: ( rule__Core__Group__4__Impl rule__Core__Group__5 )
            // InternalWebDsl.g:1345:2: rule__Core__Group__4__Impl rule__Core__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Core__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Core__Group__5();

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
    // $ANTLR end "rule__Core__Group__4"


    // $ANTLR start "rule__Core__Group__4__Impl"
    // InternalWebDsl.g:1352:1: rule__Core__Group__4__Impl : ( ( rule__Core__BrowserAssignment_4 ) ) ;
    public final void rule__Core__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1356:1: ( ( ( rule__Core__BrowserAssignment_4 ) ) )
            // InternalWebDsl.g:1357:1: ( ( rule__Core__BrowserAssignment_4 ) )
            {
            // InternalWebDsl.g:1357:1: ( ( rule__Core__BrowserAssignment_4 ) )
            // InternalWebDsl.g:1358:2: ( rule__Core__BrowserAssignment_4 )
            {
             before(grammarAccess.getCoreAccess().getBrowserAssignment_4()); 
            // InternalWebDsl.g:1359:2: ( rule__Core__BrowserAssignment_4 )
            // InternalWebDsl.g:1359:3: rule__Core__BrowserAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Core__BrowserAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCoreAccess().getBrowserAssignment_4()); 

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
    // $ANTLR end "rule__Core__Group__4__Impl"


    // $ANTLR start "rule__Core__Group__5"
    // InternalWebDsl.g:1367:1: rule__Core__Group__5 : rule__Core__Group__5__Impl rule__Core__Group__6 ;
    public final void rule__Core__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1371:1: ( rule__Core__Group__5__Impl rule__Core__Group__6 )
            // InternalWebDsl.g:1372:2: rule__Core__Group__5__Impl rule__Core__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Core__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Core__Group__6();

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
    // $ANTLR end "rule__Core__Group__5"


    // $ANTLR start "rule__Core__Group__5__Impl"
    // InternalWebDsl.g:1379:1: rule__Core__Group__5__Impl : ( ( rule__Core__ActionsAssignment_5 )* ) ;
    public final void rule__Core__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1383:1: ( ( ( rule__Core__ActionsAssignment_5 )* ) )
            // InternalWebDsl.g:1384:1: ( ( rule__Core__ActionsAssignment_5 )* )
            {
            // InternalWebDsl.g:1384:1: ( ( rule__Core__ActionsAssignment_5 )* )
            // InternalWebDsl.g:1385:2: ( rule__Core__ActionsAssignment_5 )*
            {
             before(grammarAccess.getCoreAccess().getActionsAssignment_5()); 
            // InternalWebDsl.g:1386:2: ( rule__Core__ActionsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=11 && LA21_0<=15)||(LA21_0>=27 && LA21_0<=28)||LA21_0==45||LA21_0==47||LA21_0==59) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalWebDsl.g:1386:3: rule__Core__ActionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Core__ActionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getCoreAccess().getActionsAssignment_5()); 

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
    // $ANTLR end "rule__Core__Group__5__Impl"


    // $ANTLR start "rule__Core__Group__6"
    // InternalWebDsl.g:1394:1: rule__Core__Group__6 : rule__Core__Group__6__Impl ;
    public final void rule__Core__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1398:1: ( rule__Core__Group__6__Impl )
            // InternalWebDsl.g:1399:2: rule__Core__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Core__Group__6__Impl();

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
    // $ANTLR end "rule__Core__Group__6"


    // $ANTLR start "rule__Core__Group__6__Impl"
    // InternalWebDsl.g:1405:1: rule__Core__Group__6__Impl : ( '}' ) ;
    public final void rule__Core__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1409:1: ( ( '}' ) )
            // InternalWebDsl.g:1410:1: ( '}' )
            {
            // InternalWebDsl.g:1410:1: ( '}' )
            // InternalWebDsl.g:1411:2: '}'
            {
             before(grammarAccess.getCoreAccess().getRightCurlyBracketKeyword_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCoreAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Core__Group__6__Impl"


    // $ANTLR start "rule__Procedure__Group__0"
    // InternalWebDsl.g:1421:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1425:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // InternalWebDsl.g:1426:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Procedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__1();

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
    // $ANTLR end "rule__Procedure__Group__0"


    // $ANTLR start "rule__Procedure__Group__0__Impl"
    // InternalWebDsl.g:1433:1: rule__Procedure__Group__0__Impl : ( 'PROCEDURE' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1437:1: ( ( 'PROCEDURE' ) )
            // InternalWebDsl.g:1438:1: ( 'PROCEDURE' )
            {
            // InternalWebDsl.g:1438:1: ( 'PROCEDURE' )
            // InternalWebDsl.g:1439:2: 'PROCEDURE'
            {
             before(grammarAccess.getProcedureAccess().getPROCEDUREKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getPROCEDUREKeyword_0()); 

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
    // $ANTLR end "rule__Procedure__Group__0__Impl"


    // $ANTLR start "rule__Procedure__Group__1"
    // InternalWebDsl.g:1448:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1452:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // InternalWebDsl.g:1453:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Procedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__2();

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
    // $ANTLR end "rule__Procedure__Group__1"


    // $ANTLR start "rule__Procedure__Group__1__Impl"
    // InternalWebDsl.g:1460:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1464:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // InternalWebDsl.g:1465:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // InternalWebDsl.g:1465:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // InternalWebDsl.g:1466:2: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // InternalWebDsl.g:1467:2: ( rule__Procedure__NameAssignment_1 )
            // InternalWebDsl.g:1467:3: rule__Procedure__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Procedure__Group__1__Impl"


    // $ANTLR start "rule__Procedure__Group__2"
    // InternalWebDsl.g:1475:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl rule__Procedure__Group__3 ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1479:1: ( rule__Procedure__Group__2__Impl rule__Procedure__Group__3 )
            // InternalWebDsl.g:1480:2: rule__Procedure__Group__2__Impl rule__Procedure__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Procedure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__3();

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
    // $ANTLR end "rule__Procedure__Group__2"


    // $ANTLR start "rule__Procedure__Group__2__Impl"
    // InternalWebDsl.g:1487:1: rule__Procedure__Group__2__Impl : ( '(' ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1491:1: ( ( '(' ) )
            // InternalWebDsl.g:1492:1: ( '(' )
            {
            // InternalWebDsl.g:1492:1: ( '(' )
            // InternalWebDsl.g:1493:2: '('
            {
             before(grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Procedure__Group__2__Impl"


    // $ANTLR start "rule__Procedure__Group__3"
    // InternalWebDsl.g:1502:1: rule__Procedure__Group__3 : rule__Procedure__Group__3__Impl rule__Procedure__Group__4 ;
    public final void rule__Procedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1506:1: ( rule__Procedure__Group__3__Impl rule__Procedure__Group__4 )
            // InternalWebDsl.g:1507:2: rule__Procedure__Group__3__Impl rule__Procedure__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Procedure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__4();

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
    // $ANTLR end "rule__Procedure__Group__3"


    // $ANTLR start "rule__Procedure__Group__3__Impl"
    // InternalWebDsl.g:1514:1: rule__Procedure__Group__3__Impl : ( ( rule__Procedure__VarAssignment_3 ) ) ;
    public final void rule__Procedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1518:1: ( ( ( rule__Procedure__VarAssignment_3 ) ) )
            // InternalWebDsl.g:1519:1: ( ( rule__Procedure__VarAssignment_3 ) )
            {
            // InternalWebDsl.g:1519:1: ( ( rule__Procedure__VarAssignment_3 ) )
            // InternalWebDsl.g:1520:2: ( rule__Procedure__VarAssignment_3 )
            {
             before(grammarAccess.getProcedureAccess().getVarAssignment_3()); 
            // InternalWebDsl.g:1521:2: ( rule__Procedure__VarAssignment_3 )
            // InternalWebDsl.g:1521:3: rule__Procedure__VarAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__VarAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getVarAssignment_3()); 

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
    // $ANTLR end "rule__Procedure__Group__3__Impl"


    // $ANTLR start "rule__Procedure__Group__4"
    // InternalWebDsl.g:1529:1: rule__Procedure__Group__4 : rule__Procedure__Group__4__Impl rule__Procedure__Group__5 ;
    public final void rule__Procedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1533:1: ( rule__Procedure__Group__4__Impl rule__Procedure__Group__5 )
            // InternalWebDsl.g:1534:2: rule__Procedure__Group__4__Impl rule__Procedure__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Procedure__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__5();

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
    // $ANTLR end "rule__Procedure__Group__4"


    // $ANTLR start "rule__Procedure__Group__4__Impl"
    // InternalWebDsl.g:1541:1: rule__Procedure__Group__4__Impl : ( '){' ) ;
    public final void rule__Procedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1545:1: ( ( '){' ) )
            // InternalWebDsl.g:1546:1: ( '){' )
            {
            // InternalWebDsl.g:1546:1: ( '){' )
            // InternalWebDsl.g:1547:2: '){'
            {
             before(grammarAccess.getProcedureAccess().getRightParenthesisLeftCurlyBracketKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getRightParenthesisLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Procedure__Group__4__Impl"


    // $ANTLR start "rule__Procedure__Group__5"
    // InternalWebDsl.g:1556:1: rule__Procedure__Group__5 : rule__Procedure__Group__5__Impl rule__Procedure__Group__6 ;
    public final void rule__Procedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1560:1: ( rule__Procedure__Group__5__Impl rule__Procedure__Group__6 )
            // InternalWebDsl.g:1561:2: rule__Procedure__Group__5__Impl rule__Procedure__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Procedure__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__6();

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
    // $ANTLR end "rule__Procedure__Group__5"


    // $ANTLR start "rule__Procedure__Group__5__Impl"
    // InternalWebDsl.g:1568:1: rule__Procedure__Group__5__Impl : ( ( rule__Procedure__ActionsAssignment_5 )* ) ;
    public final void rule__Procedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1572:1: ( ( ( rule__Procedure__ActionsAssignment_5 )* ) )
            // InternalWebDsl.g:1573:1: ( ( rule__Procedure__ActionsAssignment_5 )* )
            {
            // InternalWebDsl.g:1573:1: ( ( rule__Procedure__ActionsAssignment_5 )* )
            // InternalWebDsl.g:1574:2: ( rule__Procedure__ActionsAssignment_5 )*
            {
             before(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 
            // InternalWebDsl.g:1575:2: ( rule__Procedure__ActionsAssignment_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=11 && LA22_0<=15)||(LA22_0>=27 && LA22_0<=28)||LA22_0==45||LA22_0==47||LA22_0==59) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalWebDsl.g:1575:3: rule__Procedure__ActionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Procedure__ActionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 

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
    // $ANTLR end "rule__Procedure__Group__5__Impl"


    // $ANTLR start "rule__Procedure__Group__6"
    // InternalWebDsl.g:1583:1: rule__Procedure__Group__6 : rule__Procedure__Group__6__Impl ;
    public final void rule__Procedure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1587:1: ( rule__Procedure__Group__6__Impl )
            // InternalWebDsl.g:1588:2: rule__Procedure__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group__6__Impl();

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
    // $ANTLR end "rule__Procedure__Group__6"


    // $ANTLR start "rule__Procedure__Group__6__Impl"
    // InternalWebDsl.g:1594:1: rule__Procedure__Group__6__Impl : ( '}' ) ;
    public final void rule__Procedure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1598:1: ( ( '}' ) )
            // InternalWebDsl.g:1599:1: ( '}' )
            {
            // InternalWebDsl.g:1599:1: ( '}' )
            // InternalWebDsl.g:1600:2: '}'
            {
             before(grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Procedure__Group__6__Impl"


    // $ANTLR start "rule__CallProcedure__Group__0"
    // InternalWebDsl.g:1610:1: rule__CallProcedure__Group__0 : rule__CallProcedure__Group__0__Impl rule__CallProcedure__Group__1 ;
    public final void rule__CallProcedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1614:1: ( rule__CallProcedure__Group__0__Impl rule__CallProcedure__Group__1 )
            // InternalWebDsl.g:1615:2: rule__CallProcedure__Group__0__Impl rule__CallProcedure__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CallProcedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group__1();

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
    // $ANTLR end "rule__CallProcedure__Group__0"


    // $ANTLR start "rule__CallProcedure__Group__0__Impl"
    // InternalWebDsl.g:1622:1: rule__CallProcedure__Group__0__Impl : ( 'PROC:' ) ;
    public final void rule__CallProcedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1626:1: ( ( 'PROC:' ) )
            // InternalWebDsl.g:1627:1: ( 'PROC:' )
            {
            // InternalWebDsl.g:1627:1: ( 'PROC:' )
            // InternalWebDsl.g:1628:2: 'PROC:'
            {
             before(grammarAccess.getCallProcedureAccess().getPROCKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCallProcedureAccess().getPROCKeyword_0()); 

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
    // $ANTLR end "rule__CallProcedure__Group__0__Impl"


    // $ANTLR start "rule__CallProcedure__Group__1"
    // InternalWebDsl.g:1637:1: rule__CallProcedure__Group__1 : rule__CallProcedure__Group__1__Impl rule__CallProcedure__Group__2 ;
    public final void rule__CallProcedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1641:1: ( rule__CallProcedure__Group__1__Impl rule__CallProcedure__Group__2 )
            // InternalWebDsl.g:1642:2: rule__CallProcedure__Group__1__Impl rule__CallProcedure__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__CallProcedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group__2();

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
    // $ANTLR end "rule__CallProcedure__Group__1"


    // $ANTLR start "rule__CallProcedure__Group__1__Impl"
    // InternalWebDsl.g:1649:1: rule__CallProcedure__Group__1__Impl : ( ( rule__CallProcedure__RefAssignment_1 ) ) ;
    public final void rule__CallProcedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1653:1: ( ( ( rule__CallProcedure__RefAssignment_1 ) ) )
            // InternalWebDsl.g:1654:1: ( ( rule__CallProcedure__RefAssignment_1 ) )
            {
            // InternalWebDsl.g:1654:1: ( ( rule__CallProcedure__RefAssignment_1 ) )
            // InternalWebDsl.g:1655:2: ( rule__CallProcedure__RefAssignment_1 )
            {
             before(grammarAccess.getCallProcedureAccess().getRefAssignment_1()); 
            // InternalWebDsl.g:1656:2: ( rule__CallProcedure__RefAssignment_1 )
            // InternalWebDsl.g:1656:3: rule__CallProcedure__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CallProcedure__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCallProcedureAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__CallProcedure__Group__1__Impl"


    // $ANTLR start "rule__CallProcedure__Group__2"
    // InternalWebDsl.g:1664:1: rule__CallProcedure__Group__2 : rule__CallProcedure__Group__2__Impl rule__CallProcedure__Group__3 ;
    public final void rule__CallProcedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1668:1: ( rule__CallProcedure__Group__2__Impl rule__CallProcedure__Group__3 )
            // InternalWebDsl.g:1669:2: rule__CallProcedure__Group__2__Impl rule__CallProcedure__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__CallProcedure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group__3();

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
    // $ANTLR end "rule__CallProcedure__Group__2"


    // $ANTLR start "rule__CallProcedure__Group__2__Impl"
    // InternalWebDsl.g:1676:1: rule__CallProcedure__Group__2__Impl : ( '(' ) ;
    public final void rule__CallProcedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1680:1: ( ( '(' ) )
            // InternalWebDsl.g:1681:1: ( '(' )
            {
            // InternalWebDsl.g:1681:1: ( '(' )
            // InternalWebDsl.g:1682:2: '('
            {
             before(grammarAccess.getCallProcedureAccess().getLeftParenthesisKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCallProcedureAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__CallProcedure__Group__2__Impl"


    // $ANTLR start "rule__CallProcedure__Group__3"
    // InternalWebDsl.g:1691:1: rule__CallProcedure__Group__3 : rule__CallProcedure__Group__3__Impl rule__CallProcedure__Group__4 ;
    public final void rule__CallProcedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1695:1: ( rule__CallProcedure__Group__3__Impl rule__CallProcedure__Group__4 )
            // InternalWebDsl.g:1696:2: rule__CallProcedure__Group__3__Impl rule__CallProcedure__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__CallProcedure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group__4();

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
    // $ANTLR end "rule__CallProcedure__Group__3"


    // $ANTLR start "rule__CallProcedure__Group__3__Impl"
    // InternalWebDsl.g:1703:1: rule__CallProcedure__Group__3__Impl : ( ( rule__CallProcedure__ArgAssignment_3 ) ) ;
    public final void rule__CallProcedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1707:1: ( ( ( rule__CallProcedure__ArgAssignment_3 ) ) )
            // InternalWebDsl.g:1708:1: ( ( rule__CallProcedure__ArgAssignment_3 ) )
            {
            // InternalWebDsl.g:1708:1: ( ( rule__CallProcedure__ArgAssignment_3 ) )
            // InternalWebDsl.g:1709:2: ( rule__CallProcedure__ArgAssignment_3 )
            {
             before(grammarAccess.getCallProcedureAccess().getArgAssignment_3()); 
            // InternalWebDsl.g:1710:2: ( rule__CallProcedure__ArgAssignment_3 )
            // InternalWebDsl.g:1710:3: rule__CallProcedure__ArgAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CallProcedure__ArgAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCallProcedureAccess().getArgAssignment_3()); 

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
    // $ANTLR end "rule__CallProcedure__Group__3__Impl"


    // $ANTLR start "rule__CallProcedure__Group__4"
    // InternalWebDsl.g:1718:1: rule__CallProcedure__Group__4 : rule__CallProcedure__Group__4__Impl ;
    public final void rule__CallProcedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1722:1: ( rule__CallProcedure__Group__4__Impl )
            // InternalWebDsl.g:1723:2: rule__CallProcedure__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group__4__Impl();

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
    // $ANTLR end "rule__CallProcedure__Group__4"


    // $ANTLR start "rule__CallProcedure__Group__4__Impl"
    // InternalWebDsl.g:1729:1: rule__CallProcedure__Group__4__Impl : ( ')' ) ;
    public final void rule__CallProcedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1733:1: ( ( ')' ) )
            // InternalWebDsl.g:1734:1: ( ')' )
            {
            // InternalWebDsl.g:1734:1: ( ')' )
            // InternalWebDsl.g:1735:2: ')'
            {
             before(grammarAccess.getCallProcedureAccess().getRightParenthesisKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCallProcedureAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__CallProcedure__Group__4__Impl"


    // $ANTLR start "rule__GoAction__Group__0"
    // InternalWebDsl.g:1745:1: rule__GoAction__Group__0 : rule__GoAction__Group__0__Impl rule__GoAction__Group__1 ;
    public final void rule__GoAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1749:1: ( rule__GoAction__Group__0__Impl rule__GoAction__Group__1 )
            // InternalWebDsl.g:1750:2: rule__GoAction__Group__0__Impl rule__GoAction__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalWebDsl.g:1757:1: rule__GoAction__Group__0__Impl : ( 'go' ) ;
    public final void rule__GoAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1761:1: ( ( 'go' ) )
            // InternalWebDsl.g:1762:1: ( 'go' )
            {
            // InternalWebDsl.g:1762:1: ( 'go' )
            // InternalWebDsl.g:1763:2: 'go'
            {
             before(grammarAccess.getGoActionAccess().getGoKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalWebDsl.g:1772:1: rule__GoAction__Group__1 : rule__GoAction__Group__1__Impl ;
    public final void rule__GoAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1776:1: ( rule__GoAction__Group__1__Impl )
            // InternalWebDsl.g:1777:2: rule__GoAction__Group__1__Impl
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
    // InternalWebDsl.g:1783:1: rule__GoAction__Group__1__Impl : ( ( rule__GoAction__UrlAssignment_1 ) ) ;
    public final void rule__GoAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1787:1: ( ( ( rule__GoAction__UrlAssignment_1 ) ) )
            // InternalWebDsl.g:1788:1: ( ( rule__GoAction__UrlAssignment_1 ) )
            {
            // InternalWebDsl.g:1788:1: ( ( rule__GoAction__UrlAssignment_1 ) )
            // InternalWebDsl.g:1789:2: ( rule__GoAction__UrlAssignment_1 )
            {
             before(grammarAccess.getGoActionAccess().getUrlAssignment_1()); 
            // InternalWebDsl.g:1790:2: ( rule__GoAction__UrlAssignment_1 )
            // InternalWebDsl.g:1790:3: rule__GoAction__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GoAction__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoActionAccess().getUrlAssignment_1()); 

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
    // InternalWebDsl.g:1799:1: rule__LinkButtonSelection__Group__0 : rule__LinkButtonSelection__Group__0__Impl rule__LinkButtonSelection__Group__1 ;
    public final void rule__LinkButtonSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1803:1: ( rule__LinkButtonSelection__Group__0__Impl rule__LinkButtonSelection__Group__1 )
            // InternalWebDsl.g:1804:2: rule__LinkButtonSelection__Group__0__Impl rule__LinkButtonSelection__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalWebDsl.g:1811:1: rule__LinkButtonSelection__Group__0__Impl : ( ( rule__LinkButtonSelection__TypeElementAssignment_0 ) ) ;
    public final void rule__LinkButtonSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1815:1: ( ( ( rule__LinkButtonSelection__TypeElementAssignment_0 ) ) )
            // InternalWebDsl.g:1816:1: ( ( rule__LinkButtonSelection__TypeElementAssignment_0 ) )
            {
            // InternalWebDsl.g:1816:1: ( ( rule__LinkButtonSelection__TypeElementAssignment_0 ) )
            // InternalWebDsl.g:1817:2: ( rule__LinkButtonSelection__TypeElementAssignment_0 )
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getTypeElementAssignment_0()); 
            // InternalWebDsl.g:1818:2: ( rule__LinkButtonSelection__TypeElementAssignment_0 )
            // InternalWebDsl.g:1818:3: rule__LinkButtonSelection__TypeElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LinkButtonSelection__TypeElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLinkButtonSelectionAccess().getTypeElementAssignment_0()); 

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
    // InternalWebDsl.g:1826:1: rule__LinkButtonSelection__Group__1 : rule__LinkButtonSelection__Group__1__Impl rule__LinkButtonSelection__Group__2 ;
    public final void rule__LinkButtonSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1830:1: ( rule__LinkButtonSelection__Group__1__Impl rule__LinkButtonSelection__Group__2 )
            // InternalWebDsl.g:1831:2: rule__LinkButtonSelection__Group__1__Impl rule__LinkButtonSelection__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalWebDsl.g:1838:1: rule__LinkButtonSelection__Group__1__Impl : ( ( rule__LinkButtonSelection__TypeSelectionAssignment_1 ) ) ;
    public final void rule__LinkButtonSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1842:1: ( ( ( rule__LinkButtonSelection__TypeSelectionAssignment_1 ) ) )
            // InternalWebDsl.g:1843:1: ( ( rule__LinkButtonSelection__TypeSelectionAssignment_1 ) )
            {
            // InternalWebDsl.g:1843:1: ( ( rule__LinkButtonSelection__TypeSelectionAssignment_1 ) )
            // InternalWebDsl.g:1844:2: ( rule__LinkButtonSelection__TypeSelectionAssignment_1 )
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getTypeSelectionAssignment_1()); 
            // InternalWebDsl.g:1845:2: ( rule__LinkButtonSelection__TypeSelectionAssignment_1 )
            // InternalWebDsl.g:1845:3: rule__LinkButtonSelection__TypeSelectionAssignment_1
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
    // InternalWebDsl.g:1853:1: rule__LinkButtonSelection__Group__2 : rule__LinkButtonSelection__Group__2__Impl rule__LinkButtonSelection__Group__3 ;
    public final void rule__LinkButtonSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1857:1: ( rule__LinkButtonSelection__Group__2__Impl rule__LinkButtonSelection__Group__3 )
            // InternalWebDsl.g:1858:2: rule__LinkButtonSelection__Group__2__Impl rule__LinkButtonSelection__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalWebDsl.g:1865:1: rule__LinkButtonSelection__Group__2__Impl : ( '{' ) ;
    public final void rule__LinkButtonSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1869:1: ( ( '{' ) )
            // InternalWebDsl.g:1870:1: ( '{' )
            {
            // InternalWebDsl.g:1870:1: ( '{' )
            // InternalWebDsl.g:1871:2: '{'
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalWebDsl.g:1880:1: rule__LinkButtonSelection__Group__3 : rule__LinkButtonSelection__Group__3__Impl rule__LinkButtonSelection__Group__4 ;
    public final void rule__LinkButtonSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1884:1: ( rule__LinkButtonSelection__Group__3__Impl rule__LinkButtonSelection__Group__4 )
            // InternalWebDsl.g:1885:2: rule__LinkButtonSelection__Group__3__Impl rule__LinkButtonSelection__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalWebDsl.g:1892:1: rule__LinkButtonSelection__Group__3__Impl : ( ( rule__LinkButtonSelection__Alternatives_3 )* ) ;
    public final void rule__LinkButtonSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1896:1: ( ( ( rule__LinkButtonSelection__Alternatives_3 )* ) )
            // InternalWebDsl.g:1897:1: ( ( rule__LinkButtonSelection__Alternatives_3 )* )
            {
            // InternalWebDsl.g:1897:1: ( ( rule__LinkButtonSelection__Alternatives_3 )* )
            // InternalWebDsl.g:1898:2: ( rule__LinkButtonSelection__Alternatives_3 )*
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getAlternatives_3()); 
            // InternalWebDsl.g:1899:2: ( rule__LinkButtonSelection__Alternatives_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=11 && LA23_0<=15)||(LA23_0>=27 && LA23_0<=28)||LA23_0==49||LA23_0==52||(LA23_0>=58 && LA23_0<=59)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalWebDsl.g:1899:3: rule__LinkButtonSelection__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__LinkButtonSelection__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalWebDsl.g:1907:1: rule__LinkButtonSelection__Group__4 : rule__LinkButtonSelection__Group__4__Impl ;
    public final void rule__LinkButtonSelection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1911:1: ( rule__LinkButtonSelection__Group__4__Impl )
            // InternalWebDsl.g:1912:2: rule__LinkButtonSelection__Group__4__Impl
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
    // InternalWebDsl.g:1918:1: rule__LinkButtonSelection__Group__4__Impl : ( '}' ) ;
    public final void rule__LinkButtonSelection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1922:1: ( ( '}' ) )
            // InternalWebDsl.g:1923:1: ( '}' )
            {
            // InternalWebDsl.g:1923:1: ( '}' )
            // InternalWebDsl.g:1924:2: '}'
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalWebDsl.g:1934:1: rule__GeneralSelection__Group__0 : rule__GeneralSelection__Group__0__Impl rule__GeneralSelection__Group__1 ;
    public final void rule__GeneralSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1938:1: ( rule__GeneralSelection__Group__0__Impl rule__GeneralSelection__Group__1 )
            // InternalWebDsl.g:1939:2: rule__GeneralSelection__Group__0__Impl rule__GeneralSelection__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalWebDsl.g:1946:1: rule__GeneralSelection__Group__0__Impl : ( ( rule__GeneralSelection__TypeElementAssignment_0 ) ) ;
    public final void rule__GeneralSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1950:1: ( ( ( rule__GeneralSelection__TypeElementAssignment_0 ) ) )
            // InternalWebDsl.g:1951:1: ( ( rule__GeneralSelection__TypeElementAssignment_0 ) )
            {
            // InternalWebDsl.g:1951:1: ( ( rule__GeneralSelection__TypeElementAssignment_0 ) )
            // InternalWebDsl.g:1952:2: ( rule__GeneralSelection__TypeElementAssignment_0 )
            {
             before(grammarAccess.getGeneralSelectionAccess().getTypeElementAssignment_0()); 
            // InternalWebDsl.g:1953:2: ( rule__GeneralSelection__TypeElementAssignment_0 )
            // InternalWebDsl.g:1953:3: rule__GeneralSelection__TypeElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralSelection__TypeElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralSelectionAccess().getTypeElementAssignment_0()); 

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
    // InternalWebDsl.g:1961:1: rule__GeneralSelection__Group__1 : rule__GeneralSelection__Group__1__Impl rule__GeneralSelection__Group__2 ;
    public final void rule__GeneralSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1965:1: ( rule__GeneralSelection__Group__1__Impl rule__GeneralSelection__Group__2 )
            // InternalWebDsl.g:1966:2: rule__GeneralSelection__Group__1__Impl rule__GeneralSelection__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalWebDsl.g:1973:1: rule__GeneralSelection__Group__1__Impl : ( ( rule__GeneralSelection__TypeSelectionAssignment_1 ) ) ;
    public final void rule__GeneralSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1977:1: ( ( ( rule__GeneralSelection__TypeSelectionAssignment_1 ) ) )
            // InternalWebDsl.g:1978:1: ( ( rule__GeneralSelection__TypeSelectionAssignment_1 ) )
            {
            // InternalWebDsl.g:1978:1: ( ( rule__GeneralSelection__TypeSelectionAssignment_1 ) )
            // InternalWebDsl.g:1979:2: ( rule__GeneralSelection__TypeSelectionAssignment_1 )
            {
             before(grammarAccess.getGeneralSelectionAccess().getTypeSelectionAssignment_1()); 
            // InternalWebDsl.g:1980:2: ( rule__GeneralSelection__TypeSelectionAssignment_1 )
            // InternalWebDsl.g:1980:3: rule__GeneralSelection__TypeSelectionAssignment_1
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
    // InternalWebDsl.g:1988:1: rule__GeneralSelection__Group__2 : rule__GeneralSelection__Group__2__Impl rule__GeneralSelection__Group__3 ;
    public final void rule__GeneralSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1992:1: ( rule__GeneralSelection__Group__2__Impl rule__GeneralSelection__Group__3 )
            // InternalWebDsl.g:1993:2: rule__GeneralSelection__Group__2__Impl rule__GeneralSelection__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalWebDsl.g:2000:1: rule__GeneralSelection__Group__2__Impl : ( '{' ) ;
    public final void rule__GeneralSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2004:1: ( ( '{' ) )
            // InternalWebDsl.g:2005:1: ( '{' )
            {
            // InternalWebDsl.g:2005:1: ( '{' )
            // InternalWebDsl.g:2006:2: '{'
            {
             before(grammarAccess.getGeneralSelectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalWebDsl.g:2015:1: rule__GeneralSelection__Group__3 : rule__GeneralSelection__Group__3__Impl rule__GeneralSelection__Group__4 ;
    public final void rule__GeneralSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2019:1: ( rule__GeneralSelection__Group__3__Impl rule__GeneralSelection__Group__4 )
            // InternalWebDsl.g:2020:2: rule__GeneralSelection__Group__3__Impl rule__GeneralSelection__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalWebDsl.g:2027:1: rule__GeneralSelection__Group__3__Impl : ( ( rule__GeneralSelection__GeneralActionsAssignment_3 )* ) ;
    public final void rule__GeneralSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2031:1: ( ( ( rule__GeneralSelection__GeneralActionsAssignment_3 )* ) )
            // InternalWebDsl.g:2032:1: ( ( rule__GeneralSelection__GeneralActionsAssignment_3 )* )
            {
            // InternalWebDsl.g:2032:1: ( ( rule__GeneralSelection__GeneralActionsAssignment_3 )* )
            // InternalWebDsl.g:2033:2: ( rule__GeneralSelection__GeneralActionsAssignment_3 )*
            {
             before(grammarAccess.getGeneralSelectionAccess().getGeneralActionsAssignment_3()); 
            // InternalWebDsl.g:2034:2: ( rule__GeneralSelection__GeneralActionsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=11 && LA24_0<=15)||(LA24_0>=27 && LA24_0<=28)||LA24_0==49||LA24_0==52||LA24_0==59) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalWebDsl.g:2034:3: rule__GeneralSelection__GeneralActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__GeneralSelection__GeneralActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalWebDsl.g:2042:1: rule__GeneralSelection__Group__4 : rule__GeneralSelection__Group__4__Impl ;
    public final void rule__GeneralSelection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2046:1: ( rule__GeneralSelection__Group__4__Impl )
            // InternalWebDsl.g:2047:2: rule__GeneralSelection__Group__4__Impl
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
    // InternalWebDsl.g:2053:1: rule__GeneralSelection__Group__4__Impl : ( '}' ) ;
    public final void rule__GeneralSelection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2057:1: ( ( '}' ) )
            // InternalWebDsl.g:2058:1: ( '}' )
            {
            // InternalWebDsl.g:2058:1: ( '}' )
            // InternalWebDsl.g:2059:2: '}'
            {
             before(grammarAccess.getGeneralSelectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalWebDsl.g:2069:1: rule__CheckboxSelection__Group__0 : rule__CheckboxSelection__Group__0__Impl rule__CheckboxSelection__Group__1 ;
    public final void rule__CheckboxSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2073:1: ( rule__CheckboxSelection__Group__0__Impl rule__CheckboxSelection__Group__1 )
            // InternalWebDsl.g:2074:2: rule__CheckboxSelection__Group__0__Impl rule__CheckboxSelection__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalWebDsl.g:2081:1: rule__CheckboxSelection__Group__0__Impl : ( ( rule__CheckboxSelection__TypeElementAssignment_0 ) ) ;
    public final void rule__CheckboxSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2085:1: ( ( ( rule__CheckboxSelection__TypeElementAssignment_0 ) ) )
            // InternalWebDsl.g:2086:1: ( ( rule__CheckboxSelection__TypeElementAssignment_0 ) )
            {
            // InternalWebDsl.g:2086:1: ( ( rule__CheckboxSelection__TypeElementAssignment_0 ) )
            // InternalWebDsl.g:2087:2: ( rule__CheckboxSelection__TypeElementAssignment_0 )
            {
             before(grammarAccess.getCheckboxSelectionAccess().getTypeElementAssignment_0()); 
            // InternalWebDsl.g:2088:2: ( rule__CheckboxSelection__TypeElementAssignment_0 )
            // InternalWebDsl.g:2088:3: rule__CheckboxSelection__TypeElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxSelection__TypeElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxSelectionAccess().getTypeElementAssignment_0()); 

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
    // InternalWebDsl.g:2096:1: rule__CheckboxSelection__Group__1 : rule__CheckboxSelection__Group__1__Impl rule__CheckboxSelection__Group__2 ;
    public final void rule__CheckboxSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2100:1: ( rule__CheckboxSelection__Group__1__Impl rule__CheckboxSelection__Group__2 )
            // InternalWebDsl.g:2101:2: rule__CheckboxSelection__Group__1__Impl rule__CheckboxSelection__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalWebDsl.g:2108:1: rule__CheckboxSelection__Group__1__Impl : ( ( rule__CheckboxSelection__TypeSelectionAssignment_1 ) ) ;
    public final void rule__CheckboxSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2112:1: ( ( ( rule__CheckboxSelection__TypeSelectionAssignment_1 ) ) )
            // InternalWebDsl.g:2113:1: ( ( rule__CheckboxSelection__TypeSelectionAssignment_1 ) )
            {
            // InternalWebDsl.g:2113:1: ( ( rule__CheckboxSelection__TypeSelectionAssignment_1 ) )
            // InternalWebDsl.g:2114:2: ( rule__CheckboxSelection__TypeSelectionAssignment_1 )
            {
             before(grammarAccess.getCheckboxSelectionAccess().getTypeSelectionAssignment_1()); 
            // InternalWebDsl.g:2115:2: ( rule__CheckboxSelection__TypeSelectionAssignment_1 )
            // InternalWebDsl.g:2115:3: rule__CheckboxSelection__TypeSelectionAssignment_1
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
    // InternalWebDsl.g:2123:1: rule__CheckboxSelection__Group__2 : rule__CheckboxSelection__Group__2__Impl rule__CheckboxSelection__Group__3 ;
    public final void rule__CheckboxSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2127:1: ( rule__CheckboxSelection__Group__2__Impl rule__CheckboxSelection__Group__3 )
            // InternalWebDsl.g:2128:2: rule__CheckboxSelection__Group__2__Impl rule__CheckboxSelection__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalWebDsl.g:2135:1: rule__CheckboxSelection__Group__2__Impl : ( '{' ) ;
    public final void rule__CheckboxSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2139:1: ( ( '{' ) )
            // InternalWebDsl.g:2140:1: ( '{' )
            {
            // InternalWebDsl.g:2140:1: ( '{' )
            // InternalWebDsl.g:2141:2: '{'
            {
             before(grammarAccess.getCheckboxSelectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalWebDsl.g:2150:1: rule__CheckboxSelection__Group__3 : rule__CheckboxSelection__Group__3__Impl rule__CheckboxSelection__Group__4 ;
    public final void rule__CheckboxSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2154:1: ( rule__CheckboxSelection__Group__3__Impl rule__CheckboxSelection__Group__4 )
            // InternalWebDsl.g:2155:2: rule__CheckboxSelection__Group__3__Impl rule__CheckboxSelection__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalWebDsl.g:2162:1: rule__CheckboxSelection__Group__3__Impl : ( ( rule__CheckboxSelection__Alternatives_3 )* ) ;
    public final void rule__CheckboxSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2166:1: ( ( ( rule__CheckboxSelection__Alternatives_3 )* ) )
            // InternalWebDsl.g:2167:1: ( ( rule__CheckboxSelection__Alternatives_3 )* )
            {
            // InternalWebDsl.g:2167:1: ( ( rule__CheckboxSelection__Alternatives_3 )* )
            // InternalWebDsl.g:2168:2: ( rule__CheckboxSelection__Alternatives_3 )*
            {
             before(grammarAccess.getCheckboxSelectionAccess().getAlternatives_3()); 
            // InternalWebDsl.g:2169:2: ( rule__CheckboxSelection__Alternatives_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=11 && LA25_0<=17)||(LA25_0>=27 && LA25_0<=28)||LA25_0==49||LA25_0==52||LA25_0==59) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalWebDsl.g:2169:3: rule__CheckboxSelection__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__CheckboxSelection__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalWebDsl.g:2177:1: rule__CheckboxSelection__Group__4 : rule__CheckboxSelection__Group__4__Impl ;
    public final void rule__CheckboxSelection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2181:1: ( rule__CheckboxSelection__Group__4__Impl )
            // InternalWebDsl.g:2182:2: rule__CheckboxSelection__Group__4__Impl
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
    // InternalWebDsl.g:2188:1: rule__CheckboxSelection__Group__4__Impl : ( '}' ) ;
    public final void rule__CheckboxSelection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2192:1: ( ( '}' ) )
            // InternalWebDsl.g:2193:1: ( '}' )
            {
            // InternalWebDsl.g:2193:1: ( '}' )
            // InternalWebDsl.g:2194:2: '}'
            {
             before(grammarAccess.getCheckboxSelectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalWebDsl.g:2204:1: rule__ComboboxSelection__Group__0 : rule__ComboboxSelection__Group__0__Impl rule__ComboboxSelection__Group__1 ;
    public final void rule__ComboboxSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2208:1: ( rule__ComboboxSelection__Group__0__Impl rule__ComboboxSelection__Group__1 )
            // InternalWebDsl.g:2209:2: rule__ComboboxSelection__Group__0__Impl rule__ComboboxSelection__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalWebDsl.g:2216:1: rule__ComboboxSelection__Group__0__Impl : ( ( rule__ComboboxSelection__TypeElementAssignment_0 ) ) ;
    public final void rule__ComboboxSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2220:1: ( ( ( rule__ComboboxSelection__TypeElementAssignment_0 ) ) )
            // InternalWebDsl.g:2221:1: ( ( rule__ComboboxSelection__TypeElementAssignment_0 ) )
            {
            // InternalWebDsl.g:2221:1: ( ( rule__ComboboxSelection__TypeElementAssignment_0 ) )
            // InternalWebDsl.g:2222:2: ( rule__ComboboxSelection__TypeElementAssignment_0 )
            {
             before(grammarAccess.getComboboxSelectionAccess().getTypeElementAssignment_0()); 
            // InternalWebDsl.g:2223:2: ( rule__ComboboxSelection__TypeElementAssignment_0 )
            // InternalWebDsl.g:2223:3: rule__ComboboxSelection__TypeElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComboboxSelection__TypeElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComboboxSelectionAccess().getTypeElementAssignment_0()); 

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
    // InternalWebDsl.g:2231:1: rule__ComboboxSelection__Group__1 : rule__ComboboxSelection__Group__1__Impl rule__ComboboxSelection__Group__2 ;
    public final void rule__ComboboxSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2235:1: ( rule__ComboboxSelection__Group__1__Impl rule__ComboboxSelection__Group__2 )
            // InternalWebDsl.g:2236:2: rule__ComboboxSelection__Group__1__Impl rule__ComboboxSelection__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalWebDsl.g:2243:1: rule__ComboboxSelection__Group__1__Impl : ( ( rule__ComboboxSelection__TypeSelectionAssignment_1 ) ) ;
    public final void rule__ComboboxSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2247:1: ( ( ( rule__ComboboxSelection__TypeSelectionAssignment_1 ) ) )
            // InternalWebDsl.g:2248:1: ( ( rule__ComboboxSelection__TypeSelectionAssignment_1 ) )
            {
            // InternalWebDsl.g:2248:1: ( ( rule__ComboboxSelection__TypeSelectionAssignment_1 ) )
            // InternalWebDsl.g:2249:2: ( rule__ComboboxSelection__TypeSelectionAssignment_1 )
            {
             before(grammarAccess.getComboboxSelectionAccess().getTypeSelectionAssignment_1()); 
            // InternalWebDsl.g:2250:2: ( rule__ComboboxSelection__TypeSelectionAssignment_1 )
            // InternalWebDsl.g:2250:3: rule__ComboboxSelection__TypeSelectionAssignment_1
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
    // InternalWebDsl.g:2258:1: rule__ComboboxSelection__Group__2 : rule__ComboboxSelection__Group__2__Impl rule__ComboboxSelection__Group__3 ;
    public final void rule__ComboboxSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2262:1: ( rule__ComboboxSelection__Group__2__Impl rule__ComboboxSelection__Group__3 )
            // InternalWebDsl.g:2263:2: rule__ComboboxSelection__Group__2__Impl rule__ComboboxSelection__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalWebDsl.g:2270:1: rule__ComboboxSelection__Group__2__Impl : ( '{' ) ;
    public final void rule__ComboboxSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2274:1: ( ( '{' ) )
            // InternalWebDsl.g:2275:1: ( '{' )
            {
            // InternalWebDsl.g:2275:1: ( '{' )
            // InternalWebDsl.g:2276:2: '{'
            {
             before(grammarAccess.getComboboxSelectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalWebDsl.g:2285:1: rule__ComboboxSelection__Group__3 : rule__ComboboxSelection__Group__3__Impl rule__ComboboxSelection__Group__4 ;
    public final void rule__ComboboxSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2289:1: ( rule__ComboboxSelection__Group__3__Impl rule__ComboboxSelection__Group__4 )
            // InternalWebDsl.g:2290:2: rule__ComboboxSelection__Group__3__Impl rule__ComboboxSelection__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalWebDsl.g:2297:1: rule__ComboboxSelection__Group__3__Impl : ( ( rule__ComboboxSelection__Alternatives_3 )* ) ;
    public final void rule__ComboboxSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2301:1: ( ( ( rule__ComboboxSelection__Alternatives_3 )* ) )
            // InternalWebDsl.g:2302:1: ( ( rule__ComboboxSelection__Alternatives_3 )* )
            {
            // InternalWebDsl.g:2302:1: ( ( rule__ComboboxSelection__Alternatives_3 )* )
            // InternalWebDsl.g:2303:2: ( rule__ComboboxSelection__Alternatives_3 )*
            {
             before(grammarAccess.getComboboxSelectionAccess().getAlternatives_3()); 
            // InternalWebDsl.g:2304:2: ( rule__ComboboxSelection__Alternatives_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=11 && LA26_0<=15)||(LA26_0>=27 && LA26_0<=28)||(LA26_0>=48 && LA26_0<=49)||LA26_0==52||LA26_0==59) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalWebDsl.g:2304:3: rule__ComboboxSelection__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ComboboxSelection__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalWebDsl.g:2312:1: rule__ComboboxSelection__Group__4 : rule__ComboboxSelection__Group__4__Impl ;
    public final void rule__ComboboxSelection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2316:1: ( rule__ComboboxSelection__Group__4__Impl )
            // InternalWebDsl.g:2317:2: rule__ComboboxSelection__Group__4__Impl
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
    // InternalWebDsl.g:2323:1: rule__ComboboxSelection__Group__4__Impl : ( '}' ) ;
    public final void rule__ComboboxSelection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2327:1: ( ( '}' ) )
            // InternalWebDsl.g:2328:1: ( '}' )
            {
            // InternalWebDsl.g:2328:1: ( '}' )
            // InternalWebDsl.g:2329:2: '}'
            {
             before(grammarAccess.getComboboxSelectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalWebDsl.g:2339:1: rule__ComboboxSelection__Group_3_1__0 : rule__ComboboxSelection__Group_3_1__0__Impl rule__ComboboxSelection__Group_3_1__1 ;
    public final void rule__ComboboxSelection__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2343:1: ( rule__ComboboxSelection__Group_3_1__0__Impl rule__ComboboxSelection__Group_3_1__1 )
            // InternalWebDsl.g:2344:2: rule__ComboboxSelection__Group_3_1__0__Impl rule__ComboboxSelection__Group_3_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalWebDsl.g:2351:1: rule__ComboboxSelection__Group_3_1__0__Impl : ( 'select' ) ;
    public final void rule__ComboboxSelection__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2355:1: ( ( 'select' ) )
            // InternalWebDsl.g:2356:1: ( 'select' )
            {
            // InternalWebDsl.g:2356:1: ( 'select' )
            // InternalWebDsl.g:2357:2: 'select'
            {
             before(grammarAccess.getComboboxSelectionAccess().getSelectKeyword_3_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalWebDsl.g:2366:1: rule__ComboboxSelection__Group_3_1__1 : rule__ComboboxSelection__Group_3_1__1__Impl ;
    public final void rule__ComboboxSelection__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2370:1: ( rule__ComboboxSelection__Group_3_1__1__Impl )
            // InternalWebDsl.g:2371:2: rule__ComboboxSelection__Group_3_1__1__Impl
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
    // InternalWebDsl.g:2377:1: rule__ComboboxSelection__Group_3_1__1__Impl : ( RULE_STRING ) ;
    public final void rule__ComboboxSelection__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2381:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:2382:1: ( RULE_STRING )
            {
            // InternalWebDsl.g:2382:1: ( RULE_STRING )
            // InternalWebDsl.g:2383:2: RULE_STRING
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
    // InternalWebDsl.g:2393:1: rule__PageSelection__Group__0 : rule__PageSelection__Group__0__Impl rule__PageSelection__Group__1 ;
    public final void rule__PageSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2397:1: ( rule__PageSelection__Group__0__Impl rule__PageSelection__Group__1 )
            // InternalWebDsl.g:2398:2: rule__PageSelection__Group__0__Impl rule__PageSelection__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalWebDsl.g:2405:1: rule__PageSelection__Group__0__Impl : ( ( rule__PageSelection__TypeElementAssignment_0 ) ) ;
    public final void rule__PageSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2409:1: ( ( ( rule__PageSelection__TypeElementAssignment_0 ) ) )
            // InternalWebDsl.g:2410:1: ( ( rule__PageSelection__TypeElementAssignment_0 ) )
            {
            // InternalWebDsl.g:2410:1: ( ( rule__PageSelection__TypeElementAssignment_0 ) )
            // InternalWebDsl.g:2411:2: ( rule__PageSelection__TypeElementAssignment_0 )
            {
             before(grammarAccess.getPageSelectionAccess().getTypeElementAssignment_0()); 
            // InternalWebDsl.g:2412:2: ( rule__PageSelection__TypeElementAssignment_0 )
            // InternalWebDsl.g:2412:3: rule__PageSelection__TypeElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PageSelection__TypeElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPageSelectionAccess().getTypeElementAssignment_0()); 

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
    // InternalWebDsl.g:2420:1: rule__PageSelection__Group__1 : rule__PageSelection__Group__1__Impl rule__PageSelection__Group__2 ;
    public final void rule__PageSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2424:1: ( rule__PageSelection__Group__1__Impl rule__PageSelection__Group__2 )
            // InternalWebDsl.g:2425:2: rule__PageSelection__Group__1__Impl rule__PageSelection__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalWebDsl.g:2432:1: rule__PageSelection__Group__1__Impl : ( '{' ) ;
    public final void rule__PageSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2436:1: ( ( '{' ) )
            // InternalWebDsl.g:2437:1: ( '{' )
            {
            // InternalWebDsl.g:2437:1: ( '{' )
            // InternalWebDsl.g:2438:2: '{'
            {
             before(grammarAccess.getPageSelectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalWebDsl.g:2447:1: rule__PageSelection__Group__2 : rule__PageSelection__Group__2__Impl rule__PageSelection__Group__3 ;
    public final void rule__PageSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2451:1: ( rule__PageSelection__Group__2__Impl rule__PageSelection__Group__3 )
            // InternalWebDsl.g:2452:2: rule__PageSelection__Group__2__Impl rule__PageSelection__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalWebDsl.g:2459:1: rule__PageSelection__Group__2__Impl : ( ( rule__PageSelection__Alternatives_2 )* ) ;
    public final void rule__PageSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2463:1: ( ( ( rule__PageSelection__Alternatives_2 )* ) )
            // InternalWebDsl.g:2464:1: ( ( rule__PageSelection__Alternatives_2 )* )
            {
            // InternalWebDsl.g:2464:1: ( ( rule__PageSelection__Alternatives_2 )* )
            // InternalWebDsl.g:2465:2: ( rule__PageSelection__Alternatives_2 )*
            {
             before(grammarAccess.getPageSelectionAccess().getAlternatives_2()); 
            // InternalWebDsl.g:2466:2: ( rule__PageSelection__Alternatives_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==49||LA27_0==54) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalWebDsl.g:2466:3: rule__PageSelection__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__PageSelection__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalWebDsl.g:2474:1: rule__PageSelection__Group__3 : rule__PageSelection__Group__3__Impl ;
    public final void rule__PageSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2478:1: ( rule__PageSelection__Group__3__Impl )
            // InternalWebDsl.g:2479:2: rule__PageSelection__Group__3__Impl
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
    // InternalWebDsl.g:2485:1: rule__PageSelection__Group__3__Impl : ( '}' ) ;
    public final void rule__PageSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2489:1: ( ( '}' ) )
            // InternalWebDsl.g:2490:1: ( '}' )
            {
            // InternalWebDsl.g:2490:1: ( '}' )
            // InternalWebDsl.g:2491:2: '}'
            {
             before(grammarAccess.getPageSelectionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalWebDsl.g:2501:1: rule__StoreAction__Group__0 : rule__StoreAction__Group__0__Impl rule__StoreAction__Group__1 ;
    public final void rule__StoreAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2505:1: ( rule__StoreAction__Group__0__Impl rule__StoreAction__Group__1 )
            // InternalWebDsl.g:2506:2: rule__StoreAction__Group__0__Impl rule__StoreAction__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalWebDsl.g:2513:1: rule__StoreAction__Group__0__Impl : ( 'store' ) ;
    public final void rule__StoreAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2517:1: ( ( 'store' ) )
            // InternalWebDsl.g:2518:1: ( 'store' )
            {
            // InternalWebDsl.g:2518:1: ( 'store' )
            // InternalWebDsl.g:2519:2: 'store'
            {
             before(grammarAccess.getStoreActionAccess().getStoreKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalWebDsl.g:2528:1: rule__StoreAction__Group__1 : rule__StoreAction__Group__1__Impl rule__StoreAction__Group__2 ;
    public final void rule__StoreAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2532:1: ( rule__StoreAction__Group__1__Impl rule__StoreAction__Group__2 )
            // InternalWebDsl.g:2533:2: rule__StoreAction__Group__1__Impl rule__StoreAction__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalWebDsl.g:2540:1: rule__StoreAction__Group__1__Impl : ( '(' ) ;
    public final void rule__StoreAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2544:1: ( ( '(' ) )
            // InternalWebDsl.g:2545:1: ( '(' )
            {
            // InternalWebDsl.g:2545:1: ( '(' )
            // InternalWebDsl.g:2546:2: '('
            {
             before(grammarAccess.getStoreActionAccess().getLeftParenthesisKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getStoreActionAccess().getLeftParenthesisKeyword_1()); 

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
    // InternalWebDsl.g:2555:1: rule__StoreAction__Group__2 : rule__StoreAction__Group__2__Impl rule__StoreAction__Group__3 ;
    public final void rule__StoreAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2559:1: ( rule__StoreAction__Group__2__Impl rule__StoreAction__Group__3 )
            // InternalWebDsl.g:2560:2: rule__StoreAction__Group__2__Impl rule__StoreAction__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalWebDsl.g:2567:1: rule__StoreAction__Group__2__Impl : ( ( rule__StoreAction__Alternatives_2 ) ) ;
    public final void rule__StoreAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2571:1: ( ( ( rule__StoreAction__Alternatives_2 ) ) )
            // InternalWebDsl.g:2572:1: ( ( rule__StoreAction__Alternatives_2 ) )
            {
            // InternalWebDsl.g:2572:1: ( ( rule__StoreAction__Alternatives_2 ) )
            // InternalWebDsl.g:2573:2: ( rule__StoreAction__Alternatives_2 )
            {
             before(grammarAccess.getStoreActionAccess().getAlternatives_2()); 
            // InternalWebDsl.g:2574:2: ( rule__StoreAction__Alternatives_2 )
            // InternalWebDsl.g:2574:3: rule__StoreAction__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__StoreAction__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getStoreActionAccess().getAlternatives_2()); 

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
    // InternalWebDsl.g:2582:1: rule__StoreAction__Group__3 : rule__StoreAction__Group__3__Impl rule__StoreAction__Group__4 ;
    public final void rule__StoreAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2586:1: ( rule__StoreAction__Group__3__Impl rule__StoreAction__Group__4 )
            // InternalWebDsl.g:2587:2: rule__StoreAction__Group__3__Impl rule__StoreAction__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__StoreAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreAction__Group__4();

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
    // InternalWebDsl.g:2594:1: rule__StoreAction__Group__3__Impl : ( ')' ) ;
    public final void rule__StoreAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2598:1: ( ( ')' ) )
            // InternalWebDsl.g:2599:1: ( ')' )
            {
            // InternalWebDsl.g:2599:1: ( ')' )
            // InternalWebDsl.g:2600:2: ')'
            {
             before(grammarAccess.getStoreActionAccess().getRightParenthesisKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getStoreActionAccess().getRightParenthesisKeyword_3()); 

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


    // $ANTLR start "rule__StoreAction__Group__4"
    // InternalWebDsl.g:2609:1: rule__StoreAction__Group__4 : rule__StoreAction__Group__4__Impl rule__StoreAction__Group__5 ;
    public final void rule__StoreAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2613:1: ( rule__StoreAction__Group__4__Impl rule__StoreAction__Group__5 )
            // InternalWebDsl.g:2614:2: rule__StoreAction__Group__4__Impl rule__StoreAction__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__StoreAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreAction__Group__5();

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
    // $ANTLR end "rule__StoreAction__Group__4"


    // $ANTLR start "rule__StoreAction__Group__4__Impl"
    // InternalWebDsl.g:2621:1: rule__StoreAction__Group__4__Impl : ( 'in' ) ;
    public final void rule__StoreAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2625:1: ( ( 'in' ) )
            // InternalWebDsl.g:2626:1: ( 'in' )
            {
            // InternalWebDsl.g:2626:1: ( 'in' )
            // InternalWebDsl.g:2627:2: 'in'
            {
             before(grammarAccess.getStoreActionAccess().getInKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getStoreActionAccess().getInKeyword_4()); 

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
    // $ANTLR end "rule__StoreAction__Group__4__Impl"


    // $ANTLR start "rule__StoreAction__Group__5"
    // InternalWebDsl.g:2636:1: rule__StoreAction__Group__5 : rule__StoreAction__Group__5__Impl ;
    public final void rule__StoreAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2640:1: ( rule__StoreAction__Group__5__Impl )
            // InternalWebDsl.g:2641:2: rule__StoreAction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoreAction__Group__5__Impl();

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
    // $ANTLR end "rule__StoreAction__Group__5"


    // $ANTLR start "rule__StoreAction__Group__5__Impl"
    // InternalWebDsl.g:2647:1: rule__StoreAction__Group__5__Impl : ( ( rule__StoreAction__VarAssignment_5 ) ) ;
    public final void rule__StoreAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2651:1: ( ( ( rule__StoreAction__VarAssignment_5 ) ) )
            // InternalWebDsl.g:2652:1: ( ( rule__StoreAction__VarAssignment_5 ) )
            {
            // InternalWebDsl.g:2652:1: ( ( rule__StoreAction__VarAssignment_5 ) )
            // InternalWebDsl.g:2653:2: ( rule__StoreAction__VarAssignment_5 )
            {
             before(grammarAccess.getStoreActionAccess().getVarAssignment_5()); 
            // InternalWebDsl.g:2654:2: ( rule__StoreAction__VarAssignment_5 )
            // InternalWebDsl.g:2654:3: rule__StoreAction__VarAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__StoreAction__VarAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStoreActionAccess().getVarAssignment_5()); 

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
    // $ANTLR end "rule__StoreAction__Group__5__Impl"


    // $ANTLR start "rule__CountAction__Group__0"
    // InternalWebDsl.g:2663:1: rule__CountAction__Group__0 : rule__CountAction__Group__0__Impl rule__CountAction__Group__1 ;
    public final void rule__CountAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2667:1: ( rule__CountAction__Group__0__Impl rule__CountAction__Group__1 )
            // InternalWebDsl.g:2668:2: rule__CountAction__Group__0__Impl rule__CountAction__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__CountAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountAction__Group__1();

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
    // $ANTLR end "rule__CountAction__Group__0"


    // $ANTLR start "rule__CountAction__Group__0__Impl"
    // InternalWebDsl.g:2675:1: rule__CountAction__Group__0__Impl : ( 'count' ) ;
    public final void rule__CountAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2679:1: ( ( 'count' ) )
            // InternalWebDsl.g:2680:1: ( 'count' )
            {
            // InternalWebDsl.g:2680:1: ( 'count' )
            // InternalWebDsl.g:2681:2: 'count'
            {
             before(grammarAccess.getCountActionAccess().getCountKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCountActionAccess().getCountKeyword_0()); 

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
    // $ANTLR end "rule__CountAction__Group__0__Impl"


    // $ANTLR start "rule__CountAction__Group__1"
    // InternalWebDsl.g:2690:1: rule__CountAction__Group__1 : rule__CountAction__Group__1__Impl rule__CountAction__Group__2 ;
    public final void rule__CountAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2694:1: ( rule__CountAction__Group__1__Impl rule__CountAction__Group__2 )
            // InternalWebDsl.g:2695:2: rule__CountAction__Group__1__Impl rule__CountAction__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__CountAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountAction__Group__2();

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
    // $ANTLR end "rule__CountAction__Group__1"


    // $ANTLR start "rule__CountAction__Group__1__Impl"
    // InternalWebDsl.g:2702:1: rule__CountAction__Group__1__Impl : ( ( rule__CountAction__HtmlElementAssignment_1 ) ) ;
    public final void rule__CountAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2706:1: ( ( ( rule__CountAction__HtmlElementAssignment_1 ) ) )
            // InternalWebDsl.g:2707:1: ( ( rule__CountAction__HtmlElementAssignment_1 ) )
            {
            // InternalWebDsl.g:2707:1: ( ( rule__CountAction__HtmlElementAssignment_1 ) )
            // InternalWebDsl.g:2708:2: ( rule__CountAction__HtmlElementAssignment_1 )
            {
             before(grammarAccess.getCountActionAccess().getHtmlElementAssignment_1()); 
            // InternalWebDsl.g:2709:2: ( rule__CountAction__HtmlElementAssignment_1 )
            // InternalWebDsl.g:2709:3: rule__CountAction__HtmlElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CountAction__HtmlElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCountActionAccess().getHtmlElementAssignment_1()); 

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
    // $ANTLR end "rule__CountAction__Group__1__Impl"


    // $ANTLR start "rule__CountAction__Group__2"
    // InternalWebDsl.g:2717:1: rule__CountAction__Group__2 : rule__CountAction__Group__2__Impl ;
    public final void rule__CountAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2721:1: ( rule__CountAction__Group__2__Impl )
            // InternalWebDsl.g:2722:2: rule__CountAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountAction__Group__2__Impl();

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
    // $ANTLR end "rule__CountAction__Group__2"


    // $ANTLR start "rule__CountAction__Group__2__Impl"
    // InternalWebDsl.g:2728:1: rule__CountAction__Group__2__Impl : ( ( rule__CountAction__TypeSelectionAssignment_2 ) ) ;
    public final void rule__CountAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2732:1: ( ( ( rule__CountAction__TypeSelectionAssignment_2 ) ) )
            // InternalWebDsl.g:2733:1: ( ( rule__CountAction__TypeSelectionAssignment_2 ) )
            {
            // InternalWebDsl.g:2733:1: ( ( rule__CountAction__TypeSelectionAssignment_2 ) )
            // InternalWebDsl.g:2734:2: ( rule__CountAction__TypeSelectionAssignment_2 )
            {
             before(grammarAccess.getCountActionAccess().getTypeSelectionAssignment_2()); 
            // InternalWebDsl.g:2735:2: ( rule__CountAction__TypeSelectionAssignment_2 )
            // InternalWebDsl.g:2735:3: rule__CountAction__TypeSelectionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CountAction__TypeSelectionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCountActionAccess().getTypeSelectionAssignment_2()); 

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
    // $ANTLR end "rule__CountAction__Group__2__Impl"


    // $ANTLR start "rule__SetAction__Group__0"
    // InternalWebDsl.g:2744:1: rule__SetAction__Group__0 : rule__SetAction__Group__0__Impl rule__SetAction__Group__1 ;
    public final void rule__SetAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2748:1: ( rule__SetAction__Group__0__Impl rule__SetAction__Group__1 )
            // InternalWebDsl.g:2749:2: rule__SetAction__Group__0__Impl rule__SetAction__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalWebDsl.g:2756:1: rule__SetAction__Group__0__Impl : ( 'set' ) ;
    public final void rule__SetAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2760:1: ( ( 'set' ) )
            // InternalWebDsl.g:2761:1: ( 'set' )
            {
            // InternalWebDsl.g:2761:1: ( 'set' )
            // InternalWebDsl.g:2762:2: 'set'
            {
             before(grammarAccess.getSetActionAccess().getSetKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalWebDsl.g:2771:1: rule__SetAction__Group__1 : rule__SetAction__Group__1__Impl rule__SetAction__Group__2 ;
    public final void rule__SetAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2775:1: ( rule__SetAction__Group__1__Impl rule__SetAction__Group__2 )
            // InternalWebDsl.g:2776:2: rule__SetAction__Group__1__Impl rule__SetAction__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalWebDsl.g:2783:1: rule__SetAction__Group__1__Impl : ( ( rule__SetAction__AttributeAssignment_1 ) ) ;
    public final void rule__SetAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2787:1: ( ( ( rule__SetAction__AttributeAssignment_1 ) ) )
            // InternalWebDsl.g:2788:1: ( ( rule__SetAction__AttributeAssignment_1 ) )
            {
            // InternalWebDsl.g:2788:1: ( ( rule__SetAction__AttributeAssignment_1 ) )
            // InternalWebDsl.g:2789:2: ( rule__SetAction__AttributeAssignment_1 )
            {
             before(grammarAccess.getSetActionAccess().getAttributeAssignment_1()); 
            // InternalWebDsl.g:2790:2: ( rule__SetAction__AttributeAssignment_1 )
            // InternalWebDsl.g:2790:3: rule__SetAction__AttributeAssignment_1
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
    // InternalWebDsl.g:2798:1: rule__SetAction__Group__2 : rule__SetAction__Group__2__Impl rule__SetAction__Group__3 ;
    public final void rule__SetAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2802:1: ( rule__SetAction__Group__2__Impl rule__SetAction__Group__3 )
            // InternalWebDsl.g:2803:2: rule__SetAction__Group__2__Impl rule__SetAction__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalWebDsl.g:2810:1: rule__SetAction__Group__2__Impl : ( ':' ) ;
    public final void rule__SetAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2814:1: ( ( ':' ) )
            // InternalWebDsl.g:2815:1: ( ':' )
            {
            // InternalWebDsl.g:2815:1: ( ':' )
            // InternalWebDsl.g:2816:2: ':'
            {
             before(grammarAccess.getSetActionAccess().getColonKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalWebDsl.g:2825:1: rule__SetAction__Group__3 : rule__SetAction__Group__3__Impl ;
    public final void rule__SetAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2829:1: ( rule__SetAction__Group__3__Impl )
            // InternalWebDsl.g:2830:2: rule__SetAction__Group__3__Impl
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
    // InternalWebDsl.g:2836:1: rule__SetAction__Group__3__Impl : ( ( rule__SetAction__ValueAssignment_3 ) ) ;
    public final void rule__SetAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2840:1: ( ( ( rule__SetAction__ValueAssignment_3 ) ) )
            // InternalWebDsl.g:2841:1: ( ( rule__SetAction__ValueAssignment_3 ) )
            {
            // InternalWebDsl.g:2841:1: ( ( rule__SetAction__ValueAssignment_3 ) )
            // InternalWebDsl.g:2842:2: ( rule__SetAction__ValueAssignment_3 )
            {
             before(grammarAccess.getSetActionAccess().getValueAssignment_3()); 
            // InternalWebDsl.g:2843:2: ( rule__SetAction__ValueAssignment_3 )
            // InternalWebDsl.g:2843:3: rule__SetAction__ValueAssignment_3
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
    // InternalWebDsl.g:2852:1: rule__TypeSelection__Group_0__0 : rule__TypeSelection__Group_0__0__Impl rule__TypeSelection__Group_0__1 ;
    public final void rule__TypeSelection__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2856:1: ( rule__TypeSelection__Group_0__0__Impl rule__TypeSelection__Group_0__1 )
            // InternalWebDsl.g:2857:2: rule__TypeSelection__Group_0__0__Impl rule__TypeSelection__Group_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalWebDsl.g:2864:1: rule__TypeSelection__Group_0__0__Impl : ( ( rule__TypeSelection__AttributeAssignment_0_0 ) ) ;
    public final void rule__TypeSelection__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2868:1: ( ( ( rule__TypeSelection__AttributeAssignment_0_0 ) ) )
            // InternalWebDsl.g:2869:1: ( ( rule__TypeSelection__AttributeAssignment_0_0 ) )
            {
            // InternalWebDsl.g:2869:1: ( ( rule__TypeSelection__AttributeAssignment_0_0 ) )
            // InternalWebDsl.g:2870:2: ( rule__TypeSelection__AttributeAssignment_0_0 )
            {
             before(grammarAccess.getTypeSelectionAccess().getAttributeAssignment_0_0()); 
            // InternalWebDsl.g:2871:2: ( rule__TypeSelection__AttributeAssignment_0_0 )
            // InternalWebDsl.g:2871:3: rule__TypeSelection__AttributeAssignment_0_0
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
    // InternalWebDsl.g:2879:1: rule__TypeSelection__Group_0__1 : rule__TypeSelection__Group_0__1__Impl rule__TypeSelection__Group_0__2 ;
    public final void rule__TypeSelection__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2883:1: ( rule__TypeSelection__Group_0__1__Impl rule__TypeSelection__Group_0__2 )
            // InternalWebDsl.g:2884:2: rule__TypeSelection__Group_0__1__Impl rule__TypeSelection__Group_0__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalWebDsl.g:2891:1: rule__TypeSelection__Group_0__1__Impl : ( ':' ) ;
    public final void rule__TypeSelection__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2895:1: ( ( ':' ) )
            // InternalWebDsl.g:2896:1: ( ':' )
            {
            // InternalWebDsl.g:2896:1: ( ':' )
            // InternalWebDsl.g:2897:2: ':'
            {
             before(grammarAccess.getTypeSelectionAccess().getColonKeyword_0_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalWebDsl.g:2906:1: rule__TypeSelection__Group_0__2 : rule__TypeSelection__Group_0__2__Impl ;
    public final void rule__TypeSelection__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2910:1: ( rule__TypeSelection__Group_0__2__Impl )
            // InternalWebDsl.g:2911:2: rule__TypeSelection__Group_0__2__Impl
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
    // InternalWebDsl.g:2917:1: rule__TypeSelection__Group_0__2__Impl : ( ( rule__TypeSelection__Alternatives_0_2 ) ) ;
    public final void rule__TypeSelection__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2921:1: ( ( ( rule__TypeSelection__Alternatives_0_2 ) ) )
            // InternalWebDsl.g:2922:1: ( ( rule__TypeSelection__Alternatives_0_2 ) )
            {
            // InternalWebDsl.g:2922:1: ( ( rule__TypeSelection__Alternatives_0_2 ) )
            // InternalWebDsl.g:2923:2: ( rule__TypeSelection__Alternatives_0_2 )
            {
             before(grammarAccess.getTypeSelectionAccess().getAlternatives_0_2()); 
            // InternalWebDsl.g:2924:2: ( rule__TypeSelection__Alternatives_0_2 )
            // InternalWebDsl.g:2924:3: rule__TypeSelection__Alternatives_0_2
            {
            pushFollow(FOLLOW_2);
            rule__TypeSelection__Alternatives_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeSelectionAccess().getAlternatives_0_2()); 

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
    // InternalWebDsl.g:2933:1: rule__Assert__Group__0 : rule__Assert__Group__0__Impl rule__Assert__Group__1 ;
    public final void rule__Assert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2937:1: ( rule__Assert__Group__0__Impl rule__Assert__Group__1 )
            // InternalWebDsl.g:2938:2: rule__Assert__Group__0__Impl rule__Assert__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalWebDsl.g:2945:1: rule__Assert__Group__0__Impl : ( 'verify' ) ;
    public final void rule__Assert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2949:1: ( ( 'verify' ) )
            // InternalWebDsl.g:2950:1: ( 'verify' )
            {
            // InternalWebDsl.g:2950:1: ( 'verify' )
            // InternalWebDsl.g:2951:2: 'verify'
            {
             before(grammarAccess.getAssertAccess().getVerifyKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalWebDsl.g:2960:1: rule__Assert__Group__1 : rule__Assert__Group__1__Impl ;
    public final void rule__Assert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2964:1: ( rule__Assert__Group__1__Impl )
            // InternalWebDsl.g:2965:2: rule__Assert__Group__1__Impl
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
    // InternalWebDsl.g:2971:1: rule__Assert__Group__1__Impl : ( ( rule__Assert__Alternatives_1 ) ) ;
    public final void rule__Assert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2975:1: ( ( ( rule__Assert__Alternatives_1 ) ) )
            // InternalWebDsl.g:2976:1: ( ( rule__Assert__Alternatives_1 ) )
            {
            // InternalWebDsl.g:2976:1: ( ( rule__Assert__Alternatives_1 ) )
            // InternalWebDsl.g:2977:2: ( rule__Assert__Alternatives_1 )
            {
             before(grammarAccess.getAssertAccess().getAlternatives_1()); 
            // InternalWebDsl.g:2978:2: ( rule__Assert__Alternatives_1 )
            // InternalWebDsl.g:2978:3: rule__Assert__Alternatives_1
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
    // InternalWebDsl.g:2987:1: rule__AssertContains__Group__0 : rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 ;
    public final void rule__AssertContains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2991:1: ( rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 )
            // InternalWebDsl.g:2992:2: rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalWebDsl.g:2999:1: rule__AssertContains__Group__0__Impl : ( 'contains' ) ;
    public final void rule__AssertContains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3003:1: ( ( 'contains' ) )
            // InternalWebDsl.g:3004:1: ( 'contains' )
            {
            // InternalWebDsl.g:3004:1: ( 'contains' )
            // InternalWebDsl.g:3005:2: 'contains'
            {
             before(grammarAccess.getAssertContainsAccess().getContainsKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalWebDsl.g:3014:1: rule__AssertContains__Group__1 : rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 ;
    public final void rule__AssertContains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3018:1: ( rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 )
            // InternalWebDsl.g:3019:2: rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalWebDsl.g:3026:1: rule__AssertContains__Group__1__Impl : ( ( rule__AssertContains__Alternatives_1 ) ) ;
    public final void rule__AssertContains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3030:1: ( ( ( rule__AssertContains__Alternatives_1 ) ) )
            // InternalWebDsl.g:3031:1: ( ( rule__AssertContains__Alternatives_1 ) )
            {
            // InternalWebDsl.g:3031:1: ( ( rule__AssertContains__Alternatives_1 ) )
            // InternalWebDsl.g:3032:2: ( rule__AssertContains__Alternatives_1 )
            {
             before(grammarAccess.getAssertContainsAccess().getAlternatives_1()); 
            // InternalWebDsl.g:3033:2: ( rule__AssertContains__Alternatives_1 )
            // InternalWebDsl.g:3033:3: rule__AssertContains__Alternatives_1
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
    // InternalWebDsl.g:3041:1: rule__AssertContains__Group__2 : rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 ;
    public final void rule__AssertContains__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3045:1: ( rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 )
            // InternalWebDsl.g:3046:2: rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalWebDsl.g:3053:1: rule__AssertContains__Group__2__Impl : ( ':' ) ;
    public final void rule__AssertContains__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3057:1: ( ( ':' ) )
            // InternalWebDsl.g:3058:1: ( ':' )
            {
            // InternalWebDsl.g:3058:1: ( ':' )
            // InternalWebDsl.g:3059:2: ':'
            {
             before(grammarAccess.getAssertContainsAccess().getColonKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalWebDsl.g:3068:1: rule__AssertContains__Group__3 : rule__AssertContains__Group__3__Impl ;
    public final void rule__AssertContains__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3072:1: ( rule__AssertContains__Group__3__Impl )
            // InternalWebDsl.g:3073:2: rule__AssertContains__Group__3__Impl
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
    // InternalWebDsl.g:3079:1: rule__AssertContains__Group__3__Impl : ( ( rule__AssertContains__ValueAssignment_3 ) ) ;
    public final void rule__AssertContains__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3083:1: ( ( ( rule__AssertContains__ValueAssignment_3 ) ) )
            // InternalWebDsl.g:3084:1: ( ( rule__AssertContains__ValueAssignment_3 ) )
            {
            // InternalWebDsl.g:3084:1: ( ( rule__AssertContains__ValueAssignment_3 ) )
            // InternalWebDsl.g:3085:2: ( rule__AssertContains__ValueAssignment_3 )
            {
             before(grammarAccess.getAssertContainsAccess().getValueAssignment_3()); 
            // InternalWebDsl.g:3086:2: ( rule__AssertContains__ValueAssignment_3 )
            // InternalWebDsl.g:3086:3: rule__AssertContains__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AssertContains__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssertContainsAccess().getValueAssignment_3()); 

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
    // InternalWebDsl.g:3095:1: rule__AssertContains__Group_1_0__0 : rule__AssertContains__Group_1_0__0__Impl rule__AssertContains__Group_1_0__1 ;
    public final void rule__AssertContains__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3099:1: ( rule__AssertContains__Group_1_0__0__Impl rule__AssertContains__Group_1_0__1 )
            // InternalWebDsl.g:3100:2: rule__AssertContains__Group_1_0__0__Impl rule__AssertContains__Group_1_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalWebDsl.g:3107:1: rule__AssertContains__Group_1_0__0__Impl : ( ( rule__AssertContains__HtmlElementAssignment_1_0_0 ) ) ;
    public final void rule__AssertContains__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3111:1: ( ( ( rule__AssertContains__HtmlElementAssignment_1_0_0 ) ) )
            // InternalWebDsl.g:3112:1: ( ( rule__AssertContains__HtmlElementAssignment_1_0_0 ) )
            {
            // InternalWebDsl.g:3112:1: ( ( rule__AssertContains__HtmlElementAssignment_1_0_0 ) )
            // InternalWebDsl.g:3113:2: ( rule__AssertContains__HtmlElementAssignment_1_0_0 )
            {
             before(grammarAccess.getAssertContainsAccess().getHtmlElementAssignment_1_0_0()); 
            // InternalWebDsl.g:3114:2: ( rule__AssertContains__HtmlElementAssignment_1_0_0 )
            // InternalWebDsl.g:3114:3: rule__AssertContains__HtmlElementAssignment_1_0_0
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
    // InternalWebDsl.g:3122:1: rule__AssertContains__Group_1_0__1 : rule__AssertContains__Group_1_0__1__Impl ;
    public final void rule__AssertContains__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3126:1: ( rule__AssertContains__Group_1_0__1__Impl )
            // InternalWebDsl.g:3127:2: rule__AssertContains__Group_1_0__1__Impl
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
    // InternalWebDsl.g:3133:1: rule__AssertContains__Group_1_0__1__Impl : ( ( rule__AssertContains__AttributeAssignment_1_0_1 ) ) ;
    public final void rule__AssertContains__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3137:1: ( ( ( rule__AssertContains__AttributeAssignment_1_0_1 ) ) )
            // InternalWebDsl.g:3138:1: ( ( rule__AssertContains__AttributeAssignment_1_0_1 ) )
            {
            // InternalWebDsl.g:3138:1: ( ( rule__AssertContains__AttributeAssignment_1_0_1 ) )
            // InternalWebDsl.g:3139:2: ( rule__AssertContains__AttributeAssignment_1_0_1 )
            {
             before(grammarAccess.getAssertContainsAccess().getAttributeAssignment_1_0_1()); 
            // InternalWebDsl.g:3140:2: ( rule__AssertContains__AttributeAssignment_1_0_1 )
            // InternalWebDsl.g:3140:3: rule__AssertContains__AttributeAssignment_1_0_1
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
    // InternalWebDsl.g:3149:1: rule__AssertEquals__Group__0 : rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 ;
    public final void rule__AssertEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3153:1: ( rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 )
            // InternalWebDsl.g:3154:2: rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalWebDsl.g:3161:1: rule__AssertEquals__Group__0__Impl : ( ( rule__AssertEquals__C1Assignment_0 ) ) ;
    public final void rule__AssertEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3165:1: ( ( ( rule__AssertEquals__C1Assignment_0 ) ) )
            // InternalWebDsl.g:3166:1: ( ( rule__AssertEquals__C1Assignment_0 ) )
            {
            // InternalWebDsl.g:3166:1: ( ( rule__AssertEquals__C1Assignment_0 ) )
            // InternalWebDsl.g:3167:2: ( rule__AssertEquals__C1Assignment_0 )
            {
             before(grammarAccess.getAssertEqualsAccess().getC1Assignment_0()); 
            // InternalWebDsl.g:3168:2: ( rule__AssertEquals__C1Assignment_0 )
            // InternalWebDsl.g:3168:3: rule__AssertEquals__C1Assignment_0
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
    // InternalWebDsl.g:3176:1: rule__AssertEquals__Group__1 : rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 ;
    public final void rule__AssertEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3180:1: ( rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 )
            // InternalWebDsl.g:3181:2: rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalWebDsl.g:3188:1: rule__AssertEquals__Group__1__Impl : ( 'equals' ) ;
    public final void rule__AssertEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3192:1: ( ( 'equals' ) )
            // InternalWebDsl.g:3193:1: ( 'equals' )
            {
            // InternalWebDsl.g:3193:1: ( 'equals' )
            // InternalWebDsl.g:3194:2: 'equals'
            {
             before(grammarAccess.getAssertEqualsAccess().getEqualsKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalWebDsl.g:3203:1: rule__AssertEquals__Group__2 : rule__AssertEquals__Group__2__Impl ;
    public final void rule__AssertEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3207:1: ( rule__AssertEquals__Group__2__Impl )
            // InternalWebDsl.g:3208:2: rule__AssertEquals__Group__2__Impl
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
    // InternalWebDsl.g:3214:1: rule__AssertEquals__Group__2__Impl : ( ( rule__AssertEquals__C2Assignment_2 ) ) ;
    public final void rule__AssertEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3218:1: ( ( ( rule__AssertEquals__C2Assignment_2 ) ) )
            // InternalWebDsl.g:3219:1: ( ( rule__AssertEquals__C2Assignment_2 ) )
            {
            // InternalWebDsl.g:3219:1: ( ( rule__AssertEquals__C2Assignment_2 ) )
            // InternalWebDsl.g:3220:2: ( rule__AssertEquals__C2Assignment_2 )
            {
             before(grammarAccess.getAssertEqualsAccess().getC2Assignment_2()); 
            // InternalWebDsl.g:3221:2: ( rule__AssertEquals__C2Assignment_2 )
            // InternalWebDsl.g:3221:3: rule__AssertEquals__C2Assignment_2
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
    // InternalWebDsl.g:3230:1: rule__Comparable__Group_0__0 : rule__Comparable__Group_0__0__Impl rule__Comparable__Group_0__1 ;
    public final void rule__Comparable__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3234:1: ( rule__Comparable__Group_0__0__Impl rule__Comparable__Group_0__1 )
            // InternalWebDsl.g:3235:2: rule__Comparable__Group_0__0__Impl rule__Comparable__Group_0__1
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
    // InternalWebDsl.g:3242:1: rule__Comparable__Group_0__0__Impl : ( 'VAR:' ) ;
    public final void rule__Comparable__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3246:1: ( ( 'VAR:' ) )
            // InternalWebDsl.g:3247:1: ( 'VAR:' )
            {
            // InternalWebDsl.g:3247:1: ( 'VAR:' )
            // InternalWebDsl.g:3248:2: 'VAR:'
            {
             before(grammarAccess.getComparableAccess().getVARKeyword_0_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalWebDsl.g:3257:1: rule__Comparable__Group_0__1 : rule__Comparable__Group_0__1__Impl ;
    public final void rule__Comparable__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3261:1: ( rule__Comparable__Group_0__1__Impl )
            // InternalWebDsl.g:3262:2: rule__Comparable__Group_0__1__Impl
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
    // InternalWebDsl.g:3268:1: rule__Comparable__Group_0__1__Impl : ( ( rule__Comparable__VarAssignment_0_1 ) ) ;
    public final void rule__Comparable__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3272:1: ( ( ( rule__Comparable__VarAssignment_0_1 ) ) )
            // InternalWebDsl.g:3273:1: ( ( rule__Comparable__VarAssignment_0_1 ) )
            {
            // InternalWebDsl.g:3273:1: ( ( rule__Comparable__VarAssignment_0_1 ) )
            // InternalWebDsl.g:3274:2: ( rule__Comparable__VarAssignment_0_1 )
            {
             before(grammarAccess.getComparableAccess().getVarAssignment_0_1()); 
            // InternalWebDsl.g:3275:2: ( rule__Comparable__VarAssignment_0_1 )
            // InternalWebDsl.g:3275:3: rule__Comparable__VarAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparable__VarAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getComparableAccess().getVarAssignment_0_1()); 

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
    // InternalWebDsl.g:3284:1: rule__Comparable__Group_1__0 : rule__Comparable__Group_1__0__Impl rule__Comparable__Group_1__1 ;
    public final void rule__Comparable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3288:1: ( rule__Comparable__Group_1__0__Impl rule__Comparable__Group_1__1 )
            // InternalWebDsl.g:3289:2: rule__Comparable__Group_1__0__Impl rule__Comparable__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalWebDsl.g:3296:1: rule__Comparable__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Comparable__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3300:1: ( ( '(' ) )
            // InternalWebDsl.g:3301:1: ( '(' )
            {
            // InternalWebDsl.g:3301:1: ( '(' )
            // InternalWebDsl.g:3302:2: '('
            {
             before(grammarAccess.getComparableAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalWebDsl.g:3311:1: rule__Comparable__Group_1__1 : rule__Comparable__Group_1__1__Impl rule__Comparable__Group_1__2 ;
    public final void rule__Comparable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3315:1: ( rule__Comparable__Group_1__1__Impl rule__Comparable__Group_1__2 )
            // InternalWebDsl.g:3316:2: rule__Comparable__Group_1__1__Impl rule__Comparable__Group_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalWebDsl.g:3323:1: rule__Comparable__Group_1__1__Impl : ( ( rule__Comparable__HtmlElementAssignment_1_1 ) ) ;
    public final void rule__Comparable__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3327:1: ( ( ( rule__Comparable__HtmlElementAssignment_1_1 ) ) )
            // InternalWebDsl.g:3328:1: ( ( rule__Comparable__HtmlElementAssignment_1_1 ) )
            {
            // InternalWebDsl.g:3328:1: ( ( rule__Comparable__HtmlElementAssignment_1_1 ) )
            // InternalWebDsl.g:3329:2: ( rule__Comparable__HtmlElementAssignment_1_1 )
            {
             before(grammarAccess.getComparableAccess().getHtmlElementAssignment_1_1()); 
            // InternalWebDsl.g:3330:2: ( rule__Comparable__HtmlElementAssignment_1_1 )
            // InternalWebDsl.g:3330:3: rule__Comparable__HtmlElementAssignment_1_1
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
    // InternalWebDsl.g:3338:1: rule__Comparable__Group_1__2 : rule__Comparable__Group_1__2__Impl rule__Comparable__Group_1__3 ;
    public final void rule__Comparable__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3342:1: ( rule__Comparable__Group_1__2__Impl rule__Comparable__Group_1__3 )
            // InternalWebDsl.g:3343:2: rule__Comparable__Group_1__2__Impl rule__Comparable__Group_1__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalWebDsl.g:3350:1: rule__Comparable__Group_1__2__Impl : ( ( rule__Comparable__AttributeAssignment_1_2 ) ) ;
    public final void rule__Comparable__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3354:1: ( ( ( rule__Comparable__AttributeAssignment_1_2 ) ) )
            // InternalWebDsl.g:3355:1: ( ( rule__Comparable__AttributeAssignment_1_2 ) )
            {
            // InternalWebDsl.g:3355:1: ( ( rule__Comparable__AttributeAssignment_1_2 ) )
            // InternalWebDsl.g:3356:2: ( rule__Comparable__AttributeAssignment_1_2 )
            {
             before(grammarAccess.getComparableAccess().getAttributeAssignment_1_2()); 
            // InternalWebDsl.g:3357:2: ( rule__Comparable__AttributeAssignment_1_2 )
            // InternalWebDsl.g:3357:3: rule__Comparable__AttributeAssignment_1_2
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
    // InternalWebDsl.g:3365:1: rule__Comparable__Group_1__3 : rule__Comparable__Group_1__3__Impl ;
    public final void rule__Comparable__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3369:1: ( rule__Comparable__Group_1__3__Impl )
            // InternalWebDsl.g:3370:2: rule__Comparable__Group_1__3__Impl
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
    // InternalWebDsl.g:3376:1: rule__Comparable__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Comparable__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3380:1: ( ( ')' ) )
            // InternalWebDsl.g:3381:1: ( ')' )
            {
            // InternalWebDsl.g:3381:1: ( ')' )
            // InternalWebDsl.g:3382:2: ')'
            {
             before(grammarAccess.getComparableAccess().getRightParenthesisKeyword_1_3()); 
            match(input,46,FOLLOW_2); 
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


    // $ANTLR start "rule__Program__ProceduresAssignment_0"
    // InternalWebDsl.g:3392:1: rule__Program__ProceduresAssignment_0 : ( ruleProcedure ) ;
    public final void rule__Program__ProceduresAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3396:1: ( ( ruleProcedure ) )
            // InternalWebDsl.g:3397:2: ( ruleProcedure )
            {
            // InternalWebDsl.g:3397:2: ( ruleProcedure )
            // InternalWebDsl.g:3398:3: ruleProcedure
            {
             before(grammarAccess.getProgramAccess().getProceduresProcedureParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getProceduresProcedureParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Program__ProceduresAssignment_0"


    // $ANTLR start "rule__Program__CoresAssignment_1"
    // InternalWebDsl.g:3407:1: rule__Program__CoresAssignment_1 : ( ruleCore ) ;
    public final void rule__Program__CoresAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3411:1: ( ( ruleCore ) )
            // InternalWebDsl.g:3412:2: ( ruleCore )
            {
            // InternalWebDsl.g:3412:2: ( ruleCore )
            // InternalWebDsl.g:3413:3: ruleCore
            {
             before(grammarAccess.getProgramAccess().getCoresCoreParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCore();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getCoresCoreParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Program__CoresAssignment_1"


    // $ANTLR start "rule__Core__NameAssignment_1"
    // InternalWebDsl.g:3422:1: rule__Core__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Core__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3426:1: ( ( RULE_ID ) )
            // InternalWebDsl.g:3427:2: ( RULE_ID )
            {
            // InternalWebDsl.g:3427:2: ( RULE_ID )
            // InternalWebDsl.g:3428:3: RULE_ID
            {
             before(grammarAccess.getCoreAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoreAccess().getNameIDTerminalRuleCall_1_0()); 

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


    // $ANTLR start "rule__Core__BrowserAssignment_4"
    // InternalWebDsl.g:3437:1: rule__Core__BrowserAssignment_4 : ( ruleBrowser ) ;
    public final void rule__Core__BrowserAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3441:1: ( ( ruleBrowser ) )
            // InternalWebDsl.g:3442:2: ( ruleBrowser )
            {
            // InternalWebDsl.g:3442:2: ( ruleBrowser )
            // InternalWebDsl.g:3443:3: ruleBrowser
            {
             before(grammarAccess.getCoreAccess().getBrowserBrowserEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBrowser();

            state._fsp--;

             after(grammarAccess.getCoreAccess().getBrowserBrowserEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__Core__BrowserAssignment_4"


    // $ANTLR start "rule__Core__ActionsAssignment_5"
    // InternalWebDsl.g:3452:1: rule__Core__ActionsAssignment_5 : ( ruleAction ) ;
    public final void rule__Core__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3456:1: ( ( ruleAction ) )
            // InternalWebDsl.g:3457:2: ( ruleAction )
            {
            // InternalWebDsl.g:3457:2: ( ruleAction )
            // InternalWebDsl.g:3458:3: ruleAction
            {
             before(grammarAccess.getCoreAccess().getActionsActionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getCoreAccess().getActionsActionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Core__ActionsAssignment_5"


    // $ANTLR start "rule__Procedure__NameAssignment_1"
    // InternalWebDsl.g:3467:1: rule__Procedure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3471:1: ( ( RULE_ID ) )
            // InternalWebDsl.g:3472:2: ( RULE_ID )
            {
            // InternalWebDsl.g:3472:2: ( RULE_ID )
            // InternalWebDsl.g:3473:3: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Procedure__NameAssignment_1"


    // $ANTLR start "rule__Procedure__VarAssignment_3"
    // InternalWebDsl.g:3482:1: rule__Procedure__VarAssignment_3 : ( ruleVar ) ;
    public final void rule__Procedure__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3486:1: ( ( ruleVar ) )
            // InternalWebDsl.g:3487:2: ( ruleVar )
            {
            // InternalWebDsl.g:3487:2: ( ruleVar )
            // InternalWebDsl.g:3488:3: ruleVar
            {
             before(grammarAccess.getProcedureAccess().getVarVarParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getVarVarParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Procedure__VarAssignment_3"


    // $ANTLR start "rule__Procedure__ActionsAssignment_5"
    // InternalWebDsl.g:3497:1: rule__Procedure__ActionsAssignment_5 : ( ruleAction ) ;
    public final void rule__Procedure__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3501:1: ( ( ruleAction ) )
            // InternalWebDsl.g:3502:2: ( ruleAction )
            {
            // InternalWebDsl.g:3502:2: ( ruleAction )
            // InternalWebDsl.g:3503:3: ruleAction
            {
             before(grammarAccess.getProcedureAccess().getActionsActionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getActionsActionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Procedure__ActionsAssignment_5"


    // $ANTLR start "rule__CallProcedure__RefAssignment_1"
    // InternalWebDsl.g:3512:1: rule__CallProcedure__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CallProcedure__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3516:1: ( ( ( RULE_ID ) ) )
            // InternalWebDsl.g:3517:2: ( ( RULE_ID ) )
            {
            // InternalWebDsl.g:3517:2: ( ( RULE_ID ) )
            // InternalWebDsl.g:3518:3: ( RULE_ID )
            {
             before(grammarAccess.getCallProcedureAccess().getRefProcedureCrossReference_1_0()); 
            // InternalWebDsl.g:3519:3: ( RULE_ID )
            // InternalWebDsl.g:3520:4: RULE_ID
            {
             before(grammarAccess.getCallProcedureAccess().getRefProcedureIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCallProcedureAccess().getRefProcedureIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCallProcedureAccess().getRefProcedureCrossReference_1_0()); 

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
    // $ANTLR end "rule__CallProcedure__RefAssignment_1"


    // $ANTLR start "rule__CallProcedure__ArgAssignment_3"
    // InternalWebDsl.g:3531:1: rule__CallProcedure__ArgAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CallProcedure__ArgAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3535:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:3536:2: ( RULE_STRING )
            {
            // InternalWebDsl.g:3536:2: ( RULE_STRING )
            // InternalWebDsl.g:3537:3: RULE_STRING
            {
             before(grammarAccess.getCallProcedureAccess().getArgSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCallProcedureAccess().getArgSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__CallProcedure__ArgAssignment_3"


    // $ANTLR start "rule__GoAction__UrlAssignment_1"
    // InternalWebDsl.g:3546:1: rule__GoAction__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GoAction__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3550:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:3551:2: ( RULE_STRING )
            {
            // InternalWebDsl.g:3551:2: ( RULE_STRING )
            // InternalWebDsl.g:3552:3: RULE_STRING
            {
             before(grammarAccess.getGoActionAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoActionAccess().getUrlSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__GoAction__UrlAssignment_1"


    // $ANTLR start "rule__LinkButtonSelection__TypeElementAssignment_0"
    // InternalWebDsl.g:3561:1: rule__LinkButtonSelection__TypeElementAssignment_0 : ( ( rule__LinkButtonSelection__TypeElementAlternatives_0_0 ) ) ;
    public final void rule__LinkButtonSelection__TypeElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3565:1: ( ( ( rule__LinkButtonSelection__TypeElementAlternatives_0_0 ) ) )
            // InternalWebDsl.g:3566:2: ( ( rule__LinkButtonSelection__TypeElementAlternatives_0_0 ) )
            {
            // InternalWebDsl.g:3566:2: ( ( rule__LinkButtonSelection__TypeElementAlternatives_0_0 ) )
            // InternalWebDsl.g:3567:3: ( rule__LinkButtonSelection__TypeElementAlternatives_0_0 )
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getTypeElementAlternatives_0_0()); 
            // InternalWebDsl.g:3568:3: ( rule__LinkButtonSelection__TypeElementAlternatives_0_0 )
            // InternalWebDsl.g:3568:4: rule__LinkButtonSelection__TypeElementAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__LinkButtonSelection__TypeElementAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getLinkButtonSelectionAccess().getTypeElementAlternatives_0_0()); 

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
    // $ANTLR end "rule__LinkButtonSelection__TypeElementAssignment_0"


    // $ANTLR start "rule__LinkButtonSelection__TypeSelectionAssignment_1"
    // InternalWebDsl.g:3576:1: rule__LinkButtonSelection__TypeSelectionAssignment_1 : ( ruleTypeSelection ) ;
    public final void rule__LinkButtonSelection__TypeSelectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3580:1: ( ( ruleTypeSelection ) )
            // InternalWebDsl.g:3581:2: ( ruleTypeSelection )
            {
            // InternalWebDsl.g:3581:2: ( ruleTypeSelection )
            // InternalWebDsl.g:3582:3: ruleTypeSelection
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
    // InternalWebDsl.g:3591:1: rule__LinkButtonSelection__GeneralActionsAssignment_3_0 : ( ruleGeneralAction ) ;
    public final void rule__LinkButtonSelection__GeneralActionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3595:1: ( ( ruleGeneralAction ) )
            // InternalWebDsl.g:3596:2: ( ruleGeneralAction )
            {
            // InternalWebDsl.g:3596:2: ( ruleGeneralAction )
            // InternalWebDsl.g:3597:3: ruleGeneralAction
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


    // $ANTLR start "rule__LinkButtonSelection__ClicksAssignment_3_1"
    // InternalWebDsl.g:3606:1: rule__LinkButtonSelection__ClicksAssignment_3_1 : ( ( 'click' ) ) ;
    public final void rule__LinkButtonSelection__ClicksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3610:1: ( ( ( 'click' ) ) )
            // InternalWebDsl.g:3611:2: ( ( 'click' ) )
            {
            // InternalWebDsl.g:3611:2: ( ( 'click' ) )
            // InternalWebDsl.g:3612:3: ( 'click' )
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getClicksClickKeyword_3_1_0()); 
            // InternalWebDsl.g:3613:3: ( 'click' )
            // InternalWebDsl.g:3614:4: 'click'
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getClicksClickKeyword_3_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getLinkButtonSelectionAccess().getClicksClickKeyword_3_1_0()); 

            }

             after(grammarAccess.getLinkButtonSelectionAccess().getClicksClickKeyword_3_1_0()); 

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
    // $ANTLR end "rule__LinkButtonSelection__ClicksAssignment_3_1"


    // $ANTLR start "rule__GeneralSelection__TypeElementAssignment_0"
    // InternalWebDsl.g:3625:1: rule__GeneralSelection__TypeElementAssignment_0 : ( ( rule__GeneralSelection__TypeElementAlternatives_0_0 ) ) ;
    public final void rule__GeneralSelection__TypeElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3629:1: ( ( ( rule__GeneralSelection__TypeElementAlternatives_0_0 ) ) )
            // InternalWebDsl.g:3630:2: ( ( rule__GeneralSelection__TypeElementAlternatives_0_0 ) )
            {
            // InternalWebDsl.g:3630:2: ( ( rule__GeneralSelection__TypeElementAlternatives_0_0 ) )
            // InternalWebDsl.g:3631:3: ( rule__GeneralSelection__TypeElementAlternatives_0_0 )
            {
             before(grammarAccess.getGeneralSelectionAccess().getTypeElementAlternatives_0_0()); 
            // InternalWebDsl.g:3632:3: ( rule__GeneralSelection__TypeElementAlternatives_0_0 )
            // InternalWebDsl.g:3632:4: rule__GeneralSelection__TypeElementAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralSelection__TypeElementAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralSelectionAccess().getTypeElementAlternatives_0_0()); 

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
    // $ANTLR end "rule__GeneralSelection__TypeElementAssignment_0"


    // $ANTLR start "rule__GeneralSelection__TypeSelectionAssignment_1"
    // InternalWebDsl.g:3640:1: rule__GeneralSelection__TypeSelectionAssignment_1 : ( ruleTypeSelection ) ;
    public final void rule__GeneralSelection__TypeSelectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3644:1: ( ( ruleTypeSelection ) )
            // InternalWebDsl.g:3645:2: ( ruleTypeSelection )
            {
            // InternalWebDsl.g:3645:2: ( ruleTypeSelection )
            // InternalWebDsl.g:3646:3: ruleTypeSelection
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
    // InternalWebDsl.g:3655:1: rule__GeneralSelection__GeneralActionsAssignment_3 : ( ruleGeneralAction ) ;
    public final void rule__GeneralSelection__GeneralActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3659:1: ( ( ruleGeneralAction ) )
            // InternalWebDsl.g:3660:2: ( ruleGeneralAction )
            {
            // InternalWebDsl.g:3660:2: ( ruleGeneralAction )
            // InternalWebDsl.g:3661:3: ruleGeneralAction
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


    // $ANTLR start "rule__CheckboxSelection__TypeElementAssignment_0"
    // InternalWebDsl.g:3670:1: rule__CheckboxSelection__TypeElementAssignment_0 : ( ( 'CHECKBOX' ) ) ;
    public final void rule__CheckboxSelection__TypeElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3674:1: ( ( ( 'CHECKBOX' ) ) )
            // InternalWebDsl.g:3675:2: ( ( 'CHECKBOX' ) )
            {
            // InternalWebDsl.g:3675:2: ( ( 'CHECKBOX' ) )
            // InternalWebDsl.g:3676:3: ( 'CHECKBOX' )
            {
             before(grammarAccess.getCheckboxSelectionAccess().getTypeElementCHECKBOXKeyword_0_0()); 
            // InternalWebDsl.g:3677:3: ( 'CHECKBOX' )
            // InternalWebDsl.g:3678:4: 'CHECKBOX'
            {
             before(grammarAccess.getCheckboxSelectionAccess().getTypeElementCHECKBOXKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCheckboxSelectionAccess().getTypeElementCHECKBOXKeyword_0_0()); 

            }

             after(grammarAccess.getCheckboxSelectionAccess().getTypeElementCHECKBOXKeyword_0_0()); 

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
    // $ANTLR end "rule__CheckboxSelection__TypeElementAssignment_0"


    // $ANTLR start "rule__CheckboxSelection__TypeSelectionAssignment_1"
    // InternalWebDsl.g:3689:1: rule__CheckboxSelection__TypeSelectionAssignment_1 : ( ruleTypeSelection ) ;
    public final void rule__CheckboxSelection__TypeSelectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3693:1: ( ( ruleTypeSelection ) )
            // InternalWebDsl.g:3694:2: ( ruleTypeSelection )
            {
            // InternalWebDsl.g:3694:2: ( ruleTypeSelection )
            // InternalWebDsl.g:3695:3: ruleTypeSelection
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
    // InternalWebDsl.g:3704:1: rule__CheckboxSelection__GeneralActionsAssignment_3_0 : ( ruleGeneralAction ) ;
    public final void rule__CheckboxSelection__GeneralActionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3708:1: ( ( ruleGeneralAction ) )
            // InternalWebDsl.g:3709:2: ( ruleGeneralAction )
            {
            // InternalWebDsl.g:3709:2: ( ruleGeneralAction )
            // InternalWebDsl.g:3710:3: ruleGeneralAction
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


    // $ANTLR start "rule__ComboboxSelection__TypeElementAssignment_0"
    // InternalWebDsl.g:3719:1: rule__ComboboxSelection__TypeElementAssignment_0 : ( ( 'COMBO_BOX' ) ) ;
    public final void rule__ComboboxSelection__TypeElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3723:1: ( ( ( 'COMBO_BOX' ) ) )
            // InternalWebDsl.g:3724:2: ( ( 'COMBO_BOX' ) )
            {
            // InternalWebDsl.g:3724:2: ( ( 'COMBO_BOX' ) )
            // InternalWebDsl.g:3725:3: ( 'COMBO_BOX' )
            {
             before(grammarAccess.getComboboxSelectionAccess().getTypeElementCOMBO_BOXKeyword_0_0()); 
            // InternalWebDsl.g:3726:3: ( 'COMBO_BOX' )
            // InternalWebDsl.g:3727:4: 'COMBO_BOX'
            {
             before(grammarAccess.getComboboxSelectionAccess().getTypeElementCOMBO_BOXKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComboboxSelectionAccess().getTypeElementCOMBO_BOXKeyword_0_0()); 

            }

             after(grammarAccess.getComboboxSelectionAccess().getTypeElementCOMBO_BOXKeyword_0_0()); 

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
    // $ANTLR end "rule__ComboboxSelection__TypeElementAssignment_0"


    // $ANTLR start "rule__ComboboxSelection__TypeSelectionAssignment_1"
    // InternalWebDsl.g:3738:1: rule__ComboboxSelection__TypeSelectionAssignment_1 : ( ruleTypeSelection ) ;
    public final void rule__ComboboxSelection__TypeSelectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3742:1: ( ( ruleTypeSelection ) )
            // InternalWebDsl.g:3743:2: ( ruleTypeSelection )
            {
            // InternalWebDsl.g:3743:2: ( ruleTypeSelection )
            // InternalWebDsl.g:3744:3: ruleTypeSelection
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
    // InternalWebDsl.g:3753:1: rule__ComboboxSelection__GeneralActionsAssignment_3_0 : ( ruleGeneralAction ) ;
    public final void rule__ComboboxSelection__GeneralActionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3757:1: ( ( ruleGeneralAction ) )
            // InternalWebDsl.g:3758:2: ( ruleGeneralAction )
            {
            // InternalWebDsl.g:3758:2: ( ruleGeneralAction )
            // InternalWebDsl.g:3759:3: ruleGeneralAction
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


    // $ANTLR start "rule__PageSelection__TypeElementAssignment_0"
    // InternalWebDsl.g:3768:1: rule__PageSelection__TypeElementAssignment_0 : ( ( 'PAGE' ) ) ;
    public final void rule__PageSelection__TypeElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3772:1: ( ( ( 'PAGE' ) ) )
            // InternalWebDsl.g:3773:2: ( ( 'PAGE' ) )
            {
            // InternalWebDsl.g:3773:2: ( ( 'PAGE' ) )
            // InternalWebDsl.g:3774:3: ( 'PAGE' )
            {
             before(grammarAccess.getPageSelectionAccess().getTypeElementPAGEKeyword_0_0()); 
            // InternalWebDsl.g:3775:3: ( 'PAGE' )
            // InternalWebDsl.g:3776:4: 'PAGE'
            {
             before(grammarAccess.getPageSelectionAccess().getTypeElementPAGEKeyword_0_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getPageSelectionAccess().getTypeElementPAGEKeyword_0_0()); 

            }

             after(grammarAccess.getPageSelectionAccess().getTypeElementPAGEKeyword_0_0()); 

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
    // $ANTLR end "rule__PageSelection__TypeElementAssignment_0"


    // $ANTLR start "rule__PageSelection__StoreActionsAssignment_2_0"
    // InternalWebDsl.g:3787:1: rule__PageSelection__StoreActionsAssignment_2_0 : ( ruleStoreAction ) ;
    public final void rule__PageSelection__StoreActionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3791:1: ( ( ruleStoreAction ) )
            // InternalWebDsl.g:3792:2: ( ruleStoreAction )
            {
            // InternalWebDsl.g:3792:2: ( ruleStoreAction )
            // InternalWebDsl.g:3793:3: ruleStoreAction
            {
             before(grammarAccess.getPageSelectionAccess().getStoreActionsStoreActionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStoreAction();

            state._fsp--;

             after(grammarAccess.getPageSelectionAccess().getStoreActionsStoreActionParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__PageSelection__StoreActionsAssignment_2_0"


    // $ANTLR start "rule__PageSelection__AssertionsAssignment_2_1"
    // InternalWebDsl.g:3802:1: rule__PageSelection__AssertionsAssignment_2_1 : ( ruleAssert ) ;
    public final void rule__PageSelection__AssertionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3806:1: ( ( ruleAssert ) )
            // InternalWebDsl.g:3807:2: ( ruleAssert )
            {
            // InternalWebDsl.g:3807:2: ( ruleAssert )
            // InternalWebDsl.g:3808:3: ruleAssert
            {
             before(grammarAccess.getPageSelectionAccess().getAssertionsAssertParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssert();

            state._fsp--;

             after(grammarAccess.getPageSelectionAccess().getAssertionsAssertParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__PageSelection__AssertionsAssignment_2_1"


    // $ANTLR start "rule__StoreAction__ValAssignment_2_0"
    // InternalWebDsl.g:3817:1: rule__StoreAction__ValAssignment_2_0 : ( ruleAttribute ) ;
    public final void rule__StoreAction__ValAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3821:1: ( ( ruleAttribute ) )
            // InternalWebDsl.g:3822:2: ( ruleAttribute )
            {
            // InternalWebDsl.g:3822:2: ( ruleAttribute )
            // InternalWebDsl.g:3823:3: ruleAttribute
            {
             before(grammarAccess.getStoreActionAccess().getValAttributeEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getStoreActionAccess().getValAttributeEnumRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__StoreAction__ValAssignment_2_0"


    // $ANTLR start "rule__StoreAction__CountAssignment_2_1"
    // InternalWebDsl.g:3832:1: rule__StoreAction__CountAssignment_2_1 : ( ruleCountAction ) ;
    public final void rule__StoreAction__CountAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3836:1: ( ( ruleCountAction ) )
            // InternalWebDsl.g:3837:2: ( ruleCountAction )
            {
            // InternalWebDsl.g:3837:2: ( ruleCountAction )
            // InternalWebDsl.g:3838:3: ruleCountAction
            {
             before(grammarAccess.getStoreActionAccess().getCountCountActionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCountAction();

            state._fsp--;

             after(grammarAccess.getStoreActionAccess().getCountCountActionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__StoreAction__CountAssignment_2_1"


    // $ANTLR start "rule__StoreAction__VarAssignment_5"
    // InternalWebDsl.g:3847:1: rule__StoreAction__VarAssignment_5 : ( ruleVar ) ;
    public final void rule__StoreAction__VarAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3851:1: ( ( ruleVar ) )
            // InternalWebDsl.g:3852:2: ( ruleVar )
            {
            // InternalWebDsl.g:3852:2: ( ruleVar )
            // InternalWebDsl.g:3853:3: ruleVar
            {
             before(grammarAccess.getStoreActionAccess().getVarVarParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getStoreActionAccess().getVarVarParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__StoreAction__VarAssignment_5"


    // $ANTLR start "rule__CountAction__HtmlElementAssignment_1"
    // InternalWebDsl.g:3862:1: rule__CountAction__HtmlElementAssignment_1 : ( ruleHtmlElement ) ;
    public final void rule__CountAction__HtmlElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3866:1: ( ( ruleHtmlElement ) )
            // InternalWebDsl.g:3867:2: ( ruleHtmlElement )
            {
            // InternalWebDsl.g:3867:2: ( ruleHtmlElement )
            // InternalWebDsl.g:3868:3: ruleHtmlElement
            {
             before(grammarAccess.getCountActionAccess().getHtmlElementHtmlElementEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHtmlElement();

            state._fsp--;

             after(grammarAccess.getCountActionAccess().getHtmlElementHtmlElementEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__CountAction__HtmlElementAssignment_1"


    // $ANTLR start "rule__CountAction__TypeSelectionAssignment_2"
    // InternalWebDsl.g:3877:1: rule__CountAction__TypeSelectionAssignment_2 : ( ruleTypeSelection ) ;
    public final void rule__CountAction__TypeSelectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3881:1: ( ( ruleTypeSelection ) )
            // InternalWebDsl.g:3882:2: ( ruleTypeSelection )
            {
            // InternalWebDsl.g:3882:2: ( ruleTypeSelection )
            // InternalWebDsl.g:3883:3: ruleTypeSelection
            {
             before(grammarAccess.getCountActionAccess().getTypeSelectionTypeSelectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeSelection();

            state._fsp--;

             after(grammarAccess.getCountActionAccess().getTypeSelectionTypeSelectionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CountAction__TypeSelectionAssignment_2"


    // $ANTLR start "rule__Var__NameAssignment"
    // InternalWebDsl.g:3892:1: rule__Var__NameAssignment : ( RULE_ID ) ;
    public final void rule__Var__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3896:1: ( ( RULE_ID ) )
            // InternalWebDsl.g:3897:2: ( RULE_ID )
            {
            // InternalWebDsl.g:3897:2: ( RULE_ID )
            // InternalWebDsl.g:3898:3: RULE_ID
            {
             before(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0()); 

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
    // InternalWebDsl.g:3907:1: rule__SetAction__AttributeAssignment_1 : ( ruleAttribute ) ;
    public final void rule__SetAction__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3911:1: ( ( ruleAttribute ) )
            // InternalWebDsl.g:3912:2: ( ruleAttribute )
            {
            // InternalWebDsl.g:3912:2: ( ruleAttribute )
            // InternalWebDsl.g:3913:3: ruleAttribute
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
    // InternalWebDsl.g:3922:1: rule__SetAction__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SetAction__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3926:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:3927:2: ( RULE_STRING )
            {
            // InternalWebDsl.g:3927:2: ( RULE_STRING )
            // InternalWebDsl.g:3928:3: RULE_STRING
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
    // InternalWebDsl.g:3937:1: rule__TypeSelection__AttributeAssignment_0_0 : ( ruleAttribute ) ;
    public final void rule__TypeSelection__AttributeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3941:1: ( ( ruleAttribute ) )
            // InternalWebDsl.g:3942:2: ( ruleAttribute )
            {
            // InternalWebDsl.g:3942:2: ( ruleAttribute )
            // InternalWebDsl.g:3943:3: ruleAttribute
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


    // $ANTLR start "rule__TypeSelection__ValueAssignment_0_2_0"
    // InternalWebDsl.g:3952:1: rule__TypeSelection__ValueAssignment_0_2_0 : ( RULE_STRING ) ;
    public final void rule__TypeSelection__ValueAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3956:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:3957:2: ( RULE_STRING )
            {
            // InternalWebDsl.g:3957:2: ( RULE_STRING )
            // InternalWebDsl.g:3958:3: RULE_STRING
            {
             before(grammarAccess.getTypeSelectionAccess().getValueSTRINGTerminalRuleCall_0_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypeSelectionAccess().getValueSTRINGTerminalRuleCall_0_2_0_0()); 

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
    // $ANTLR end "rule__TypeSelection__ValueAssignment_0_2_0"


    // $ANTLR start "rule__TypeSelection__VarAssignment_0_2_1"
    // InternalWebDsl.g:3967:1: rule__TypeSelection__VarAssignment_0_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeSelection__VarAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3971:1: ( ( ( RULE_ID ) ) )
            // InternalWebDsl.g:3972:2: ( ( RULE_ID ) )
            {
            // InternalWebDsl.g:3972:2: ( ( RULE_ID ) )
            // InternalWebDsl.g:3973:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeSelectionAccess().getVarVarCrossReference_0_2_1_0()); 
            // InternalWebDsl.g:3974:3: ( RULE_ID )
            // InternalWebDsl.g:3975:4: RULE_ID
            {
             before(grammarAccess.getTypeSelectionAccess().getVarVarIDTerminalRuleCall_0_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeSelectionAccess().getVarVarIDTerminalRuleCall_0_2_1_0_1()); 

            }

             after(grammarAccess.getTypeSelectionAccess().getVarVarCrossReference_0_2_1_0()); 

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
    // $ANTLR end "rule__TypeSelection__VarAssignment_0_2_1"


    // $ANTLR start "rule__AssertContains__HtmlElementAssignment_1_0_0"
    // InternalWebDsl.g:3986:1: rule__AssertContains__HtmlElementAssignment_1_0_0 : ( ruleHtmlElement ) ;
    public final void rule__AssertContains__HtmlElementAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3990:1: ( ( ruleHtmlElement ) )
            // InternalWebDsl.g:3991:2: ( ruleHtmlElement )
            {
            // InternalWebDsl.g:3991:2: ( ruleHtmlElement )
            // InternalWebDsl.g:3992:3: ruleHtmlElement
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
    // InternalWebDsl.g:4001:1: rule__AssertContains__AttributeAssignment_1_0_1 : ( ruleAttribute ) ;
    public final void rule__AssertContains__AttributeAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:4005:1: ( ( ruleAttribute ) )
            // InternalWebDsl.g:4006:2: ( ruleAttribute )
            {
            // InternalWebDsl.g:4006:2: ( ruleAttribute )
            // InternalWebDsl.g:4007:3: ruleAttribute
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


    // $ANTLR start "rule__AssertContains__TextAssignment_1_1"
    // InternalWebDsl.g:4016:1: rule__AssertContains__TextAssignment_1_1 : ( ( 'TEXT' ) ) ;
    public final void rule__AssertContains__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:4020:1: ( ( ( 'TEXT' ) ) )
            // InternalWebDsl.g:4021:2: ( ( 'TEXT' ) )
            {
            // InternalWebDsl.g:4021:2: ( ( 'TEXT' ) )
            // InternalWebDsl.g:4022:3: ( 'TEXT' )
            {
             before(grammarAccess.getAssertContainsAccess().getTextTEXTKeyword_1_1_0()); 
            // InternalWebDsl.g:4023:3: ( 'TEXT' )
            // InternalWebDsl.g:4024:4: 'TEXT'
            {
             before(grammarAccess.getAssertContainsAccess().getTextTEXTKeyword_1_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getAssertContainsAccess().getTextTEXTKeyword_1_1_0()); 

            }

             after(grammarAccess.getAssertContainsAccess().getTextTEXTKeyword_1_1_0()); 

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
    // $ANTLR end "rule__AssertContains__TextAssignment_1_1"


    // $ANTLR start "rule__AssertContains__ValueAssignment_3"
    // InternalWebDsl.g:4035:1: rule__AssertContains__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AssertContains__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:4039:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:4040:2: ( RULE_STRING )
            {
            // InternalWebDsl.g:4040:2: ( RULE_STRING )
            // InternalWebDsl.g:4041:3: RULE_STRING
            {
             before(grammarAccess.getAssertContainsAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssertContainsAccess().getValueSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__AssertContains__ValueAssignment_3"


    // $ANTLR start "rule__AssertEquals__C1Assignment_0"
    // InternalWebDsl.g:4050:1: rule__AssertEquals__C1Assignment_0 : ( ruleComparable ) ;
    public final void rule__AssertEquals__C1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:4054:1: ( ( ruleComparable ) )
            // InternalWebDsl.g:4055:2: ( ruleComparable )
            {
            // InternalWebDsl.g:4055:2: ( ruleComparable )
            // InternalWebDsl.g:4056:3: ruleComparable
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
    // InternalWebDsl.g:4065:1: rule__AssertEquals__C2Assignment_2 : ( ruleComparable ) ;
    public final void rule__AssertEquals__C2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:4069:1: ( ( ruleComparable ) )
            // InternalWebDsl.g:4070:2: ( ruleComparable )
            {
            // InternalWebDsl.g:4070:2: ( ruleComparable )
            // InternalWebDsl.g:4071:3: ruleComparable
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


    // $ANTLR start "rule__Comparable__VarAssignment_0_1"
    // InternalWebDsl.g:4080:1: rule__Comparable__VarAssignment_0_1 : ( ruleVar ) ;
    public final void rule__Comparable__VarAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:4084:1: ( ( ruleVar ) )
            // InternalWebDsl.g:4085:2: ( ruleVar )
            {
            // InternalWebDsl.g:4085:2: ( ruleVar )
            // InternalWebDsl.g:4086:3: ruleVar
            {
             before(grammarAccess.getComparableAccess().getVarVarParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getComparableAccess().getVarVarParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Comparable__VarAssignment_0_1"


    // $ANTLR start "rule__Comparable__HtmlElementAssignment_1_1"
    // InternalWebDsl.g:4095:1: rule__Comparable__HtmlElementAssignment_1_1 : ( ruleHtmlElement ) ;
    public final void rule__Comparable__HtmlElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:4099:1: ( ( ruleHtmlElement ) )
            // InternalWebDsl.g:4100:2: ( ruleHtmlElement )
            {
            // InternalWebDsl.g:4100:2: ( ruleHtmlElement )
            // InternalWebDsl.g:4101:3: ruleHtmlElement
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
    // InternalWebDsl.g:4110:1: rule__Comparable__AttributeAssignment_1_2 : ( ruleAttribute ) ;
    public final void rule__Comparable__AttributeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:4114:1: ( ( ruleAttribute ) )
            // InternalWebDsl.g:4115:2: ( ruleAttribute )
            {
            // InternalWebDsl.g:4115:2: ( ruleAttribute )
            // InternalWebDsl.g:4116:3: ruleAttribute
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0800A2001800F800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0800A0001800F802L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000003FC03C0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0C1202001800F800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0C1200001800F802L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x081202001800F800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x081200001800F802L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x081202001803F800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x081200001803F802L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x081302001800F800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x081300001800F802L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0042020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0042000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008003FC0000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000003800B800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000003FC0000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0280080000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x100000003800B800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000000000L});

}