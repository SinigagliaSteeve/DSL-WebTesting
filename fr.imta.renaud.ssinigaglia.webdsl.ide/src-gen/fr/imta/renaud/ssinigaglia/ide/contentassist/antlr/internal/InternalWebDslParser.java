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


    // $ANTLR start "rule__CheckboxSelection__ActionAlternatives_3_0"
    // InternalWebDsl.g:785:1: rule__CheckboxSelection__ActionAlternatives_3_0 : ( ( 'check' ) | ( 'uncheck' ) );
    public final void rule__CheckboxSelection__ActionAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:789:1: ( ( 'check' ) | ( 'uncheck' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalWebDsl.g:790:2: ( 'check' )
                    {
                    // InternalWebDsl.g:790:2: ( 'check' )
                    // InternalWebDsl.g:791:3: 'check'
                    {
                     before(grammarAccess.getCheckboxSelectionAccess().getActionCheckKeyword_3_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCheckboxSelectionAccess().getActionCheckKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:796:2: ( 'uncheck' )
                    {
                    // InternalWebDsl.g:796:2: ( 'uncheck' )
                    // InternalWebDsl.g:797:3: 'uncheck'
                    {
                     before(grammarAccess.getCheckboxSelectionAccess().getActionUncheckKeyword_3_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCheckboxSelectionAccess().getActionUncheckKeyword_3_0_1()); 

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
    // $ANTLR end "rule__CheckboxSelection__ActionAlternatives_3_0"


    // $ANTLR start "rule__ComboboxSelection__Alternatives_3"
    // InternalWebDsl.g:806:1: rule__ComboboxSelection__Alternatives_3 : ( ( ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 ) ) | ( ( rule__ComboboxSelection__Group_3_1__0 ) ) );
    public final void rule__ComboboxSelection__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:810:1: ( ( ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 ) ) | ( ( rule__ComboboxSelection__Group_3_1__0 ) ) )
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
                    // InternalWebDsl.g:811:2: ( ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 ) )
                    {
                    // InternalWebDsl.g:811:2: ( ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 ) )
                    // InternalWebDsl.g:812:3: ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 )
                    {
                     before(grammarAccess.getComboboxSelectionAccess().getGeneralActionsAssignment_3_0()); 
                    // InternalWebDsl.g:813:3: ( rule__ComboboxSelection__GeneralActionsAssignment_3_0 )
                    // InternalWebDsl.g:813:4: rule__ComboboxSelection__GeneralActionsAssignment_3_0
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
                    // InternalWebDsl.g:817:2: ( ( rule__ComboboxSelection__Group_3_1__0 ) )
                    {
                    // InternalWebDsl.g:817:2: ( ( rule__ComboboxSelection__Group_3_1__0 ) )
                    // InternalWebDsl.g:818:3: ( rule__ComboboxSelection__Group_3_1__0 )
                    {
                     before(grammarAccess.getComboboxSelectionAccess().getGroup_3_1()); 
                    // InternalWebDsl.g:819:3: ( rule__ComboboxSelection__Group_3_1__0 )
                    // InternalWebDsl.g:819:4: rule__ComboboxSelection__Group_3_1__0
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
    // InternalWebDsl.g:827:1: rule__PageSelection__Alternatives_2 : ( ( ( rule__PageSelection__StoreActionsAssignment_2_0 ) ) | ( ( rule__PageSelection__AssertionsAssignment_2_1 ) ) );
    public final void rule__PageSelection__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:831:1: ( ( ( rule__PageSelection__StoreActionsAssignment_2_0 ) ) | ( ( rule__PageSelection__AssertionsAssignment_2_1 ) ) )
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
                    // InternalWebDsl.g:832:2: ( ( rule__PageSelection__StoreActionsAssignment_2_0 ) )
                    {
                    // InternalWebDsl.g:832:2: ( ( rule__PageSelection__StoreActionsAssignment_2_0 ) )
                    // InternalWebDsl.g:833:3: ( rule__PageSelection__StoreActionsAssignment_2_0 )
                    {
                     before(grammarAccess.getPageSelectionAccess().getStoreActionsAssignment_2_0()); 
                    // InternalWebDsl.g:834:3: ( rule__PageSelection__StoreActionsAssignment_2_0 )
                    // InternalWebDsl.g:834:4: rule__PageSelection__StoreActionsAssignment_2_0
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
                    // InternalWebDsl.g:838:2: ( ( rule__PageSelection__AssertionsAssignment_2_1 ) )
                    {
                    // InternalWebDsl.g:838:2: ( ( rule__PageSelection__AssertionsAssignment_2_1 ) )
                    // InternalWebDsl.g:839:3: ( rule__PageSelection__AssertionsAssignment_2_1 )
                    {
                     before(grammarAccess.getPageSelectionAccess().getAssertionsAssignment_2_1()); 
                    // InternalWebDsl.g:840:3: ( rule__PageSelection__AssertionsAssignment_2_1 )
                    // InternalWebDsl.g:840:4: rule__PageSelection__AssertionsAssignment_2_1
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
    // InternalWebDsl.g:848:1: rule__GeneralAction__Alternatives : ( ( ruleSetAction ) | ( ruleStoreAction ) | ( ruleSelection ) );
    public final void rule__GeneralAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:852:1: ( ( ruleSetAction ) | ( ruleStoreAction ) | ( ruleSelection ) )
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
                    // InternalWebDsl.g:853:2: ( ruleSetAction )
                    {
                    // InternalWebDsl.g:853:2: ( ruleSetAction )
                    // InternalWebDsl.g:854:3: ruleSetAction
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
                    // InternalWebDsl.g:859:2: ( ruleStoreAction )
                    {
                    // InternalWebDsl.g:859:2: ( ruleStoreAction )
                    // InternalWebDsl.g:860:3: ruleStoreAction
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
                    // InternalWebDsl.g:865:2: ( ruleSelection )
                    {
                    // InternalWebDsl.g:865:2: ( ruleSelection )
                    // InternalWebDsl.g:866:3: ruleSelection
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
    // InternalWebDsl.g:875:1: rule__StoreAction__Alternatives_2 : ( ( ( rule__StoreAction__ValAssignment_2_0 ) ) | ( ( rule__StoreAction__CountAssignment_2_1 ) ) );
    public final void rule__StoreAction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:879:1: ( ( ( rule__StoreAction__ValAssignment_2_0 ) ) | ( ( rule__StoreAction__CountAssignment_2_1 ) ) )
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
                    // InternalWebDsl.g:880:2: ( ( rule__StoreAction__ValAssignment_2_0 ) )
                    {
                    // InternalWebDsl.g:880:2: ( ( rule__StoreAction__ValAssignment_2_0 ) )
                    // InternalWebDsl.g:881:3: ( rule__StoreAction__ValAssignment_2_0 )
                    {
                     before(grammarAccess.getStoreActionAccess().getValAssignment_2_0()); 
                    // InternalWebDsl.g:882:3: ( rule__StoreAction__ValAssignment_2_0 )
                    // InternalWebDsl.g:882:4: rule__StoreAction__ValAssignment_2_0
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
                    // InternalWebDsl.g:886:2: ( ( rule__StoreAction__CountAssignment_2_1 ) )
                    {
                    // InternalWebDsl.g:886:2: ( ( rule__StoreAction__CountAssignment_2_1 ) )
                    // InternalWebDsl.g:887:3: ( rule__StoreAction__CountAssignment_2_1 )
                    {
                     before(grammarAccess.getStoreActionAccess().getCountAssignment_2_1()); 
                    // InternalWebDsl.g:888:3: ( rule__StoreAction__CountAssignment_2_1 )
                    // InternalWebDsl.g:888:4: rule__StoreAction__CountAssignment_2_1
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
    // InternalWebDsl.g:896:1: rule__TypeSelection__Alternatives : ( ( ( rule__TypeSelection__Group_0__0 ) ) | ( 'PARENT' ) | ( 'FIRST' ) | ( 'LAST' ) | ( 'ALL' ) );
    public final void rule__TypeSelection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:900:1: ( ( ( rule__TypeSelection__Group_0__0 ) ) | ( 'PARENT' ) | ( 'FIRST' ) | ( 'LAST' ) | ( 'ALL' ) )
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
                    // InternalWebDsl.g:901:2: ( ( rule__TypeSelection__Group_0__0 ) )
                    {
                    // InternalWebDsl.g:901:2: ( ( rule__TypeSelection__Group_0__0 ) )
                    // InternalWebDsl.g:902:3: ( rule__TypeSelection__Group_0__0 )
                    {
                     before(grammarAccess.getTypeSelectionAccess().getGroup_0()); 
                    // InternalWebDsl.g:903:3: ( rule__TypeSelection__Group_0__0 )
                    // InternalWebDsl.g:903:4: rule__TypeSelection__Group_0__0
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
                    // InternalWebDsl.g:907:2: ( 'PARENT' )
                    {
                    // InternalWebDsl.g:907:2: ( 'PARENT' )
                    // InternalWebDsl.g:908:3: 'PARENT'
                    {
                     before(grammarAccess.getTypeSelectionAccess().getPARENTKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTypeSelectionAccess().getPARENTKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:913:2: ( 'FIRST' )
                    {
                    // InternalWebDsl.g:913:2: ( 'FIRST' )
                    // InternalWebDsl.g:914:3: 'FIRST'
                    {
                     before(grammarAccess.getTypeSelectionAccess().getFIRSTKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTypeSelectionAccess().getFIRSTKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:919:2: ( 'LAST' )
                    {
                    // InternalWebDsl.g:919:2: ( 'LAST' )
                    // InternalWebDsl.g:920:3: 'LAST'
                    {
                     before(grammarAccess.getTypeSelectionAccess().getLASTKeyword_3()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getTypeSelectionAccess().getLASTKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:925:2: ( 'ALL' )
                    {
                    // InternalWebDsl.g:925:2: ( 'ALL' )
                    // InternalWebDsl.g:926:3: 'ALL'
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
    // InternalWebDsl.g:935:1: rule__TypeSelection__Alternatives_0_2 : ( ( ( rule__TypeSelection__ValueAssignment_0_2_0 ) ) | ( ( rule__TypeSelection__VarAssignment_0_2_1 ) ) );
    public final void rule__TypeSelection__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:939:1: ( ( ( rule__TypeSelection__ValueAssignment_0_2_0 ) ) | ( ( rule__TypeSelection__VarAssignment_0_2_1 ) ) )
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
                    // InternalWebDsl.g:940:2: ( ( rule__TypeSelection__ValueAssignment_0_2_0 ) )
                    {
                    // InternalWebDsl.g:940:2: ( ( rule__TypeSelection__ValueAssignment_0_2_0 ) )
                    // InternalWebDsl.g:941:3: ( rule__TypeSelection__ValueAssignment_0_2_0 )
                    {
                     before(grammarAccess.getTypeSelectionAccess().getValueAssignment_0_2_0()); 
                    // InternalWebDsl.g:942:3: ( rule__TypeSelection__ValueAssignment_0_2_0 )
                    // InternalWebDsl.g:942:4: rule__TypeSelection__ValueAssignment_0_2_0
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
                    // InternalWebDsl.g:946:2: ( ( rule__TypeSelection__VarAssignment_0_2_1 ) )
                    {
                    // InternalWebDsl.g:946:2: ( ( rule__TypeSelection__VarAssignment_0_2_1 ) )
                    // InternalWebDsl.g:947:3: ( rule__TypeSelection__VarAssignment_0_2_1 )
                    {
                     before(grammarAccess.getTypeSelectionAccess().getVarAssignment_0_2_1()); 
                    // InternalWebDsl.g:948:3: ( rule__TypeSelection__VarAssignment_0_2_1 )
                    // InternalWebDsl.g:948:4: rule__TypeSelection__VarAssignment_0_2_1
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
    // InternalWebDsl.g:956:1: rule__Assert__Alternatives_1 : ( ( ruleAssertContains ) | ( ruleAssertEquals ) );
    public final void rule__Assert__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:960:1: ( ( ruleAssertContains ) | ( ruleAssertEquals ) )
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
                    // InternalWebDsl.g:961:2: ( ruleAssertContains )
                    {
                    // InternalWebDsl.g:961:2: ( ruleAssertContains )
                    // InternalWebDsl.g:962:3: ruleAssertContains
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
                    // InternalWebDsl.g:967:2: ( ruleAssertEquals )
                    {
                    // InternalWebDsl.g:967:2: ( ruleAssertEquals )
                    // InternalWebDsl.g:968:3: ruleAssertEquals
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
    // InternalWebDsl.g:977:1: rule__AssertContains__Alternatives_1 : ( ( ( rule__AssertContains__Group_1_0__0 ) ) | ( ( rule__AssertContains__TextAssignment_1_1 ) ) );
    public final void rule__AssertContains__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:981:1: ( ( ( rule__AssertContains__Group_1_0__0 ) ) | ( ( rule__AssertContains__TextAssignment_1_1 ) ) )
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
                    // InternalWebDsl.g:982:2: ( ( rule__AssertContains__Group_1_0__0 ) )
                    {
                    // InternalWebDsl.g:982:2: ( ( rule__AssertContains__Group_1_0__0 ) )
                    // InternalWebDsl.g:983:3: ( rule__AssertContains__Group_1_0__0 )
                    {
                     before(grammarAccess.getAssertContainsAccess().getGroup_1_0()); 
                    // InternalWebDsl.g:984:3: ( rule__AssertContains__Group_1_0__0 )
                    // InternalWebDsl.g:984:4: rule__AssertContains__Group_1_0__0
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
                    // InternalWebDsl.g:988:2: ( ( rule__AssertContains__TextAssignment_1_1 ) )
                    {
                    // InternalWebDsl.g:988:2: ( ( rule__AssertContains__TextAssignment_1_1 ) )
                    // InternalWebDsl.g:989:3: ( rule__AssertContains__TextAssignment_1_1 )
                    {
                     before(grammarAccess.getAssertContainsAccess().getTextAssignment_1_1()); 
                    // InternalWebDsl.g:990:3: ( rule__AssertContains__TextAssignment_1_1 )
                    // InternalWebDsl.g:990:4: rule__AssertContains__TextAssignment_1_1
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
    // InternalWebDsl.g:998:1: rule__Comparable__Alternatives : ( ( ( rule__Comparable__Group_0__0 ) ) | ( ( rule__Comparable__Group_1__0 ) ) | ( RULE_STRING ) );
    public final void rule__Comparable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1002:1: ( ( ( rule__Comparable__Group_0__0 ) ) | ( ( rule__Comparable__Group_1__0 ) ) | ( RULE_STRING ) )
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
                    // InternalWebDsl.g:1003:2: ( ( rule__Comparable__Group_0__0 ) )
                    {
                    // InternalWebDsl.g:1003:2: ( ( rule__Comparable__Group_0__0 ) )
                    // InternalWebDsl.g:1004:3: ( rule__Comparable__Group_0__0 )
                    {
                     before(grammarAccess.getComparableAccess().getGroup_0()); 
                    // InternalWebDsl.g:1005:3: ( rule__Comparable__Group_0__0 )
                    // InternalWebDsl.g:1005:4: rule__Comparable__Group_0__0
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
                    // InternalWebDsl.g:1009:2: ( ( rule__Comparable__Group_1__0 ) )
                    {
                    // InternalWebDsl.g:1009:2: ( ( rule__Comparable__Group_1__0 ) )
                    // InternalWebDsl.g:1010:3: ( rule__Comparable__Group_1__0 )
                    {
                     before(grammarAccess.getComparableAccess().getGroup_1()); 
                    // InternalWebDsl.g:1011:3: ( rule__Comparable__Group_1__0 )
                    // InternalWebDsl.g:1011:4: rule__Comparable__Group_1__0
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
                    // InternalWebDsl.g:1015:2: ( RULE_STRING )
                    {
                    // InternalWebDsl.g:1015:2: ( RULE_STRING )
                    // InternalWebDsl.g:1016:3: RULE_STRING
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
    // InternalWebDsl.g:1025:1: rule__Browser__Alternatives : ( ( ( 'chrome' ) ) | ( ( 'firefox' ) ) | ( ( 'safari' ) ) | ( ( 'edge' ) ) | ( ( 'ie' ) ) );
    public final void rule__Browser__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1029:1: ( ( ( 'chrome' ) ) | ( ( 'firefox' ) ) | ( ( 'safari' ) ) | ( ( 'edge' ) ) | ( ( 'ie' ) ) )
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
                    // InternalWebDsl.g:1030:2: ( ( 'chrome' ) )
                    {
                    // InternalWebDsl.g:1030:2: ( ( 'chrome' ) )
                    // InternalWebDsl.g:1031:3: ( 'chrome' )
                    {
                     before(grammarAccess.getBrowserAccess().getCHROMEEnumLiteralDeclaration_0()); 
                    // InternalWebDsl.g:1032:3: ( 'chrome' )
                    // InternalWebDsl.g:1032:4: 'chrome'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getCHROMEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1036:2: ( ( 'firefox' ) )
                    {
                    // InternalWebDsl.g:1036:2: ( ( 'firefox' ) )
                    // InternalWebDsl.g:1037:3: ( 'firefox' )
                    {
                     before(grammarAccess.getBrowserAccess().getFIREFOXEnumLiteralDeclaration_1()); 
                    // InternalWebDsl.g:1038:3: ( 'firefox' )
                    // InternalWebDsl.g:1038:4: 'firefox'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getFIREFOXEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1042:2: ( ( 'safari' ) )
                    {
                    // InternalWebDsl.g:1042:2: ( ( 'safari' ) )
                    // InternalWebDsl.g:1043:3: ( 'safari' )
                    {
                     before(grammarAccess.getBrowserAccess().getSAFARIEnumLiteralDeclaration_2()); 
                    // InternalWebDsl.g:1044:3: ( 'safari' )
                    // InternalWebDsl.g:1044:4: 'safari'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getSAFARIEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1048:2: ( ( 'edge' ) )
                    {
                    // InternalWebDsl.g:1048:2: ( ( 'edge' ) )
                    // InternalWebDsl.g:1049:3: ( 'edge' )
                    {
                     before(grammarAccess.getBrowserAccess().getEDGEEnumLiteralDeclaration_3()); 
                    // InternalWebDsl.g:1050:3: ( 'edge' )
                    // InternalWebDsl.g:1050:4: 'edge'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrowserAccess().getEDGEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1054:2: ( ( 'ie' ) )
                    {
                    // InternalWebDsl.g:1054:2: ( ( 'ie' ) )
                    // InternalWebDsl.g:1055:3: ( 'ie' )
                    {
                     before(grammarAccess.getBrowserAccess().getIEEnumLiteralDeclaration_4()); 
                    // InternalWebDsl.g:1056:3: ( 'ie' )
                    // InternalWebDsl.g:1056:4: 'ie'
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
    // InternalWebDsl.g:1064:1: rule__HtmlElement__Alternatives : ( ( ( 'LINK' ) ) | ( ( 'BUTTON' ) ) | ( ( 'CHECKBOX' ) ) | ( ( 'COMBO_BOX' ) ) | ( ( 'DIV' ) ) | ( ( 'IMAGE' ) ) | ( ( 'A' ) ) );
    public final void rule__HtmlElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1068:1: ( ( ( 'LINK' ) ) | ( ( 'BUTTON' ) ) | ( ( 'CHECKBOX' ) ) | ( ( 'COMBO_BOX' ) ) | ( ( 'DIV' ) ) | ( ( 'IMAGE' ) ) | ( ( 'A' ) ) )
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
                    // InternalWebDsl.g:1069:2: ( ( 'LINK' ) )
                    {
                    // InternalWebDsl.g:1069:2: ( ( 'LINK' ) )
                    // InternalWebDsl.g:1070:3: ( 'LINK' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getLINKEnumLiteralDeclaration_0()); 
                    // InternalWebDsl.g:1071:3: ( 'LINK' )
                    // InternalWebDsl.g:1071:4: 'LINK'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getLINKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1075:2: ( ( 'BUTTON' ) )
                    {
                    // InternalWebDsl.g:1075:2: ( ( 'BUTTON' ) )
                    // InternalWebDsl.g:1076:3: ( 'BUTTON' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getBUTTONEnumLiteralDeclaration_1()); 
                    // InternalWebDsl.g:1077:3: ( 'BUTTON' )
                    // InternalWebDsl.g:1077:4: 'BUTTON'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getBUTTONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1081:2: ( ( 'CHECKBOX' ) )
                    {
                    // InternalWebDsl.g:1081:2: ( ( 'CHECKBOX' ) )
                    // InternalWebDsl.g:1082:3: ( 'CHECKBOX' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getCHECKBOXEnumLiteralDeclaration_2()); 
                    // InternalWebDsl.g:1083:3: ( 'CHECKBOX' )
                    // InternalWebDsl.g:1083:4: 'CHECKBOX'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getCHECKBOXEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1087:2: ( ( 'COMBO_BOX' ) )
                    {
                    // InternalWebDsl.g:1087:2: ( ( 'COMBO_BOX' ) )
                    // InternalWebDsl.g:1088:3: ( 'COMBO_BOX' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getCOMBOBOXEnumLiteralDeclaration_3()); 
                    // InternalWebDsl.g:1089:3: ( 'COMBO_BOX' )
                    // InternalWebDsl.g:1089:4: 'COMBO_BOX'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getCOMBOBOXEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1093:2: ( ( 'DIV' ) )
                    {
                    // InternalWebDsl.g:1093:2: ( ( 'DIV' ) )
                    // InternalWebDsl.g:1094:3: ( 'DIV' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getDIVEnumLiteralDeclaration_4()); 
                    // InternalWebDsl.g:1095:3: ( 'DIV' )
                    // InternalWebDsl.g:1095:4: 'DIV'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getDIVEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWebDsl.g:1099:2: ( ( 'IMAGE' ) )
                    {
                    // InternalWebDsl.g:1099:2: ( ( 'IMAGE' ) )
                    // InternalWebDsl.g:1100:3: ( 'IMAGE' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getIMAGEEnumLiteralDeclaration_5()); 
                    // InternalWebDsl.g:1101:3: ( 'IMAGE' )
                    // InternalWebDsl.g:1101:4: 'IMAGE'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getHtmlElementAccess().getIMAGEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalWebDsl.g:1105:2: ( ( 'A' ) )
                    {
                    // InternalWebDsl.g:1105:2: ( ( 'A' ) )
                    // InternalWebDsl.g:1106:3: ( 'A' )
                    {
                     before(grammarAccess.getHtmlElementAccess().getAEnumLiteralDeclaration_6()); 
                    // InternalWebDsl.g:1107:3: ( 'A' )
                    // InternalWebDsl.g:1107:4: 'A'
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
    // InternalWebDsl.g:1115:1: rule__Attribute__Alternatives : ( ( ( 'LABEL' ) ) | ( ( 'ID' ) ) | ( ( 'CLASS' ) ) | ( ( 'ALT' ) ) | ( ( 'VALUE' ) ) | ( ( 'HREF' ) ) | ( ( 'TITLE' ) ) | ( ( 'NAME' ) ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1119:1: ( ( ( 'LABEL' ) ) | ( ( 'ID' ) ) | ( ( 'CLASS' ) ) | ( ( 'ALT' ) ) | ( ( 'VALUE' ) ) | ( ( 'HREF' ) ) | ( ( 'TITLE' ) ) | ( ( 'NAME' ) ) )
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
                    // InternalWebDsl.g:1120:2: ( ( 'LABEL' ) )
                    {
                    // InternalWebDsl.g:1120:2: ( ( 'LABEL' ) )
                    // InternalWebDsl.g:1121:3: ( 'LABEL' )
                    {
                     before(grammarAccess.getAttributeAccess().getLABELEnumLiteralDeclaration_0()); 
                    // InternalWebDsl.g:1122:3: ( 'LABEL' )
                    // InternalWebDsl.g:1122:4: 'LABEL'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getLABELEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1126:2: ( ( 'ID' ) )
                    {
                    // InternalWebDsl.g:1126:2: ( ( 'ID' ) )
                    // InternalWebDsl.g:1127:3: ( 'ID' )
                    {
                     before(grammarAccess.getAttributeAccess().getIDEnumLiteralDeclaration_1()); 
                    // InternalWebDsl.g:1128:3: ( 'ID' )
                    // InternalWebDsl.g:1128:4: 'ID'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getIDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1132:2: ( ( 'CLASS' ) )
                    {
                    // InternalWebDsl.g:1132:2: ( ( 'CLASS' ) )
                    // InternalWebDsl.g:1133:3: ( 'CLASS' )
                    {
                     before(grammarAccess.getAttributeAccess().getCLASSEnumLiteralDeclaration_2()); 
                    // InternalWebDsl.g:1134:3: ( 'CLASS' )
                    // InternalWebDsl.g:1134:4: 'CLASS'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getCLASSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1138:2: ( ( 'ALT' ) )
                    {
                    // InternalWebDsl.g:1138:2: ( ( 'ALT' ) )
                    // InternalWebDsl.g:1139:3: ( 'ALT' )
                    {
                     before(grammarAccess.getAttributeAccess().getALTEnumLiteralDeclaration_3()); 
                    // InternalWebDsl.g:1140:3: ( 'ALT' )
                    // InternalWebDsl.g:1140:4: 'ALT'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getALTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1144:2: ( ( 'VALUE' ) )
                    {
                    // InternalWebDsl.g:1144:2: ( ( 'VALUE' ) )
                    // InternalWebDsl.g:1145:3: ( 'VALUE' )
                    {
                     before(grammarAccess.getAttributeAccess().getVALUEEnumLiteralDeclaration_4()); 
                    // InternalWebDsl.g:1146:3: ( 'VALUE' )
                    // InternalWebDsl.g:1146:4: 'VALUE'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getVALUEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalWebDsl.g:1150:2: ( ( 'HREF' ) )
                    {
                    // InternalWebDsl.g:1150:2: ( ( 'HREF' ) )
                    // InternalWebDsl.g:1151:3: ( 'HREF' )
                    {
                     before(grammarAccess.getAttributeAccess().getHREFEnumLiteralDeclaration_5()); 
                    // InternalWebDsl.g:1152:3: ( 'HREF' )
                    // InternalWebDsl.g:1152:4: 'HREF'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getHREFEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalWebDsl.g:1156:2: ( ( 'TITLE' ) )
                    {
                    // InternalWebDsl.g:1156:2: ( ( 'TITLE' ) )
                    // InternalWebDsl.g:1157:3: ( 'TITLE' )
                    {
                     before(grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_6()); 
                    // InternalWebDsl.g:1158:3: ( 'TITLE' )
                    // InternalWebDsl.g:1158:4: 'TITLE'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalWebDsl.g:1162:2: ( ( 'NAME' ) )
                    {
                    // InternalWebDsl.g:1162:2: ( ( 'NAME' ) )
                    // InternalWebDsl.g:1163:3: ( 'NAME' )
                    {
                     before(grammarAccess.getAttributeAccess().getNAMEEnumLiteralDeclaration_7()); 
                    // InternalWebDsl.g:1164:3: ( 'NAME' )
                    // InternalWebDsl.g:1164:4: 'NAME'
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
    // InternalWebDsl.g:1172:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1176:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalWebDsl.g:1177:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalWebDsl.g:1184:1: rule__Program__Group__0__Impl : ( ( rule__Program__ProceduresAssignment_0 )* ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1188:1: ( ( ( rule__Program__ProceduresAssignment_0 )* ) )
            // InternalWebDsl.g:1189:1: ( ( rule__Program__ProceduresAssignment_0 )* )
            {
            // InternalWebDsl.g:1189:1: ( ( rule__Program__ProceduresAssignment_0 )* )
            // InternalWebDsl.g:1190:2: ( rule__Program__ProceduresAssignment_0 )*
            {
             before(grammarAccess.getProgramAccess().getProceduresAssignment_0()); 
            // InternalWebDsl.g:1191:2: ( rule__Program__ProceduresAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==42) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalWebDsl.g:1191:3: rule__Program__ProceduresAssignment_0
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
    // InternalWebDsl.g:1199:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1203:1: ( rule__Program__Group__1__Impl )
            // InternalWebDsl.g:1204:2: rule__Program__Group__1__Impl
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
    // InternalWebDsl.g:1210:1: rule__Program__Group__1__Impl : ( ( rule__Program__CoresAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1214:1: ( ( ( rule__Program__CoresAssignment_1 )* ) )
            // InternalWebDsl.g:1215:1: ( ( rule__Program__CoresAssignment_1 )* )
            {
            // InternalWebDsl.g:1215:1: ( ( rule__Program__CoresAssignment_1 )* )
            // InternalWebDsl.g:1216:2: ( rule__Program__CoresAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getCoresAssignment_1()); 
            // InternalWebDsl.g:1217:2: ( rule__Program__CoresAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalWebDsl.g:1217:3: rule__Program__CoresAssignment_1
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
    // InternalWebDsl.g:1226:1: rule__Core__Group__0 : rule__Core__Group__0__Impl rule__Core__Group__1 ;
    public final void rule__Core__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1230:1: ( rule__Core__Group__0__Impl rule__Core__Group__1 )
            // InternalWebDsl.g:1231:2: rule__Core__Group__0__Impl rule__Core__Group__1
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
    // InternalWebDsl.g:1238:1: rule__Core__Group__0__Impl : ( 'test' ) ;
    public final void rule__Core__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1242:1: ( ( 'test' ) )
            // InternalWebDsl.g:1243:1: ( 'test' )
            {
            // InternalWebDsl.g:1243:1: ( 'test' )
            // InternalWebDsl.g:1244:2: 'test'
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
    // InternalWebDsl.g:1253:1: rule__Core__Group__1 : rule__Core__Group__1__Impl rule__Core__Group__2 ;
    public final void rule__Core__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1257:1: ( rule__Core__Group__1__Impl rule__Core__Group__2 )
            // InternalWebDsl.g:1258:2: rule__Core__Group__1__Impl rule__Core__Group__2
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
    // InternalWebDsl.g:1265:1: rule__Core__Group__1__Impl : ( ( rule__Core__NameAssignment_1 ) ) ;
    public final void rule__Core__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1269:1: ( ( ( rule__Core__NameAssignment_1 ) ) )
            // InternalWebDsl.g:1270:1: ( ( rule__Core__NameAssignment_1 ) )
            {
            // InternalWebDsl.g:1270:1: ( ( rule__Core__NameAssignment_1 ) )
            // InternalWebDsl.g:1271:2: ( rule__Core__NameAssignment_1 )
            {
             before(grammarAccess.getCoreAccess().getNameAssignment_1()); 
            // InternalWebDsl.g:1272:2: ( rule__Core__NameAssignment_1 )
            // InternalWebDsl.g:1272:3: rule__Core__NameAssignment_1
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
    // InternalWebDsl.g:1280:1: rule__Core__Group__2 : rule__Core__Group__2__Impl rule__Core__Group__3 ;
    public final void rule__Core__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1284:1: ( rule__Core__Group__2__Impl rule__Core__Group__3 )
            // InternalWebDsl.g:1285:2: rule__Core__Group__2__Impl rule__Core__Group__3
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
    // InternalWebDsl.g:1292:1: rule__Core__Group__2__Impl : ( '{' ) ;
    public final void rule__Core__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1296:1: ( ( '{' ) )
            // InternalWebDsl.g:1297:1: ( '{' )
            {
            // InternalWebDsl.g:1297:1: ( '{' )
            // InternalWebDsl.g:1298:2: '{'
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
    // InternalWebDsl.g:1307:1: rule__Core__Group__3 : rule__Core__Group__3__Impl rule__Core__Group__4 ;
    public final void rule__Core__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1311:1: ( rule__Core__Group__3__Impl rule__Core__Group__4 )
            // InternalWebDsl.g:1312:2: rule__Core__Group__3__Impl rule__Core__Group__4
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
    // InternalWebDsl.g:1319:1: rule__Core__Group__3__Impl : ( 'open_browser' ) ;
    public final void rule__Core__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1323:1: ( ( 'open_browser' ) )
            // InternalWebDsl.g:1324:1: ( 'open_browser' )
            {
            // InternalWebDsl.g:1324:1: ( 'open_browser' )
            // InternalWebDsl.g:1325:2: 'open_browser'
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
    // InternalWebDsl.g:1334:1: rule__Core__Group__4 : rule__Core__Group__4__Impl rule__Core__Group__5 ;
    public final void rule__Core__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1338:1: ( rule__Core__Group__4__Impl rule__Core__Group__5 )
            // InternalWebDsl.g:1339:2: rule__Core__Group__4__Impl rule__Core__Group__5
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
    // InternalWebDsl.g:1346:1: rule__Core__Group__4__Impl : ( ( rule__Core__BrowserAssignment_4 ) ) ;
    public final void rule__Core__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1350:1: ( ( ( rule__Core__BrowserAssignment_4 ) ) )
            // InternalWebDsl.g:1351:1: ( ( rule__Core__BrowserAssignment_4 ) )
            {
            // InternalWebDsl.g:1351:1: ( ( rule__Core__BrowserAssignment_4 ) )
            // InternalWebDsl.g:1352:2: ( rule__Core__BrowserAssignment_4 )
            {
             before(grammarAccess.getCoreAccess().getBrowserAssignment_4()); 
            // InternalWebDsl.g:1353:2: ( rule__Core__BrowserAssignment_4 )
            // InternalWebDsl.g:1353:3: rule__Core__BrowserAssignment_4
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
    // InternalWebDsl.g:1361:1: rule__Core__Group__5 : rule__Core__Group__5__Impl rule__Core__Group__6 ;
    public final void rule__Core__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1365:1: ( rule__Core__Group__5__Impl rule__Core__Group__6 )
            // InternalWebDsl.g:1366:2: rule__Core__Group__5__Impl rule__Core__Group__6
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
    // InternalWebDsl.g:1373:1: rule__Core__Group__5__Impl : ( ( rule__Core__ActionsAssignment_5 )* ) ;
    public final void rule__Core__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1377:1: ( ( ( rule__Core__ActionsAssignment_5 )* ) )
            // InternalWebDsl.g:1378:1: ( ( rule__Core__ActionsAssignment_5 )* )
            {
            // InternalWebDsl.g:1378:1: ( ( rule__Core__ActionsAssignment_5 )* )
            // InternalWebDsl.g:1379:2: ( rule__Core__ActionsAssignment_5 )*
            {
             before(grammarAccess.getCoreAccess().getActionsAssignment_5()); 
            // InternalWebDsl.g:1380:2: ( rule__Core__ActionsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=11 && LA21_0<=15)||(LA21_0>=27 && LA21_0<=28)||LA21_0==45||LA21_0==47||LA21_0==59) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalWebDsl.g:1380:3: rule__Core__ActionsAssignment_5
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
    // InternalWebDsl.g:1388:1: rule__Core__Group__6 : rule__Core__Group__6__Impl ;
    public final void rule__Core__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1392:1: ( rule__Core__Group__6__Impl )
            // InternalWebDsl.g:1393:2: rule__Core__Group__6__Impl
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
    // InternalWebDsl.g:1399:1: rule__Core__Group__6__Impl : ( '}' ) ;
    public final void rule__Core__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1403:1: ( ( '}' ) )
            // InternalWebDsl.g:1404:1: ( '}' )
            {
            // InternalWebDsl.g:1404:1: ( '}' )
            // InternalWebDsl.g:1405:2: '}'
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
    // InternalWebDsl.g:1415:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1419:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // InternalWebDsl.g:1420:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
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
    // InternalWebDsl.g:1427:1: rule__Procedure__Group__0__Impl : ( 'PROCEDURE' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1431:1: ( ( 'PROCEDURE' ) )
            // InternalWebDsl.g:1432:1: ( 'PROCEDURE' )
            {
            // InternalWebDsl.g:1432:1: ( 'PROCEDURE' )
            // InternalWebDsl.g:1433:2: 'PROCEDURE'
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
    // InternalWebDsl.g:1442:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1446:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // InternalWebDsl.g:1447:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
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
    // InternalWebDsl.g:1454:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1458:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // InternalWebDsl.g:1459:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // InternalWebDsl.g:1459:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // InternalWebDsl.g:1460:2: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // InternalWebDsl.g:1461:2: ( rule__Procedure__NameAssignment_1 )
            // InternalWebDsl.g:1461:3: rule__Procedure__NameAssignment_1
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
    // InternalWebDsl.g:1469:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl rule__Procedure__Group__3 ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1473:1: ( rule__Procedure__Group__2__Impl rule__Procedure__Group__3 )
            // InternalWebDsl.g:1474:2: rule__Procedure__Group__2__Impl rule__Procedure__Group__3
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
    // InternalWebDsl.g:1481:1: rule__Procedure__Group__2__Impl : ( '(' ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1485:1: ( ( '(' ) )
            // InternalWebDsl.g:1486:1: ( '(' )
            {
            // InternalWebDsl.g:1486:1: ( '(' )
            // InternalWebDsl.g:1487:2: '('
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
    // InternalWebDsl.g:1496:1: rule__Procedure__Group__3 : rule__Procedure__Group__3__Impl rule__Procedure__Group__4 ;
    public final void rule__Procedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1500:1: ( rule__Procedure__Group__3__Impl rule__Procedure__Group__4 )
            // InternalWebDsl.g:1501:2: rule__Procedure__Group__3__Impl rule__Procedure__Group__4
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
    // InternalWebDsl.g:1508:1: rule__Procedure__Group__3__Impl : ( ( rule__Procedure__VarAssignment_3 ) ) ;
    public final void rule__Procedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1512:1: ( ( ( rule__Procedure__VarAssignment_3 ) ) )
            // InternalWebDsl.g:1513:1: ( ( rule__Procedure__VarAssignment_3 ) )
            {
            // InternalWebDsl.g:1513:1: ( ( rule__Procedure__VarAssignment_3 ) )
            // InternalWebDsl.g:1514:2: ( rule__Procedure__VarAssignment_3 )
            {
             before(grammarAccess.getProcedureAccess().getVarAssignment_3()); 
            // InternalWebDsl.g:1515:2: ( rule__Procedure__VarAssignment_3 )
            // InternalWebDsl.g:1515:3: rule__Procedure__VarAssignment_3
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
    // InternalWebDsl.g:1523:1: rule__Procedure__Group__4 : rule__Procedure__Group__4__Impl rule__Procedure__Group__5 ;
    public final void rule__Procedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1527:1: ( rule__Procedure__Group__4__Impl rule__Procedure__Group__5 )
            // InternalWebDsl.g:1528:2: rule__Procedure__Group__4__Impl rule__Procedure__Group__5
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
    // InternalWebDsl.g:1535:1: rule__Procedure__Group__4__Impl : ( '){' ) ;
    public final void rule__Procedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1539:1: ( ( '){' ) )
            // InternalWebDsl.g:1540:1: ( '){' )
            {
            // InternalWebDsl.g:1540:1: ( '){' )
            // InternalWebDsl.g:1541:2: '){'
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
    // InternalWebDsl.g:1550:1: rule__Procedure__Group__5 : rule__Procedure__Group__5__Impl rule__Procedure__Group__6 ;
    public final void rule__Procedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1554:1: ( rule__Procedure__Group__5__Impl rule__Procedure__Group__6 )
            // InternalWebDsl.g:1555:2: rule__Procedure__Group__5__Impl rule__Procedure__Group__6
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
    // InternalWebDsl.g:1562:1: rule__Procedure__Group__5__Impl : ( ( rule__Procedure__ActionsAssignment_5 )* ) ;
    public final void rule__Procedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1566:1: ( ( ( rule__Procedure__ActionsAssignment_5 )* ) )
            // InternalWebDsl.g:1567:1: ( ( rule__Procedure__ActionsAssignment_5 )* )
            {
            // InternalWebDsl.g:1567:1: ( ( rule__Procedure__ActionsAssignment_5 )* )
            // InternalWebDsl.g:1568:2: ( rule__Procedure__ActionsAssignment_5 )*
            {
             before(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 
            // InternalWebDsl.g:1569:2: ( rule__Procedure__ActionsAssignment_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=11 && LA22_0<=15)||(LA22_0>=27 && LA22_0<=28)||LA22_0==45||LA22_0==47||LA22_0==59) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalWebDsl.g:1569:3: rule__Procedure__ActionsAssignment_5
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
    // InternalWebDsl.g:1577:1: rule__Procedure__Group__6 : rule__Procedure__Group__6__Impl ;
    public final void rule__Procedure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1581:1: ( rule__Procedure__Group__6__Impl )
            // InternalWebDsl.g:1582:2: rule__Procedure__Group__6__Impl
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
    // InternalWebDsl.g:1588:1: rule__Procedure__Group__6__Impl : ( '}' ) ;
    public final void rule__Procedure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1592:1: ( ( '}' ) )
            // InternalWebDsl.g:1593:1: ( '}' )
            {
            // InternalWebDsl.g:1593:1: ( '}' )
            // InternalWebDsl.g:1594:2: '}'
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
    // InternalWebDsl.g:1604:1: rule__CallProcedure__Group__0 : rule__CallProcedure__Group__0__Impl rule__CallProcedure__Group__1 ;
    public final void rule__CallProcedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1608:1: ( rule__CallProcedure__Group__0__Impl rule__CallProcedure__Group__1 )
            // InternalWebDsl.g:1609:2: rule__CallProcedure__Group__0__Impl rule__CallProcedure__Group__1
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
    // InternalWebDsl.g:1616:1: rule__CallProcedure__Group__0__Impl : ( 'PROC:' ) ;
    public final void rule__CallProcedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1620:1: ( ( 'PROC:' ) )
            // InternalWebDsl.g:1621:1: ( 'PROC:' )
            {
            // InternalWebDsl.g:1621:1: ( 'PROC:' )
            // InternalWebDsl.g:1622:2: 'PROC:'
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
    // InternalWebDsl.g:1631:1: rule__CallProcedure__Group__1 : rule__CallProcedure__Group__1__Impl rule__CallProcedure__Group__2 ;
    public final void rule__CallProcedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1635:1: ( rule__CallProcedure__Group__1__Impl rule__CallProcedure__Group__2 )
            // InternalWebDsl.g:1636:2: rule__CallProcedure__Group__1__Impl rule__CallProcedure__Group__2
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
    // InternalWebDsl.g:1643:1: rule__CallProcedure__Group__1__Impl : ( ( rule__CallProcedure__RefAssignment_1 ) ) ;
    public final void rule__CallProcedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1647:1: ( ( ( rule__CallProcedure__RefAssignment_1 ) ) )
            // InternalWebDsl.g:1648:1: ( ( rule__CallProcedure__RefAssignment_1 ) )
            {
            // InternalWebDsl.g:1648:1: ( ( rule__CallProcedure__RefAssignment_1 ) )
            // InternalWebDsl.g:1649:2: ( rule__CallProcedure__RefAssignment_1 )
            {
             before(grammarAccess.getCallProcedureAccess().getRefAssignment_1()); 
            // InternalWebDsl.g:1650:2: ( rule__CallProcedure__RefAssignment_1 )
            // InternalWebDsl.g:1650:3: rule__CallProcedure__RefAssignment_1
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
    // InternalWebDsl.g:1658:1: rule__CallProcedure__Group__2 : rule__CallProcedure__Group__2__Impl rule__CallProcedure__Group__3 ;
    public final void rule__CallProcedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1662:1: ( rule__CallProcedure__Group__2__Impl rule__CallProcedure__Group__3 )
            // InternalWebDsl.g:1663:2: rule__CallProcedure__Group__2__Impl rule__CallProcedure__Group__3
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
    // InternalWebDsl.g:1670:1: rule__CallProcedure__Group__2__Impl : ( '(' ) ;
    public final void rule__CallProcedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1674:1: ( ( '(' ) )
            // InternalWebDsl.g:1675:1: ( '(' )
            {
            // InternalWebDsl.g:1675:1: ( '(' )
            // InternalWebDsl.g:1676:2: '('
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
    // InternalWebDsl.g:1685:1: rule__CallProcedure__Group__3 : rule__CallProcedure__Group__3__Impl rule__CallProcedure__Group__4 ;
    public final void rule__CallProcedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1689:1: ( rule__CallProcedure__Group__3__Impl rule__CallProcedure__Group__4 )
            // InternalWebDsl.g:1690:2: rule__CallProcedure__Group__3__Impl rule__CallProcedure__Group__4
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
    // InternalWebDsl.g:1697:1: rule__CallProcedure__Group__3__Impl : ( ( rule__CallProcedure__ArgAssignment_3 ) ) ;
    public final void rule__CallProcedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1701:1: ( ( ( rule__CallProcedure__ArgAssignment_3 ) ) )
            // InternalWebDsl.g:1702:1: ( ( rule__CallProcedure__ArgAssignment_3 ) )
            {
            // InternalWebDsl.g:1702:1: ( ( rule__CallProcedure__ArgAssignment_3 ) )
            // InternalWebDsl.g:1703:2: ( rule__CallProcedure__ArgAssignment_3 )
            {
             before(grammarAccess.getCallProcedureAccess().getArgAssignment_3()); 
            // InternalWebDsl.g:1704:2: ( rule__CallProcedure__ArgAssignment_3 )
            // InternalWebDsl.g:1704:3: rule__CallProcedure__ArgAssignment_3
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
    // InternalWebDsl.g:1712:1: rule__CallProcedure__Group__4 : rule__CallProcedure__Group__4__Impl ;
    public final void rule__CallProcedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1716:1: ( rule__CallProcedure__Group__4__Impl )
            // InternalWebDsl.g:1717:2: rule__CallProcedure__Group__4__Impl
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
    // InternalWebDsl.g:1723:1: rule__CallProcedure__Group__4__Impl : ( ')' ) ;
    public final void rule__CallProcedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1727:1: ( ( ')' ) )
            // InternalWebDsl.g:1728:1: ( ')' )
            {
            // InternalWebDsl.g:1728:1: ( ')' )
            // InternalWebDsl.g:1729:2: ')'
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
    // InternalWebDsl.g:1739:1: rule__GoAction__Group__0 : rule__GoAction__Group__0__Impl rule__GoAction__Group__1 ;
    public final void rule__GoAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1743:1: ( rule__GoAction__Group__0__Impl rule__GoAction__Group__1 )
            // InternalWebDsl.g:1744:2: rule__GoAction__Group__0__Impl rule__GoAction__Group__1
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
    // InternalWebDsl.g:1751:1: rule__GoAction__Group__0__Impl : ( 'go' ) ;
    public final void rule__GoAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1755:1: ( ( 'go' ) )
            // InternalWebDsl.g:1756:1: ( 'go' )
            {
            // InternalWebDsl.g:1756:1: ( 'go' )
            // InternalWebDsl.g:1757:2: 'go'
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
    // InternalWebDsl.g:1766:1: rule__GoAction__Group__1 : rule__GoAction__Group__1__Impl ;
    public final void rule__GoAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1770:1: ( rule__GoAction__Group__1__Impl )
            // InternalWebDsl.g:1771:2: rule__GoAction__Group__1__Impl
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
    // InternalWebDsl.g:1777:1: rule__GoAction__Group__1__Impl : ( ( rule__GoAction__UrlAssignment_1 ) ) ;
    public final void rule__GoAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1781:1: ( ( ( rule__GoAction__UrlAssignment_1 ) ) )
            // InternalWebDsl.g:1782:1: ( ( rule__GoAction__UrlAssignment_1 ) )
            {
            // InternalWebDsl.g:1782:1: ( ( rule__GoAction__UrlAssignment_1 ) )
            // InternalWebDsl.g:1783:2: ( rule__GoAction__UrlAssignment_1 )
            {
             before(grammarAccess.getGoActionAccess().getUrlAssignment_1()); 
            // InternalWebDsl.g:1784:2: ( rule__GoAction__UrlAssignment_1 )
            // InternalWebDsl.g:1784:3: rule__GoAction__UrlAssignment_1
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
    // InternalWebDsl.g:1793:1: rule__LinkButtonSelection__Group__0 : rule__LinkButtonSelection__Group__0__Impl rule__LinkButtonSelection__Group__1 ;
    public final void rule__LinkButtonSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1797:1: ( rule__LinkButtonSelection__Group__0__Impl rule__LinkButtonSelection__Group__1 )
            // InternalWebDsl.g:1798:2: rule__LinkButtonSelection__Group__0__Impl rule__LinkButtonSelection__Group__1
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
    // InternalWebDsl.g:1805:1: rule__LinkButtonSelection__Group__0__Impl : ( ( rule__LinkButtonSelection__TypeElementAssignment_0 ) ) ;
    public final void rule__LinkButtonSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1809:1: ( ( ( rule__LinkButtonSelection__TypeElementAssignment_0 ) ) )
            // InternalWebDsl.g:1810:1: ( ( rule__LinkButtonSelection__TypeElementAssignment_0 ) )
            {
            // InternalWebDsl.g:1810:1: ( ( rule__LinkButtonSelection__TypeElementAssignment_0 ) )
            // InternalWebDsl.g:1811:2: ( rule__LinkButtonSelection__TypeElementAssignment_0 )
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getTypeElementAssignment_0()); 
            // InternalWebDsl.g:1812:2: ( rule__LinkButtonSelection__TypeElementAssignment_0 )
            // InternalWebDsl.g:1812:3: rule__LinkButtonSelection__TypeElementAssignment_0
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
    // InternalWebDsl.g:1820:1: rule__LinkButtonSelection__Group__1 : rule__LinkButtonSelection__Group__1__Impl rule__LinkButtonSelection__Group__2 ;
    public final void rule__LinkButtonSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1824:1: ( rule__LinkButtonSelection__Group__1__Impl rule__LinkButtonSelection__Group__2 )
            // InternalWebDsl.g:1825:2: rule__LinkButtonSelection__Group__1__Impl rule__LinkButtonSelection__Group__2
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
    // InternalWebDsl.g:1832:1: rule__LinkButtonSelection__Group__1__Impl : ( ( rule__LinkButtonSelection__TypeSelectionAssignment_1 ) ) ;
    public final void rule__LinkButtonSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1836:1: ( ( ( rule__LinkButtonSelection__TypeSelectionAssignment_1 ) ) )
            // InternalWebDsl.g:1837:1: ( ( rule__LinkButtonSelection__TypeSelectionAssignment_1 ) )
            {
            // InternalWebDsl.g:1837:1: ( ( rule__LinkButtonSelection__TypeSelectionAssignment_1 ) )
            // InternalWebDsl.g:1838:2: ( rule__LinkButtonSelection__TypeSelectionAssignment_1 )
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getTypeSelectionAssignment_1()); 
            // InternalWebDsl.g:1839:2: ( rule__LinkButtonSelection__TypeSelectionAssignment_1 )
            // InternalWebDsl.g:1839:3: rule__LinkButtonSelection__TypeSelectionAssignment_1
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
    // InternalWebDsl.g:1847:1: rule__LinkButtonSelection__Group__2 : rule__LinkButtonSelection__Group__2__Impl rule__LinkButtonSelection__Group__3 ;
    public final void rule__LinkButtonSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1851:1: ( rule__LinkButtonSelection__Group__2__Impl rule__LinkButtonSelection__Group__3 )
            // InternalWebDsl.g:1852:2: rule__LinkButtonSelection__Group__2__Impl rule__LinkButtonSelection__Group__3
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
    // InternalWebDsl.g:1859:1: rule__LinkButtonSelection__Group__2__Impl : ( '{' ) ;
    public final void rule__LinkButtonSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1863:1: ( ( '{' ) )
            // InternalWebDsl.g:1864:1: ( '{' )
            {
            // InternalWebDsl.g:1864:1: ( '{' )
            // InternalWebDsl.g:1865:2: '{'
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
    // InternalWebDsl.g:1874:1: rule__LinkButtonSelection__Group__3 : rule__LinkButtonSelection__Group__3__Impl rule__LinkButtonSelection__Group__4 ;
    public final void rule__LinkButtonSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1878:1: ( rule__LinkButtonSelection__Group__3__Impl rule__LinkButtonSelection__Group__4 )
            // InternalWebDsl.g:1879:2: rule__LinkButtonSelection__Group__3__Impl rule__LinkButtonSelection__Group__4
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
    // InternalWebDsl.g:1886:1: rule__LinkButtonSelection__Group__3__Impl : ( ( rule__LinkButtonSelection__Alternatives_3 )* ) ;
    public final void rule__LinkButtonSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1890:1: ( ( ( rule__LinkButtonSelection__Alternatives_3 )* ) )
            // InternalWebDsl.g:1891:1: ( ( rule__LinkButtonSelection__Alternatives_3 )* )
            {
            // InternalWebDsl.g:1891:1: ( ( rule__LinkButtonSelection__Alternatives_3 )* )
            // InternalWebDsl.g:1892:2: ( rule__LinkButtonSelection__Alternatives_3 )*
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getAlternatives_3()); 
            // InternalWebDsl.g:1893:2: ( rule__LinkButtonSelection__Alternatives_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=11 && LA23_0<=15)||(LA23_0>=27 && LA23_0<=28)||LA23_0==49||LA23_0==52||(LA23_0>=58 && LA23_0<=59)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalWebDsl.g:1893:3: rule__LinkButtonSelection__Alternatives_3
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
    // InternalWebDsl.g:1901:1: rule__LinkButtonSelection__Group__4 : rule__LinkButtonSelection__Group__4__Impl ;
    public final void rule__LinkButtonSelection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1905:1: ( rule__LinkButtonSelection__Group__4__Impl )
            // InternalWebDsl.g:1906:2: rule__LinkButtonSelection__Group__4__Impl
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
    // InternalWebDsl.g:1912:1: rule__LinkButtonSelection__Group__4__Impl : ( '}' ) ;
    public final void rule__LinkButtonSelection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1916:1: ( ( '}' ) )
            // InternalWebDsl.g:1917:1: ( '}' )
            {
            // InternalWebDsl.g:1917:1: ( '}' )
            // InternalWebDsl.g:1918:2: '}'
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
    // InternalWebDsl.g:1928:1: rule__GeneralSelection__Group__0 : rule__GeneralSelection__Group__0__Impl rule__GeneralSelection__Group__1 ;
    public final void rule__GeneralSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1932:1: ( rule__GeneralSelection__Group__0__Impl rule__GeneralSelection__Group__1 )
            // InternalWebDsl.g:1933:2: rule__GeneralSelection__Group__0__Impl rule__GeneralSelection__Group__1
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
    // InternalWebDsl.g:1940:1: rule__GeneralSelection__Group__0__Impl : ( ( rule__GeneralSelection__TypeElementAssignment_0 ) ) ;
    public final void rule__GeneralSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1944:1: ( ( ( rule__GeneralSelection__TypeElementAssignment_0 ) ) )
            // InternalWebDsl.g:1945:1: ( ( rule__GeneralSelection__TypeElementAssignment_0 ) )
            {
            // InternalWebDsl.g:1945:1: ( ( rule__GeneralSelection__TypeElementAssignment_0 ) )
            // InternalWebDsl.g:1946:2: ( rule__GeneralSelection__TypeElementAssignment_0 )
            {
             before(grammarAccess.getGeneralSelectionAccess().getTypeElementAssignment_0()); 
            // InternalWebDsl.g:1947:2: ( rule__GeneralSelection__TypeElementAssignment_0 )
            // InternalWebDsl.g:1947:3: rule__GeneralSelection__TypeElementAssignment_0
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
    // InternalWebDsl.g:1955:1: rule__GeneralSelection__Group__1 : rule__GeneralSelection__Group__1__Impl rule__GeneralSelection__Group__2 ;
    public final void rule__GeneralSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1959:1: ( rule__GeneralSelection__Group__1__Impl rule__GeneralSelection__Group__2 )
            // InternalWebDsl.g:1960:2: rule__GeneralSelection__Group__1__Impl rule__GeneralSelection__Group__2
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
    // InternalWebDsl.g:1967:1: rule__GeneralSelection__Group__1__Impl : ( ( rule__GeneralSelection__TypeSelectionAssignment_1 ) ) ;
    public final void rule__GeneralSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1971:1: ( ( ( rule__GeneralSelection__TypeSelectionAssignment_1 ) ) )
            // InternalWebDsl.g:1972:1: ( ( rule__GeneralSelection__TypeSelectionAssignment_1 ) )
            {
            // InternalWebDsl.g:1972:1: ( ( rule__GeneralSelection__TypeSelectionAssignment_1 ) )
            // InternalWebDsl.g:1973:2: ( rule__GeneralSelection__TypeSelectionAssignment_1 )
            {
             before(grammarAccess.getGeneralSelectionAccess().getTypeSelectionAssignment_1()); 
            // InternalWebDsl.g:1974:2: ( rule__GeneralSelection__TypeSelectionAssignment_1 )
            // InternalWebDsl.g:1974:3: rule__GeneralSelection__TypeSelectionAssignment_1
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
    // InternalWebDsl.g:1982:1: rule__GeneralSelection__Group__2 : rule__GeneralSelection__Group__2__Impl rule__GeneralSelection__Group__3 ;
    public final void rule__GeneralSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1986:1: ( rule__GeneralSelection__Group__2__Impl rule__GeneralSelection__Group__3 )
            // InternalWebDsl.g:1987:2: rule__GeneralSelection__Group__2__Impl rule__GeneralSelection__Group__3
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
    // InternalWebDsl.g:1994:1: rule__GeneralSelection__Group__2__Impl : ( '{' ) ;
    public final void rule__GeneralSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:1998:1: ( ( '{' ) )
            // InternalWebDsl.g:1999:1: ( '{' )
            {
            // InternalWebDsl.g:1999:1: ( '{' )
            // InternalWebDsl.g:2000:2: '{'
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
    // InternalWebDsl.g:2009:1: rule__GeneralSelection__Group__3 : rule__GeneralSelection__Group__3__Impl rule__GeneralSelection__Group__4 ;
    public final void rule__GeneralSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2013:1: ( rule__GeneralSelection__Group__3__Impl rule__GeneralSelection__Group__4 )
            // InternalWebDsl.g:2014:2: rule__GeneralSelection__Group__3__Impl rule__GeneralSelection__Group__4
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
    // InternalWebDsl.g:2021:1: rule__GeneralSelection__Group__3__Impl : ( ( rule__GeneralSelection__GeneralActionsAssignment_3 )* ) ;
    public final void rule__GeneralSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2025:1: ( ( ( rule__GeneralSelection__GeneralActionsAssignment_3 )* ) )
            // InternalWebDsl.g:2026:1: ( ( rule__GeneralSelection__GeneralActionsAssignment_3 )* )
            {
            // InternalWebDsl.g:2026:1: ( ( rule__GeneralSelection__GeneralActionsAssignment_3 )* )
            // InternalWebDsl.g:2027:2: ( rule__GeneralSelection__GeneralActionsAssignment_3 )*
            {
             before(grammarAccess.getGeneralSelectionAccess().getGeneralActionsAssignment_3()); 
            // InternalWebDsl.g:2028:2: ( rule__GeneralSelection__GeneralActionsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=11 && LA24_0<=15)||(LA24_0>=27 && LA24_0<=28)||LA24_0==49||LA24_0==52||LA24_0==59) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalWebDsl.g:2028:3: rule__GeneralSelection__GeneralActionsAssignment_3
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
    // InternalWebDsl.g:2036:1: rule__GeneralSelection__Group__4 : rule__GeneralSelection__Group__4__Impl ;
    public final void rule__GeneralSelection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2040:1: ( rule__GeneralSelection__Group__4__Impl )
            // InternalWebDsl.g:2041:2: rule__GeneralSelection__Group__4__Impl
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
    // InternalWebDsl.g:2047:1: rule__GeneralSelection__Group__4__Impl : ( '}' ) ;
    public final void rule__GeneralSelection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2051:1: ( ( '}' ) )
            // InternalWebDsl.g:2052:1: ( '}' )
            {
            // InternalWebDsl.g:2052:1: ( '}' )
            // InternalWebDsl.g:2053:2: '}'
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
    // InternalWebDsl.g:2063:1: rule__CheckboxSelection__Group__0 : rule__CheckboxSelection__Group__0__Impl rule__CheckboxSelection__Group__1 ;
    public final void rule__CheckboxSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2067:1: ( rule__CheckboxSelection__Group__0__Impl rule__CheckboxSelection__Group__1 )
            // InternalWebDsl.g:2068:2: rule__CheckboxSelection__Group__0__Impl rule__CheckboxSelection__Group__1
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
    // InternalWebDsl.g:2075:1: rule__CheckboxSelection__Group__0__Impl : ( ( rule__CheckboxSelection__TypeElementAssignment_0 ) ) ;
    public final void rule__CheckboxSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2079:1: ( ( ( rule__CheckboxSelection__TypeElementAssignment_0 ) ) )
            // InternalWebDsl.g:2080:1: ( ( rule__CheckboxSelection__TypeElementAssignment_0 ) )
            {
            // InternalWebDsl.g:2080:1: ( ( rule__CheckboxSelection__TypeElementAssignment_0 ) )
            // InternalWebDsl.g:2081:2: ( rule__CheckboxSelection__TypeElementAssignment_0 )
            {
             before(grammarAccess.getCheckboxSelectionAccess().getTypeElementAssignment_0()); 
            // InternalWebDsl.g:2082:2: ( rule__CheckboxSelection__TypeElementAssignment_0 )
            // InternalWebDsl.g:2082:3: rule__CheckboxSelection__TypeElementAssignment_0
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
    // InternalWebDsl.g:2090:1: rule__CheckboxSelection__Group__1 : rule__CheckboxSelection__Group__1__Impl rule__CheckboxSelection__Group__2 ;
    public final void rule__CheckboxSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2094:1: ( rule__CheckboxSelection__Group__1__Impl rule__CheckboxSelection__Group__2 )
            // InternalWebDsl.g:2095:2: rule__CheckboxSelection__Group__1__Impl rule__CheckboxSelection__Group__2
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
    // InternalWebDsl.g:2102:1: rule__CheckboxSelection__Group__1__Impl : ( ( rule__CheckboxSelection__TypeSelectionAssignment_1 ) ) ;
    public final void rule__CheckboxSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2106:1: ( ( ( rule__CheckboxSelection__TypeSelectionAssignment_1 ) ) )
            // InternalWebDsl.g:2107:1: ( ( rule__CheckboxSelection__TypeSelectionAssignment_1 ) )
            {
            // InternalWebDsl.g:2107:1: ( ( rule__CheckboxSelection__TypeSelectionAssignment_1 ) )
            // InternalWebDsl.g:2108:2: ( rule__CheckboxSelection__TypeSelectionAssignment_1 )
            {
             before(grammarAccess.getCheckboxSelectionAccess().getTypeSelectionAssignment_1()); 
            // InternalWebDsl.g:2109:2: ( rule__CheckboxSelection__TypeSelectionAssignment_1 )
            // InternalWebDsl.g:2109:3: rule__CheckboxSelection__TypeSelectionAssignment_1
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
    // InternalWebDsl.g:2117:1: rule__CheckboxSelection__Group__2 : rule__CheckboxSelection__Group__2__Impl rule__CheckboxSelection__Group__3 ;
    public final void rule__CheckboxSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2121:1: ( rule__CheckboxSelection__Group__2__Impl rule__CheckboxSelection__Group__3 )
            // InternalWebDsl.g:2122:2: rule__CheckboxSelection__Group__2__Impl rule__CheckboxSelection__Group__3
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
    // InternalWebDsl.g:2129:1: rule__CheckboxSelection__Group__2__Impl : ( '{' ) ;
    public final void rule__CheckboxSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2133:1: ( ( '{' ) )
            // InternalWebDsl.g:2134:1: ( '{' )
            {
            // InternalWebDsl.g:2134:1: ( '{' )
            // InternalWebDsl.g:2135:2: '{'
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
    // InternalWebDsl.g:2144:1: rule__CheckboxSelection__Group__3 : rule__CheckboxSelection__Group__3__Impl rule__CheckboxSelection__Group__4 ;
    public final void rule__CheckboxSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2148:1: ( rule__CheckboxSelection__Group__3__Impl rule__CheckboxSelection__Group__4 )
            // InternalWebDsl.g:2149:2: rule__CheckboxSelection__Group__3__Impl rule__CheckboxSelection__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalWebDsl.g:2156:1: rule__CheckboxSelection__Group__3__Impl : ( ( rule__CheckboxSelection__ActionAssignment_3 ) ) ;
    public final void rule__CheckboxSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2160:1: ( ( ( rule__CheckboxSelection__ActionAssignment_3 ) ) )
            // InternalWebDsl.g:2161:1: ( ( rule__CheckboxSelection__ActionAssignment_3 ) )
            {
            // InternalWebDsl.g:2161:1: ( ( rule__CheckboxSelection__ActionAssignment_3 ) )
            // InternalWebDsl.g:2162:2: ( rule__CheckboxSelection__ActionAssignment_3 )
            {
             before(grammarAccess.getCheckboxSelectionAccess().getActionAssignment_3()); 
            // InternalWebDsl.g:2163:2: ( rule__CheckboxSelection__ActionAssignment_3 )
            // InternalWebDsl.g:2163:3: rule__CheckboxSelection__ActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxSelection__ActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxSelectionAccess().getActionAssignment_3()); 

            }


            }

        }
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
    // InternalWebDsl.g:2171:1: rule__CheckboxSelection__Group__4 : rule__CheckboxSelection__Group__4__Impl ;
    public final void rule__CheckboxSelection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2175:1: ( rule__CheckboxSelection__Group__4__Impl )
            // InternalWebDsl.g:2176:2: rule__CheckboxSelection__Group__4__Impl
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
    // InternalWebDsl.g:2182:1: rule__CheckboxSelection__Group__4__Impl : ( '}' ) ;
    public final void rule__CheckboxSelection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2186:1: ( ( '}' ) )
            // InternalWebDsl.g:2187:1: ( '}' )
            {
            // InternalWebDsl.g:2187:1: ( '}' )
            // InternalWebDsl.g:2188:2: '}'
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
    // InternalWebDsl.g:2198:1: rule__ComboboxSelection__Group__0 : rule__ComboboxSelection__Group__0__Impl rule__ComboboxSelection__Group__1 ;
    public final void rule__ComboboxSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2202:1: ( rule__ComboboxSelection__Group__0__Impl rule__ComboboxSelection__Group__1 )
            // InternalWebDsl.g:2203:2: rule__ComboboxSelection__Group__0__Impl rule__ComboboxSelection__Group__1
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
    // InternalWebDsl.g:2210:1: rule__ComboboxSelection__Group__0__Impl : ( ( rule__ComboboxSelection__TypeElementAssignment_0 ) ) ;
    public final void rule__ComboboxSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2214:1: ( ( ( rule__ComboboxSelection__TypeElementAssignment_0 ) ) )
            // InternalWebDsl.g:2215:1: ( ( rule__ComboboxSelection__TypeElementAssignment_0 ) )
            {
            // InternalWebDsl.g:2215:1: ( ( rule__ComboboxSelection__TypeElementAssignment_0 ) )
            // InternalWebDsl.g:2216:2: ( rule__ComboboxSelection__TypeElementAssignment_0 )
            {
             before(grammarAccess.getComboboxSelectionAccess().getTypeElementAssignment_0()); 
            // InternalWebDsl.g:2217:2: ( rule__ComboboxSelection__TypeElementAssignment_0 )
            // InternalWebDsl.g:2217:3: rule__ComboboxSelection__TypeElementAssignment_0
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
    // InternalWebDsl.g:2225:1: rule__ComboboxSelection__Group__1 : rule__ComboboxSelection__Group__1__Impl rule__ComboboxSelection__Group__2 ;
    public final void rule__ComboboxSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2229:1: ( rule__ComboboxSelection__Group__1__Impl rule__ComboboxSelection__Group__2 )
            // InternalWebDsl.g:2230:2: rule__ComboboxSelection__Group__1__Impl rule__ComboboxSelection__Group__2
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
    // InternalWebDsl.g:2237:1: rule__ComboboxSelection__Group__1__Impl : ( ( rule__ComboboxSelection__TypeSelectionAssignment_1 ) ) ;
    public final void rule__ComboboxSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2241:1: ( ( ( rule__ComboboxSelection__TypeSelectionAssignment_1 ) ) )
            // InternalWebDsl.g:2242:1: ( ( rule__ComboboxSelection__TypeSelectionAssignment_1 ) )
            {
            // InternalWebDsl.g:2242:1: ( ( rule__ComboboxSelection__TypeSelectionAssignment_1 ) )
            // InternalWebDsl.g:2243:2: ( rule__ComboboxSelection__TypeSelectionAssignment_1 )
            {
             before(grammarAccess.getComboboxSelectionAccess().getTypeSelectionAssignment_1()); 
            // InternalWebDsl.g:2244:2: ( rule__ComboboxSelection__TypeSelectionAssignment_1 )
            // InternalWebDsl.g:2244:3: rule__ComboboxSelection__TypeSelectionAssignment_1
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
    // InternalWebDsl.g:2252:1: rule__ComboboxSelection__Group__2 : rule__ComboboxSelection__Group__2__Impl rule__ComboboxSelection__Group__3 ;
    public final void rule__ComboboxSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2256:1: ( rule__ComboboxSelection__Group__2__Impl rule__ComboboxSelection__Group__3 )
            // InternalWebDsl.g:2257:2: rule__ComboboxSelection__Group__2__Impl rule__ComboboxSelection__Group__3
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
    // InternalWebDsl.g:2264:1: rule__ComboboxSelection__Group__2__Impl : ( '{' ) ;
    public final void rule__ComboboxSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2268:1: ( ( '{' ) )
            // InternalWebDsl.g:2269:1: ( '{' )
            {
            // InternalWebDsl.g:2269:1: ( '{' )
            // InternalWebDsl.g:2270:2: '{'
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
    // InternalWebDsl.g:2279:1: rule__ComboboxSelection__Group__3 : rule__ComboboxSelection__Group__3__Impl rule__ComboboxSelection__Group__4 ;
    public final void rule__ComboboxSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2283:1: ( rule__ComboboxSelection__Group__3__Impl rule__ComboboxSelection__Group__4 )
            // InternalWebDsl.g:2284:2: rule__ComboboxSelection__Group__3__Impl rule__ComboboxSelection__Group__4
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
    // InternalWebDsl.g:2291:1: rule__ComboboxSelection__Group__3__Impl : ( ( rule__ComboboxSelection__Alternatives_3 )* ) ;
    public final void rule__ComboboxSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2295:1: ( ( ( rule__ComboboxSelection__Alternatives_3 )* ) )
            // InternalWebDsl.g:2296:1: ( ( rule__ComboboxSelection__Alternatives_3 )* )
            {
            // InternalWebDsl.g:2296:1: ( ( rule__ComboboxSelection__Alternatives_3 )* )
            // InternalWebDsl.g:2297:2: ( rule__ComboboxSelection__Alternatives_3 )*
            {
             before(grammarAccess.getComboboxSelectionAccess().getAlternatives_3()); 
            // InternalWebDsl.g:2298:2: ( rule__ComboboxSelection__Alternatives_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=11 && LA25_0<=15)||(LA25_0>=27 && LA25_0<=28)||(LA25_0>=48 && LA25_0<=49)||LA25_0==52||LA25_0==59) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalWebDsl.g:2298:3: rule__ComboboxSelection__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ComboboxSelection__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalWebDsl.g:2306:1: rule__ComboboxSelection__Group__4 : rule__ComboboxSelection__Group__4__Impl ;
    public final void rule__ComboboxSelection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2310:1: ( rule__ComboboxSelection__Group__4__Impl )
            // InternalWebDsl.g:2311:2: rule__ComboboxSelection__Group__4__Impl
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
    // InternalWebDsl.g:2317:1: rule__ComboboxSelection__Group__4__Impl : ( '}' ) ;
    public final void rule__ComboboxSelection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2321:1: ( ( '}' ) )
            // InternalWebDsl.g:2322:1: ( '}' )
            {
            // InternalWebDsl.g:2322:1: ( '}' )
            // InternalWebDsl.g:2323:2: '}'
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
    // InternalWebDsl.g:2333:1: rule__ComboboxSelection__Group_3_1__0 : rule__ComboboxSelection__Group_3_1__0__Impl rule__ComboboxSelection__Group_3_1__1 ;
    public final void rule__ComboboxSelection__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2337:1: ( rule__ComboboxSelection__Group_3_1__0__Impl rule__ComboboxSelection__Group_3_1__1 )
            // InternalWebDsl.g:2338:2: rule__ComboboxSelection__Group_3_1__0__Impl rule__ComboboxSelection__Group_3_1__1
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
    // InternalWebDsl.g:2345:1: rule__ComboboxSelection__Group_3_1__0__Impl : ( 'select' ) ;
    public final void rule__ComboboxSelection__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2349:1: ( ( 'select' ) )
            // InternalWebDsl.g:2350:1: ( 'select' )
            {
            // InternalWebDsl.g:2350:1: ( 'select' )
            // InternalWebDsl.g:2351:2: 'select'
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
    // InternalWebDsl.g:2360:1: rule__ComboboxSelection__Group_3_1__1 : rule__ComboboxSelection__Group_3_1__1__Impl ;
    public final void rule__ComboboxSelection__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2364:1: ( rule__ComboboxSelection__Group_3_1__1__Impl )
            // InternalWebDsl.g:2365:2: rule__ComboboxSelection__Group_3_1__1__Impl
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
    // InternalWebDsl.g:2371:1: rule__ComboboxSelection__Group_3_1__1__Impl : ( RULE_STRING ) ;
    public final void rule__ComboboxSelection__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2375:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:2376:1: ( RULE_STRING )
            {
            // InternalWebDsl.g:2376:1: ( RULE_STRING )
            // InternalWebDsl.g:2377:2: RULE_STRING
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
    // InternalWebDsl.g:2387:1: rule__PageSelection__Group__0 : rule__PageSelection__Group__0__Impl rule__PageSelection__Group__1 ;
    public final void rule__PageSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2391:1: ( rule__PageSelection__Group__0__Impl rule__PageSelection__Group__1 )
            // InternalWebDsl.g:2392:2: rule__PageSelection__Group__0__Impl rule__PageSelection__Group__1
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
    // InternalWebDsl.g:2399:1: rule__PageSelection__Group__0__Impl : ( ( rule__PageSelection__TypeElementAssignment_0 ) ) ;
    public final void rule__PageSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2403:1: ( ( ( rule__PageSelection__TypeElementAssignment_0 ) ) )
            // InternalWebDsl.g:2404:1: ( ( rule__PageSelection__TypeElementAssignment_0 ) )
            {
            // InternalWebDsl.g:2404:1: ( ( rule__PageSelection__TypeElementAssignment_0 ) )
            // InternalWebDsl.g:2405:2: ( rule__PageSelection__TypeElementAssignment_0 )
            {
             before(grammarAccess.getPageSelectionAccess().getTypeElementAssignment_0()); 
            // InternalWebDsl.g:2406:2: ( rule__PageSelection__TypeElementAssignment_0 )
            // InternalWebDsl.g:2406:3: rule__PageSelection__TypeElementAssignment_0
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
    // InternalWebDsl.g:2414:1: rule__PageSelection__Group__1 : rule__PageSelection__Group__1__Impl rule__PageSelection__Group__2 ;
    public final void rule__PageSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2418:1: ( rule__PageSelection__Group__1__Impl rule__PageSelection__Group__2 )
            // InternalWebDsl.g:2419:2: rule__PageSelection__Group__1__Impl rule__PageSelection__Group__2
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
    // InternalWebDsl.g:2426:1: rule__PageSelection__Group__1__Impl : ( '{' ) ;
    public final void rule__PageSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2430:1: ( ( '{' ) )
            // InternalWebDsl.g:2431:1: ( '{' )
            {
            // InternalWebDsl.g:2431:1: ( '{' )
            // InternalWebDsl.g:2432:2: '{'
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
    // InternalWebDsl.g:2441:1: rule__PageSelection__Group__2 : rule__PageSelection__Group__2__Impl rule__PageSelection__Group__3 ;
    public final void rule__PageSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2445:1: ( rule__PageSelection__Group__2__Impl rule__PageSelection__Group__3 )
            // InternalWebDsl.g:2446:2: rule__PageSelection__Group__2__Impl rule__PageSelection__Group__3
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
    // InternalWebDsl.g:2453:1: rule__PageSelection__Group__2__Impl : ( ( rule__PageSelection__Alternatives_2 )* ) ;
    public final void rule__PageSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2457:1: ( ( ( rule__PageSelection__Alternatives_2 )* ) )
            // InternalWebDsl.g:2458:1: ( ( rule__PageSelection__Alternatives_2 )* )
            {
            // InternalWebDsl.g:2458:1: ( ( rule__PageSelection__Alternatives_2 )* )
            // InternalWebDsl.g:2459:2: ( rule__PageSelection__Alternatives_2 )*
            {
             before(grammarAccess.getPageSelectionAccess().getAlternatives_2()); 
            // InternalWebDsl.g:2460:2: ( rule__PageSelection__Alternatives_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==49||LA26_0==54) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalWebDsl.g:2460:3: rule__PageSelection__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__PageSelection__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalWebDsl.g:2468:1: rule__PageSelection__Group__3 : rule__PageSelection__Group__3__Impl ;
    public final void rule__PageSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2472:1: ( rule__PageSelection__Group__3__Impl )
            // InternalWebDsl.g:2473:2: rule__PageSelection__Group__3__Impl
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
    // InternalWebDsl.g:2479:1: rule__PageSelection__Group__3__Impl : ( '}' ) ;
    public final void rule__PageSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2483:1: ( ( '}' ) )
            // InternalWebDsl.g:2484:1: ( '}' )
            {
            // InternalWebDsl.g:2484:1: ( '}' )
            // InternalWebDsl.g:2485:2: '}'
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
    // InternalWebDsl.g:2495:1: rule__StoreAction__Group__0 : rule__StoreAction__Group__0__Impl rule__StoreAction__Group__1 ;
    public final void rule__StoreAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2499:1: ( rule__StoreAction__Group__0__Impl rule__StoreAction__Group__1 )
            // InternalWebDsl.g:2500:2: rule__StoreAction__Group__0__Impl rule__StoreAction__Group__1
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
    // InternalWebDsl.g:2507:1: rule__StoreAction__Group__0__Impl : ( 'store' ) ;
    public final void rule__StoreAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2511:1: ( ( 'store' ) )
            // InternalWebDsl.g:2512:1: ( 'store' )
            {
            // InternalWebDsl.g:2512:1: ( 'store' )
            // InternalWebDsl.g:2513:2: 'store'
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
    // InternalWebDsl.g:2522:1: rule__StoreAction__Group__1 : rule__StoreAction__Group__1__Impl rule__StoreAction__Group__2 ;
    public final void rule__StoreAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2526:1: ( rule__StoreAction__Group__1__Impl rule__StoreAction__Group__2 )
            // InternalWebDsl.g:2527:2: rule__StoreAction__Group__1__Impl rule__StoreAction__Group__2
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
    // InternalWebDsl.g:2534:1: rule__StoreAction__Group__1__Impl : ( '(' ) ;
    public final void rule__StoreAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2538:1: ( ( '(' ) )
            // InternalWebDsl.g:2539:1: ( '(' )
            {
            // InternalWebDsl.g:2539:1: ( '(' )
            // InternalWebDsl.g:2540:2: '('
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
    // InternalWebDsl.g:2549:1: rule__StoreAction__Group__2 : rule__StoreAction__Group__2__Impl rule__StoreAction__Group__3 ;
    public final void rule__StoreAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2553:1: ( rule__StoreAction__Group__2__Impl rule__StoreAction__Group__3 )
            // InternalWebDsl.g:2554:2: rule__StoreAction__Group__2__Impl rule__StoreAction__Group__3
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
    // InternalWebDsl.g:2561:1: rule__StoreAction__Group__2__Impl : ( ( rule__StoreAction__Alternatives_2 ) ) ;
    public final void rule__StoreAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2565:1: ( ( ( rule__StoreAction__Alternatives_2 ) ) )
            // InternalWebDsl.g:2566:1: ( ( rule__StoreAction__Alternatives_2 ) )
            {
            // InternalWebDsl.g:2566:1: ( ( rule__StoreAction__Alternatives_2 ) )
            // InternalWebDsl.g:2567:2: ( rule__StoreAction__Alternatives_2 )
            {
             before(grammarAccess.getStoreActionAccess().getAlternatives_2()); 
            // InternalWebDsl.g:2568:2: ( rule__StoreAction__Alternatives_2 )
            // InternalWebDsl.g:2568:3: rule__StoreAction__Alternatives_2
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
    // InternalWebDsl.g:2576:1: rule__StoreAction__Group__3 : rule__StoreAction__Group__3__Impl rule__StoreAction__Group__4 ;
    public final void rule__StoreAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2580:1: ( rule__StoreAction__Group__3__Impl rule__StoreAction__Group__4 )
            // InternalWebDsl.g:2581:2: rule__StoreAction__Group__3__Impl rule__StoreAction__Group__4
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
    // InternalWebDsl.g:2588:1: rule__StoreAction__Group__3__Impl : ( ')' ) ;
    public final void rule__StoreAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2592:1: ( ( ')' ) )
            // InternalWebDsl.g:2593:1: ( ')' )
            {
            // InternalWebDsl.g:2593:1: ( ')' )
            // InternalWebDsl.g:2594:2: ')'
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
    // InternalWebDsl.g:2603:1: rule__StoreAction__Group__4 : rule__StoreAction__Group__4__Impl rule__StoreAction__Group__5 ;
    public final void rule__StoreAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2607:1: ( rule__StoreAction__Group__4__Impl rule__StoreAction__Group__5 )
            // InternalWebDsl.g:2608:2: rule__StoreAction__Group__4__Impl rule__StoreAction__Group__5
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
    // InternalWebDsl.g:2615:1: rule__StoreAction__Group__4__Impl : ( 'in' ) ;
    public final void rule__StoreAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2619:1: ( ( 'in' ) )
            // InternalWebDsl.g:2620:1: ( 'in' )
            {
            // InternalWebDsl.g:2620:1: ( 'in' )
            // InternalWebDsl.g:2621:2: 'in'
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
    // InternalWebDsl.g:2630:1: rule__StoreAction__Group__5 : rule__StoreAction__Group__5__Impl ;
    public final void rule__StoreAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2634:1: ( rule__StoreAction__Group__5__Impl )
            // InternalWebDsl.g:2635:2: rule__StoreAction__Group__5__Impl
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
    // InternalWebDsl.g:2641:1: rule__StoreAction__Group__5__Impl : ( ( rule__StoreAction__VarAssignment_5 ) ) ;
    public final void rule__StoreAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2645:1: ( ( ( rule__StoreAction__VarAssignment_5 ) ) )
            // InternalWebDsl.g:2646:1: ( ( rule__StoreAction__VarAssignment_5 ) )
            {
            // InternalWebDsl.g:2646:1: ( ( rule__StoreAction__VarAssignment_5 ) )
            // InternalWebDsl.g:2647:2: ( rule__StoreAction__VarAssignment_5 )
            {
             before(grammarAccess.getStoreActionAccess().getVarAssignment_5()); 
            // InternalWebDsl.g:2648:2: ( rule__StoreAction__VarAssignment_5 )
            // InternalWebDsl.g:2648:3: rule__StoreAction__VarAssignment_5
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
    // InternalWebDsl.g:2657:1: rule__CountAction__Group__0 : rule__CountAction__Group__0__Impl rule__CountAction__Group__1 ;
    public final void rule__CountAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2661:1: ( rule__CountAction__Group__0__Impl rule__CountAction__Group__1 )
            // InternalWebDsl.g:2662:2: rule__CountAction__Group__0__Impl rule__CountAction__Group__1
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
    // InternalWebDsl.g:2669:1: rule__CountAction__Group__0__Impl : ( 'count' ) ;
    public final void rule__CountAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2673:1: ( ( 'count' ) )
            // InternalWebDsl.g:2674:1: ( 'count' )
            {
            // InternalWebDsl.g:2674:1: ( 'count' )
            // InternalWebDsl.g:2675:2: 'count'
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
    // InternalWebDsl.g:2684:1: rule__CountAction__Group__1 : rule__CountAction__Group__1__Impl rule__CountAction__Group__2 ;
    public final void rule__CountAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2688:1: ( rule__CountAction__Group__1__Impl rule__CountAction__Group__2 )
            // InternalWebDsl.g:2689:2: rule__CountAction__Group__1__Impl rule__CountAction__Group__2
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
    // InternalWebDsl.g:2696:1: rule__CountAction__Group__1__Impl : ( ( rule__CountAction__HtmlElementAssignment_1 ) ) ;
    public final void rule__CountAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2700:1: ( ( ( rule__CountAction__HtmlElementAssignment_1 ) ) )
            // InternalWebDsl.g:2701:1: ( ( rule__CountAction__HtmlElementAssignment_1 ) )
            {
            // InternalWebDsl.g:2701:1: ( ( rule__CountAction__HtmlElementAssignment_1 ) )
            // InternalWebDsl.g:2702:2: ( rule__CountAction__HtmlElementAssignment_1 )
            {
             before(grammarAccess.getCountActionAccess().getHtmlElementAssignment_1()); 
            // InternalWebDsl.g:2703:2: ( rule__CountAction__HtmlElementAssignment_1 )
            // InternalWebDsl.g:2703:3: rule__CountAction__HtmlElementAssignment_1
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
    // InternalWebDsl.g:2711:1: rule__CountAction__Group__2 : rule__CountAction__Group__2__Impl ;
    public final void rule__CountAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2715:1: ( rule__CountAction__Group__2__Impl )
            // InternalWebDsl.g:2716:2: rule__CountAction__Group__2__Impl
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
    // InternalWebDsl.g:2722:1: rule__CountAction__Group__2__Impl : ( ( rule__CountAction__TypeSelectionAssignment_2 ) ) ;
    public final void rule__CountAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2726:1: ( ( ( rule__CountAction__TypeSelectionAssignment_2 ) ) )
            // InternalWebDsl.g:2727:1: ( ( rule__CountAction__TypeSelectionAssignment_2 ) )
            {
            // InternalWebDsl.g:2727:1: ( ( rule__CountAction__TypeSelectionAssignment_2 ) )
            // InternalWebDsl.g:2728:2: ( rule__CountAction__TypeSelectionAssignment_2 )
            {
             before(grammarAccess.getCountActionAccess().getTypeSelectionAssignment_2()); 
            // InternalWebDsl.g:2729:2: ( rule__CountAction__TypeSelectionAssignment_2 )
            // InternalWebDsl.g:2729:3: rule__CountAction__TypeSelectionAssignment_2
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
    // InternalWebDsl.g:2738:1: rule__SetAction__Group__0 : rule__SetAction__Group__0__Impl rule__SetAction__Group__1 ;
    public final void rule__SetAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2742:1: ( rule__SetAction__Group__0__Impl rule__SetAction__Group__1 )
            // InternalWebDsl.g:2743:2: rule__SetAction__Group__0__Impl rule__SetAction__Group__1
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
    // InternalWebDsl.g:2750:1: rule__SetAction__Group__0__Impl : ( 'set' ) ;
    public final void rule__SetAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2754:1: ( ( 'set' ) )
            // InternalWebDsl.g:2755:1: ( 'set' )
            {
            // InternalWebDsl.g:2755:1: ( 'set' )
            // InternalWebDsl.g:2756:2: 'set'
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
    // InternalWebDsl.g:2765:1: rule__SetAction__Group__1 : rule__SetAction__Group__1__Impl rule__SetAction__Group__2 ;
    public final void rule__SetAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2769:1: ( rule__SetAction__Group__1__Impl rule__SetAction__Group__2 )
            // InternalWebDsl.g:2770:2: rule__SetAction__Group__1__Impl rule__SetAction__Group__2
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
    // InternalWebDsl.g:2777:1: rule__SetAction__Group__1__Impl : ( ( rule__SetAction__AttributeAssignment_1 ) ) ;
    public final void rule__SetAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2781:1: ( ( ( rule__SetAction__AttributeAssignment_1 ) ) )
            // InternalWebDsl.g:2782:1: ( ( rule__SetAction__AttributeAssignment_1 ) )
            {
            // InternalWebDsl.g:2782:1: ( ( rule__SetAction__AttributeAssignment_1 ) )
            // InternalWebDsl.g:2783:2: ( rule__SetAction__AttributeAssignment_1 )
            {
             before(grammarAccess.getSetActionAccess().getAttributeAssignment_1()); 
            // InternalWebDsl.g:2784:2: ( rule__SetAction__AttributeAssignment_1 )
            // InternalWebDsl.g:2784:3: rule__SetAction__AttributeAssignment_1
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
    // InternalWebDsl.g:2792:1: rule__SetAction__Group__2 : rule__SetAction__Group__2__Impl rule__SetAction__Group__3 ;
    public final void rule__SetAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2796:1: ( rule__SetAction__Group__2__Impl rule__SetAction__Group__3 )
            // InternalWebDsl.g:2797:2: rule__SetAction__Group__2__Impl rule__SetAction__Group__3
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
    // InternalWebDsl.g:2804:1: rule__SetAction__Group__2__Impl : ( ':' ) ;
    public final void rule__SetAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2808:1: ( ( ':' ) )
            // InternalWebDsl.g:2809:1: ( ':' )
            {
            // InternalWebDsl.g:2809:1: ( ':' )
            // InternalWebDsl.g:2810:2: ':'
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
    // InternalWebDsl.g:2819:1: rule__SetAction__Group__3 : rule__SetAction__Group__3__Impl ;
    public final void rule__SetAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2823:1: ( rule__SetAction__Group__3__Impl )
            // InternalWebDsl.g:2824:2: rule__SetAction__Group__3__Impl
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
    // InternalWebDsl.g:2830:1: rule__SetAction__Group__3__Impl : ( ( rule__SetAction__ValueAssignment_3 ) ) ;
    public final void rule__SetAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2834:1: ( ( ( rule__SetAction__ValueAssignment_3 ) ) )
            // InternalWebDsl.g:2835:1: ( ( rule__SetAction__ValueAssignment_3 ) )
            {
            // InternalWebDsl.g:2835:1: ( ( rule__SetAction__ValueAssignment_3 ) )
            // InternalWebDsl.g:2836:2: ( rule__SetAction__ValueAssignment_3 )
            {
             before(grammarAccess.getSetActionAccess().getValueAssignment_3()); 
            // InternalWebDsl.g:2837:2: ( rule__SetAction__ValueAssignment_3 )
            // InternalWebDsl.g:2837:3: rule__SetAction__ValueAssignment_3
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
    // InternalWebDsl.g:2846:1: rule__TypeSelection__Group_0__0 : rule__TypeSelection__Group_0__0__Impl rule__TypeSelection__Group_0__1 ;
    public final void rule__TypeSelection__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2850:1: ( rule__TypeSelection__Group_0__0__Impl rule__TypeSelection__Group_0__1 )
            // InternalWebDsl.g:2851:2: rule__TypeSelection__Group_0__0__Impl rule__TypeSelection__Group_0__1
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
    // InternalWebDsl.g:2858:1: rule__TypeSelection__Group_0__0__Impl : ( ( rule__TypeSelection__AttributeAssignment_0_0 ) ) ;
    public final void rule__TypeSelection__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2862:1: ( ( ( rule__TypeSelection__AttributeAssignment_0_0 ) ) )
            // InternalWebDsl.g:2863:1: ( ( rule__TypeSelection__AttributeAssignment_0_0 ) )
            {
            // InternalWebDsl.g:2863:1: ( ( rule__TypeSelection__AttributeAssignment_0_0 ) )
            // InternalWebDsl.g:2864:2: ( rule__TypeSelection__AttributeAssignment_0_0 )
            {
             before(grammarAccess.getTypeSelectionAccess().getAttributeAssignment_0_0()); 
            // InternalWebDsl.g:2865:2: ( rule__TypeSelection__AttributeAssignment_0_0 )
            // InternalWebDsl.g:2865:3: rule__TypeSelection__AttributeAssignment_0_0
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
    // InternalWebDsl.g:2873:1: rule__TypeSelection__Group_0__1 : rule__TypeSelection__Group_0__1__Impl rule__TypeSelection__Group_0__2 ;
    public final void rule__TypeSelection__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2877:1: ( rule__TypeSelection__Group_0__1__Impl rule__TypeSelection__Group_0__2 )
            // InternalWebDsl.g:2878:2: rule__TypeSelection__Group_0__1__Impl rule__TypeSelection__Group_0__2
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
    // InternalWebDsl.g:2885:1: rule__TypeSelection__Group_0__1__Impl : ( ':' ) ;
    public final void rule__TypeSelection__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2889:1: ( ( ':' ) )
            // InternalWebDsl.g:2890:1: ( ':' )
            {
            // InternalWebDsl.g:2890:1: ( ':' )
            // InternalWebDsl.g:2891:2: ':'
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
    // InternalWebDsl.g:2900:1: rule__TypeSelection__Group_0__2 : rule__TypeSelection__Group_0__2__Impl ;
    public final void rule__TypeSelection__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2904:1: ( rule__TypeSelection__Group_0__2__Impl )
            // InternalWebDsl.g:2905:2: rule__TypeSelection__Group_0__2__Impl
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
    // InternalWebDsl.g:2911:1: rule__TypeSelection__Group_0__2__Impl : ( ( rule__TypeSelection__Alternatives_0_2 ) ) ;
    public final void rule__TypeSelection__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2915:1: ( ( ( rule__TypeSelection__Alternatives_0_2 ) ) )
            // InternalWebDsl.g:2916:1: ( ( rule__TypeSelection__Alternatives_0_2 ) )
            {
            // InternalWebDsl.g:2916:1: ( ( rule__TypeSelection__Alternatives_0_2 ) )
            // InternalWebDsl.g:2917:2: ( rule__TypeSelection__Alternatives_0_2 )
            {
             before(grammarAccess.getTypeSelectionAccess().getAlternatives_0_2()); 
            // InternalWebDsl.g:2918:2: ( rule__TypeSelection__Alternatives_0_2 )
            // InternalWebDsl.g:2918:3: rule__TypeSelection__Alternatives_0_2
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
    // InternalWebDsl.g:2927:1: rule__Assert__Group__0 : rule__Assert__Group__0__Impl rule__Assert__Group__1 ;
    public final void rule__Assert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2931:1: ( rule__Assert__Group__0__Impl rule__Assert__Group__1 )
            // InternalWebDsl.g:2932:2: rule__Assert__Group__0__Impl rule__Assert__Group__1
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
    // InternalWebDsl.g:2939:1: rule__Assert__Group__0__Impl : ( 'verify' ) ;
    public final void rule__Assert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2943:1: ( ( 'verify' ) )
            // InternalWebDsl.g:2944:1: ( 'verify' )
            {
            // InternalWebDsl.g:2944:1: ( 'verify' )
            // InternalWebDsl.g:2945:2: 'verify'
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
    // InternalWebDsl.g:2954:1: rule__Assert__Group__1 : rule__Assert__Group__1__Impl ;
    public final void rule__Assert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2958:1: ( rule__Assert__Group__1__Impl )
            // InternalWebDsl.g:2959:2: rule__Assert__Group__1__Impl
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
    // InternalWebDsl.g:2965:1: rule__Assert__Group__1__Impl : ( ( rule__Assert__Alternatives_1 ) ) ;
    public final void rule__Assert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2969:1: ( ( ( rule__Assert__Alternatives_1 ) ) )
            // InternalWebDsl.g:2970:1: ( ( rule__Assert__Alternatives_1 ) )
            {
            // InternalWebDsl.g:2970:1: ( ( rule__Assert__Alternatives_1 ) )
            // InternalWebDsl.g:2971:2: ( rule__Assert__Alternatives_1 )
            {
             before(grammarAccess.getAssertAccess().getAlternatives_1()); 
            // InternalWebDsl.g:2972:2: ( rule__Assert__Alternatives_1 )
            // InternalWebDsl.g:2972:3: rule__Assert__Alternatives_1
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
    // InternalWebDsl.g:2981:1: rule__AssertContains__Group__0 : rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 ;
    public final void rule__AssertContains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2985:1: ( rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1 )
            // InternalWebDsl.g:2986:2: rule__AssertContains__Group__0__Impl rule__AssertContains__Group__1
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
    // InternalWebDsl.g:2993:1: rule__AssertContains__Group__0__Impl : ( 'contains' ) ;
    public final void rule__AssertContains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:2997:1: ( ( 'contains' ) )
            // InternalWebDsl.g:2998:1: ( 'contains' )
            {
            // InternalWebDsl.g:2998:1: ( 'contains' )
            // InternalWebDsl.g:2999:2: 'contains'
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
    // InternalWebDsl.g:3008:1: rule__AssertContains__Group__1 : rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 ;
    public final void rule__AssertContains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3012:1: ( rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2 )
            // InternalWebDsl.g:3013:2: rule__AssertContains__Group__1__Impl rule__AssertContains__Group__2
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
    // InternalWebDsl.g:3020:1: rule__AssertContains__Group__1__Impl : ( ( rule__AssertContains__Alternatives_1 ) ) ;
    public final void rule__AssertContains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3024:1: ( ( ( rule__AssertContains__Alternatives_1 ) ) )
            // InternalWebDsl.g:3025:1: ( ( rule__AssertContains__Alternatives_1 ) )
            {
            // InternalWebDsl.g:3025:1: ( ( rule__AssertContains__Alternatives_1 ) )
            // InternalWebDsl.g:3026:2: ( rule__AssertContains__Alternatives_1 )
            {
             before(grammarAccess.getAssertContainsAccess().getAlternatives_1()); 
            // InternalWebDsl.g:3027:2: ( rule__AssertContains__Alternatives_1 )
            // InternalWebDsl.g:3027:3: rule__AssertContains__Alternatives_1
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
    // InternalWebDsl.g:3035:1: rule__AssertContains__Group__2 : rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 ;
    public final void rule__AssertContains__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3039:1: ( rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3 )
            // InternalWebDsl.g:3040:2: rule__AssertContains__Group__2__Impl rule__AssertContains__Group__3
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
    // InternalWebDsl.g:3047:1: rule__AssertContains__Group__2__Impl : ( ':' ) ;
    public final void rule__AssertContains__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3051:1: ( ( ':' ) )
            // InternalWebDsl.g:3052:1: ( ':' )
            {
            // InternalWebDsl.g:3052:1: ( ':' )
            // InternalWebDsl.g:3053:2: ':'
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
    // InternalWebDsl.g:3062:1: rule__AssertContains__Group__3 : rule__AssertContains__Group__3__Impl ;
    public final void rule__AssertContains__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3066:1: ( rule__AssertContains__Group__3__Impl )
            // InternalWebDsl.g:3067:2: rule__AssertContains__Group__3__Impl
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
    // InternalWebDsl.g:3073:1: rule__AssertContains__Group__3__Impl : ( ( rule__AssertContains__ValueAssignment_3 ) ) ;
    public final void rule__AssertContains__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3077:1: ( ( ( rule__AssertContains__ValueAssignment_3 ) ) )
            // InternalWebDsl.g:3078:1: ( ( rule__AssertContains__ValueAssignment_3 ) )
            {
            // InternalWebDsl.g:3078:1: ( ( rule__AssertContains__ValueAssignment_3 ) )
            // InternalWebDsl.g:3079:2: ( rule__AssertContains__ValueAssignment_3 )
            {
             before(grammarAccess.getAssertContainsAccess().getValueAssignment_3()); 
            // InternalWebDsl.g:3080:2: ( rule__AssertContains__ValueAssignment_3 )
            // InternalWebDsl.g:3080:3: rule__AssertContains__ValueAssignment_3
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
    // InternalWebDsl.g:3089:1: rule__AssertContains__Group_1_0__0 : rule__AssertContains__Group_1_0__0__Impl rule__AssertContains__Group_1_0__1 ;
    public final void rule__AssertContains__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3093:1: ( rule__AssertContains__Group_1_0__0__Impl rule__AssertContains__Group_1_0__1 )
            // InternalWebDsl.g:3094:2: rule__AssertContains__Group_1_0__0__Impl rule__AssertContains__Group_1_0__1
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
    // InternalWebDsl.g:3101:1: rule__AssertContains__Group_1_0__0__Impl : ( ( rule__AssertContains__HtmlElementAssignment_1_0_0 ) ) ;
    public final void rule__AssertContains__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3105:1: ( ( ( rule__AssertContains__HtmlElementAssignment_1_0_0 ) ) )
            // InternalWebDsl.g:3106:1: ( ( rule__AssertContains__HtmlElementAssignment_1_0_0 ) )
            {
            // InternalWebDsl.g:3106:1: ( ( rule__AssertContains__HtmlElementAssignment_1_0_0 ) )
            // InternalWebDsl.g:3107:2: ( rule__AssertContains__HtmlElementAssignment_1_0_0 )
            {
             before(grammarAccess.getAssertContainsAccess().getHtmlElementAssignment_1_0_0()); 
            // InternalWebDsl.g:3108:2: ( rule__AssertContains__HtmlElementAssignment_1_0_0 )
            // InternalWebDsl.g:3108:3: rule__AssertContains__HtmlElementAssignment_1_0_0
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
    // InternalWebDsl.g:3116:1: rule__AssertContains__Group_1_0__1 : rule__AssertContains__Group_1_0__1__Impl ;
    public final void rule__AssertContains__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3120:1: ( rule__AssertContains__Group_1_0__1__Impl )
            // InternalWebDsl.g:3121:2: rule__AssertContains__Group_1_0__1__Impl
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
    // InternalWebDsl.g:3127:1: rule__AssertContains__Group_1_0__1__Impl : ( ( rule__AssertContains__AttributeAssignment_1_0_1 ) ) ;
    public final void rule__AssertContains__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3131:1: ( ( ( rule__AssertContains__AttributeAssignment_1_0_1 ) ) )
            // InternalWebDsl.g:3132:1: ( ( rule__AssertContains__AttributeAssignment_1_0_1 ) )
            {
            // InternalWebDsl.g:3132:1: ( ( rule__AssertContains__AttributeAssignment_1_0_1 ) )
            // InternalWebDsl.g:3133:2: ( rule__AssertContains__AttributeAssignment_1_0_1 )
            {
             before(grammarAccess.getAssertContainsAccess().getAttributeAssignment_1_0_1()); 
            // InternalWebDsl.g:3134:2: ( rule__AssertContains__AttributeAssignment_1_0_1 )
            // InternalWebDsl.g:3134:3: rule__AssertContains__AttributeAssignment_1_0_1
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
    // InternalWebDsl.g:3143:1: rule__AssertEquals__Group__0 : rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 ;
    public final void rule__AssertEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3147:1: ( rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1 )
            // InternalWebDsl.g:3148:2: rule__AssertEquals__Group__0__Impl rule__AssertEquals__Group__1
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
    // InternalWebDsl.g:3155:1: rule__AssertEquals__Group__0__Impl : ( ( rule__AssertEquals__C1Assignment_0 ) ) ;
    public final void rule__AssertEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3159:1: ( ( ( rule__AssertEquals__C1Assignment_0 ) ) )
            // InternalWebDsl.g:3160:1: ( ( rule__AssertEquals__C1Assignment_0 ) )
            {
            // InternalWebDsl.g:3160:1: ( ( rule__AssertEquals__C1Assignment_0 ) )
            // InternalWebDsl.g:3161:2: ( rule__AssertEquals__C1Assignment_0 )
            {
             before(grammarAccess.getAssertEqualsAccess().getC1Assignment_0()); 
            // InternalWebDsl.g:3162:2: ( rule__AssertEquals__C1Assignment_0 )
            // InternalWebDsl.g:3162:3: rule__AssertEquals__C1Assignment_0
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
    // InternalWebDsl.g:3170:1: rule__AssertEquals__Group__1 : rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 ;
    public final void rule__AssertEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3174:1: ( rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2 )
            // InternalWebDsl.g:3175:2: rule__AssertEquals__Group__1__Impl rule__AssertEquals__Group__2
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
    // InternalWebDsl.g:3182:1: rule__AssertEquals__Group__1__Impl : ( 'equals' ) ;
    public final void rule__AssertEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3186:1: ( ( 'equals' ) )
            // InternalWebDsl.g:3187:1: ( 'equals' )
            {
            // InternalWebDsl.g:3187:1: ( 'equals' )
            // InternalWebDsl.g:3188:2: 'equals'
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
    // InternalWebDsl.g:3197:1: rule__AssertEquals__Group__2 : rule__AssertEquals__Group__2__Impl ;
    public final void rule__AssertEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3201:1: ( rule__AssertEquals__Group__2__Impl )
            // InternalWebDsl.g:3202:2: rule__AssertEquals__Group__2__Impl
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
    // InternalWebDsl.g:3208:1: rule__AssertEquals__Group__2__Impl : ( ( rule__AssertEquals__C2Assignment_2 ) ) ;
    public final void rule__AssertEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3212:1: ( ( ( rule__AssertEquals__C2Assignment_2 ) ) )
            // InternalWebDsl.g:3213:1: ( ( rule__AssertEquals__C2Assignment_2 ) )
            {
            // InternalWebDsl.g:3213:1: ( ( rule__AssertEquals__C2Assignment_2 ) )
            // InternalWebDsl.g:3214:2: ( rule__AssertEquals__C2Assignment_2 )
            {
             before(grammarAccess.getAssertEqualsAccess().getC2Assignment_2()); 
            // InternalWebDsl.g:3215:2: ( rule__AssertEquals__C2Assignment_2 )
            // InternalWebDsl.g:3215:3: rule__AssertEquals__C2Assignment_2
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
    // InternalWebDsl.g:3224:1: rule__Comparable__Group_0__0 : rule__Comparable__Group_0__0__Impl rule__Comparable__Group_0__1 ;
    public final void rule__Comparable__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3228:1: ( rule__Comparable__Group_0__0__Impl rule__Comparable__Group_0__1 )
            // InternalWebDsl.g:3229:2: rule__Comparable__Group_0__0__Impl rule__Comparable__Group_0__1
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
    // InternalWebDsl.g:3236:1: rule__Comparable__Group_0__0__Impl : ( 'VAR:' ) ;
    public final void rule__Comparable__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3240:1: ( ( 'VAR:' ) )
            // InternalWebDsl.g:3241:1: ( 'VAR:' )
            {
            // InternalWebDsl.g:3241:1: ( 'VAR:' )
            // InternalWebDsl.g:3242:2: 'VAR:'
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
    // InternalWebDsl.g:3251:1: rule__Comparable__Group_0__1 : rule__Comparable__Group_0__1__Impl ;
    public final void rule__Comparable__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3255:1: ( rule__Comparable__Group_0__1__Impl )
            // InternalWebDsl.g:3256:2: rule__Comparable__Group_0__1__Impl
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
    // InternalWebDsl.g:3262:1: rule__Comparable__Group_0__1__Impl : ( ( rule__Comparable__VarAssignment_0_1 ) ) ;
    public final void rule__Comparable__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3266:1: ( ( ( rule__Comparable__VarAssignment_0_1 ) ) )
            // InternalWebDsl.g:3267:1: ( ( rule__Comparable__VarAssignment_0_1 ) )
            {
            // InternalWebDsl.g:3267:1: ( ( rule__Comparable__VarAssignment_0_1 ) )
            // InternalWebDsl.g:3268:2: ( rule__Comparable__VarAssignment_0_1 )
            {
             before(grammarAccess.getComparableAccess().getVarAssignment_0_1()); 
            // InternalWebDsl.g:3269:2: ( rule__Comparable__VarAssignment_0_1 )
            // InternalWebDsl.g:3269:3: rule__Comparable__VarAssignment_0_1
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
    // InternalWebDsl.g:3278:1: rule__Comparable__Group_1__0 : rule__Comparable__Group_1__0__Impl rule__Comparable__Group_1__1 ;
    public final void rule__Comparable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3282:1: ( rule__Comparable__Group_1__0__Impl rule__Comparable__Group_1__1 )
            // InternalWebDsl.g:3283:2: rule__Comparable__Group_1__0__Impl rule__Comparable__Group_1__1
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
    // InternalWebDsl.g:3290:1: rule__Comparable__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Comparable__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3294:1: ( ( '(' ) )
            // InternalWebDsl.g:3295:1: ( '(' )
            {
            // InternalWebDsl.g:3295:1: ( '(' )
            // InternalWebDsl.g:3296:2: '('
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
    // InternalWebDsl.g:3305:1: rule__Comparable__Group_1__1 : rule__Comparable__Group_1__1__Impl rule__Comparable__Group_1__2 ;
    public final void rule__Comparable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3309:1: ( rule__Comparable__Group_1__1__Impl rule__Comparable__Group_1__2 )
            // InternalWebDsl.g:3310:2: rule__Comparable__Group_1__1__Impl rule__Comparable__Group_1__2
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
    // InternalWebDsl.g:3317:1: rule__Comparable__Group_1__1__Impl : ( ( rule__Comparable__HtmlElementAssignment_1_1 ) ) ;
    public final void rule__Comparable__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3321:1: ( ( ( rule__Comparable__HtmlElementAssignment_1_1 ) ) )
            // InternalWebDsl.g:3322:1: ( ( rule__Comparable__HtmlElementAssignment_1_1 ) )
            {
            // InternalWebDsl.g:3322:1: ( ( rule__Comparable__HtmlElementAssignment_1_1 ) )
            // InternalWebDsl.g:3323:2: ( rule__Comparable__HtmlElementAssignment_1_1 )
            {
             before(grammarAccess.getComparableAccess().getHtmlElementAssignment_1_1()); 
            // InternalWebDsl.g:3324:2: ( rule__Comparable__HtmlElementAssignment_1_1 )
            // InternalWebDsl.g:3324:3: rule__Comparable__HtmlElementAssignment_1_1
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
    // InternalWebDsl.g:3332:1: rule__Comparable__Group_1__2 : rule__Comparable__Group_1__2__Impl rule__Comparable__Group_1__3 ;
    public final void rule__Comparable__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3336:1: ( rule__Comparable__Group_1__2__Impl rule__Comparable__Group_1__3 )
            // InternalWebDsl.g:3337:2: rule__Comparable__Group_1__2__Impl rule__Comparable__Group_1__3
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
    // InternalWebDsl.g:3344:1: rule__Comparable__Group_1__2__Impl : ( ( rule__Comparable__AttributeAssignment_1_2 ) ) ;
    public final void rule__Comparable__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3348:1: ( ( ( rule__Comparable__AttributeAssignment_1_2 ) ) )
            // InternalWebDsl.g:3349:1: ( ( rule__Comparable__AttributeAssignment_1_2 ) )
            {
            // InternalWebDsl.g:3349:1: ( ( rule__Comparable__AttributeAssignment_1_2 ) )
            // InternalWebDsl.g:3350:2: ( rule__Comparable__AttributeAssignment_1_2 )
            {
             before(grammarAccess.getComparableAccess().getAttributeAssignment_1_2()); 
            // InternalWebDsl.g:3351:2: ( rule__Comparable__AttributeAssignment_1_2 )
            // InternalWebDsl.g:3351:3: rule__Comparable__AttributeAssignment_1_2
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
    // InternalWebDsl.g:3359:1: rule__Comparable__Group_1__3 : rule__Comparable__Group_1__3__Impl ;
    public final void rule__Comparable__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3363:1: ( rule__Comparable__Group_1__3__Impl )
            // InternalWebDsl.g:3364:2: rule__Comparable__Group_1__3__Impl
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
    // InternalWebDsl.g:3370:1: rule__Comparable__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Comparable__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3374:1: ( ( ')' ) )
            // InternalWebDsl.g:3375:1: ( ')' )
            {
            // InternalWebDsl.g:3375:1: ( ')' )
            // InternalWebDsl.g:3376:2: ')'
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
    // InternalWebDsl.g:3386:1: rule__Program__ProceduresAssignment_0 : ( ruleProcedure ) ;
    public final void rule__Program__ProceduresAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3390:1: ( ( ruleProcedure ) )
            // InternalWebDsl.g:3391:2: ( ruleProcedure )
            {
            // InternalWebDsl.g:3391:2: ( ruleProcedure )
            // InternalWebDsl.g:3392:3: ruleProcedure
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
    // InternalWebDsl.g:3401:1: rule__Program__CoresAssignment_1 : ( ruleCore ) ;
    public final void rule__Program__CoresAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3405:1: ( ( ruleCore ) )
            // InternalWebDsl.g:3406:2: ( ruleCore )
            {
            // InternalWebDsl.g:3406:2: ( ruleCore )
            // InternalWebDsl.g:3407:3: ruleCore
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
    // InternalWebDsl.g:3416:1: rule__Core__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Core__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3420:1: ( ( RULE_ID ) )
            // InternalWebDsl.g:3421:2: ( RULE_ID )
            {
            // InternalWebDsl.g:3421:2: ( RULE_ID )
            // InternalWebDsl.g:3422:3: RULE_ID
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
    // InternalWebDsl.g:3431:1: rule__Core__BrowserAssignment_4 : ( ruleBrowser ) ;
    public final void rule__Core__BrowserAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3435:1: ( ( ruleBrowser ) )
            // InternalWebDsl.g:3436:2: ( ruleBrowser )
            {
            // InternalWebDsl.g:3436:2: ( ruleBrowser )
            // InternalWebDsl.g:3437:3: ruleBrowser
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
    // InternalWebDsl.g:3446:1: rule__Core__ActionsAssignment_5 : ( ruleAction ) ;
    public final void rule__Core__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3450:1: ( ( ruleAction ) )
            // InternalWebDsl.g:3451:2: ( ruleAction )
            {
            // InternalWebDsl.g:3451:2: ( ruleAction )
            // InternalWebDsl.g:3452:3: ruleAction
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
    // InternalWebDsl.g:3461:1: rule__Procedure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3465:1: ( ( RULE_ID ) )
            // InternalWebDsl.g:3466:2: ( RULE_ID )
            {
            // InternalWebDsl.g:3466:2: ( RULE_ID )
            // InternalWebDsl.g:3467:3: RULE_ID
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
    // InternalWebDsl.g:3476:1: rule__Procedure__VarAssignment_3 : ( ruleVar ) ;
    public final void rule__Procedure__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3480:1: ( ( ruleVar ) )
            // InternalWebDsl.g:3481:2: ( ruleVar )
            {
            // InternalWebDsl.g:3481:2: ( ruleVar )
            // InternalWebDsl.g:3482:3: ruleVar
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
    // InternalWebDsl.g:3491:1: rule__Procedure__ActionsAssignment_5 : ( ruleAction ) ;
    public final void rule__Procedure__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3495:1: ( ( ruleAction ) )
            // InternalWebDsl.g:3496:2: ( ruleAction )
            {
            // InternalWebDsl.g:3496:2: ( ruleAction )
            // InternalWebDsl.g:3497:3: ruleAction
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
    // InternalWebDsl.g:3506:1: rule__CallProcedure__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CallProcedure__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3510:1: ( ( ( RULE_ID ) ) )
            // InternalWebDsl.g:3511:2: ( ( RULE_ID ) )
            {
            // InternalWebDsl.g:3511:2: ( ( RULE_ID ) )
            // InternalWebDsl.g:3512:3: ( RULE_ID )
            {
             before(grammarAccess.getCallProcedureAccess().getRefProcedureCrossReference_1_0()); 
            // InternalWebDsl.g:3513:3: ( RULE_ID )
            // InternalWebDsl.g:3514:4: RULE_ID
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
    // InternalWebDsl.g:3525:1: rule__CallProcedure__ArgAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CallProcedure__ArgAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3529:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:3530:2: ( RULE_STRING )
            {
            // InternalWebDsl.g:3530:2: ( RULE_STRING )
            // InternalWebDsl.g:3531:3: RULE_STRING
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
    // InternalWebDsl.g:3540:1: rule__GoAction__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GoAction__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3544:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:3545:2: ( RULE_STRING )
            {
            // InternalWebDsl.g:3545:2: ( RULE_STRING )
            // InternalWebDsl.g:3546:3: RULE_STRING
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
    // InternalWebDsl.g:3555:1: rule__LinkButtonSelection__TypeElementAssignment_0 : ( ( rule__LinkButtonSelection__TypeElementAlternatives_0_0 ) ) ;
    public final void rule__LinkButtonSelection__TypeElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3559:1: ( ( ( rule__LinkButtonSelection__TypeElementAlternatives_0_0 ) ) )
            // InternalWebDsl.g:3560:2: ( ( rule__LinkButtonSelection__TypeElementAlternatives_0_0 ) )
            {
            // InternalWebDsl.g:3560:2: ( ( rule__LinkButtonSelection__TypeElementAlternatives_0_0 ) )
            // InternalWebDsl.g:3561:3: ( rule__LinkButtonSelection__TypeElementAlternatives_0_0 )
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getTypeElementAlternatives_0_0()); 
            // InternalWebDsl.g:3562:3: ( rule__LinkButtonSelection__TypeElementAlternatives_0_0 )
            // InternalWebDsl.g:3562:4: rule__LinkButtonSelection__TypeElementAlternatives_0_0
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
    // InternalWebDsl.g:3570:1: rule__LinkButtonSelection__TypeSelectionAssignment_1 : ( ruleTypeSelection ) ;
    public final void rule__LinkButtonSelection__TypeSelectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3574:1: ( ( ruleTypeSelection ) )
            // InternalWebDsl.g:3575:2: ( ruleTypeSelection )
            {
            // InternalWebDsl.g:3575:2: ( ruleTypeSelection )
            // InternalWebDsl.g:3576:3: ruleTypeSelection
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
    // InternalWebDsl.g:3585:1: rule__LinkButtonSelection__GeneralActionsAssignment_3_0 : ( ruleGeneralAction ) ;
    public final void rule__LinkButtonSelection__GeneralActionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3589:1: ( ( ruleGeneralAction ) )
            // InternalWebDsl.g:3590:2: ( ruleGeneralAction )
            {
            // InternalWebDsl.g:3590:2: ( ruleGeneralAction )
            // InternalWebDsl.g:3591:3: ruleGeneralAction
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
    // InternalWebDsl.g:3600:1: rule__LinkButtonSelection__ClicksAssignment_3_1 : ( ( 'click' ) ) ;
    public final void rule__LinkButtonSelection__ClicksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3604:1: ( ( ( 'click' ) ) )
            // InternalWebDsl.g:3605:2: ( ( 'click' ) )
            {
            // InternalWebDsl.g:3605:2: ( ( 'click' ) )
            // InternalWebDsl.g:3606:3: ( 'click' )
            {
             before(grammarAccess.getLinkButtonSelectionAccess().getClicksClickKeyword_3_1_0()); 
            // InternalWebDsl.g:3607:3: ( 'click' )
            // InternalWebDsl.g:3608:4: 'click'
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
    // InternalWebDsl.g:3619:1: rule__GeneralSelection__TypeElementAssignment_0 : ( ( rule__GeneralSelection__TypeElementAlternatives_0_0 ) ) ;
    public final void rule__GeneralSelection__TypeElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3623:1: ( ( ( rule__GeneralSelection__TypeElementAlternatives_0_0 ) ) )
            // InternalWebDsl.g:3624:2: ( ( rule__GeneralSelection__TypeElementAlternatives_0_0 ) )
            {
            // InternalWebDsl.g:3624:2: ( ( rule__GeneralSelection__TypeElementAlternatives_0_0 ) )
            // InternalWebDsl.g:3625:3: ( rule__GeneralSelection__TypeElementAlternatives_0_0 )
            {
             before(grammarAccess.getGeneralSelectionAccess().getTypeElementAlternatives_0_0()); 
            // InternalWebDsl.g:3626:3: ( rule__GeneralSelection__TypeElementAlternatives_0_0 )
            // InternalWebDsl.g:3626:4: rule__GeneralSelection__TypeElementAlternatives_0_0
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
    // InternalWebDsl.g:3634:1: rule__GeneralSelection__TypeSelectionAssignment_1 : ( ruleTypeSelection ) ;
    public final void rule__GeneralSelection__TypeSelectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3638:1: ( ( ruleTypeSelection ) )
            // InternalWebDsl.g:3639:2: ( ruleTypeSelection )
            {
            // InternalWebDsl.g:3639:2: ( ruleTypeSelection )
            // InternalWebDsl.g:3640:3: ruleTypeSelection
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
    // InternalWebDsl.g:3649:1: rule__GeneralSelection__GeneralActionsAssignment_3 : ( ruleGeneralAction ) ;
    public final void rule__GeneralSelection__GeneralActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3653:1: ( ( ruleGeneralAction ) )
            // InternalWebDsl.g:3654:2: ( ruleGeneralAction )
            {
            // InternalWebDsl.g:3654:2: ( ruleGeneralAction )
            // InternalWebDsl.g:3655:3: ruleGeneralAction
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
    // InternalWebDsl.g:3664:1: rule__CheckboxSelection__TypeElementAssignment_0 : ( ( 'CHECKBOX' ) ) ;
    public final void rule__CheckboxSelection__TypeElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3668:1: ( ( ( 'CHECKBOX' ) ) )
            // InternalWebDsl.g:3669:2: ( ( 'CHECKBOX' ) )
            {
            // InternalWebDsl.g:3669:2: ( ( 'CHECKBOX' ) )
            // InternalWebDsl.g:3670:3: ( 'CHECKBOX' )
            {
             before(grammarAccess.getCheckboxSelectionAccess().getTypeElementCHECKBOXKeyword_0_0()); 
            // InternalWebDsl.g:3671:3: ( 'CHECKBOX' )
            // InternalWebDsl.g:3672:4: 'CHECKBOX'
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
    // InternalWebDsl.g:3683:1: rule__CheckboxSelection__TypeSelectionAssignment_1 : ( ruleTypeSelection ) ;
    public final void rule__CheckboxSelection__TypeSelectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3687:1: ( ( ruleTypeSelection ) )
            // InternalWebDsl.g:3688:2: ( ruleTypeSelection )
            {
            // InternalWebDsl.g:3688:2: ( ruleTypeSelection )
            // InternalWebDsl.g:3689:3: ruleTypeSelection
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


    // $ANTLR start "rule__CheckboxSelection__ActionAssignment_3"
    // InternalWebDsl.g:3698:1: rule__CheckboxSelection__ActionAssignment_3 : ( ( rule__CheckboxSelection__ActionAlternatives_3_0 ) ) ;
    public final void rule__CheckboxSelection__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3702:1: ( ( ( rule__CheckboxSelection__ActionAlternatives_3_0 ) ) )
            // InternalWebDsl.g:3703:2: ( ( rule__CheckboxSelection__ActionAlternatives_3_0 ) )
            {
            // InternalWebDsl.g:3703:2: ( ( rule__CheckboxSelection__ActionAlternatives_3_0 ) )
            // InternalWebDsl.g:3704:3: ( rule__CheckboxSelection__ActionAlternatives_3_0 )
            {
             before(grammarAccess.getCheckboxSelectionAccess().getActionAlternatives_3_0()); 
            // InternalWebDsl.g:3705:3: ( rule__CheckboxSelection__ActionAlternatives_3_0 )
            // InternalWebDsl.g:3705:4: rule__CheckboxSelection__ActionAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxSelection__ActionAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxSelectionAccess().getActionAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxSelection__ActionAssignment_3"


    // $ANTLR start "rule__ComboboxSelection__TypeElementAssignment_0"
    // InternalWebDsl.g:3713:1: rule__ComboboxSelection__TypeElementAssignment_0 : ( ( 'COMBO_BOX' ) ) ;
    public final void rule__ComboboxSelection__TypeElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3717:1: ( ( ( 'COMBO_BOX' ) ) )
            // InternalWebDsl.g:3718:2: ( ( 'COMBO_BOX' ) )
            {
            // InternalWebDsl.g:3718:2: ( ( 'COMBO_BOX' ) )
            // InternalWebDsl.g:3719:3: ( 'COMBO_BOX' )
            {
             before(grammarAccess.getComboboxSelectionAccess().getTypeElementCOMBO_BOXKeyword_0_0()); 
            // InternalWebDsl.g:3720:3: ( 'COMBO_BOX' )
            // InternalWebDsl.g:3721:4: 'COMBO_BOX'
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
    // InternalWebDsl.g:3732:1: rule__ComboboxSelection__TypeSelectionAssignment_1 : ( ruleTypeSelection ) ;
    public final void rule__ComboboxSelection__TypeSelectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3736:1: ( ( ruleTypeSelection ) )
            // InternalWebDsl.g:3737:2: ( ruleTypeSelection )
            {
            // InternalWebDsl.g:3737:2: ( ruleTypeSelection )
            // InternalWebDsl.g:3738:3: ruleTypeSelection
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
    // InternalWebDsl.g:3747:1: rule__ComboboxSelection__GeneralActionsAssignment_3_0 : ( ruleGeneralAction ) ;
    public final void rule__ComboboxSelection__GeneralActionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3751:1: ( ( ruleGeneralAction ) )
            // InternalWebDsl.g:3752:2: ( ruleGeneralAction )
            {
            // InternalWebDsl.g:3752:2: ( ruleGeneralAction )
            // InternalWebDsl.g:3753:3: ruleGeneralAction
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
    // InternalWebDsl.g:3762:1: rule__PageSelection__TypeElementAssignment_0 : ( ( 'PAGE' ) ) ;
    public final void rule__PageSelection__TypeElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3766:1: ( ( ( 'PAGE' ) ) )
            // InternalWebDsl.g:3767:2: ( ( 'PAGE' ) )
            {
            // InternalWebDsl.g:3767:2: ( ( 'PAGE' ) )
            // InternalWebDsl.g:3768:3: ( 'PAGE' )
            {
             before(grammarAccess.getPageSelectionAccess().getTypeElementPAGEKeyword_0_0()); 
            // InternalWebDsl.g:3769:3: ( 'PAGE' )
            // InternalWebDsl.g:3770:4: 'PAGE'
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
    // InternalWebDsl.g:3781:1: rule__PageSelection__StoreActionsAssignment_2_0 : ( ruleStoreAction ) ;
    public final void rule__PageSelection__StoreActionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3785:1: ( ( ruleStoreAction ) )
            // InternalWebDsl.g:3786:2: ( ruleStoreAction )
            {
            // InternalWebDsl.g:3786:2: ( ruleStoreAction )
            // InternalWebDsl.g:3787:3: ruleStoreAction
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
    // InternalWebDsl.g:3796:1: rule__PageSelection__AssertionsAssignment_2_1 : ( ruleAssert ) ;
    public final void rule__PageSelection__AssertionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3800:1: ( ( ruleAssert ) )
            // InternalWebDsl.g:3801:2: ( ruleAssert )
            {
            // InternalWebDsl.g:3801:2: ( ruleAssert )
            // InternalWebDsl.g:3802:3: ruleAssert
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
    // InternalWebDsl.g:3811:1: rule__StoreAction__ValAssignment_2_0 : ( ruleAttribute ) ;
    public final void rule__StoreAction__ValAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3815:1: ( ( ruleAttribute ) )
            // InternalWebDsl.g:3816:2: ( ruleAttribute )
            {
            // InternalWebDsl.g:3816:2: ( ruleAttribute )
            // InternalWebDsl.g:3817:3: ruleAttribute
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
    // InternalWebDsl.g:3826:1: rule__StoreAction__CountAssignment_2_1 : ( ruleCountAction ) ;
    public final void rule__StoreAction__CountAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3830:1: ( ( ruleCountAction ) )
            // InternalWebDsl.g:3831:2: ( ruleCountAction )
            {
            // InternalWebDsl.g:3831:2: ( ruleCountAction )
            // InternalWebDsl.g:3832:3: ruleCountAction
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
    // InternalWebDsl.g:3841:1: rule__StoreAction__VarAssignment_5 : ( ruleVar ) ;
    public final void rule__StoreAction__VarAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3845:1: ( ( ruleVar ) )
            // InternalWebDsl.g:3846:2: ( ruleVar )
            {
            // InternalWebDsl.g:3846:2: ( ruleVar )
            // InternalWebDsl.g:3847:3: ruleVar
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
    // InternalWebDsl.g:3856:1: rule__CountAction__HtmlElementAssignment_1 : ( ruleHtmlElement ) ;
    public final void rule__CountAction__HtmlElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3860:1: ( ( ruleHtmlElement ) )
            // InternalWebDsl.g:3861:2: ( ruleHtmlElement )
            {
            // InternalWebDsl.g:3861:2: ( ruleHtmlElement )
            // InternalWebDsl.g:3862:3: ruleHtmlElement
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
    // InternalWebDsl.g:3871:1: rule__CountAction__TypeSelectionAssignment_2 : ( ruleTypeSelection ) ;
    public final void rule__CountAction__TypeSelectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3875:1: ( ( ruleTypeSelection ) )
            // InternalWebDsl.g:3876:2: ( ruleTypeSelection )
            {
            // InternalWebDsl.g:3876:2: ( ruleTypeSelection )
            // InternalWebDsl.g:3877:3: ruleTypeSelection
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
    // InternalWebDsl.g:3886:1: rule__Var__NameAssignment : ( RULE_ID ) ;
    public final void rule__Var__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3890:1: ( ( RULE_ID ) )
            // InternalWebDsl.g:3891:2: ( RULE_ID )
            {
            // InternalWebDsl.g:3891:2: ( RULE_ID )
            // InternalWebDsl.g:3892:3: RULE_ID
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
    // InternalWebDsl.g:3901:1: rule__SetAction__AttributeAssignment_1 : ( ruleAttribute ) ;
    public final void rule__SetAction__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3905:1: ( ( ruleAttribute ) )
            // InternalWebDsl.g:3906:2: ( ruleAttribute )
            {
            // InternalWebDsl.g:3906:2: ( ruleAttribute )
            // InternalWebDsl.g:3907:3: ruleAttribute
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
    // InternalWebDsl.g:3916:1: rule__SetAction__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SetAction__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3920:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:3921:2: ( RULE_STRING )
            {
            // InternalWebDsl.g:3921:2: ( RULE_STRING )
            // InternalWebDsl.g:3922:3: RULE_STRING
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
    // InternalWebDsl.g:3931:1: rule__TypeSelection__AttributeAssignment_0_0 : ( ruleAttribute ) ;
    public final void rule__TypeSelection__AttributeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3935:1: ( ( ruleAttribute ) )
            // InternalWebDsl.g:3936:2: ( ruleAttribute )
            {
            // InternalWebDsl.g:3936:2: ( ruleAttribute )
            // InternalWebDsl.g:3937:3: ruleAttribute
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
    // InternalWebDsl.g:3946:1: rule__TypeSelection__ValueAssignment_0_2_0 : ( RULE_STRING ) ;
    public final void rule__TypeSelection__ValueAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3950:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:3951:2: ( RULE_STRING )
            {
            // InternalWebDsl.g:3951:2: ( RULE_STRING )
            // InternalWebDsl.g:3952:3: RULE_STRING
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
    // InternalWebDsl.g:3961:1: rule__TypeSelection__VarAssignment_0_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeSelection__VarAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3965:1: ( ( ( RULE_ID ) ) )
            // InternalWebDsl.g:3966:2: ( ( RULE_ID ) )
            {
            // InternalWebDsl.g:3966:2: ( ( RULE_ID ) )
            // InternalWebDsl.g:3967:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeSelectionAccess().getVarVarCrossReference_0_2_1_0()); 
            // InternalWebDsl.g:3968:3: ( RULE_ID )
            // InternalWebDsl.g:3969:4: RULE_ID
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
    // InternalWebDsl.g:3980:1: rule__AssertContains__HtmlElementAssignment_1_0_0 : ( ruleHtmlElement ) ;
    public final void rule__AssertContains__HtmlElementAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3984:1: ( ( ruleHtmlElement ) )
            // InternalWebDsl.g:3985:2: ( ruleHtmlElement )
            {
            // InternalWebDsl.g:3985:2: ( ruleHtmlElement )
            // InternalWebDsl.g:3986:3: ruleHtmlElement
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
    // InternalWebDsl.g:3995:1: rule__AssertContains__AttributeAssignment_1_0_1 : ( ruleAttribute ) ;
    public final void rule__AssertContains__AttributeAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:3999:1: ( ( ruleAttribute ) )
            // InternalWebDsl.g:4000:2: ( ruleAttribute )
            {
            // InternalWebDsl.g:4000:2: ( ruleAttribute )
            // InternalWebDsl.g:4001:3: ruleAttribute
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
    // InternalWebDsl.g:4010:1: rule__AssertContains__TextAssignment_1_1 : ( ( 'TEXT' ) ) ;
    public final void rule__AssertContains__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:4014:1: ( ( ( 'TEXT' ) ) )
            // InternalWebDsl.g:4015:2: ( ( 'TEXT' ) )
            {
            // InternalWebDsl.g:4015:2: ( ( 'TEXT' ) )
            // InternalWebDsl.g:4016:3: ( 'TEXT' )
            {
             before(grammarAccess.getAssertContainsAccess().getTextTEXTKeyword_1_1_0()); 
            // InternalWebDsl.g:4017:3: ( 'TEXT' )
            // InternalWebDsl.g:4018:4: 'TEXT'
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
    // InternalWebDsl.g:4029:1: rule__AssertContains__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AssertContains__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:4033:1: ( ( RULE_STRING ) )
            // InternalWebDsl.g:4034:2: ( RULE_STRING )
            {
            // InternalWebDsl.g:4034:2: ( RULE_STRING )
            // InternalWebDsl.g:4035:3: RULE_STRING
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
    // InternalWebDsl.g:4044:1: rule__AssertEquals__C1Assignment_0 : ( ruleComparable ) ;
    public final void rule__AssertEquals__C1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:4048:1: ( ( ruleComparable ) )
            // InternalWebDsl.g:4049:2: ( ruleComparable )
            {
            // InternalWebDsl.g:4049:2: ( ruleComparable )
            // InternalWebDsl.g:4050:3: ruleComparable
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
    // InternalWebDsl.g:4059:1: rule__AssertEquals__C2Assignment_2 : ( ruleComparable ) ;
    public final void rule__AssertEquals__C2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:4063:1: ( ( ruleComparable ) )
            // InternalWebDsl.g:4064:2: ( ruleComparable )
            {
            // InternalWebDsl.g:4064:2: ( ruleComparable )
            // InternalWebDsl.g:4065:3: ruleComparable
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
    // InternalWebDsl.g:4074:1: rule__Comparable__VarAssignment_0_1 : ( ruleVar ) ;
    public final void rule__Comparable__VarAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:4078:1: ( ( ruleVar ) )
            // InternalWebDsl.g:4079:2: ( ruleVar )
            {
            // InternalWebDsl.g:4079:2: ( ruleVar )
            // InternalWebDsl.g:4080:3: ruleVar
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
    // InternalWebDsl.g:4089:1: rule__Comparable__HtmlElementAssignment_1_1 : ( ruleHtmlElement ) ;
    public final void rule__Comparable__HtmlElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:4093:1: ( ( ruleHtmlElement ) )
            // InternalWebDsl.g:4094:2: ( ruleHtmlElement )
            {
            // InternalWebDsl.g:4094:2: ( ruleHtmlElement )
            // InternalWebDsl.g:4095:3: ruleHtmlElement
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
    // InternalWebDsl.g:4104:1: rule__Comparable__AttributeAssignment_1_2 : ( ruleAttribute ) ;
    public final void rule__Comparable__AttributeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWebDsl.g:4108:1: ( ( ruleAttribute ) )
            // InternalWebDsl.g:4109:2: ( ruleAttribute )
            {
            // InternalWebDsl.g:4109:2: ( ruleAttribute )
            // InternalWebDsl.g:4110:3: ruleAttribute
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
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
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