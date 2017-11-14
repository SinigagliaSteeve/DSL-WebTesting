package fr.imta.renaud.ssinigaglia.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.imta.renaud.ssinigaglia.services.WebDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWebDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'open_browser'", "'go'", "'LINK'", "'BUTTON'", "'{'", "'click'", "'}'", "'SEARCH_FIELD'", "'DIV'", "'A'", "'CHECKBOX'", "'check'", "'uncheck'", "'COMBO_BOX'", "'select'", "'PAGE'", "'store'", "'()'", "'in'", "'set'", "':'", "'PARENT'", "'FIRST'", "'LAST'", "'ALL'", "'verify'", "'contains'", "'TEXT'", "'equals'", "'VAR:'", "'('", "')'", "'chrome'", "'firefox'", "'safari'", "'edge'", "'ie'", "'IMAGE'", "'LABEL'", "'ID'", "'CLASS'", "'ALT'", "'VALUE'", "'HREF'", "'TITLE'"
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

        public InternalWebDslParser(TokenStream input, WebDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected WebDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalWebDsl.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalWebDsl.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalWebDsl.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalWebDsl.g:72:1: ruleProgram returns [EObject current=null] : ( (lv_core_0_0= ruleCore ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_core_0_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:78:2: ( ( (lv_core_0_0= ruleCore ) ) )
            // InternalWebDsl.g:79:2: ( (lv_core_0_0= ruleCore ) )
            {
            // InternalWebDsl.g:79:2: ( (lv_core_0_0= ruleCore ) )
            // InternalWebDsl.g:80:3: (lv_core_0_0= ruleCore )
            {
            // InternalWebDsl.g:80:3: (lv_core_0_0= ruleCore )
            // InternalWebDsl.g:81:4: lv_core_0_0= ruleCore
            {

            				newCompositeNode(grammarAccess.getProgramAccess().getCoreCoreParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_core_0_0=ruleCore();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getProgramRule());
            				}
            				set(
            					current,
            					"core",
            					lv_core_0_0,
            					"fr.imta.renaud.ssinigaglia.WebDsl.Core");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleCore"
    // InternalWebDsl.g:101:1: entryRuleCore returns [EObject current=null] : iv_ruleCore= ruleCore EOF ;
    public final EObject entryRuleCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCore = null;


        try {
            // InternalWebDsl.g:101:45: (iv_ruleCore= ruleCore EOF )
            // InternalWebDsl.g:102:2: iv_ruleCore= ruleCore EOF
            {
             newCompositeNode(grammarAccess.getCoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCore=ruleCore();

            state._fsp--;

             current =iv_ruleCore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCore"


    // $ANTLR start "ruleCore"
    // InternalWebDsl.g:108:1: ruleCore returns [EObject current=null] : (otherlv_0= 'open_browser' ( (lv_name_1_0= ruleBrowser ) ) ( (lv_actions_2_0= ruleAction ) )* ) ;
    public final EObject ruleCore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_name_1_0 = null;

        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:114:2: ( (otherlv_0= 'open_browser' ( (lv_name_1_0= ruleBrowser ) ) ( (lv_actions_2_0= ruleAction ) )* ) )
            // InternalWebDsl.g:115:2: (otherlv_0= 'open_browser' ( (lv_name_1_0= ruleBrowser ) ) ( (lv_actions_2_0= ruleAction ) )* )
            {
            // InternalWebDsl.g:115:2: (otherlv_0= 'open_browser' ( (lv_name_1_0= ruleBrowser ) ) ( (lv_actions_2_0= ruleAction ) )* )
            // InternalWebDsl.g:116:3: otherlv_0= 'open_browser' ( (lv_name_1_0= ruleBrowser ) ) ( (lv_actions_2_0= ruleAction ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCoreAccess().getOpen_browserKeyword_0());
            		
            // InternalWebDsl.g:120:3: ( (lv_name_1_0= ruleBrowser ) )
            // InternalWebDsl.g:121:4: (lv_name_1_0= ruleBrowser )
            {
            // InternalWebDsl.g:121:4: (lv_name_1_0= ruleBrowser )
            // InternalWebDsl.g:122:5: lv_name_1_0= ruleBrowser
            {

            					newCompositeNode(grammarAccess.getCoreAccess().getNameBrowserEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleBrowser();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoreRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.Browser");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWebDsl.g:139:3: ( (lv_actions_2_0= ruleAction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=14)||(LA1_0>=18 && LA1_0<=21)||LA1_0==24||LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWebDsl.g:140:4: (lv_actions_2_0= ruleAction )
            	    {
            	    // InternalWebDsl.g:140:4: (lv_actions_2_0= ruleAction )
            	    // InternalWebDsl.g:141:5: lv_actions_2_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getCoreAccess().getActionsActionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_actions_2_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCoreRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_2_0,
            	    						"fr.imta.renaud.ssinigaglia.WebDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCore"


    // $ANTLR start "entryRuleAction"
    // InternalWebDsl.g:162:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalWebDsl.g:162:47: (iv_ruleAction= ruleAction EOF )
            // InternalWebDsl.g:163:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalWebDsl.g:169:1: ruleAction returns [EObject current=null] : ( ( (lv_goAction_0_0= ruleGoAction ) ) | ( (lv_selection_1_0= ruleSelection ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_goAction_0_0 = null;

        EObject lv_selection_1_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:175:2: ( ( ( (lv_goAction_0_0= ruleGoAction ) ) | ( (lv_selection_1_0= ruleSelection ) ) ) )
            // InternalWebDsl.g:176:2: ( ( (lv_goAction_0_0= ruleGoAction ) ) | ( (lv_selection_1_0= ruleSelection ) ) )
            {
            // InternalWebDsl.g:176:2: ( ( (lv_goAction_0_0= ruleGoAction ) ) | ( (lv_selection_1_0= ruleSelection ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=13 && LA2_0<=14)||(LA2_0>=18 && LA2_0<=21)||LA2_0==24||LA2_0==26) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWebDsl.g:177:3: ( (lv_goAction_0_0= ruleGoAction ) )
                    {
                    // InternalWebDsl.g:177:3: ( (lv_goAction_0_0= ruleGoAction ) )
                    // InternalWebDsl.g:178:4: (lv_goAction_0_0= ruleGoAction )
                    {
                    // InternalWebDsl.g:178:4: (lv_goAction_0_0= ruleGoAction )
                    // InternalWebDsl.g:179:5: lv_goAction_0_0= ruleGoAction
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getGoActionGoActionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_goAction_0_0=ruleGoAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"goAction",
                    						lv_goAction_0_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.GoAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:197:3: ( (lv_selection_1_0= ruleSelection ) )
                    {
                    // InternalWebDsl.g:197:3: ( (lv_selection_1_0= ruleSelection ) )
                    // InternalWebDsl.g:198:4: (lv_selection_1_0= ruleSelection )
                    {
                    // InternalWebDsl.g:198:4: (lv_selection_1_0= ruleSelection )
                    // InternalWebDsl.g:199:5: lv_selection_1_0= ruleSelection
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getSelectionSelectionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_selection_1_0=ruleSelection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"selection",
                    						lv_selection_1_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.Selection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleGoAction"
    // InternalWebDsl.g:220:1: entryRuleGoAction returns [EObject current=null] : iv_ruleGoAction= ruleGoAction EOF ;
    public final EObject entryRuleGoAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoAction = null;


        try {
            // InternalWebDsl.g:220:49: (iv_ruleGoAction= ruleGoAction EOF )
            // InternalWebDsl.g:221:2: iv_ruleGoAction= ruleGoAction EOF
            {
             newCompositeNode(grammarAccess.getGoActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoAction=ruleGoAction();

            state._fsp--;

             current =iv_ruleGoAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoAction"


    // $ANTLR start "ruleGoAction"
    // InternalWebDsl.g:227:1: ruleGoAction returns [EObject current=null] : (otherlv_0= 'go' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGoAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalWebDsl.g:233:2: ( (otherlv_0= 'go' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalWebDsl.g:234:2: (otherlv_0= 'go' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalWebDsl.g:234:2: (otherlv_0= 'go' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalWebDsl.g:235:3: otherlv_0= 'go' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGoActionAccess().getGoKeyword_0());
            		
            // InternalWebDsl.g:239:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalWebDsl.g:240:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalWebDsl.g:240:4: (lv_name_1_0= RULE_STRING )
            // InternalWebDsl.g:241:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGoActionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoAction"


    // $ANTLR start "entryRuleSelection"
    // InternalWebDsl.g:261:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // InternalWebDsl.g:261:50: (iv_ruleSelection= ruleSelection EOF )
            // InternalWebDsl.g:262:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // InternalWebDsl.g:268:1: ruleSelection returns [EObject current=null] : ( ( (lv_linkButtonSelection_0_0= ruleLinkButtonSelection ) ) | ( (lv_generalSelection_1_0= ruleGeneralSelection ) ) | ( (lv_checkboxSelection_2_0= ruleCheckboxSelection ) ) | ( (lv_comboboxSelection_3_0= ruleComboboxSelection ) ) | ( (lv_pageSelection_4_0= rulePageSelection ) ) ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        EObject lv_linkButtonSelection_0_0 = null;

        EObject lv_generalSelection_1_0 = null;

        EObject lv_checkboxSelection_2_0 = null;

        EObject lv_comboboxSelection_3_0 = null;

        EObject lv_pageSelection_4_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:274:2: ( ( ( (lv_linkButtonSelection_0_0= ruleLinkButtonSelection ) ) | ( (lv_generalSelection_1_0= ruleGeneralSelection ) ) | ( (lv_checkboxSelection_2_0= ruleCheckboxSelection ) ) | ( (lv_comboboxSelection_3_0= ruleComboboxSelection ) ) | ( (lv_pageSelection_4_0= rulePageSelection ) ) ) )
            // InternalWebDsl.g:275:2: ( ( (lv_linkButtonSelection_0_0= ruleLinkButtonSelection ) ) | ( (lv_generalSelection_1_0= ruleGeneralSelection ) ) | ( (lv_checkboxSelection_2_0= ruleCheckboxSelection ) ) | ( (lv_comboboxSelection_3_0= ruleComboboxSelection ) ) | ( (lv_pageSelection_4_0= rulePageSelection ) ) )
            {
            // InternalWebDsl.g:275:2: ( ( (lv_linkButtonSelection_0_0= ruleLinkButtonSelection ) ) | ( (lv_generalSelection_1_0= ruleGeneralSelection ) ) | ( (lv_checkboxSelection_2_0= ruleCheckboxSelection ) ) | ( (lv_comboboxSelection_3_0= ruleComboboxSelection ) ) | ( (lv_pageSelection_4_0= rulePageSelection ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
                {
                alt3=1;
                }
                break;
            case 18:
            case 19:
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            case 26:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalWebDsl.g:276:3: ( (lv_linkButtonSelection_0_0= ruleLinkButtonSelection ) )
                    {
                    // InternalWebDsl.g:276:3: ( (lv_linkButtonSelection_0_0= ruleLinkButtonSelection ) )
                    // InternalWebDsl.g:277:4: (lv_linkButtonSelection_0_0= ruleLinkButtonSelection )
                    {
                    // InternalWebDsl.g:277:4: (lv_linkButtonSelection_0_0= ruleLinkButtonSelection )
                    // InternalWebDsl.g:278:5: lv_linkButtonSelection_0_0= ruleLinkButtonSelection
                    {

                    					newCompositeNode(grammarAccess.getSelectionAccess().getLinkButtonSelectionLinkButtonSelectionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_linkButtonSelection_0_0=ruleLinkButtonSelection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectionRule());
                    					}
                    					set(
                    						current,
                    						"linkButtonSelection",
                    						lv_linkButtonSelection_0_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.LinkButtonSelection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:296:3: ( (lv_generalSelection_1_0= ruleGeneralSelection ) )
                    {
                    // InternalWebDsl.g:296:3: ( (lv_generalSelection_1_0= ruleGeneralSelection ) )
                    // InternalWebDsl.g:297:4: (lv_generalSelection_1_0= ruleGeneralSelection )
                    {
                    // InternalWebDsl.g:297:4: (lv_generalSelection_1_0= ruleGeneralSelection )
                    // InternalWebDsl.g:298:5: lv_generalSelection_1_0= ruleGeneralSelection
                    {

                    					newCompositeNode(grammarAccess.getSelectionAccess().getGeneralSelectionGeneralSelectionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_generalSelection_1_0=ruleGeneralSelection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectionRule());
                    					}
                    					set(
                    						current,
                    						"generalSelection",
                    						lv_generalSelection_1_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.GeneralSelection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:316:3: ( (lv_checkboxSelection_2_0= ruleCheckboxSelection ) )
                    {
                    // InternalWebDsl.g:316:3: ( (lv_checkboxSelection_2_0= ruleCheckboxSelection ) )
                    // InternalWebDsl.g:317:4: (lv_checkboxSelection_2_0= ruleCheckboxSelection )
                    {
                    // InternalWebDsl.g:317:4: (lv_checkboxSelection_2_0= ruleCheckboxSelection )
                    // InternalWebDsl.g:318:5: lv_checkboxSelection_2_0= ruleCheckboxSelection
                    {

                    					newCompositeNode(grammarAccess.getSelectionAccess().getCheckboxSelectionCheckboxSelectionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_checkboxSelection_2_0=ruleCheckboxSelection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectionRule());
                    					}
                    					set(
                    						current,
                    						"checkboxSelection",
                    						lv_checkboxSelection_2_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.CheckboxSelection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:336:3: ( (lv_comboboxSelection_3_0= ruleComboboxSelection ) )
                    {
                    // InternalWebDsl.g:336:3: ( (lv_comboboxSelection_3_0= ruleComboboxSelection ) )
                    // InternalWebDsl.g:337:4: (lv_comboboxSelection_3_0= ruleComboboxSelection )
                    {
                    // InternalWebDsl.g:337:4: (lv_comboboxSelection_3_0= ruleComboboxSelection )
                    // InternalWebDsl.g:338:5: lv_comboboxSelection_3_0= ruleComboboxSelection
                    {

                    					newCompositeNode(grammarAccess.getSelectionAccess().getComboboxSelectionComboboxSelectionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comboboxSelection_3_0=ruleComboboxSelection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectionRule());
                    					}
                    					set(
                    						current,
                    						"comboboxSelection",
                    						lv_comboboxSelection_3_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.ComboboxSelection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:356:3: ( (lv_pageSelection_4_0= rulePageSelection ) )
                    {
                    // InternalWebDsl.g:356:3: ( (lv_pageSelection_4_0= rulePageSelection ) )
                    // InternalWebDsl.g:357:4: (lv_pageSelection_4_0= rulePageSelection )
                    {
                    // InternalWebDsl.g:357:4: (lv_pageSelection_4_0= rulePageSelection )
                    // InternalWebDsl.g:358:5: lv_pageSelection_4_0= rulePageSelection
                    {

                    					newCompositeNode(grammarAccess.getSelectionAccess().getPageSelectionPageSelectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pageSelection_4_0=rulePageSelection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectionRule());
                    					}
                    					set(
                    						current,
                    						"pageSelection",
                    						lv_pageSelection_4_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.PageSelection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleLinkButtonSelection"
    // InternalWebDsl.g:379:1: entryRuleLinkButtonSelection returns [EObject current=null] : iv_ruleLinkButtonSelection= ruleLinkButtonSelection EOF ;
    public final EObject entryRuleLinkButtonSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkButtonSelection = null;


        try {
            // InternalWebDsl.g:379:60: (iv_ruleLinkButtonSelection= ruleLinkButtonSelection EOF )
            // InternalWebDsl.g:380:2: iv_ruleLinkButtonSelection= ruleLinkButtonSelection EOF
            {
             newCompositeNode(grammarAccess.getLinkButtonSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkButtonSelection=ruleLinkButtonSelection();

            state._fsp--;

             current =iv_ruleLinkButtonSelection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkButtonSelection"


    // $ANTLR start "ruleLinkButtonSelection"
    // InternalWebDsl.g:386:1: ruleLinkButtonSelection returns [EObject current=null] : ( (otherlv_0= 'LINK' | otherlv_1= 'BUTTON' ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) otherlv_3= '{' ( ( (lv_generalActions_4_0= ruleGeneralAction ) ) | otherlv_5= 'click' )* otherlv_6= '}' ) ;
    public final EObject ruleLinkButtonSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_typeSelection_2_0 = null;

        EObject lv_generalActions_4_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:392:2: ( ( (otherlv_0= 'LINK' | otherlv_1= 'BUTTON' ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) otherlv_3= '{' ( ( (lv_generalActions_4_0= ruleGeneralAction ) ) | otherlv_5= 'click' )* otherlv_6= '}' ) )
            // InternalWebDsl.g:393:2: ( (otherlv_0= 'LINK' | otherlv_1= 'BUTTON' ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) otherlv_3= '{' ( ( (lv_generalActions_4_0= ruleGeneralAction ) ) | otherlv_5= 'click' )* otherlv_6= '}' )
            {
            // InternalWebDsl.g:393:2: ( (otherlv_0= 'LINK' | otherlv_1= 'BUTTON' ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) otherlv_3= '{' ( ( (lv_generalActions_4_0= ruleGeneralAction ) ) | otherlv_5= 'click' )* otherlv_6= '}' )
            // InternalWebDsl.g:394:3: (otherlv_0= 'LINK' | otherlv_1= 'BUTTON' ) ( (lv_typeSelection_2_0= ruleTypeSelection ) ) otherlv_3= '{' ( ( (lv_generalActions_4_0= ruleGeneralAction ) ) | otherlv_5= 'click' )* otherlv_6= '}'
            {
            // InternalWebDsl.g:394:3: (otherlv_0= 'LINK' | otherlv_1= 'BUTTON' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalWebDsl.g:395:4: otherlv_0= 'LINK'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getLinkButtonSelectionAccess().getLINKKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:400:4: otherlv_1= 'BUTTON'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getLinkButtonSelectionAccess().getBUTTONKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalWebDsl.g:405:3: ( (lv_typeSelection_2_0= ruleTypeSelection ) )
            // InternalWebDsl.g:406:4: (lv_typeSelection_2_0= ruleTypeSelection )
            {
            // InternalWebDsl.g:406:4: (lv_typeSelection_2_0= ruleTypeSelection )
            // InternalWebDsl.g:407:5: lv_typeSelection_2_0= ruleTypeSelection
            {

            					newCompositeNode(grammarAccess.getLinkButtonSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_typeSelection_2_0=ruleTypeSelection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkButtonSelectionRule());
            					}
            					set(
            						current,
            						"typeSelection",
            						lv_typeSelection_2_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.TypeSelection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkButtonSelectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebDsl.g:428:3: ( ( (lv_generalActions_4_0= ruleGeneralAction ) ) | otherlv_5= 'click' )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=13 && LA5_0<=14)||(LA5_0>=18 && LA5_0<=21)||LA5_0==24||(LA5_0>=26 && LA5_0<=27)||LA5_0==30) ) {
                    alt5=1;
                }
                else if ( (LA5_0==16) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWebDsl.g:429:4: ( (lv_generalActions_4_0= ruleGeneralAction ) )
            	    {
            	    // InternalWebDsl.g:429:4: ( (lv_generalActions_4_0= ruleGeneralAction ) )
            	    // InternalWebDsl.g:430:5: (lv_generalActions_4_0= ruleGeneralAction )
            	    {
            	    // InternalWebDsl.g:430:5: (lv_generalActions_4_0= ruleGeneralAction )
            	    // InternalWebDsl.g:431:6: lv_generalActions_4_0= ruleGeneralAction
            	    {

            	    						newCompositeNode(grammarAccess.getLinkButtonSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_generalActions_4_0=ruleGeneralAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLinkButtonSelectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"generalActions",
            	    							lv_generalActions_4_0,
            	    							"fr.imta.renaud.ssinigaglia.WebDsl.GeneralAction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalWebDsl.g:449:4: otherlv_5= 'click'
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_8); 

            	    				newLeafNode(otherlv_5, grammarAccess.getLinkButtonSelectionAccess().getClickKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLinkButtonSelectionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkButtonSelection"


    // $ANTLR start "entryRuleGeneralSelection"
    // InternalWebDsl.g:462:1: entryRuleGeneralSelection returns [EObject current=null] : iv_ruleGeneralSelection= ruleGeneralSelection EOF ;
    public final EObject entryRuleGeneralSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralSelection = null;


        try {
            // InternalWebDsl.g:462:57: (iv_ruleGeneralSelection= ruleGeneralSelection EOF )
            // InternalWebDsl.g:463:2: iv_ruleGeneralSelection= ruleGeneralSelection EOF
            {
             newCompositeNode(grammarAccess.getGeneralSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralSelection=ruleGeneralSelection();

            state._fsp--;

             current =iv_ruleGeneralSelection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralSelection"


    // $ANTLR start "ruleGeneralSelection"
    // InternalWebDsl.g:469:1: ruleGeneralSelection returns [EObject current=null] : ( (otherlv_0= 'SEARCH_FIELD' | otherlv_1= 'DIV' | otherlv_2= 'A' ) ( (lv_typeSelection_3_0= ruleTypeSelection ) ) otherlv_4= '{' ( (lv_generalActions_5_0= ruleGeneralAction ) )* otherlv_6= '}' ) ;
    public final EObject ruleGeneralSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_typeSelection_3_0 = null;

        EObject lv_generalActions_5_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:475:2: ( ( (otherlv_0= 'SEARCH_FIELD' | otherlv_1= 'DIV' | otherlv_2= 'A' ) ( (lv_typeSelection_3_0= ruleTypeSelection ) ) otherlv_4= '{' ( (lv_generalActions_5_0= ruleGeneralAction ) )* otherlv_6= '}' ) )
            // InternalWebDsl.g:476:2: ( (otherlv_0= 'SEARCH_FIELD' | otherlv_1= 'DIV' | otherlv_2= 'A' ) ( (lv_typeSelection_3_0= ruleTypeSelection ) ) otherlv_4= '{' ( (lv_generalActions_5_0= ruleGeneralAction ) )* otherlv_6= '}' )
            {
            // InternalWebDsl.g:476:2: ( (otherlv_0= 'SEARCH_FIELD' | otherlv_1= 'DIV' | otherlv_2= 'A' ) ( (lv_typeSelection_3_0= ruleTypeSelection ) ) otherlv_4= '{' ( (lv_generalActions_5_0= ruleGeneralAction ) )* otherlv_6= '}' )
            // InternalWebDsl.g:477:3: (otherlv_0= 'SEARCH_FIELD' | otherlv_1= 'DIV' | otherlv_2= 'A' ) ( (lv_typeSelection_3_0= ruleTypeSelection ) ) otherlv_4= '{' ( (lv_generalActions_5_0= ruleGeneralAction ) )* otherlv_6= '}'
            {
            // InternalWebDsl.g:477:3: (otherlv_0= 'SEARCH_FIELD' | otherlv_1= 'DIV' | otherlv_2= 'A' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
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
                    // InternalWebDsl.g:478:4: otherlv_0= 'SEARCH_FIELD'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getGeneralSelectionAccess().getSEARCH_FIELDKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:483:4: otherlv_1= 'DIV'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getGeneralSelectionAccess().getDIVKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:488:4: otherlv_2= 'A'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getGeneralSelectionAccess().getAKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalWebDsl.g:493:3: ( (lv_typeSelection_3_0= ruleTypeSelection ) )
            // InternalWebDsl.g:494:4: (lv_typeSelection_3_0= ruleTypeSelection )
            {
            // InternalWebDsl.g:494:4: (lv_typeSelection_3_0= ruleTypeSelection )
            // InternalWebDsl.g:495:5: lv_typeSelection_3_0= ruleTypeSelection
            {

            					newCompositeNode(grammarAccess.getGeneralSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_typeSelection_3_0=ruleTypeSelection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeneralSelectionRule());
            					}
            					set(
            						current,
            						"typeSelection",
            						lv_typeSelection_3_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.TypeSelection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneralSelectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebDsl.g:516:3: ( (lv_generalActions_5_0= ruleGeneralAction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=13 && LA7_0<=14)||(LA7_0>=18 && LA7_0<=21)||LA7_0==24||(LA7_0>=26 && LA7_0<=27)||LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWebDsl.g:517:4: (lv_generalActions_5_0= ruleGeneralAction )
            	    {
            	    // InternalWebDsl.g:517:4: (lv_generalActions_5_0= ruleGeneralAction )
            	    // InternalWebDsl.g:518:5: lv_generalActions_5_0= ruleGeneralAction
            	    {

            	    					newCompositeNode(grammarAccess.getGeneralSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_generalActions_5_0=ruleGeneralAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGeneralSelectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"generalActions",
            	    						lv_generalActions_5_0,
            	    						"fr.imta.renaud.ssinigaglia.WebDsl.GeneralAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGeneralSelectionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralSelection"


    // $ANTLR start "entryRuleCheckboxSelection"
    // InternalWebDsl.g:543:1: entryRuleCheckboxSelection returns [EObject current=null] : iv_ruleCheckboxSelection= ruleCheckboxSelection EOF ;
    public final EObject entryRuleCheckboxSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckboxSelection = null;


        try {
            // InternalWebDsl.g:543:58: (iv_ruleCheckboxSelection= ruleCheckboxSelection EOF )
            // InternalWebDsl.g:544:2: iv_ruleCheckboxSelection= ruleCheckboxSelection EOF
            {
             newCompositeNode(grammarAccess.getCheckboxSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckboxSelection=ruleCheckboxSelection();

            state._fsp--;

             current =iv_ruleCheckboxSelection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckboxSelection"


    // $ANTLR start "ruleCheckboxSelection"
    // InternalWebDsl.g:550:1: ruleCheckboxSelection returns [EObject current=null] : (otherlv_0= 'CHECKBOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | otherlv_4= 'check' | otherlv_5= 'uncheck' )* otherlv_6= '}' ) ;
    public final EObject ruleCheckboxSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_typeSelection_1_0 = null;

        EObject lv_generalActions_3_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:556:2: ( (otherlv_0= 'CHECKBOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | otherlv_4= 'check' | otherlv_5= 'uncheck' )* otherlv_6= '}' ) )
            // InternalWebDsl.g:557:2: (otherlv_0= 'CHECKBOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | otherlv_4= 'check' | otherlv_5= 'uncheck' )* otherlv_6= '}' )
            {
            // InternalWebDsl.g:557:2: (otherlv_0= 'CHECKBOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | otherlv_4= 'check' | otherlv_5= 'uncheck' )* otherlv_6= '}' )
            // InternalWebDsl.g:558:3: otherlv_0= 'CHECKBOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | otherlv_4= 'check' | otherlv_5= 'uncheck' )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckboxSelectionAccess().getCHECKBOXKeyword_0());
            		
            // InternalWebDsl.g:562:3: ( (lv_typeSelection_1_0= ruleTypeSelection ) )
            // InternalWebDsl.g:563:4: (lv_typeSelection_1_0= ruleTypeSelection )
            {
            // InternalWebDsl.g:563:4: (lv_typeSelection_1_0= ruleTypeSelection )
            // InternalWebDsl.g:564:5: lv_typeSelection_1_0= ruleTypeSelection
            {

            					newCompositeNode(grammarAccess.getCheckboxSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_typeSelection_1_0=ruleTypeSelection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckboxSelectionRule());
            					}
            					set(
            						current,
            						"typeSelection",
            						lv_typeSelection_1_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.TypeSelection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getCheckboxSelectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebDsl.g:585:3: ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | otherlv_4= 'check' | otherlv_5= 'uncheck' )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case 13:
                case 14:
                case 18:
                case 19:
                case 20:
                case 21:
                case 24:
                case 26:
                case 27:
                case 30:
                    {
                    alt8=1;
                    }
                    break;
                case 22:
                    {
                    alt8=2;
                    }
                    break;
                case 23:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalWebDsl.g:586:4: ( (lv_generalActions_3_0= ruleGeneralAction ) )
            	    {
            	    // InternalWebDsl.g:586:4: ( (lv_generalActions_3_0= ruleGeneralAction ) )
            	    // InternalWebDsl.g:587:5: (lv_generalActions_3_0= ruleGeneralAction )
            	    {
            	    // InternalWebDsl.g:587:5: (lv_generalActions_3_0= ruleGeneralAction )
            	    // InternalWebDsl.g:588:6: lv_generalActions_3_0= ruleGeneralAction
            	    {

            	    						newCompositeNode(grammarAccess.getCheckboxSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_generalActions_3_0=ruleGeneralAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCheckboxSelectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"generalActions",
            	    							lv_generalActions_3_0,
            	    							"fr.imta.renaud.ssinigaglia.WebDsl.GeneralAction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalWebDsl.g:606:4: otherlv_4= 'check'
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCheckboxSelectionAccess().getCheckKeyword_3_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalWebDsl.g:611:4: otherlv_5= 'uncheck'
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_10); 

            	    				newLeafNode(otherlv_5, grammarAccess.getCheckboxSelectionAccess().getUncheckKeyword_3_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCheckboxSelectionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckboxSelection"


    // $ANTLR start "entryRuleComboboxSelection"
    // InternalWebDsl.g:624:1: entryRuleComboboxSelection returns [EObject current=null] : iv_ruleComboboxSelection= ruleComboboxSelection EOF ;
    public final EObject entryRuleComboboxSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComboboxSelection = null;


        try {
            // InternalWebDsl.g:624:58: (iv_ruleComboboxSelection= ruleComboboxSelection EOF )
            // InternalWebDsl.g:625:2: iv_ruleComboboxSelection= ruleComboboxSelection EOF
            {
             newCompositeNode(grammarAccess.getComboboxSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComboboxSelection=ruleComboboxSelection();

            state._fsp--;

             current =iv_ruleComboboxSelection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComboboxSelection"


    // $ANTLR start "ruleComboboxSelection"
    // InternalWebDsl.g:631:1: ruleComboboxSelection returns [EObject current=null] : (otherlv_0= 'COMBO_BOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )* otherlv_6= '}' ) ;
    public final EObject ruleComboboxSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_STRING_5=null;
        Token otherlv_6=null;
        EObject lv_typeSelection_1_0 = null;

        EObject lv_generalActions_3_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:637:2: ( (otherlv_0= 'COMBO_BOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )* otherlv_6= '}' ) )
            // InternalWebDsl.g:638:2: (otherlv_0= 'COMBO_BOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )* otherlv_6= '}' )
            {
            // InternalWebDsl.g:638:2: (otherlv_0= 'COMBO_BOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )* otherlv_6= '}' )
            // InternalWebDsl.g:639:3: otherlv_0= 'COMBO_BOX' ( (lv_typeSelection_1_0= ruleTypeSelection ) ) otherlv_2= '{' ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComboboxSelectionAccess().getCOMBO_BOXKeyword_0());
            		
            // InternalWebDsl.g:643:3: ( (lv_typeSelection_1_0= ruleTypeSelection ) )
            // InternalWebDsl.g:644:4: (lv_typeSelection_1_0= ruleTypeSelection )
            {
            // InternalWebDsl.g:644:4: (lv_typeSelection_1_0= ruleTypeSelection )
            // InternalWebDsl.g:645:5: lv_typeSelection_1_0= ruleTypeSelection
            {

            					newCompositeNode(grammarAccess.getComboboxSelectionAccess().getTypeSelectionTypeSelectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_typeSelection_1_0=ruleTypeSelection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComboboxSelectionRule());
            					}
            					set(
            						current,
            						"typeSelection",
            						lv_typeSelection_1_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.TypeSelection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getComboboxSelectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalWebDsl.g:666:3: ( ( (lv_generalActions_3_0= ruleGeneralAction ) ) | (otherlv_4= 'select' this_STRING_5= RULE_STRING ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=13 && LA9_0<=14)||(LA9_0>=18 && LA9_0<=21)||LA9_0==24||(LA9_0>=26 && LA9_0<=27)||LA9_0==30) ) {
                    alt9=1;
                }
                else if ( (LA9_0==25) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWebDsl.g:667:4: ( (lv_generalActions_3_0= ruleGeneralAction ) )
            	    {
            	    // InternalWebDsl.g:667:4: ( (lv_generalActions_3_0= ruleGeneralAction ) )
            	    // InternalWebDsl.g:668:5: (lv_generalActions_3_0= ruleGeneralAction )
            	    {
            	    // InternalWebDsl.g:668:5: (lv_generalActions_3_0= ruleGeneralAction )
            	    // InternalWebDsl.g:669:6: lv_generalActions_3_0= ruleGeneralAction
            	    {

            	    						newCompositeNode(grammarAccess.getComboboxSelectionAccess().getGeneralActionsGeneralActionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_generalActions_3_0=ruleGeneralAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComboboxSelectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"generalActions",
            	    							lv_generalActions_3_0,
            	    							"fr.imta.renaud.ssinigaglia.WebDsl.GeneralAction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalWebDsl.g:687:4: (otherlv_4= 'select' this_STRING_5= RULE_STRING )
            	    {
            	    // InternalWebDsl.g:687:4: (otherlv_4= 'select' this_STRING_5= RULE_STRING )
            	    // InternalWebDsl.g:688:5: otherlv_4= 'select' this_STRING_5= RULE_STRING
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_5); 

            	    					newLeafNode(otherlv_4, grammarAccess.getComboboxSelectionAccess().getSelectKeyword_3_1_0());
            	    				
            	    this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    					newLeafNode(this_STRING_5, grammarAccess.getComboboxSelectionAccess().getSTRINGTerminalRuleCall_3_1_1());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComboboxSelectionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComboboxSelection"


    // $ANTLR start "entryRulePageSelection"
    // InternalWebDsl.g:706:1: entryRulePageSelection returns [EObject current=null] : iv_rulePageSelection= rulePageSelection EOF ;
    public final EObject entryRulePageSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageSelection = null;


        try {
            // InternalWebDsl.g:706:54: (iv_rulePageSelection= rulePageSelection EOF )
            // InternalWebDsl.g:707:2: iv_rulePageSelection= rulePageSelection EOF
            {
             newCompositeNode(grammarAccess.getPageSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageSelection=rulePageSelection();

            state._fsp--;

             current =iv_rulePageSelection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageSelection"


    // $ANTLR start "rulePageSelection"
    // InternalWebDsl.g:713:1: rulePageSelection returns [EObject current=null] : (otherlv_0= 'PAGE' otherlv_1= '{' ( ( (lv_storeAction_2_0= ruleStoreAction ) ) | ( (lv_assertion_3_0= ruleAssert ) ) )* otherlv_4= '}' ) ;
    public final EObject rulePageSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_storeAction_2_0 = null;

        EObject lv_assertion_3_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:719:2: ( (otherlv_0= 'PAGE' otherlv_1= '{' ( ( (lv_storeAction_2_0= ruleStoreAction ) ) | ( (lv_assertion_3_0= ruleAssert ) ) )* otherlv_4= '}' ) )
            // InternalWebDsl.g:720:2: (otherlv_0= 'PAGE' otherlv_1= '{' ( ( (lv_storeAction_2_0= ruleStoreAction ) ) | ( (lv_assertion_3_0= ruleAssert ) ) )* otherlv_4= '}' )
            {
            // InternalWebDsl.g:720:2: (otherlv_0= 'PAGE' otherlv_1= '{' ( ( (lv_storeAction_2_0= ruleStoreAction ) ) | ( (lv_assertion_3_0= ruleAssert ) ) )* otherlv_4= '}' )
            // InternalWebDsl.g:721:3: otherlv_0= 'PAGE' otherlv_1= '{' ( ( (lv_storeAction_2_0= ruleStoreAction ) ) | ( (lv_assertion_3_0= ruleAssert ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPageSelectionAccess().getPAGEKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getPageSelectionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWebDsl.g:729:3: ( ( (lv_storeAction_2_0= ruleStoreAction ) ) | ( (lv_assertion_3_0= ruleAssert ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }
                else if ( (LA10_0==36) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalWebDsl.g:730:4: ( (lv_storeAction_2_0= ruleStoreAction ) )
            	    {
            	    // InternalWebDsl.g:730:4: ( (lv_storeAction_2_0= ruleStoreAction ) )
            	    // InternalWebDsl.g:731:5: (lv_storeAction_2_0= ruleStoreAction )
            	    {
            	    // InternalWebDsl.g:731:5: (lv_storeAction_2_0= ruleStoreAction )
            	    // InternalWebDsl.g:732:6: lv_storeAction_2_0= ruleStoreAction
            	    {

            	    						newCompositeNode(grammarAccess.getPageSelectionAccess().getStoreActionStoreActionParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_storeAction_2_0=ruleStoreAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPageSelectionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"storeAction",
            	    							lv_storeAction_2_0,
            	    							"fr.imta.renaud.ssinigaglia.WebDsl.StoreAction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalWebDsl.g:750:4: ( (lv_assertion_3_0= ruleAssert ) )
            	    {
            	    // InternalWebDsl.g:750:4: ( (lv_assertion_3_0= ruleAssert ) )
            	    // InternalWebDsl.g:751:5: (lv_assertion_3_0= ruleAssert )
            	    {
            	    // InternalWebDsl.g:751:5: (lv_assertion_3_0= ruleAssert )
            	    // InternalWebDsl.g:752:6: lv_assertion_3_0= ruleAssert
            	    {

            	    						newCompositeNode(grammarAccess.getPageSelectionAccess().getAssertionAssertParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_assertion_3_0=ruleAssert();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPageSelectionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"assertion",
            	    							lv_assertion_3_0,
            	    							"fr.imta.renaud.ssinigaglia.WebDsl.Assert");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPageSelectionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageSelection"


    // $ANTLR start "entryRuleGeneralAction"
    // InternalWebDsl.g:778:1: entryRuleGeneralAction returns [EObject current=null] : iv_ruleGeneralAction= ruleGeneralAction EOF ;
    public final EObject entryRuleGeneralAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralAction = null;


        try {
            // InternalWebDsl.g:778:54: (iv_ruleGeneralAction= ruleGeneralAction EOF )
            // InternalWebDsl.g:779:2: iv_ruleGeneralAction= ruleGeneralAction EOF
            {
             newCompositeNode(grammarAccess.getGeneralActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralAction=ruleGeneralAction();

            state._fsp--;

             current =iv_ruleGeneralAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralAction"


    // $ANTLR start "ruleGeneralAction"
    // InternalWebDsl.g:785:1: ruleGeneralAction returns [EObject current=null] : ( ( (lv_setAction_0_0= ruleSetAction ) ) | ( (lv_storeAction_1_0= ruleStoreAction ) ) | ( (lv_selection_2_0= ruleSelection ) ) ) ;
    public final EObject ruleGeneralAction() throws RecognitionException {
        EObject current = null;

        EObject lv_setAction_0_0 = null;

        EObject lv_storeAction_1_0 = null;

        EObject lv_selection_2_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:791:2: ( ( ( (lv_setAction_0_0= ruleSetAction ) ) | ( (lv_storeAction_1_0= ruleStoreAction ) ) | ( (lv_selection_2_0= ruleSelection ) ) ) )
            // InternalWebDsl.g:792:2: ( ( (lv_setAction_0_0= ruleSetAction ) ) | ( (lv_storeAction_1_0= ruleStoreAction ) ) | ( (lv_selection_2_0= ruleSelection ) ) )
            {
            // InternalWebDsl.g:792:2: ( ( (lv_setAction_0_0= ruleSetAction ) ) | ( (lv_storeAction_1_0= ruleStoreAction ) ) | ( (lv_selection_2_0= ruleSelection ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 13:
            case 14:
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
            case 26:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalWebDsl.g:793:3: ( (lv_setAction_0_0= ruleSetAction ) )
                    {
                    // InternalWebDsl.g:793:3: ( (lv_setAction_0_0= ruleSetAction ) )
                    // InternalWebDsl.g:794:4: (lv_setAction_0_0= ruleSetAction )
                    {
                    // InternalWebDsl.g:794:4: (lv_setAction_0_0= ruleSetAction )
                    // InternalWebDsl.g:795:5: lv_setAction_0_0= ruleSetAction
                    {

                    					newCompositeNode(grammarAccess.getGeneralActionAccess().getSetActionSetActionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_setAction_0_0=ruleSetAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGeneralActionRule());
                    					}
                    					set(
                    						current,
                    						"setAction",
                    						lv_setAction_0_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.SetAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:813:3: ( (lv_storeAction_1_0= ruleStoreAction ) )
                    {
                    // InternalWebDsl.g:813:3: ( (lv_storeAction_1_0= ruleStoreAction ) )
                    // InternalWebDsl.g:814:4: (lv_storeAction_1_0= ruleStoreAction )
                    {
                    // InternalWebDsl.g:814:4: (lv_storeAction_1_0= ruleStoreAction )
                    // InternalWebDsl.g:815:5: lv_storeAction_1_0= ruleStoreAction
                    {

                    					newCompositeNode(grammarAccess.getGeneralActionAccess().getStoreActionStoreActionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_storeAction_1_0=ruleStoreAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGeneralActionRule());
                    					}
                    					set(
                    						current,
                    						"storeAction",
                    						lv_storeAction_1_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.StoreAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:833:3: ( (lv_selection_2_0= ruleSelection ) )
                    {
                    // InternalWebDsl.g:833:3: ( (lv_selection_2_0= ruleSelection ) )
                    // InternalWebDsl.g:834:4: (lv_selection_2_0= ruleSelection )
                    {
                    // InternalWebDsl.g:834:4: (lv_selection_2_0= ruleSelection )
                    // InternalWebDsl.g:835:5: lv_selection_2_0= ruleSelection
                    {

                    					newCompositeNode(grammarAccess.getGeneralActionAccess().getSelectionSelectionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_selection_2_0=ruleSelection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGeneralActionRule());
                    					}
                    					set(
                    						current,
                    						"selection",
                    						lv_selection_2_0,
                    						"fr.imta.renaud.ssinigaglia.WebDsl.Selection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralAction"


    // $ANTLR start "entryRuleStoreAction"
    // InternalWebDsl.g:856:1: entryRuleStoreAction returns [EObject current=null] : iv_ruleStoreAction= ruleStoreAction EOF ;
    public final EObject entryRuleStoreAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreAction = null;


        try {
            // InternalWebDsl.g:856:52: (iv_ruleStoreAction= ruleStoreAction EOF )
            // InternalWebDsl.g:857:2: iv_ruleStoreAction= ruleStoreAction EOF
            {
             newCompositeNode(grammarAccess.getStoreActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStoreAction=ruleStoreAction();

            state._fsp--;

             current =iv_ruleStoreAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStoreAction"


    // $ANTLR start "ruleStoreAction"
    // InternalWebDsl.g:863:1: ruleStoreAction returns [EObject current=null] : (otherlv_0= 'store' otherlv_1= '()' otherlv_2= 'in' ( (lv_var_3_0= ruleVar ) ) ) ;
    public final EObject ruleStoreAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_var_3_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:869:2: ( (otherlv_0= 'store' otherlv_1= '()' otherlv_2= 'in' ( (lv_var_3_0= ruleVar ) ) ) )
            // InternalWebDsl.g:870:2: (otherlv_0= 'store' otherlv_1= '()' otherlv_2= 'in' ( (lv_var_3_0= ruleVar ) ) )
            {
            // InternalWebDsl.g:870:2: (otherlv_0= 'store' otherlv_1= '()' otherlv_2= 'in' ( (lv_var_3_0= ruleVar ) ) )
            // InternalWebDsl.g:871:3: otherlv_0= 'store' otherlv_1= '()' otherlv_2= 'in' ( (lv_var_3_0= ruleVar ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreActionAccess().getStoreKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getStoreActionAccess().getLeftParenthesisRightParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreActionAccess().getInKeyword_2());
            		
            // InternalWebDsl.g:883:3: ( (lv_var_3_0= ruleVar ) )
            // InternalWebDsl.g:884:4: (lv_var_3_0= ruleVar )
            {
            // InternalWebDsl.g:884:4: (lv_var_3_0= ruleVar )
            // InternalWebDsl.g:885:5: lv_var_3_0= ruleVar
            {

            					newCompositeNode(grammarAccess.getStoreActionAccess().getVarVarParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_3_0=ruleVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoreActionRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_3_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.Var");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStoreAction"


    // $ANTLR start "entryRuleVar"
    // InternalWebDsl.g:906:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalWebDsl.g:906:44: (iv_ruleVar= ruleVar EOF )
            // InternalWebDsl.g:907:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalWebDsl.g:913:1: ruleVar returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalWebDsl.g:919:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalWebDsl.g:920:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalWebDsl.g:920:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalWebDsl.g:921:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalWebDsl.g:921:3: (lv_name_0_0= RULE_STRING )
            // InternalWebDsl.g:922:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVarAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVarRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleSetAction"
    // InternalWebDsl.g:941:1: entryRuleSetAction returns [EObject current=null] : iv_ruleSetAction= ruleSetAction EOF ;
    public final EObject entryRuleSetAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetAction = null;


        try {
            // InternalWebDsl.g:941:50: (iv_ruleSetAction= ruleSetAction EOF )
            // InternalWebDsl.g:942:2: iv_ruleSetAction= ruleSetAction EOF
            {
             newCompositeNode(grammarAccess.getSetActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetAction=ruleSetAction();

            state._fsp--;

             current =iv_ruleSetAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetAction"


    // $ANTLR start "ruleSetAction"
    // InternalWebDsl.g:948:1: ruleSetAction returns [EObject current=null] : (otherlv_0= 'set' ( (lv_attribute_1_0= ruleAttribute ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSetAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Enumerator lv_attribute_1_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:954:2: ( (otherlv_0= 'set' ( (lv_attribute_1_0= ruleAttribute ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalWebDsl.g:955:2: (otherlv_0= 'set' ( (lv_attribute_1_0= ruleAttribute ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalWebDsl.g:955:2: (otherlv_0= 'set' ( (lv_attribute_1_0= ruleAttribute ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalWebDsl.g:956:3: otherlv_0= 'set' ( (lv_attribute_1_0= ruleAttribute ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSetActionAccess().getSetKeyword_0());
            		
            // InternalWebDsl.g:960:3: ( (lv_attribute_1_0= ruleAttribute ) )
            // InternalWebDsl.g:961:4: (lv_attribute_1_0= ruleAttribute )
            {
            // InternalWebDsl.g:961:4: (lv_attribute_1_0= ruleAttribute )
            // InternalWebDsl.g:962:5: lv_attribute_1_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getSetActionAccess().getAttributeAttributeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_attribute_1_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetActionRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_1_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSetActionAccess().getColonKeyword_2());
            		
            // InternalWebDsl.g:983:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalWebDsl.g:984:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalWebDsl.g:984:4: (lv_value_3_0= RULE_STRING )
            // InternalWebDsl.g:985:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getSetActionAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetAction"


    // $ANTLR start "entryRuleTypeSelection"
    // InternalWebDsl.g:1005:1: entryRuleTypeSelection returns [EObject current=null] : iv_ruleTypeSelection= ruleTypeSelection EOF ;
    public final EObject entryRuleTypeSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSelection = null;


        try {
            // InternalWebDsl.g:1005:54: (iv_ruleTypeSelection= ruleTypeSelection EOF )
            // InternalWebDsl.g:1006:2: iv_ruleTypeSelection= ruleTypeSelection EOF
            {
             newCompositeNode(grammarAccess.getTypeSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeSelection=ruleTypeSelection();

            state._fsp--;

             current =iv_ruleTypeSelection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSelection"


    // $ANTLR start "ruleTypeSelection"
    // InternalWebDsl.g:1012:1: ruleTypeSelection returns [EObject current=null] : ( ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) | otherlv_3= 'PARENT' | otherlv_4= 'FIRST' | otherlv_5= 'LAST' | otherlv_6= 'ALL' ) ;
    public final EObject ruleTypeSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_attribute_0_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1018:2: ( ( ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) | otherlv_3= 'PARENT' | otherlv_4= 'FIRST' | otherlv_5= 'LAST' | otherlv_6= 'ALL' ) )
            // InternalWebDsl.g:1019:2: ( ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) | otherlv_3= 'PARENT' | otherlv_4= 'FIRST' | otherlv_5= 'LAST' | otherlv_6= 'ALL' )
            {
            // InternalWebDsl.g:1019:2: ( ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) | otherlv_3= 'PARENT' | otherlv_4= 'FIRST' | otherlv_5= 'LAST' | otherlv_6= 'ALL' )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt12=1;
                }
                break;
            case 32:
                {
                alt12=2;
                }
                break;
            case 33:
                {
                alt12=3;
                }
                break;
            case 34:
                {
                alt12=4;
                }
                break;
            case 35:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalWebDsl.g:1020:3: ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
                    {
                    // InternalWebDsl.g:1020:3: ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
                    // InternalWebDsl.g:1021:4: ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // InternalWebDsl.g:1021:4: ( (lv_attribute_0_0= ruleAttribute ) )
                    // InternalWebDsl.g:1022:5: (lv_attribute_0_0= ruleAttribute )
                    {
                    // InternalWebDsl.g:1022:5: (lv_attribute_0_0= ruleAttribute )
                    // InternalWebDsl.g:1023:6: lv_attribute_0_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getTypeSelectionAccess().getAttributeAttributeEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_attribute_0_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeSelectionRule());
                    						}
                    						set(
                    							current,
                    							"attribute",
                    							lv_attribute_0_0,
                    							"fr.imta.renaud.ssinigaglia.WebDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeSelectionAccess().getColonKeyword_0_1());
                    			
                    // InternalWebDsl.g:1044:4: ( (lv_value_2_0= RULE_STRING ) )
                    // InternalWebDsl.g:1045:5: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalWebDsl.g:1045:5: (lv_value_2_0= RULE_STRING )
                    // InternalWebDsl.g:1046:6: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getTypeSelectionAccess().getValueSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeSelectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1064:3: otherlv_3= 'PARENT'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    			newLeafNode(otherlv_3, grammarAccess.getTypeSelectionAccess().getPARENTKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1069:3: otherlv_4= 'FIRST'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_2); 

                    			newLeafNode(otherlv_4, grammarAccess.getTypeSelectionAccess().getFIRSTKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1074:3: otherlv_5= 'LAST'
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_2); 

                    			newLeafNode(otherlv_5, grammarAccess.getTypeSelectionAccess().getLASTKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1079:3: otherlv_6= 'ALL'
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_2); 

                    			newLeafNode(otherlv_6, grammarAccess.getTypeSelectionAccess().getALLKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSelection"


    // $ANTLR start "entryRuleAssert"
    // InternalWebDsl.g:1087:1: entryRuleAssert returns [EObject current=null] : iv_ruleAssert= ruleAssert EOF ;
    public final EObject entryRuleAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert = null;


        try {
            // InternalWebDsl.g:1087:47: (iv_ruleAssert= ruleAssert EOF )
            // InternalWebDsl.g:1088:2: iv_ruleAssert= ruleAssert EOF
            {
             newCompositeNode(grammarAccess.getAssertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssert=ruleAssert();

            state._fsp--;

             current =iv_ruleAssert; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssert"


    // $ANTLR start "ruleAssert"
    // InternalWebDsl.g:1094:1: ruleAssert returns [EObject current=null] : (otherlv_0= 'verify' ( ( (lv_assertContain_1_0= ruleAssertContains ) ) | ( (lv_assertEquals_2_0= ruleAssertEquals ) ) ) ) ;
    public final EObject ruleAssert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_assertContain_1_0 = null;

        EObject lv_assertEquals_2_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1100:2: ( (otherlv_0= 'verify' ( ( (lv_assertContain_1_0= ruleAssertContains ) ) | ( (lv_assertEquals_2_0= ruleAssertEquals ) ) ) ) )
            // InternalWebDsl.g:1101:2: (otherlv_0= 'verify' ( ( (lv_assertContain_1_0= ruleAssertContains ) ) | ( (lv_assertEquals_2_0= ruleAssertEquals ) ) ) )
            {
            // InternalWebDsl.g:1101:2: (otherlv_0= 'verify' ( ( (lv_assertContain_1_0= ruleAssertContains ) ) | ( (lv_assertEquals_2_0= ruleAssertEquals ) ) ) )
            // InternalWebDsl.g:1102:3: otherlv_0= 'verify' ( ( (lv_assertContain_1_0= ruleAssertContains ) ) | ( (lv_assertEquals_2_0= ruleAssertEquals ) ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertAccess().getVerifyKeyword_0());
            		
            // InternalWebDsl.g:1106:3: ( ( (lv_assertContain_1_0= ruleAssertContains ) ) | ( (lv_assertEquals_2_0= ruleAssertEquals ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING||(LA13_0>=40 && LA13_0<=41)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalWebDsl.g:1107:4: ( (lv_assertContain_1_0= ruleAssertContains ) )
                    {
                    // InternalWebDsl.g:1107:4: ( (lv_assertContain_1_0= ruleAssertContains ) )
                    // InternalWebDsl.g:1108:5: (lv_assertContain_1_0= ruleAssertContains )
                    {
                    // InternalWebDsl.g:1108:5: (lv_assertContain_1_0= ruleAssertContains )
                    // InternalWebDsl.g:1109:6: lv_assertContain_1_0= ruleAssertContains
                    {

                    						newCompositeNode(grammarAccess.getAssertAccess().getAssertContainAssertContainsParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_assertContain_1_0=ruleAssertContains();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssertRule());
                    						}
                    						set(
                    							current,
                    							"assertContain",
                    							lv_assertContain_1_0,
                    							"fr.imta.renaud.ssinigaglia.WebDsl.AssertContains");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1127:4: ( (lv_assertEquals_2_0= ruleAssertEquals ) )
                    {
                    // InternalWebDsl.g:1127:4: ( (lv_assertEquals_2_0= ruleAssertEquals ) )
                    // InternalWebDsl.g:1128:5: (lv_assertEquals_2_0= ruleAssertEquals )
                    {
                    // InternalWebDsl.g:1128:5: (lv_assertEquals_2_0= ruleAssertEquals )
                    // InternalWebDsl.g:1129:6: lv_assertEquals_2_0= ruleAssertEquals
                    {

                    						newCompositeNode(grammarAccess.getAssertAccess().getAssertEqualsAssertEqualsParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_assertEquals_2_0=ruleAssertEquals();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssertRule());
                    						}
                    						set(
                    							current,
                    							"assertEquals",
                    							lv_assertEquals_2_0,
                    							"fr.imta.renaud.ssinigaglia.WebDsl.AssertEquals");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssert"


    // $ANTLR start "entryRuleAssertContains"
    // InternalWebDsl.g:1151:1: entryRuleAssertContains returns [EObject current=null] : iv_ruleAssertContains= ruleAssertContains EOF ;
    public final EObject entryRuleAssertContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertContains = null;


        try {
            // InternalWebDsl.g:1151:55: (iv_ruleAssertContains= ruleAssertContains EOF )
            // InternalWebDsl.g:1152:2: iv_ruleAssertContains= ruleAssertContains EOF
            {
             newCompositeNode(grammarAccess.getAssertContainsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertContains=ruleAssertContains();

            state._fsp--;

             current =iv_ruleAssertContains; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertContains"


    // $ANTLR start "ruleAssertContains"
    // InternalWebDsl.g:1158:1: ruleAssertContains returns [EObject current=null] : (otherlv_0= 'contains' ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | otherlv_3= 'TEXT' ) otherlv_4= ':' this_STRING_5= RULE_STRING ) ;
    public final EObject ruleAssertContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_STRING_5=null;
        Enumerator lv_htmlElement_1_0 = null;

        Enumerator lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1164:2: ( (otherlv_0= 'contains' ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | otherlv_3= 'TEXT' ) otherlv_4= ':' this_STRING_5= RULE_STRING ) )
            // InternalWebDsl.g:1165:2: (otherlv_0= 'contains' ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | otherlv_3= 'TEXT' ) otherlv_4= ':' this_STRING_5= RULE_STRING )
            {
            // InternalWebDsl.g:1165:2: (otherlv_0= 'contains' ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | otherlv_3= 'TEXT' ) otherlv_4= ':' this_STRING_5= RULE_STRING )
            // InternalWebDsl.g:1166:3: otherlv_0= 'contains' ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | otherlv_3= 'TEXT' ) otherlv_4= ':' this_STRING_5= RULE_STRING
            {
            otherlv_0=(Token)match(input,37,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertContainsAccess().getContainsKeyword_0());
            		
            // InternalWebDsl.g:1170:3: ( ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) ) | otherlv_3= 'TEXT' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=13 && LA14_0<=14)||(LA14_0>=19 && LA14_0<=21)||LA14_0==24||LA14_0==48) ) {
                alt14=1;
            }
            else if ( (LA14_0==38) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalWebDsl.g:1171:4: ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) )
                    {
                    // InternalWebDsl.g:1171:4: ( ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) ) )
                    // InternalWebDsl.g:1172:5: ( (lv_htmlElement_1_0= ruleHtmlElement ) ) ( (lv_attribute_2_0= ruleAttribute ) )
                    {
                    // InternalWebDsl.g:1172:5: ( (lv_htmlElement_1_0= ruleHtmlElement ) )
                    // InternalWebDsl.g:1173:6: (lv_htmlElement_1_0= ruleHtmlElement )
                    {
                    // InternalWebDsl.g:1173:6: (lv_htmlElement_1_0= ruleHtmlElement )
                    // InternalWebDsl.g:1174:7: lv_htmlElement_1_0= ruleHtmlElement
                    {

                    							newCompositeNode(grammarAccess.getAssertContainsAccess().getHtmlElementHtmlElementEnumRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_htmlElement_1_0=ruleHtmlElement();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssertContainsRule());
                    							}
                    							set(
                    								current,
                    								"htmlElement",
                    								lv_htmlElement_1_0,
                    								"fr.imta.renaud.ssinigaglia.WebDsl.HtmlElement");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalWebDsl.g:1191:5: ( (lv_attribute_2_0= ruleAttribute ) )
                    // InternalWebDsl.g:1192:6: (lv_attribute_2_0= ruleAttribute )
                    {
                    // InternalWebDsl.g:1192:6: (lv_attribute_2_0= ruleAttribute )
                    // InternalWebDsl.g:1193:7: lv_attribute_2_0= ruleAttribute
                    {

                    							newCompositeNode(grammarAccess.getAssertContainsAccess().getAttributeAttributeEnumRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_16);
                    lv_attribute_2_0=ruleAttribute();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssertContainsRule());
                    							}
                    							set(
                    								current,
                    								"attribute",
                    								lv_attribute_2_0,
                    								"fr.imta.renaud.ssinigaglia.WebDsl.Attribute");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1212:4: otherlv_3= 'TEXT'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssertContainsAccess().getTEXTKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getAssertContainsAccess().getColonKeyword_2());
            		
            this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(this_STRING_5, grammarAccess.getAssertContainsAccess().getSTRINGTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertContains"


    // $ANTLR start "entryRuleAssertEquals"
    // InternalWebDsl.g:1229:1: entryRuleAssertEquals returns [EObject current=null] : iv_ruleAssertEquals= ruleAssertEquals EOF ;
    public final EObject entryRuleAssertEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertEquals = null;


        try {
            // InternalWebDsl.g:1229:53: (iv_ruleAssertEquals= ruleAssertEquals EOF )
            // InternalWebDsl.g:1230:2: iv_ruleAssertEquals= ruleAssertEquals EOF
            {
             newCompositeNode(grammarAccess.getAssertEqualsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertEquals=ruleAssertEquals();

            state._fsp--;

             current =iv_ruleAssertEquals; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertEquals"


    // $ANTLR start "ruleAssertEquals"
    // InternalWebDsl.g:1236:1: ruleAssertEquals returns [EObject current=null] : ( ( (lv_c1_0_0= ruleComparable ) ) otherlv_1= 'equals' ( (lv_c2_2_0= ruleComparable ) ) ) ;
    public final EObject ruleAssertEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_c1_0_0 = null;

        EObject lv_c2_2_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1242:2: ( ( ( (lv_c1_0_0= ruleComparable ) ) otherlv_1= 'equals' ( (lv_c2_2_0= ruleComparable ) ) ) )
            // InternalWebDsl.g:1243:2: ( ( (lv_c1_0_0= ruleComparable ) ) otherlv_1= 'equals' ( (lv_c2_2_0= ruleComparable ) ) )
            {
            // InternalWebDsl.g:1243:2: ( ( (lv_c1_0_0= ruleComparable ) ) otherlv_1= 'equals' ( (lv_c2_2_0= ruleComparable ) ) )
            // InternalWebDsl.g:1244:3: ( (lv_c1_0_0= ruleComparable ) ) otherlv_1= 'equals' ( (lv_c2_2_0= ruleComparable ) )
            {
            // InternalWebDsl.g:1244:3: ( (lv_c1_0_0= ruleComparable ) )
            // InternalWebDsl.g:1245:4: (lv_c1_0_0= ruleComparable )
            {
            // InternalWebDsl.g:1245:4: (lv_c1_0_0= ruleComparable )
            // InternalWebDsl.g:1246:5: lv_c1_0_0= ruleComparable
            {

            					newCompositeNode(grammarAccess.getAssertEqualsAccess().getC1ComparableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_c1_0_0=ruleComparable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertEqualsRule());
            					}
            					set(
            						current,
            						"c1",
            						lv_c1_0_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.Comparable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getAssertEqualsAccess().getEqualsKeyword_1());
            		
            // InternalWebDsl.g:1267:3: ( (lv_c2_2_0= ruleComparable ) )
            // InternalWebDsl.g:1268:4: (lv_c2_2_0= ruleComparable )
            {
            // InternalWebDsl.g:1268:4: (lv_c2_2_0= ruleComparable )
            // InternalWebDsl.g:1269:5: lv_c2_2_0= ruleComparable
            {

            					newCompositeNode(grammarAccess.getAssertEqualsAccess().getC2ComparableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_c2_2_0=ruleComparable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertEqualsRule());
            					}
            					set(
            						current,
            						"c2",
            						lv_c2_2_0,
            						"fr.imta.renaud.ssinigaglia.WebDsl.Comparable");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertEquals"


    // $ANTLR start "entryRuleComparable"
    // InternalWebDsl.g:1290:1: entryRuleComparable returns [EObject current=null] : iv_ruleComparable= ruleComparable EOF ;
    public final EObject entryRuleComparable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparable = null;


        try {
            // InternalWebDsl.g:1290:51: (iv_ruleComparable= ruleComparable EOF )
            // InternalWebDsl.g:1291:2: iv_ruleComparable= ruleComparable EOF
            {
             newCompositeNode(grammarAccess.getComparableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparable=ruleComparable();

            state._fsp--;

             current =iv_ruleComparable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparable"


    // $ANTLR start "ruleComparable"
    // InternalWebDsl.g:1297:1: ruleComparable returns [EObject current=null] : ( (otherlv_0= 'VAR:' this_STRING_1= RULE_STRING ) | (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' ) | this_STRING_6= RULE_STRING ) ;
    public final EObject ruleComparable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_STRING_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token this_STRING_6=null;
        Enumerator lv_htmlElement_3_0 = null;

        Enumerator lv_attribute_4_0 = null;



        	enterRule();

        try {
            // InternalWebDsl.g:1303:2: ( ( (otherlv_0= 'VAR:' this_STRING_1= RULE_STRING ) | (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' ) | this_STRING_6= RULE_STRING ) )
            // InternalWebDsl.g:1304:2: ( (otherlv_0= 'VAR:' this_STRING_1= RULE_STRING ) | (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' ) | this_STRING_6= RULE_STRING )
            {
            // InternalWebDsl.g:1304:2: ( (otherlv_0= 'VAR:' this_STRING_1= RULE_STRING ) | (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' ) | this_STRING_6= RULE_STRING )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt15=1;
                }
                break;
            case 41:
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
                    // InternalWebDsl.g:1305:3: (otherlv_0= 'VAR:' this_STRING_1= RULE_STRING )
                    {
                    // InternalWebDsl.g:1305:3: (otherlv_0= 'VAR:' this_STRING_1= RULE_STRING )
                    // InternalWebDsl.g:1306:4: otherlv_0= 'VAR:' this_STRING_1= RULE_STRING
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getComparableAccess().getVARKeyword_0_0());
                    			
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				newLeafNode(this_STRING_1, grammarAccess.getComparableAccess().getSTRINGTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1316:3: (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' )
                    {
                    // InternalWebDsl.g:1316:3: (otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')' )
                    // InternalWebDsl.g:1317:4: otherlv_2= '(' ( (lv_htmlElement_3_0= ruleHtmlElement ) ) ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getComparableAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalWebDsl.g:1321:4: ( (lv_htmlElement_3_0= ruleHtmlElement ) )
                    // InternalWebDsl.g:1322:5: (lv_htmlElement_3_0= ruleHtmlElement )
                    {
                    // InternalWebDsl.g:1322:5: (lv_htmlElement_3_0= ruleHtmlElement )
                    // InternalWebDsl.g:1323:6: lv_htmlElement_3_0= ruleHtmlElement
                    {

                    						newCompositeNode(grammarAccess.getComparableAccess().getHtmlElementHtmlElementEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_htmlElement_3_0=ruleHtmlElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComparableRule());
                    						}
                    						set(
                    							current,
                    							"htmlElement",
                    							lv_htmlElement_3_0,
                    							"fr.imta.renaud.ssinigaglia.WebDsl.HtmlElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWebDsl.g:1340:4: ( (lv_attribute_4_0= ruleAttribute ) )
                    // InternalWebDsl.g:1341:5: (lv_attribute_4_0= ruleAttribute )
                    {
                    // InternalWebDsl.g:1341:5: (lv_attribute_4_0= ruleAttribute )
                    // InternalWebDsl.g:1342:6: lv_attribute_4_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getComparableAccess().getAttributeAttributeEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_attribute_4_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComparableRule());
                    						}
                    						set(
                    							current,
                    							"attribute",
                    							lv_attribute_4_0,
                    							"fr.imta.renaud.ssinigaglia.WebDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getComparableAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1365:3: this_STRING_6= RULE_STRING
                    {
                    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_6, grammarAccess.getComparableAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparable"


    // $ANTLR start "ruleBrowser"
    // InternalWebDsl.g:1373:1: ruleBrowser returns [Enumerator current=null] : ( (enumLiteral_0= 'chrome' ) | (enumLiteral_1= 'firefox' ) | (enumLiteral_2= 'safari' ) | (enumLiteral_3= 'edge' ) | (enumLiteral_4= 'ie' ) ) ;
    public final Enumerator ruleBrowser() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalWebDsl.g:1379:2: ( ( (enumLiteral_0= 'chrome' ) | (enumLiteral_1= 'firefox' ) | (enumLiteral_2= 'safari' ) | (enumLiteral_3= 'edge' ) | (enumLiteral_4= 'ie' ) ) )
            // InternalWebDsl.g:1380:2: ( (enumLiteral_0= 'chrome' ) | (enumLiteral_1= 'firefox' ) | (enumLiteral_2= 'safari' ) | (enumLiteral_3= 'edge' ) | (enumLiteral_4= 'ie' ) )
            {
            // InternalWebDsl.g:1380:2: ( (enumLiteral_0= 'chrome' ) | (enumLiteral_1= 'firefox' ) | (enumLiteral_2= 'safari' ) | (enumLiteral_3= 'edge' ) | (enumLiteral_4= 'ie' ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt16=1;
                }
                break;
            case 44:
                {
                alt16=2;
                }
                break;
            case 45:
                {
                alt16=3;
                }
                break;
            case 46:
                {
                alt16=4;
                }
                break;
            case 47:
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
                    // InternalWebDsl.g:1381:3: (enumLiteral_0= 'chrome' )
                    {
                    // InternalWebDsl.g:1381:3: (enumLiteral_0= 'chrome' )
                    // InternalWebDsl.g:1382:4: enumLiteral_0= 'chrome'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getCHROMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBrowserAccess().getCHROMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1389:3: (enumLiteral_1= 'firefox' )
                    {
                    // InternalWebDsl.g:1389:3: (enumLiteral_1= 'firefox' )
                    // InternalWebDsl.g:1390:4: enumLiteral_1= 'firefox'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getFIREFOXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBrowserAccess().getFIREFOXEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1397:3: (enumLiteral_2= 'safari' )
                    {
                    // InternalWebDsl.g:1397:3: (enumLiteral_2= 'safari' )
                    // InternalWebDsl.g:1398:4: enumLiteral_2= 'safari'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getSAFARIEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBrowserAccess().getSAFARIEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1405:3: (enumLiteral_3= 'edge' )
                    {
                    // InternalWebDsl.g:1405:3: (enumLiteral_3= 'edge' )
                    // InternalWebDsl.g:1406:4: enumLiteral_3= 'edge'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getEDGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBrowserAccess().getEDGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1413:3: (enumLiteral_4= 'ie' )
                    {
                    // InternalWebDsl.g:1413:3: (enumLiteral_4= 'ie' )
                    // InternalWebDsl.g:1414:4: enumLiteral_4= 'ie'
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getBrowserAccess().getIEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBrowserAccess().getIEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrowser"


    // $ANTLR start "ruleHtmlElement"
    // InternalWebDsl.g:1424:1: ruleHtmlElement returns [Enumerator current=null] : ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'BUTTON' ) | (enumLiteral_2= 'CHECKBOX' ) | (enumLiteral_3= 'COMBO_BOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'A' ) ) ;
    public final Enumerator ruleHtmlElement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalWebDsl.g:1430:2: ( ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'BUTTON' ) | (enumLiteral_2= 'CHECKBOX' ) | (enumLiteral_3= 'COMBO_BOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'A' ) ) )
            // InternalWebDsl.g:1431:2: ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'BUTTON' ) | (enumLiteral_2= 'CHECKBOX' ) | (enumLiteral_3= 'COMBO_BOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'A' ) )
            {
            // InternalWebDsl.g:1431:2: ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'BUTTON' ) | (enumLiteral_2= 'CHECKBOX' ) | (enumLiteral_3= 'COMBO_BOX' ) | (enumLiteral_4= 'DIV' ) | (enumLiteral_5= 'IMAGE' ) | (enumLiteral_6= 'A' ) )
            int alt17=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt17=1;
                }
                break;
            case 14:
                {
                alt17=2;
                }
                break;
            case 21:
                {
                alt17=3;
                }
                break;
            case 24:
                {
                alt17=4;
                }
                break;
            case 19:
                {
                alt17=5;
                }
                break;
            case 48:
                {
                alt17=6;
                }
                break;
            case 20:
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
                    // InternalWebDsl.g:1432:3: (enumLiteral_0= 'LINK' )
                    {
                    // InternalWebDsl.g:1432:3: (enumLiteral_0= 'LINK' )
                    // InternalWebDsl.g:1433:4: enumLiteral_0= 'LINK'
                    {
                    enumLiteral_0=(Token)match(input,13,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getLINKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHtmlElementAccess().getLINKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1440:3: (enumLiteral_1= 'BUTTON' )
                    {
                    // InternalWebDsl.g:1440:3: (enumLiteral_1= 'BUTTON' )
                    // InternalWebDsl.g:1441:4: enumLiteral_1= 'BUTTON'
                    {
                    enumLiteral_1=(Token)match(input,14,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getBUTTONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHtmlElementAccess().getBUTTONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1448:3: (enumLiteral_2= 'CHECKBOX' )
                    {
                    // InternalWebDsl.g:1448:3: (enumLiteral_2= 'CHECKBOX' )
                    // InternalWebDsl.g:1449:4: enumLiteral_2= 'CHECKBOX'
                    {
                    enumLiteral_2=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getCHECKBOXEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHtmlElementAccess().getCHECKBOXEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1456:3: (enumLiteral_3= 'COMBO_BOX' )
                    {
                    // InternalWebDsl.g:1456:3: (enumLiteral_3= 'COMBO_BOX' )
                    // InternalWebDsl.g:1457:4: enumLiteral_3= 'COMBO_BOX'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getCOMBOBOXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getHtmlElementAccess().getCOMBOBOXEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1464:3: (enumLiteral_4= 'DIV' )
                    {
                    // InternalWebDsl.g:1464:3: (enumLiteral_4= 'DIV' )
                    // InternalWebDsl.g:1465:4: enumLiteral_4= 'DIV'
                    {
                    enumLiteral_4=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getDIVEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getHtmlElementAccess().getDIVEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalWebDsl.g:1472:3: (enumLiteral_5= 'IMAGE' )
                    {
                    // InternalWebDsl.g:1472:3: (enumLiteral_5= 'IMAGE' )
                    // InternalWebDsl.g:1473:4: enumLiteral_5= 'IMAGE'
                    {
                    enumLiteral_5=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getIMAGEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getHtmlElementAccess().getIMAGEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalWebDsl.g:1480:3: (enumLiteral_6= 'A' )
                    {
                    // InternalWebDsl.g:1480:3: (enumLiteral_6= 'A' )
                    // InternalWebDsl.g:1481:4: enumLiteral_6= 'A'
                    {
                    enumLiteral_6=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getHtmlElementAccess().getAEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getHtmlElementAccess().getAEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHtmlElement"


    // $ANTLR start "ruleAttribute"
    // InternalWebDsl.g:1491:1: ruleAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'LABEL' ) | (enumLiteral_1= 'ID' ) | (enumLiteral_2= 'CLASS' ) | (enumLiteral_3= 'ALT' ) | (enumLiteral_4= 'VALUE' ) | (enumLiteral_5= 'HREF' ) | (enumLiteral_6= 'TITLE' ) ) ;
    public final Enumerator ruleAttribute() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalWebDsl.g:1497:2: ( ( (enumLiteral_0= 'LABEL' ) | (enumLiteral_1= 'ID' ) | (enumLiteral_2= 'CLASS' ) | (enumLiteral_3= 'ALT' ) | (enumLiteral_4= 'VALUE' ) | (enumLiteral_5= 'HREF' ) | (enumLiteral_6= 'TITLE' ) ) )
            // InternalWebDsl.g:1498:2: ( (enumLiteral_0= 'LABEL' ) | (enumLiteral_1= 'ID' ) | (enumLiteral_2= 'CLASS' ) | (enumLiteral_3= 'ALT' ) | (enumLiteral_4= 'VALUE' ) | (enumLiteral_5= 'HREF' ) | (enumLiteral_6= 'TITLE' ) )
            {
            // InternalWebDsl.g:1498:2: ( (enumLiteral_0= 'LABEL' ) | (enumLiteral_1= 'ID' ) | (enumLiteral_2= 'CLASS' ) | (enumLiteral_3= 'ALT' ) | (enumLiteral_4= 'VALUE' ) | (enumLiteral_5= 'HREF' ) | (enumLiteral_6= 'TITLE' ) )
            int alt18=7;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt18=1;
                }
                break;
            case 50:
                {
                alt18=2;
                }
                break;
            case 51:
                {
                alt18=3;
                }
                break;
            case 52:
                {
                alt18=4;
                }
                break;
            case 53:
                {
                alt18=5;
                }
                break;
            case 54:
                {
                alt18=6;
                }
                break;
            case 55:
                {
                alt18=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalWebDsl.g:1499:3: (enumLiteral_0= 'LABEL' )
                    {
                    // InternalWebDsl.g:1499:3: (enumLiteral_0= 'LABEL' )
                    // InternalWebDsl.g:1500:4: enumLiteral_0= 'LABEL'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getLABELEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAttributeAccess().getLABELEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWebDsl.g:1507:3: (enumLiteral_1= 'ID' )
                    {
                    // InternalWebDsl.g:1507:3: (enumLiteral_1= 'ID' )
                    // InternalWebDsl.g:1508:4: enumLiteral_1= 'ID'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getIDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAttributeAccess().getIDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalWebDsl.g:1515:3: (enumLiteral_2= 'CLASS' )
                    {
                    // InternalWebDsl.g:1515:3: (enumLiteral_2= 'CLASS' )
                    // InternalWebDsl.g:1516:4: enumLiteral_2= 'CLASS'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getCLASSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAttributeAccess().getCLASSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalWebDsl.g:1523:3: (enumLiteral_3= 'ALT' )
                    {
                    // InternalWebDsl.g:1523:3: (enumLiteral_3= 'ALT' )
                    // InternalWebDsl.g:1524:4: enumLiteral_3= 'ALT'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getALTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAttributeAccess().getALTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalWebDsl.g:1531:3: (enumLiteral_4= 'VALUE' )
                    {
                    // InternalWebDsl.g:1531:3: (enumLiteral_4= 'VALUE' )
                    // InternalWebDsl.g:1532:4: enumLiteral_4= 'VALUE'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getVALUEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getAttributeAccess().getVALUEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalWebDsl.g:1539:3: (enumLiteral_5= 'HREF' )
                    {
                    // InternalWebDsl.g:1539:3: (enumLiteral_5= 'HREF' )
                    // InternalWebDsl.g:1540:4: enumLiteral_5= 'HREF'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getHREFEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getAttributeAccess().getHREFEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalWebDsl.g:1547:3: (enumLiteral_6= 'TITLE' )
                    {
                    // InternalWebDsl.g:1547:3: (enumLiteral_6= 'TITLE' )
                    // InternalWebDsl.g:1548:4: enumLiteral_6= 'TITLE'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getAttributeAccess().getTITLEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000F80000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000053C7002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00FE000F00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000004D3F7000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000004D3E7000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000004DFE7000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000004F3E7000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00FE000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000032000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001004001386000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001000001386000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});

}