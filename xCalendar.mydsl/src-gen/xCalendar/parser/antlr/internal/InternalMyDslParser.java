package xCalendar.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xCalendar.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STR", "RULE_INT", "RULE_TWO_DIGIT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Enregistrer sous: '", "'\\r\\n'", "'Janvier'", "'Fevrier'", "'Mars'", "'Avril'", "'Mai'", "'Juin'", "'Juillet'", "'Aout'", "'Septembre'", "'Octobre'", "'Novembre'", "'Decembre'", "'janvier'", "'fevrier'", "'mars'", "'avril'", "'mai'", "'juin'", "'juillet'", "'aout'", "'septembre'", "'octobre'", "'novembre'", "'decembre'", "'\\u00E0 '", "'a '", "'h'", "':'", "'heure '", "'m'", "'mn'", "'min'", "'minutes'", "' et '", "'s'", "'sec'", "'secondes'", "'Tentative'", "'Confirm\\u00E9'", "'Annul\\u00E9'", "'Compl\\u00E9t\\u00E9'", "'En cours'", "'RDV {'", "'Date: '", "'Identifiant: '", "'Organisateur: '", "'Objet: '", "'URL: '", "'Attachements: '", "','", "'Invit\\u00E9s: '", "'Cat\\u00E9gories: '", "'Commentaire: '", "'Contact: '", "'Status: '", "'Reli\\u00E9 \\u00E0: '", "'resources: '", "'Description: '", "'Priorit\\u00E9: '", "'Lieu: '", "'Fin: '", "'Rappel: '", "'}'", "'AlarmC'", "'{'", "'action'", "'trigger'", "'attach'", "'description'", "'type'", "'time'", "'tzprop'", "'dtstart'", "'tzoffseto'", "'tzoffsetfrom'", "'rrule'", "'opt'", "'tzpropOptional'", "'comment'", "'rdate'", "'tzname'", "'x_prop'", "'iana_prop'", "'ComponentAlarmTime'", "'duration'", "'repeat'", "'ComponentAlarmAudioProperty'", "'ComponentAlarmDispProperty'", "'ComponentAlarmEmailProperty'", "'attendee'", "'ToDoC'", "'dtstamp'", "'uid'", "'class'", "'created'", "'last_mod'", "'organizer'", "'seq'", "'status'", "'summary'", "'url'", "'recurid'", "'categories'", "'contact'", "'exdate'", "'rstatus'", "'related'", "'resources'", "'completed'", "'priority'", "'geo'", "'location'", "'dtend'", "'alarmc'", "'JournalC'", "'VacationC'", "'freebusy'", "'TimeZoneC'", "'tzid'", "'tzurl'", "'standardc'", "'daylightc'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=7;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_STR=4;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int RULE_TWO_DIGIT=6;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "iCalFormat";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleiCalFormat"
    // InternalMyDsl.g:64:1: entryRuleiCalFormat returns [EObject current=null] : iv_ruleiCalFormat= ruleiCalFormat EOF ;
    public final EObject entryRuleiCalFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleiCalFormat = null;


        try {
            // InternalMyDsl.g:64:51: (iv_ruleiCalFormat= ruleiCalFormat EOF )
            // InternalMyDsl.g:65:2: iv_ruleiCalFormat= ruleiCalFormat EOF
            {
             newCompositeNode(grammarAccess.getICalFormatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleiCalFormat=ruleiCalFormat();

            state._fsp--;

             current =iv_ruleiCalFormat; 
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
    // $ANTLR end "entryRuleiCalFormat"


    // $ANTLR start "ruleiCalFormat"
    // InternalMyDsl.g:71:1: ruleiCalFormat returns [EObject current=null] : (otherlv_0= 'Enregistrer sous: ' ( (lv_fileName_1_0= RULE_STR ) ) otherlv_2= '\\r\\n' ( (lv_calendar_3_0= ruleCalendar ) ) ) ;
    public final EObject ruleiCalFormat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fileName_1_0=null;
        Token otherlv_2=null;
        EObject lv_calendar_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'Enregistrer sous: ' ( (lv_fileName_1_0= RULE_STR ) ) otherlv_2= '\\r\\n' ( (lv_calendar_3_0= ruleCalendar ) ) ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'Enregistrer sous: ' ( (lv_fileName_1_0= RULE_STR ) ) otherlv_2= '\\r\\n' ( (lv_calendar_3_0= ruleCalendar ) ) )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'Enregistrer sous: ' ( (lv_fileName_1_0= RULE_STR ) ) otherlv_2= '\\r\\n' ( (lv_calendar_3_0= ruleCalendar ) ) )
            // InternalMyDsl.g:79:3: otherlv_0= 'Enregistrer sous: ' ( (lv_fileName_1_0= RULE_STR ) ) otherlv_2= '\\r\\n' ( (lv_calendar_3_0= ruleCalendar ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getICalFormatAccess().getEnregistrerSousKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_fileName_1_0= RULE_STR ) )
            // InternalMyDsl.g:84:4: (lv_fileName_1_0= RULE_STR )
            {
            // InternalMyDsl.g:84:4: (lv_fileName_1_0= RULE_STR )
            // InternalMyDsl.g:85:5: lv_fileName_1_0= RULE_STR
            {
            lv_fileName_1_0=(Token)match(input,RULE_STR,FOLLOW_4); 

            					newLeafNode(lv_fileName_1_0, grammarAccess.getICalFormatAccess().getFileNameSTRTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getICalFormatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fileName",
            						lv_fileName_1_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getICalFormatAccess().getCarriageReturnCrLineFeedLfKeyword_2());
            		
            // InternalMyDsl.g:105:3: ( (lv_calendar_3_0= ruleCalendar ) )
            // InternalMyDsl.g:106:4: (lv_calendar_3_0= ruleCalendar )
            {
            // InternalMyDsl.g:106:4: (lv_calendar_3_0= ruleCalendar )
            // InternalMyDsl.g:107:5: lv_calendar_3_0= ruleCalendar
            {

            					newCompositeNode(grammarAccess.getICalFormatAccess().getCalendarCalendarParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_calendar_3_0=ruleCalendar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getICalFormatRule());
            					}
            					set(
            						current,
            						"calendar",
            						lv_calendar_3_0,
            						"xCalendar.MyDsl.Calendar");
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
    // $ANTLR end "ruleiCalFormat"


    // $ANTLR start "entryRuleComponent"
    // InternalMyDsl.g:128:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalMyDsl.g:128:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalMyDsl.g:129:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMyDsl.g:135:1: ruleComponent returns [EObject current=null] : (this_EventC_0= ruleEventC | this_ToDoC_1= ruleToDoC | this_JournalC_2= ruleJournalC | this_VacationC_3= ruleVacationC | this_TimeZoneC_4= ruleTimeZoneC | this_AlarmC_5= ruleAlarmC ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_EventC_0 = null;

        EObject this_ToDoC_1 = null;

        EObject this_JournalC_2 = null;

        EObject this_VacationC_3 = null;

        EObject this_TimeZoneC_4 = null;

        EObject this_AlarmC_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:141:2: ( (this_EventC_0= ruleEventC | this_ToDoC_1= ruleToDoC | this_JournalC_2= ruleJournalC | this_VacationC_3= ruleVacationC | this_TimeZoneC_4= ruleTimeZoneC | this_AlarmC_5= ruleAlarmC ) )
            // InternalMyDsl.g:142:2: (this_EventC_0= ruleEventC | this_ToDoC_1= ruleToDoC | this_JournalC_2= ruleJournalC | this_VacationC_3= ruleVacationC | this_TimeZoneC_4= ruleTimeZoneC | this_AlarmC_5= ruleAlarmC )
            {
            // InternalMyDsl.g:142:2: (this_EventC_0= ruleEventC | this_ToDoC_1= ruleToDoC | this_JournalC_2= ruleJournalC | this_VacationC_3= ruleVacationC | this_TimeZoneC_4= ruleTimeZoneC | this_AlarmC_5= ruleAlarmC )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt1=1;
                }
                break;
            case 105:
                {
                alt1=2;
                }
                break;
            case 129:
                {
                alt1=3;
                }
                break;
            case 130:
                {
                alt1=4;
                }
                break;
            case 132:
                {
                alt1=5;
                }
                break;
            case 78:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:143:3: this_EventC_0= ruleEventC
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getEventCParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EventC_0=ruleEventC();

                    state._fsp--;


                    			current = this_EventC_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:152:3: this_ToDoC_1= ruleToDoC
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getToDoCParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ToDoC_1=ruleToDoC();

                    state._fsp--;


                    			current = this_ToDoC_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:161:3: this_JournalC_2= ruleJournalC
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getJournalCParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_JournalC_2=ruleJournalC();

                    state._fsp--;


                    			current = this_JournalC_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:170:3: this_VacationC_3= ruleVacationC
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getVacationCParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VacationC_3=ruleVacationC();

                    state._fsp--;


                    			current = this_VacationC_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:179:3: this_TimeZoneC_4= ruleTimeZoneC
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getTimeZoneCParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeZoneC_4=ruleTimeZoneC();

                    state._fsp--;


                    			current = this_TimeZoneC_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:188:3: this_AlarmC_5= ruleAlarmC
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getAlarmCParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlarmC_5=ruleAlarmC();

                    state._fsp--;


                    			current = this_AlarmC_5;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleAlarmType"
    // InternalMyDsl.g:200:1: entryRuleAlarmType returns [EObject current=null] : iv_ruleAlarmType= ruleAlarmType EOF ;
    public final EObject entryRuleAlarmType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlarmType = null;


        try {
            // InternalMyDsl.g:200:50: (iv_ruleAlarmType= ruleAlarmType EOF )
            // InternalMyDsl.g:201:2: iv_ruleAlarmType= ruleAlarmType EOF
            {
             newCompositeNode(grammarAccess.getAlarmTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlarmType=ruleAlarmType();

            state._fsp--;

             current =iv_ruleAlarmType; 
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
    // $ANTLR end "entryRuleAlarmType"


    // $ANTLR start "ruleAlarmType"
    // InternalMyDsl.g:207:1: ruleAlarmType returns [EObject current=null] : (this_ComponentAlarmAudioProperty_0= ruleComponentAlarmAudioProperty | this_ComponentAlarmDispProperty_1= ruleComponentAlarmDispProperty | this_ComponentAlarmEmailProperty_2= ruleComponentAlarmEmailProperty ) ;
    public final EObject ruleAlarmType() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentAlarmAudioProperty_0 = null;

        EObject this_ComponentAlarmDispProperty_1 = null;

        EObject this_ComponentAlarmEmailProperty_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:213:2: ( (this_ComponentAlarmAudioProperty_0= ruleComponentAlarmAudioProperty | this_ComponentAlarmDispProperty_1= ruleComponentAlarmDispProperty | this_ComponentAlarmEmailProperty_2= ruleComponentAlarmEmailProperty ) )
            // InternalMyDsl.g:214:2: (this_ComponentAlarmAudioProperty_0= ruleComponentAlarmAudioProperty | this_ComponentAlarmDispProperty_1= ruleComponentAlarmDispProperty | this_ComponentAlarmEmailProperty_2= ruleComponentAlarmEmailProperty )
            {
            // InternalMyDsl.g:214:2: (this_ComponentAlarmAudioProperty_0= ruleComponentAlarmAudioProperty | this_ComponentAlarmDispProperty_1= ruleComponentAlarmDispProperty | this_ComponentAlarmEmailProperty_2= ruleComponentAlarmEmailProperty )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt2=1;
                }
                break;
            case 102:
                {
                alt2=2;
                }
                break;
            case 103:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:215:3: this_ComponentAlarmAudioProperty_0= ruleComponentAlarmAudioProperty
                    {

                    			newCompositeNode(grammarAccess.getAlarmTypeAccess().getComponentAlarmAudioPropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentAlarmAudioProperty_0=ruleComponentAlarmAudioProperty();

                    state._fsp--;


                    			current = this_ComponentAlarmAudioProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:224:3: this_ComponentAlarmDispProperty_1= ruleComponentAlarmDispProperty
                    {

                    			newCompositeNode(grammarAccess.getAlarmTypeAccess().getComponentAlarmDispPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentAlarmDispProperty_1=ruleComponentAlarmDispProperty();

                    state._fsp--;


                    			current = this_ComponentAlarmDispProperty_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:233:3: this_ComponentAlarmEmailProperty_2= ruleComponentAlarmEmailProperty
                    {

                    			newCompositeNode(grammarAccess.getAlarmTypeAccess().getComponentAlarmEmailPropertyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentAlarmEmailProperty_2=ruleComponentAlarmEmailProperty();

                    state._fsp--;


                    			current = this_ComponentAlarmEmailProperty_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleAlarmType"


    // $ANTLR start "entryRuleCalendar"
    // InternalMyDsl.g:245:1: entryRuleCalendar returns [EObject current=null] : iv_ruleCalendar= ruleCalendar EOF ;
    public final EObject entryRuleCalendar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalendar = null;


        try {
            // InternalMyDsl.g:245:49: (iv_ruleCalendar= ruleCalendar EOF )
            // InternalMyDsl.g:246:2: iv_ruleCalendar= ruleCalendar EOF
            {
             newCompositeNode(grammarAccess.getCalendarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalendar=ruleCalendar();

            state._fsp--;

             current =iv_ruleCalendar; 
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
    // $ANTLR end "entryRuleCalendar"


    // $ANTLR start "ruleCalendar"
    // InternalMyDsl.g:252:1: ruleCalendar returns [EObject current=null] : ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= '\\r\\n' ( (lv_component_2_0= ruleComponent ) ) )* ) ;
    public final EObject ruleCalendar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_component_0_0 = null;

        EObject lv_component_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:258:2: ( ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= '\\r\\n' ( (lv_component_2_0= ruleComponent ) ) )* ) )
            // InternalMyDsl.g:259:2: ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= '\\r\\n' ( (lv_component_2_0= ruleComponent ) ) )* )
            {
            // InternalMyDsl.g:259:2: ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= '\\r\\n' ( (lv_component_2_0= ruleComponent ) ) )* )
            // InternalMyDsl.g:260:3: ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= '\\r\\n' ( (lv_component_2_0= ruleComponent ) ) )*
            {
            // InternalMyDsl.g:260:3: ( (lv_component_0_0= ruleComponent ) )
            // InternalMyDsl.g:261:4: (lv_component_0_0= ruleComponent )
            {
            // InternalMyDsl.g:261:4: (lv_component_0_0= ruleComponent )
            // InternalMyDsl.g:262:5: lv_component_0_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getCalendarAccess().getComponentComponentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_component_0_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalendarRule());
            					}
            					add(
            						current,
            						"component",
            						lv_component_0_0,
            						"xCalendar.MyDsl.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:279:3: (otherlv_1= '\\r\\n' ( (lv_component_2_0= ruleComponent ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:280:4: otherlv_1= '\\r\\n' ( (lv_component_2_0= ruleComponent ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCalendarAccess().getCarriageReturnCrLineFeedLfKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:284:4: ( (lv_component_2_0= ruleComponent ) )
            	    // InternalMyDsl.g:285:5: (lv_component_2_0= ruleComponent )
            	    {
            	    // InternalMyDsl.g:285:5: (lv_component_2_0= ruleComponent )
            	    // InternalMyDsl.g:286:6: lv_component_2_0= ruleComponent
            	    {

            	    						newCompositeNode(grammarAccess.getCalendarAccess().getComponentComponentParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_component_2_0=ruleComponent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCalendarRule());
            	    						}
            	    						add(
            	    							current,
            	    							"component",
            	    							lv_component_2_0,
            	    							"xCalendar.MyDsl.Component");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleCalendar"


    // $ANTLR start "entryRuleInteger"
    // InternalMyDsl.g:308:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalMyDsl.g:308:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalMyDsl.g:309:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalMyDsl.g:315:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:321:2: (this_INT_0= RULE_INT )
            // InternalMyDsl.g:322:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getIntegerAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleMonth"
    // InternalMyDsl.g:332:1: entryRuleMonth returns [EObject current=null] : iv_ruleMonth= ruleMonth EOF ;
    public final EObject entryRuleMonth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonth = null;


        try {
            // InternalMyDsl.g:332:46: (iv_ruleMonth= ruleMonth EOF )
            // InternalMyDsl.g:333:2: iv_ruleMonth= ruleMonth EOF
            {
             newCompositeNode(grammarAccess.getMonthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonth=ruleMonth();

            state._fsp--;

             current =iv_ruleMonth; 
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
    // $ANTLR end "entryRuleMonth"


    // $ANTLR start "ruleMonth"
    // InternalMyDsl.g:339:1: ruleMonth returns [EObject current=null] : (this_MonthT_0= ruleMonthT | this_MonthNameT_1= ruleMonthNameT ) ;
    public final EObject ruleMonth() throws RecognitionException {
        EObject current = null;

        EObject this_MonthT_0 = null;

        EObject this_MonthNameT_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:345:2: ( (this_MonthT_0= ruleMonthT | this_MonthNameT_1= ruleMonthNameT ) )
            // InternalMyDsl.g:346:2: (this_MonthT_0= ruleMonthT | this_MonthNameT_1= ruleMonthNameT )
            {
            // InternalMyDsl.g:346:2: (this_MonthT_0= ruleMonthT | this_MonthNameT_1= ruleMonthNameT )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_TWO_DIGIT) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=15 && LA4_0<=38)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:347:3: this_MonthT_0= ruleMonthT
                    {

                    			newCompositeNode(grammarAccess.getMonthAccess().getMonthTParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MonthT_0=ruleMonthT();

                    state._fsp--;


                    			current = this_MonthT_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:356:3: this_MonthNameT_1= ruleMonthNameT
                    {

                    			newCompositeNode(grammarAccess.getMonthAccess().getMonthNameTParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MonthNameT_1=ruleMonthNameT();

                    state._fsp--;


                    			current = this_MonthNameT_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleMonth"


    // $ANTLR start "entryRuleMonthNameT"
    // InternalMyDsl.g:368:1: entryRuleMonthNameT returns [EObject current=null] : iv_ruleMonthNameT= ruleMonthNameT EOF ;
    public final EObject entryRuleMonthNameT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonthNameT = null;


        try {
            // InternalMyDsl.g:368:51: (iv_ruleMonthNameT= ruleMonthNameT EOF )
            // InternalMyDsl.g:369:2: iv_ruleMonthNameT= ruleMonthNameT EOF
            {
             newCompositeNode(grammarAccess.getMonthNameTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonthNameT=ruleMonthNameT();

            state._fsp--;

             current =iv_ruleMonthNameT; 
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
    // $ANTLR end "entryRuleMonthNameT"


    // $ANTLR start "ruleMonthNameT"
    // InternalMyDsl.g:375:1: ruleMonthNameT returns [EObject current=null] : ( ( (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' | lv_value_0_13= 'janvier' | lv_value_0_14= 'fevrier' | lv_value_0_15= 'mars' | lv_value_0_16= 'avril' | lv_value_0_17= 'mai' | lv_value_0_18= 'juin' | lv_value_0_19= 'juillet' | lv_value_0_20= 'aout' | lv_value_0_21= 'septembre' | lv_value_0_22= 'octobre' | lv_value_0_23= 'novembre' | lv_value_0_24= 'decembre' ) ) ) ;
    public final EObject ruleMonthNameT() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        Token lv_value_0_6=null;
        Token lv_value_0_7=null;
        Token lv_value_0_8=null;
        Token lv_value_0_9=null;
        Token lv_value_0_10=null;
        Token lv_value_0_11=null;
        Token lv_value_0_12=null;
        Token lv_value_0_13=null;
        Token lv_value_0_14=null;
        Token lv_value_0_15=null;
        Token lv_value_0_16=null;
        Token lv_value_0_17=null;
        Token lv_value_0_18=null;
        Token lv_value_0_19=null;
        Token lv_value_0_20=null;
        Token lv_value_0_21=null;
        Token lv_value_0_22=null;
        Token lv_value_0_23=null;
        Token lv_value_0_24=null;


        	enterRule();

        try {
            // InternalMyDsl.g:381:2: ( ( ( (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' | lv_value_0_13= 'janvier' | lv_value_0_14= 'fevrier' | lv_value_0_15= 'mars' | lv_value_0_16= 'avril' | lv_value_0_17= 'mai' | lv_value_0_18= 'juin' | lv_value_0_19= 'juillet' | lv_value_0_20= 'aout' | lv_value_0_21= 'septembre' | lv_value_0_22= 'octobre' | lv_value_0_23= 'novembre' | lv_value_0_24= 'decembre' ) ) ) )
            // InternalMyDsl.g:382:2: ( ( (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' | lv_value_0_13= 'janvier' | lv_value_0_14= 'fevrier' | lv_value_0_15= 'mars' | lv_value_0_16= 'avril' | lv_value_0_17= 'mai' | lv_value_0_18= 'juin' | lv_value_0_19= 'juillet' | lv_value_0_20= 'aout' | lv_value_0_21= 'septembre' | lv_value_0_22= 'octobre' | lv_value_0_23= 'novembre' | lv_value_0_24= 'decembre' ) ) )
            {
            // InternalMyDsl.g:382:2: ( ( (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' | lv_value_0_13= 'janvier' | lv_value_0_14= 'fevrier' | lv_value_0_15= 'mars' | lv_value_0_16= 'avril' | lv_value_0_17= 'mai' | lv_value_0_18= 'juin' | lv_value_0_19= 'juillet' | lv_value_0_20= 'aout' | lv_value_0_21= 'septembre' | lv_value_0_22= 'octobre' | lv_value_0_23= 'novembre' | lv_value_0_24= 'decembre' ) ) )
            // InternalMyDsl.g:383:3: ( (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' | lv_value_0_13= 'janvier' | lv_value_0_14= 'fevrier' | lv_value_0_15= 'mars' | lv_value_0_16= 'avril' | lv_value_0_17= 'mai' | lv_value_0_18= 'juin' | lv_value_0_19= 'juillet' | lv_value_0_20= 'aout' | lv_value_0_21= 'septembre' | lv_value_0_22= 'octobre' | lv_value_0_23= 'novembre' | lv_value_0_24= 'decembre' ) )
            {
            // InternalMyDsl.g:383:3: ( (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' | lv_value_0_13= 'janvier' | lv_value_0_14= 'fevrier' | lv_value_0_15= 'mars' | lv_value_0_16= 'avril' | lv_value_0_17= 'mai' | lv_value_0_18= 'juin' | lv_value_0_19= 'juillet' | lv_value_0_20= 'aout' | lv_value_0_21= 'septembre' | lv_value_0_22= 'octobre' | lv_value_0_23= 'novembre' | lv_value_0_24= 'decembre' ) )
            // InternalMyDsl.g:384:4: (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' | lv_value_0_13= 'janvier' | lv_value_0_14= 'fevrier' | lv_value_0_15= 'mars' | lv_value_0_16= 'avril' | lv_value_0_17= 'mai' | lv_value_0_18= 'juin' | lv_value_0_19= 'juillet' | lv_value_0_20= 'aout' | lv_value_0_21= 'septembre' | lv_value_0_22= 'octobre' | lv_value_0_23= 'novembre' | lv_value_0_24= 'decembre' )
            {
            // InternalMyDsl.g:384:4: (lv_value_0_1= 'Janvier' | lv_value_0_2= 'Fevrier' | lv_value_0_3= 'Mars' | lv_value_0_4= 'Avril' | lv_value_0_5= 'Mai' | lv_value_0_6= 'Juin' | lv_value_0_7= 'Juillet' | lv_value_0_8= 'Aout' | lv_value_0_9= 'Septembre' | lv_value_0_10= 'Octobre' | lv_value_0_11= 'Novembre' | lv_value_0_12= 'Decembre' | lv_value_0_13= 'janvier' | lv_value_0_14= 'fevrier' | lv_value_0_15= 'mars' | lv_value_0_16= 'avril' | lv_value_0_17= 'mai' | lv_value_0_18= 'juin' | lv_value_0_19= 'juillet' | lv_value_0_20= 'aout' | lv_value_0_21= 'septembre' | lv_value_0_22= 'octobre' | lv_value_0_23= 'novembre' | lv_value_0_24= 'decembre' )
            int alt5=24;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            case 21:
                {
                alt5=7;
                }
                break;
            case 22:
                {
                alt5=8;
                }
                break;
            case 23:
                {
                alt5=9;
                }
                break;
            case 24:
                {
                alt5=10;
                }
                break;
            case 25:
                {
                alt5=11;
                }
                break;
            case 26:
                {
                alt5=12;
                }
                break;
            case 27:
                {
                alt5=13;
                }
                break;
            case 28:
                {
                alt5=14;
                }
                break;
            case 29:
                {
                alt5=15;
                }
                break;
            case 30:
                {
                alt5=16;
                }
                break;
            case 31:
                {
                alt5=17;
                }
                break;
            case 32:
                {
                alt5=18;
                }
                break;
            case 33:
                {
                alt5=19;
                }
                break;
            case 34:
                {
                alt5=20;
                }
                break;
            case 35:
                {
                alt5=21;
                }
                break;
            case 36:
                {
                alt5=22;
                }
                break;
            case 37:
                {
                alt5=23;
                }
                break;
            case 38:
                {
                alt5=24;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:385:5: lv_value_0_1= 'Janvier'
                    {
                    lv_value_0_1=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getMonthNameTAccess().getValueJanvierKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:396:5: lv_value_0_2= 'Fevrier'
                    {
                    lv_value_0_2=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getMonthNameTAccess().getValueFevrierKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:407:5: lv_value_0_3= 'Mars'
                    {
                    lv_value_0_3=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getMonthNameTAccess().getValueMarsKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:418:5: lv_value_0_4= 'Avril'
                    {
                    lv_value_0_4=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getMonthNameTAccess().getValueAvrilKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:429:5: lv_value_0_5= 'Mai'
                    {
                    lv_value_0_5=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_value_0_5, grammarAccess.getMonthNameTAccess().getValueMaiKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:440:5: lv_value_0_6= 'Juin'
                    {
                    lv_value_0_6=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_value_0_6, grammarAccess.getMonthNameTAccess().getValueJuinKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:451:5: lv_value_0_7= 'Juillet'
                    {
                    lv_value_0_7=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_value_0_7, grammarAccess.getMonthNameTAccess().getValueJuilletKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:462:5: lv_value_0_8= 'Aout'
                    {
                    lv_value_0_8=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_value_0_8, grammarAccess.getMonthNameTAccess().getValueAoutKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:473:5: lv_value_0_9= 'Septembre'
                    {
                    lv_value_0_9=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_value_0_9, grammarAccess.getMonthNameTAccess().getValueSeptembreKeyword_0_8());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_9, null);
                    				

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:484:5: lv_value_0_10= 'Octobre'
                    {
                    lv_value_0_10=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_value_0_10, grammarAccess.getMonthNameTAccess().getValueOctobreKeyword_0_9());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_10, null);
                    				

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:495:5: lv_value_0_11= 'Novembre'
                    {
                    lv_value_0_11=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_value_0_11, grammarAccess.getMonthNameTAccess().getValueNovembreKeyword_0_10());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_11, null);
                    				

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:506:5: lv_value_0_12= 'Decembre'
                    {
                    lv_value_0_12=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_value_0_12, grammarAccess.getMonthNameTAccess().getValueDecembreKeyword_0_11());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_12, null);
                    				

                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:517:5: lv_value_0_13= 'janvier'
                    {
                    lv_value_0_13=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_value_0_13, grammarAccess.getMonthNameTAccess().getValueJanvierKeyword_0_12());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_13, null);
                    				

                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:528:5: lv_value_0_14= 'fevrier'
                    {
                    lv_value_0_14=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_value_0_14, grammarAccess.getMonthNameTAccess().getValueFevrierKeyword_0_13());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_14, null);
                    				

                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:539:5: lv_value_0_15= 'mars'
                    {
                    lv_value_0_15=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_value_0_15, grammarAccess.getMonthNameTAccess().getValueMarsKeyword_0_14());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_15, null);
                    				

                    }
                    break;
                case 16 :
                    // InternalMyDsl.g:550:5: lv_value_0_16= 'avril'
                    {
                    lv_value_0_16=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_value_0_16, grammarAccess.getMonthNameTAccess().getValueAvrilKeyword_0_15());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_16, null);
                    				

                    }
                    break;
                case 17 :
                    // InternalMyDsl.g:561:5: lv_value_0_17= 'mai'
                    {
                    lv_value_0_17=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_value_0_17, grammarAccess.getMonthNameTAccess().getValueMaiKeyword_0_16());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_17, null);
                    				

                    }
                    break;
                case 18 :
                    // InternalMyDsl.g:572:5: lv_value_0_18= 'juin'
                    {
                    lv_value_0_18=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_value_0_18, grammarAccess.getMonthNameTAccess().getValueJuinKeyword_0_17());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_18, null);
                    				

                    }
                    break;
                case 19 :
                    // InternalMyDsl.g:583:5: lv_value_0_19= 'juillet'
                    {
                    lv_value_0_19=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_value_0_19, grammarAccess.getMonthNameTAccess().getValueJuilletKeyword_0_18());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_19, null);
                    				

                    }
                    break;
                case 20 :
                    // InternalMyDsl.g:594:5: lv_value_0_20= 'aout'
                    {
                    lv_value_0_20=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_value_0_20, grammarAccess.getMonthNameTAccess().getValueAoutKeyword_0_19());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_20, null);
                    				

                    }
                    break;
                case 21 :
                    // InternalMyDsl.g:605:5: lv_value_0_21= 'septembre'
                    {
                    lv_value_0_21=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_value_0_21, grammarAccess.getMonthNameTAccess().getValueSeptembreKeyword_0_20());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_21, null);
                    				

                    }
                    break;
                case 22 :
                    // InternalMyDsl.g:616:5: lv_value_0_22= 'octobre'
                    {
                    lv_value_0_22=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_value_0_22, grammarAccess.getMonthNameTAccess().getValueOctobreKeyword_0_21());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_22, null);
                    				

                    }
                    break;
                case 23 :
                    // InternalMyDsl.g:627:5: lv_value_0_23= 'novembre'
                    {
                    lv_value_0_23=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_value_0_23, grammarAccess.getMonthNameTAccess().getValueNovembreKeyword_0_22());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_23, null);
                    				

                    }
                    break;
                case 24 :
                    // InternalMyDsl.g:638:5: lv_value_0_24= 'decembre'
                    {
                    lv_value_0_24=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_value_0_24, grammarAccess.getMonthNameTAccess().getValueDecembreKeyword_0_23());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonthNameTRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_24, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleMonthNameT"


    // $ANTLR start "entryRuleMonthT"
    // InternalMyDsl.g:654:1: entryRuleMonthT returns [EObject current=null] : iv_ruleMonthT= ruleMonthT EOF ;
    public final EObject entryRuleMonthT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonthT = null;


        try {
            // InternalMyDsl.g:654:47: (iv_ruleMonthT= ruleMonthT EOF )
            // InternalMyDsl.g:655:2: iv_ruleMonthT= ruleMonthT EOF
            {
             newCompositeNode(grammarAccess.getMonthTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonthT=ruleMonthT();

            state._fsp--;

             current =iv_ruleMonthT; 
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
    // $ANTLR end "entryRuleMonthT"


    // $ANTLR start "ruleMonthT"
    // InternalMyDsl.g:661:1: ruleMonthT returns [EObject current=null] : ( (lv_value_0_0= RULE_TWO_DIGIT ) ) ;
    public final EObject ruleMonthT() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:667:2: ( ( (lv_value_0_0= RULE_TWO_DIGIT ) ) )
            // InternalMyDsl.g:668:2: ( (lv_value_0_0= RULE_TWO_DIGIT ) )
            {
            // InternalMyDsl.g:668:2: ( (lv_value_0_0= RULE_TWO_DIGIT ) )
            // InternalMyDsl.g:669:3: (lv_value_0_0= RULE_TWO_DIGIT )
            {
            // InternalMyDsl.g:669:3: (lv_value_0_0= RULE_TWO_DIGIT )
            // InternalMyDsl.g:670:4: lv_value_0_0= RULE_TWO_DIGIT
            {
            lv_value_0_0=(Token)match(input,RULE_TWO_DIGIT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getMonthTAccess().getValueTWO_DIGITTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMonthTRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"xCalendar.MyDsl.TWO_DIGIT");
            			

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
    // $ANTLR end "ruleMonthT"


    // $ANTLR start "entryRuleDateT"
    // InternalMyDsl.g:689:1: entryRuleDateT returns [EObject current=null] : iv_ruleDateT= ruleDateT EOF ;
    public final EObject entryRuleDateT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateT = null;


        try {
            // InternalMyDsl.g:689:46: (iv_ruleDateT= ruleDateT EOF )
            // InternalMyDsl.g:690:2: iv_ruleDateT= ruleDateT EOF
            {
             newCompositeNode(grammarAccess.getDateTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateT=ruleDateT();

            state._fsp--;

             current =iv_ruleDateT; 
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
    // $ANTLR end "entryRuleDateT"


    // $ANTLR start "ruleDateT"
    // InternalMyDsl.g:696:1: ruleDateT returns [EObject current=null] : ( ( (lv_day_name_0_0= RULE_STR ) )? ( (lv_day_1_0= ruleInteger ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= ruleInteger ) )? ( (otherlv_4= '\\u00E0 ' | otherlv_5= 'a ' )? ( (lv_hours_6_0= ruleInteger ) ) (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= 'heure ' ) ( ( (lv_minutes_10_0= ruleInteger ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= 'minutes' | otherlv_15= ':' )? )? ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= ruleInteger ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= 'secondes' )? )? )? ) ;
    public final EObject ruleDateT() throws RecognitionException {
        EObject current = null;

        Token lv_day_name_0_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_day_1_0 = null;

        EObject lv_month_2_0 = null;

        AntlrDatatypeRuleToken lv_year_3_0 = null;

        AntlrDatatypeRuleToken lv_hours_6_0 = null;

        AntlrDatatypeRuleToken lv_minutes_10_0 = null;

        AntlrDatatypeRuleToken lv_seconds_17_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:702:2: ( ( ( (lv_day_name_0_0= RULE_STR ) )? ( (lv_day_1_0= ruleInteger ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= ruleInteger ) )? ( (otherlv_4= '\\u00E0 ' | otherlv_5= 'a ' )? ( (lv_hours_6_0= ruleInteger ) ) (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= 'heure ' ) ( ( (lv_minutes_10_0= ruleInteger ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= 'minutes' | otherlv_15= ':' )? )? ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= ruleInteger ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= 'secondes' )? )? )? ) )
            // InternalMyDsl.g:703:2: ( ( (lv_day_name_0_0= RULE_STR ) )? ( (lv_day_1_0= ruleInteger ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= ruleInteger ) )? ( (otherlv_4= '\\u00E0 ' | otherlv_5= 'a ' )? ( (lv_hours_6_0= ruleInteger ) ) (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= 'heure ' ) ( ( (lv_minutes_10_0= ruleInteger ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= 'minutes' | otherlv_15= ':' )? )? ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= ruleInteger ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= 'secondes' )? )? )? )
            {
            // InternalMyDsl.g:703:2: ( ( (lv_day_name_0_0= RULE_STR ) )? ( (lv_day_1_0= ruleInteger ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= ruleInteger ) )? ( (otherlv_4= '\\u00E0 ' | otherlv_5= 'a ' )? ( (lv_hours_6_0= ruleInteger ) ) (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= 'heure ' ) ( ( (lv_minutes_10_0= ruleInteger ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= 'minutes' | otherlv_15= ':' )? )? ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= ruleInteger ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= 'secondes' )? )? )? )
            // InternalMyDsl.g:704:3: ( (lv_day_name_0_0= RULE_STR ) )? ( (lv_day_1_0= ruleInteger ) ) ( (lv_month_2_0= ruleMonth ) ) ( (lv_year_3_0= ruleInteger ) )? ( (otherlv_4= '\\u00E0 ' | otherlv_5= 'a ' )? ( (lv_hours_6_0= ruleInteger ) ) (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= 'heure ' ) ( ( (lv_minutes_10_0= ruleInteger ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= 'minutes' | otherlv_15= ':' )? )? ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= ruleInteger ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= 'secondes' )? )? )?
            {
            // InternalMyDsl.g:704:3: ( (lv_day_name_0_0= RULE_STR ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STR) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:705:4: (lv_day_name_0_0= RULE_STR )
                    {
                    // InternalMyDsl.g:705:4: (lv_day_name_0_0= RULE_STR )
                    // InternalMyDsl.g:706:5: lv_day_name_0_0= RULE_STR
                    {
                    lv_day_name_0_0=(Token)match(input,RULE_STR,FOLLOW_7); 

                    					newLeafNode(lv_day_name_0_0, grammarAccess.getDateTAccess().getDay_nameSTRTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDateTRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"day_name",
                    						lv_day_name_0_0,
                    						"xCalendar.MyDsl.STR");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:722:3: ( (lv_day_1_0= ruleInteger ) )
            // InternalMyDsl.g:723:4: (lv_day_1_0= ruleInteger )
            {
            // InternalMyDsl.g:723:4: (lv_day_1_0= ruleInteger )
            // InternalMyDsl.g:724:5: lv_day_1_0= ruleInteger
            {

            					newCompositeNode(grammarAccess.getDateTAccess().getDayIntegerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_day_1_0=ruleInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDateTRule());
            					}
            					set(
            						current,
            						"day",
            						lv_day_1_0,
            						"xCalendar.MyDsl.Integer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:741:3: ( (lv_month_2_0= ruleMonth ) )
            // InternalMyDsl.g:742:4: (lv_month_2_0= ruleMonth )
            {
            // InternalMyDsl.g:742:4: (lv_month_2_0= ruleMonth )
            // InternalMyDsl.g:743:5: lv_month_2_0= ruleMonth
            {

            					newCompositeNode(grammarAccess.getDateTAccess().getMonthMonthParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_month_2_0=ruleMonth();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDateTRule());
            					}
            					set(
            						current,
            						"month",
            						lv_month_2_0,
            						"xCalendar.MyDsl.Month");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:760:3: ( (lv_year_3_0= ruleInteger ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||LA7_1==RULE_INT||LA7_1==14||(LA7_1>=39 && LA7_1<=40)||(LA7_1>=59 && LA7_1<=63)||(LA7_1>=65 && LA7_1<=77)||(LA7_1>=82 && LA7_1<=83)||LA7_1==90||(LA7_1>=93 && LA7_1<=94)||(LA7_1>=96 && LA7_1<=97)||LA7_1==104||(LA7_1>=108 && LA7_1<=128)||LA7_1==131) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:761:4: (lv_year_3_0= ruleInteger )
                    {
                    // InternalMyDsl.g:761:4: (lv_year_3_0= ruleInteger )
                    // InternalMyDsl.g:762:5: lv_year_3_0= ruleInteger
                    {

                    					newCompositeNode(grammarAccess.getDateTAccess().getYearIntegerParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_year_3_0=ruleInteger();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDateTRule());
                    					}
                    					set(
                    						current,
                    						"year",
                    						lv_year_3_0,
                    						"xCalendar.MyDsl.Integer");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:779:3: ( (otherlv_4= '\\u00E0 ' | otherlv_5= 'a ' )? ( (lv_hours_6_0= ruleInteger ) ) (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= 'heure ' ) ( ( (lv_minutes_10_0= ruleInteger ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= 'minutes' | otherlv_15= ':' )? )? ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= ruleInteger ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= 'secondes' )? )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT||(LA15_0>=39 && LA15_0<=40)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:780:4: (otherlv_4= '\\u00E0 ' | otherlv_5= 'a ' )? ( (lv_hours_6_0= ruleInteger ) ) (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= 'heure ' ) ( ( (lv_minutes_10_0= ruleInteger ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= 'minutes' | otherlv_15= ':' )? )? ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= ruleInteger ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= 'secondes' )? )?
                    {
                    // InternalMyDsl.g:780:4: (otherlv_4= '\\u00E0 ' | otherlv_5= 'a ' )?
                    int alt8=3;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==39) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==40) ) {
                        alt8=2;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDsl.g:781:5: otherlv_4= '\\u00E0 '
                            {
                            otherlv_4=(Token)match(input,39,FOLLOW_7); 

                            					newLeafNode(otherlv_4, grammarAccess.getDateTAccess().getLatinSmallLetterAWithGraveSpaceKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:786:5: otherlv_5= 'a '
                            {
                            otherlv_5=(Token)match(input,40,FOLLOW_7); 

                            					newLeafNode(otherlv_5, grammarAccess.getDateTAccess().getAKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:791:4: ( (lv_hours_6_0= ruleInteger ) )
                    // InternalMyDsl.g:792:5: (lv_hours_6_0= ruleInteger )
                    {
                    // InternalMyDsl.g:792:5: (lv_hours_6_0= ruleInteger )
                    // InternalMyDsl.g:793:6: lv_hours_6_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getDateTAccess().getHoursIntegerParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_hours_6_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateTRule());
                    						}
                    						set(
                    							current,
                    							"hours",
                    							lv_hours_6_0,
                    							"xCalendar.MyDsl.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:810:4: (otherlv_7= 'h' | otherlv_8= ':' | otherlv_9= 'heure ' )
                    int alt9=3;
                    switch ( input.LA(1) ) {
                    case 41:
                        {
                        alt9=1;
                        }
                        break;
                    case 42:
                        {
                        alt9=2;
                        }
                        break;
                    case 43:
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
                            // InternalMyDsl.g:811:5: otherlv_7= 'h'
                            {
                            otherlv_7=(Token)match(input,41,FOLLOW_11); 

                            					newLeafNode(otherlv_7, grammarAccess.getDateTAccess().getHKeyword_4_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:816:5: otherlv_8= ':'
                            {
                            otherlv_8=(Token)match(input,42,FOLLOW_11); 

                            					newLeafNode(otherlv_8, grammarAccess.getDateTAccess().getColonKeyword_4_2_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:821:5: otherlv_9= 'heure '
                            {
                            otherlv_9=(Token)match(input,43,FOLLOW_11); 

                            					newLeafNode(otherlv_9, grammarAccess.getDateTAccess().getHeureKeyword_4_2_2());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:826:4: ( ( (lv_minutes_10_0= ruleInteger ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= 'minutes' | otherlv_15= ':' )? )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_INT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMyDsl.g:827:5: ( (lv_minutes_10_0= ruleInteger ) ) (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= 'minutes' | otherlv_15= ':' )?
                            {
                            // InternalMyDsl.g:827:5: ( (lv_minutes_10_0= ruleInteger ) )
                            // InternalMyDsl.g:828:6: (lv_minutes_10_0= ruleInteger )
                            {
                            // InternalMyDsl.g:828:6: (lv_minutes_10_0= ruleInteger )
                            // InternalMyDsl.g:829:7: lv_minutes_10_0= ruleInteger
                            {

                            							newCompositeNode(grammarAccess.getDateTAccess().getMinutesIntegerParserRuleCall_4_3_0_0());
                            						
                            pushFollow(FOLLOW_12);
                            lv_minutes_10_0=ruleInteger();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getDateTRule());
                            							}
                            							set(
                            								current,
                            								"minutes",
                            								lv_minutes_10_0,
                            								"xCalendar.MyDsl.Integer");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyDsl.g:846:5: (otherlv_11= 'm' | otherlv_12= 'mn' | otherlv_13= 'min' | otherlv_14= 'minutes' | otherlv_15= ':' )?
                            int alt10=6;
                            switch ( input.LA(1) ) {
                                case 44:
                                    {
                                    alt10=1;
                                    }
                                    break;
                                case 45:
                                    {
                                    alt10=2;
                                    }
                                    break;
                                case 46:
                                    {
                                    alt10=3;
                                    }
                                    break;
                                case 47:
                                    {
                                    alt10=4;
                                    }
                                    break;
                                case 42:
                                    {
                                    alt10=5;
                                    }
                                    break;
                            }

                            switch (alt10) {
                                case 1 :
                                    // InternalMyDsl.g:847:6: otherlv_11= 'm'
                                    {
                                    otherlv_11=(Token)match(input,44,FOLLOW_11); 

                                    						newLeafNode(otherlv_11, grammarAccess.getDateTAccess().getMKeyword_4_3_1_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalMyDsl.g:852:6: otherlv_12= 'mn'
                                    {
                                    otherlv_12=(Token)match(input,45,FOLLOW_11); 

                                    						newLeafNode(otherlv_12, grammarAccess.getDateTAccess().getMnKeyword_4_3_1_1());
                                    					

                                    }
                                    break;
                                case 3 :
                                    // InternalMyDsl.g:857:6: otherlv_13= 'min'
                                    {
                                    otherlv_13=(Token)match(input,46,FOLLOW_11); 

                                    						newLeafNode(otherlv_13, grammarAccess.getDateTAccess().getMinKeyword_4_3_1_2());
                                    					

                                    }
                                    break;
                                case 4 :
                                    // InternalMyDsl.g:862:6: otherlv_14= 'minutes'
                                    {
                                    otherlv_14=(Token)match(input,47,FOLLOW_11); 

                                    						newLeafNode(otherlv_14, grammarAccess.getDateTAccess().getMinutesKeyword_4_3_1_3());
                                    					

                                    }
                                    break;
                                case 5 :
                                    // InternalMyDsl.g:867:6: otherlv_15= ':'
                                    {
                                    otherlv_15=(Token)match(input,42,FOLLOW_11); 

                                    						newLeafNode(otherlv_15, grammarAccess.getDateTAccess().getColonKeyword_4_3_1_4());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:873:4: ( (otherlv_16= ' et ' )? ( (lv_seconds_17_0= ruleInteger ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= 'secondes' )? )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_INT||LA14_0==48) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMyDsl.g:874:5: (otherlv_16= ' et ' )? ( (lv_seconds_17_0= ruleInteger ) ) (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= 'secondes' )?
                            {
                            // InternalMyDsl.g:874:5: (otherlv_16= ' et ' )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==48) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // InternalMyDsl.g:875:6: otherlv_16= ' et '
                                    {
                                    otherlv_16=(Token)match(input,48,FOLLOW_7); 

                                    						newLeafNode(otherlv_16, grammarAccess.getDateTAccess().getEtKeyword_4_4_0());
                                    					

                                    }
                                    break;

                            }

                            // InternalMyDsl.g:880:5: ( (lv_seconds_17_0= ruleInteger ) )
                            // InternalMyDsl.g:881:6: (lv_seconds_17_0= ruleInteger )
                            {
                            // InternalMyDsl.g:881:6: (lv_seconds_17_0= ruleInteger )
                            // InternalMyDsl.g:882:7: lv_seconds_17_0= ruleInteger
                            {

                            							newCompositeNode(grammarAccess.getDateTAccess().getSecondsIntegerParserRuleCall_4_4_1_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_seconds_17_0=ruleInteger();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getDateTRule());
                            							}
                            							set(
                            								current,
                            								"seconds",
                            								lv_seconds_17_0,
                            								"xCalendar.MyDsl.Integer");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMyDsl.g:899:5: (otherlv_18= 's' | otherlv_19= 'sec' | otherlv_20= 'secondes' )?
                            int alt13=4;
                            switch ( input.LA(1) ) {
                                case 49:
                                    {
                                    alt13=1;
                                    }
                                    break;
                                case 50:
                                    {
                                    alt13=2;
                                    }
                                    break;
                                case 51:
                                    {
                                    alt13=3;
                                    }
                                    break;
                            }

                            switch (alt13) {
                                case 1 :
                                    // InternalMyDsl.g:900:6: otherlv_18= 's'
                                    {
                                    otherlv_18=(Token)match(input,49,FOLLOW_2); 

                                    						newLeafNode(otherlv_18, grammarAccess.getDateTAccess().getSKeyword_4_4_2_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalMyDsl.g:905:6: otherlv_19= 'sec'
                                    {
                                    otherlv_19=(Token)match(input,50,FOLLOW_2); 

                                    						newLeafNode(otherlv_19, grammarAccess.getDateTAccess().getSecKeyword_4_4_2_1());
                                    					

                                    }
                                    break;
                                case 3 :
                                    // InternalMyDsl.g:910:6: otherlv_20= 'secondes'
                                    {
                                    otherlv_20=(Token)match(input,51,FOLLOW_2); 

                                    						newLeafNode(otherlv_20, grammarAccess.getDateTAccess().getSecondesKeyword_4_4_2_2());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

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
    // $ANTLR end "ruleDateT"


    // $ANTLR start "entryRuleStatus"
    // InternalMyDsl.g:921:1: entryRuleStatus returns [String current=null] : iv_ruleStatus= ruleStatus EOF ;
    public final String entryRuleStatus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatus = null;


        try {
            // InternalMyDsl.g:921:46: (iv_ruleStatus= ruleStatus EOF )
            // InternalMyDsl.g:922:2: iv_ruleStatus= ruleStatus EOF
            {
             newCompositeNode(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatus=ruleStatus();

            state._fsp--;

             current =iv_ruleStatus.getText(); 
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
    // $ANTLR end "entryRuleStatus"


    // $ANTLR start "ruleStatus"
    // InternalMyDsl.g:928:1: ruleStatus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Tentative' | kw= 'Confirm\\u00E9' | kw= 'Annul\\u00E9' ) ;
    public final AntlrDatatypeRuleToken ruleStatus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:934:2: ( (kw= 'Tentative' | kw= 'Confirm\\u00E9' | kw= 'Annul\\u00E9' ) )
            // InternalMyDsl.g:935:2: (kw= 'Tentative' | kw= 'Confirm\\u00E9' | kw= 'Annul\\u00E9' )
            {
            // InternalMyDsl.g:935:2: (kw= 'Tentative' | kw= 'Confirm\\u00E9' | kw= 'Annul\\u00E9' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt16=1;
                }
                break;
            case 53:
                {
                alt16=2;
                }
                break;
            case 54:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:936:3: kw= 'Tentative'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStatusAccess().getTentativeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:942:3: kw= 'Confirm\\u00E9'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStatusAccess().getConfirmKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:948:3: kw= 'Annul\\u00E9'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStatusAccess().getAnnulKeyword_2());
                    		

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
    // $ANTLR end "ruleStatus"


    // $ANTLR start "entryRuleEventStatus"
    // InternalMyDsl.g:957:1: entryRuleEventStatus returns [String current=null] : iv_ruleEventStatus= ruleEventStatus EOF ;
    public final String entryRuleEventStatus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEventStatus = null;


        try {
            // InternalMyDsl.g:957:51: (iv_ruleEventStatus= ruleEventStatus EOF )
            // InternalMyDsl.g:958:2: iv_ruleEventStatus= ruleEventStatus EOF
            {
             newCompositeNode(grammarAccess.getEventStatusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventStatus=ruleEventStatus();

            state._fsp--;

             current =iv_ruleEventStatus.getText(); 
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
    // $ANTLR end "entryRuleEventStatus"


    // $ANTLR start "ruleEventStatus"
    // InternalMyDsl.g:964:1: ruleEventStatus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Status_0= ruleStatus | kw= 'Compl\\u00E9t\\u00E9' | kw= 'En cours' ) ;
    public final AntlrDatatypeRuleToken ruleEventStatus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Status_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:970:2: ( (this_Status_0= ruleStatus | kw= 'Compl\\u00E9t\\u00E9' | kw= 'En cours' ) )
            // InternalMyDsl.g:971:2: (this_Status_0= ruleStatus | kw= 'Compl\\u00E9t\\u00E9' | kw= 'En cours' )
            {
            // InternalMyDsl.g:971:2: (this_Status_0= ruleStatus | kw= 'Compl\\u00E9t\\u00E9' | kw= 'En cours' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 52:
            case 53:
            case 54:
                {
                alt17=1;
                }
                break;
            case 55:
                {
                alt17=2;
                }
                break;
            case 56:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:972:3: this_Status_0= ruleStatus
                    {

                    			newCompositeNode(grammarAccess.getEventStatusAccess().getStatusParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Status_0=ruleStatus();

                    state._fsp--;


                    			current.merge(this_Status_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:983:3: kw= 'Compl\\u00E9t\\u00E9'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEventStatusAccess().getComplTKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:989:3: kw= 'En cours'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEventStatusAccess().getEnCoursKeyword_2());
                    		

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
    // $ANTLR end "ruleEventStatus"


    // $ANTLR start "entryRuleEventC"
    // InternalMyDsl.g:998:1: entryRuleEventC returns [EObject current=null] : iv_ruleEventC= ruleEventC EOF ;
    public final EObject entryRuleEventC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventC = null;


        try {
            // InternalMyDsl.g:998:47: (iv_ruleEventC= ruleEventC EOF )
            // InternalMyDsl.g:999:2: iv_ruleEventC= ruleEventC EOF
            {
             newCompositeNode(grammarAccess.getEventCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventC=ruleEventC();

            state._fsp--;

             current =iv_ruleEventC; 
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
    // $ANTLR end "entryRuleEventC"


    // $ANTLR start "ruleEventC"
    // InternalMyDsl.g:1005:1: ruleEventC returns [EObject current=null] : (otherlv_0= 'RDV {' otherlv_1= 'Date: ' ( (lv_dtstart_2_0= ruleDateT ) ) (otherlv_3= 'Identifiant: ' ( (lv_uid_4_0= RULE_STR ) ) )? (otherlv_5= 'Organisateur: ' ( (lv_organizer_6_0= RULE_STR ) ) )? (otherlv_7= 'Objet: ' ( (lv_summary_8_0= RULE_STR ) ) )? (otherlv_9= 'URL: ' ( (lv_url_10_0= RULE_STR ) ) )? (otherlv_11= 'Attachements: ' ( (lv_attach_12_0= RULE_STR ) ) (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )* )? (otherlv_15= 'Invit\\u00E9s: ' ( (lv_attendee_16_0= RULE_STR ) ) (otherlv_17= ',' ( (lv_attendee_18_0= RULE_STR ) ) )* )? (otherlv_19= 'Cat\\u00E9gories: ' ( (lv_categories_20_0= RULE_STR ) ) (otherlv_21= ',' ( (lv_categories_22_0= RULE_STR ) ) )* )? (otherlv_23= 'Commentaire: ' ( (lv_comment_24_0= RULE_STR ) ) (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )* )? (otherlv_27= 'Contact: ' ( (lv_contact_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_contact_30_0= RULE_STR ) ) )* )? (otherlv_31= 'Status: ' ( (lv_rstatus_32_0= ruleEventStatus ) ) (otherlv_33= ',' ( (lv_rstatus_34_0= ruleEventStatus ) ) )* )? (otherlv_35= 'Reli\\u00E9 \\u00E0: ' ( (lv_related_36_0= RULE_STR ) ) (otherlv_37= ',' ( (lv_related_38_0= RULE_STR ) ) )* )? (otherlv_39= 'resources: ' ( (lv_resources_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_resources_42_0= RULE_STR ) ) )* )? (otherlv_43= 'Description: ' ( (lv_description_44_0= RULE_STR ) ) )? (otherlv_45= 'Priorit\\u00E9: ' ( (lv_priority_46_0= RULE_STR ) ) )? (otherlv_47= 'Lieu: ' ( (lv_location_48_0= RULE_STR ) ) )? (otherlv_49= 'Fin: ' ( (lv_dtend_50_0= ruleDateT ) ) )? (otherlv_51= 'Rappel: ' ( (lv_alarmc_52_0= ruleAlarmC ) ) (otherlv_53= ',' ( (lv_alarmc_54_0= ruleAlarmC ) ) )* )? otherlv_55= '\\r\\n' otherlv_56= '}' ) ;
    public final EObject ruleEventC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_uid_4_0=null;
        Token otherlv_5=null;
        Token lv_organizer_6_0=null;
        Token otherlv_7=null;
        Token lv_summary_8_0=null;
        Token otherlv_9=null;
        Token lv_url_10_0=null;
        Token otherlv_11=null;
        Token lv_attach_12_0=null;
        Token otherlv_13=null;
        Token lv_attach_14_0=null;
        Token otherlv_15=null;
        Token lv_attendee_16_0=null;
        Token otherlv_17=null;
        Token lv_attendee_18_0=null;
        Token otherlv_19=null;
        Token lv_categories_20_0=null;
        Token otherlv_21=null;
        Token lv_categories_22_0=null;
        Token otherlv_23=null;
        Token lv_comment_24_0=null;
        Token otherlv_25=null;
        Token lv_comment_26_0=null;
        Token otherlv_27=null;
        Token lv_contact_28_0=null;
        Token otherlv_29=null;
        Token lv_contact_30_0=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token lv_related_36_0=null;
        Token otherlv_37=null;
        Token lv_related_38_0=null;
        Token otherlv_39=null;
        Token lv_resources_40_0=null;
        Token otherlv_41=null;
        Token lv_resources_42_0=null;
        Token otherlv_43=null;
        Token lv_description_44_0=null;
        Token otherlv_45=null;
        Token lv_priority_46_0=null;
        Token otherlv_47=null;
        Token lv_location_48_0=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        EObject lv_dtstart_2_0 = null;

        AntlrDatatypeRuleToken lv_rstatus_32_0 = null;

        AntlrDatatypeRuleToken lv_rstatus_34_0 = null;

        EObject lv_dtend_50_0 = null;

        EObject lv_alarmc_52_0 = null;

        EObject lv_alarmc_54_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1011:2: ( (otherlv_0= 'RDV {' otherlv_1= 'Date: ' ( (lv_dtstart_2_0= ruleDateT ) ) (otherlv_3= 'Identifiant: ' ( (lv_uid_4_0= RULE_STR ) ) )? (otherlv_5= 'Organisateur: ' ( (lv_organizer_6_0= RULE_STR ) ) )? (otherlv_7= 'Objet: ' ( (lv_summary_8_0= RULE_STR ) ) )? (otherlv_9= 'URL: ' ( (lv_url_10_0= RULE_STR ) ) )? (otherlv_11= 'Attachements: ' ( (lv_attach_12_0= RULE_STR ) ) (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )* )? (otherlv_15= 'Invit\\u00E9s: ' ( (lv_attendee_16_0= RULE_STR ) ) (otherlv_17= ',' ( (lv_attendee_18_0= RULE_STR ) ) )* )? (otherlv_19= 'Cat\\u00E9gories: ' ( (lv_categories_20_0= RULE_STR ) ) (otherlv_21= ',' ( (lv_categories_22_0= RULE_STR ) ) )* )? (otherlv_23= 'Commentaire: ' ( (lv_comment_24_0= RULE_STR ) ) (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )* )? (otherlv_27= 'Contact: ' ( (lv_contact_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_contact_30_0= RULE_STR ) ) )* )? (otherlv_31= 'Status: ' ( (lv_rstatus_32_0= ruleEventStatus ) ) (otherlv_33= ',' ( (lv_rstatus_34_0= ruleEventStatus ) ) )* )? (otherlv_35= 'Reli\\u00E9 \\u00E0: ' ( (lv_related_36_0= RULE_STR ) ) (otherlv_37= ',' ( (lv_related_38_0= RULE_STR ) ) )* )? (otherlv_39= 'resources: ' ( (lv_resources_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_resources_42_0= RULE_STR ) ) )* )? (otherlv_43= 'Description: ' ( (lv_description_44_0= RULE_STR ) ) )? (otherlv_45= 'Priorit\\u00E9: ' ( (lv_priority_46_0= RULE_STR ) ) )? (otherlv_47= 'Lieu: ' ( (lv_location_48_0= RULE_STR ) ) )? (otherlv_49= 'Fin: ' ( (lv_dtend_50_0= ruleDateT ) ) )? (otherlv_51= 'Rappel: ' ( (lv_alarmc_52_0= ruleAlarmC ) ) (otherlv_53= ',' ( (lv_alarmc_54_0= ruleAlarmC ) ) )* )? otherlv_55= '\\r\\n' otherlv_56= '}' ) )
            // InternalMyDsl.g:1012:2: (otherlv_0= 'RDV {' otherlv_1= 'Date: ' ( (lv_dtstart_2_0= ruleDateT ) ) (otherlv_3= 'Identifiant: ' ( (lv_uid_4_0= RULE_STR ) ) )? (otherlv_5= 'Organisateur: ' ( (lv_organizer_6_0= RULE_STR ) ) )? (otherlv_7= 'Objet: ' ( (lv_summary_8_0= RULE_STR ) ) )? (otherlv_9= 'URL: ' ( (lv_url_10_0= RULE_STR ) ) )? (otherlv_11= 'Attachements: ' ( (lv_attach_12_0= RULE_STR ) ) (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )* )? (otherlv_15= 'Invit\\u00E9s: ' ( (lv_attendee_16_0= RULE_STR ) ) (otherlv_17= ',' ( (lv_attendee_18_0= RULE_STR ) ) )* )? (otherlv_19= 'Cat\\u00E9gories: ' ( (lv_categories_20_0= RULE_STR ) ) (otherlv_21= ',' ( (lv_categories_22_0= RULE_STR ) ) )* )? (otherlv_23= 'Commentaire: ' ( (lv_comment_24_0= RULE_STR ) ) (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )* )? (otherlv_27= 'Contact: ' ( (lv_contact_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_contact_30_0= RULE_STR ) ) )* )? (otherlv_31= 'Status: ' ( (lv_rstatus_32_0= ruleEventStatus ) ) (otherlv_33= ',' ( (lv_rstatus_34_0= ruleEventStatus ) ) )* )? (otherlv_35= 'Reli\\u00E9 \\u00E0: ' ( (lv_related_36_0= RULE_STR ) ) (otherlv_37= ',' ( (lv_related_38_0= RULE_STR ) ) )* )? (otherlv_39= 'resources: ' ( (lv_resources_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_resources_42_0= RULE_STR ) ) )* )? (otherlv_43= 'Description: ' ( (lv_description_44_0= RULE_STR ) ) )? (otherlv_45= 'Priorit\\u00E9: ' ( (lv_priority_46_0= RULE_STR ) ) )? (otherlv_47= 'Lieu: ' ( (lv_location_48_0= RULE_STR ) ) )? (otherlv_49= 'Fin: ' ( (lv_dtend_50_0= ruleDateT ) ) )? (otherlv_51= 'Rappel: ' ( (lv_alarmc_52_0= ruleAlarmC ) ) (otherlv_53= ',' ( (lv_alarmc_54_0= ruleAlarmC ) ) )* )? otherlv_55= '\\r\\n' otherlv_56= '}' )
            {
            // InternalMyDsl.g:1012:2: (otherlv_0= 'RDV {' otherlv_1= 'Date: ' ( (lv_dtstart_2_0= ruleDateT ) ) (otherlv_3= 'Identifiant: ' ( (lv_uid_4_0= RULE_STR ) ) )? (otherlv_5= 'Organisateur: ' ( (lv_organizer_6_0= RULE_STR ) ) )? (otherlv_7= 'Objet: ' ( (lv_summary_8_0= RULE_STR ) ) )? (otherlv_9= 'URL: ' ( (lv_url_10_0= RULE_STR ) ) )? (otherlv_11= 'Attachements: ' ( (lv_attach_12_0= RULE_STR ) ) (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )* )? (otherlv_15= 'Invit\\u00E9s: ' ( (lv_attendee_16_0= RULE_STR ) ) (otherlv_17= ',' ( (lv_attendee_18_0= RULE_STR ) ) )* )? (otherlv_19= 'Cat\\u00E9gories: ' ( (lv_categories_20_0= RULE_STR ) ) (otherlv_21= ',' ( (lv_categories_22_0= RULE_STR ) ) )* )? (otherlv_23= 'Commentaire: ' ( (lv_comment_24_0= RULE_STR ) ) (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )* )? (otherlv_27= 'Contact: ' ( (lv_contact_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_contact_30_0= RULE_STR ) ) )* )? (otherlv_31= 'Status: ' ( (lv_rstatus_32_0= ruleEventStatus ) ) (otherlv_33= ',' ( (lv_rstatus_34_0= ruleEventStatus ) ) )* )? (otherlv_35= 'Reli\\u00E9 \\u00E0: ' ( (lv_related_36_0= RULE_STR ) ) (otherlv_37= ',' ( (lv_related_38_0= RULE_STR ) ) )* )? (otherlv_39= 'resources: ' ( (lv_resources_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_resources_42_0= RULE_STR ) ) )* )? (otherlv_43= 'Description: ' ( (lv_description_44_0= RULE_STR ) ) )? (otherlv_45= 'Priorit\\u00E9: ' ( (lv_priority_46_0= RULE_STR ) ) )? (otherlv_47= 'Lieu: ' ( (lv_location_48_0= RULE_STR ) ) )? (otherlv_49= 'Fin: ' ( (lv_dtend_50_0= ruleDateT ) ) )? (otherlv_51= 'Rappel: ' ( (lv_alarmc_52_0= ruleAlarmC ) ) (otherlv_53= ',' ( (lv_alarmc_54_0= ruleAlarmC ) ) )* )? otherlv_55= '\\r\\n' otherlv_56= '}' )
            // InternalMyDsl.g:1013:3: otherlv_0= 'RDV {' otherlv_1= 'Date: ' ( (lv_dtstart_2_0= ruleDateT ) ) (otherlv_3= 'Identifiant: ' ( (lv_uid_4_0= RULE_STR ) ) )? (otherlv_5= 'Organisateur: ' ( (lv_organizer_6_0= RULE_STR ) ) )? (otherlv_7= 'Objet: ' ( (lv_summary_8_0= RULE_STR ) ) )? (otherlv_9= 'URL: ' ( (lv_url_10_0= RULE_STR ) ) )? (otherlv_11= 'Attachements: ' ( (lv_attach_12_0= RULE_STR ) ) (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )* )? (otherlv_15= 'Invit\\u00E9s: ' ( (lv_attendee_16_0= RULE_STR ) ) (otherlv_17= ',' ( (lv_attendee_18_0= RULE_STR ) ) )* )? (otherlv_19= 'Cat\\u00E9gories: ' ( (lv_categories_20_0= RULE_STR ) ) (otherlv_21= ',' ( (lv_categories_22_0= RULE_STR ) ) )* )? (otherlv_23= 'Commentaire: ' ( (lv_comment_24_0= RULE_STR ) ) (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )* )? (otherlv_27= 'Contact: ' ( (lv_contact_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_contact_30_0= RULE_STR ) ) )* )? (otherlv_31= 'Status: ' ( (lv_rstatus_32_0= ruleEventStatus ) ) (otherlv_33= ',' ( (lv_rstatus_34_0= ruleEventStatus ) ) )* )? (otherlv_35= 'Reli\\u00E9 \\u00E0: ' ( (lv_related_36_0= RULE_STR ) ) (otherlv_37= ',' ( (lv_related_38_0= RULE_STR ) ) )* )? (otherlv_39= 'resources: ' ( (lv_resources_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_resources_42_0= RULE_STR ) ) )* )? (otherlv_43= 'Description: ' ( (lv_description_44_0= RULE_STR ) ) )? (otherlv_45= 'Priorit\\u00E9: ' ( (lv_priority_46_0= RULE_STR ) ) )? (otherlv_47= 'Lieu: ' ( (lv_location_48_0= RULE_STR ) ) )? (otherlv_49= 'Fin: ' ( (lv_dtend_50_0= ruleDateT ) ) )? (otherlv_51= 'Rappel: ' ( (lv_alarmc_52_0= ruleAlarmC ) ) (otherlv_53= ',' ( (lv_alarmc_54_0= ruleAlarmC ) ) )* )? otherlv_55= '\\r\\n' otherlv_56= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEventCAccess().getRDVKeyword_0());
            		
            otherlv_1=(Token)match(input,58,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getEventCAccess().getDateKeyword_1());
            		
            // InternalMyDsl.g:1021:3: ( (lv_dtstart_2_0= ruleDateT ) )
            // InternalMyDsl.g:1022:4: (lv_dtstart_2_0= ruleDateT )
            {
            // InternalMyDsl.g:1022:4: (lv_dtstart_2_0= ruleDateT )
            // InternalMyDsl.g:1023:5: lv_dtstart_2_0= ruleDateT
            {

            					newCompositeNode(grammarAccess.getEventCAccess().getDtstartDateTParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_dtstart_2_0=ruleDateT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventCRule());
            					}
            					set(
            						current,
            						"dtstart",
            						lv_dtstart_2_0,
            						"xCalendar.MyDsl.DateT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1040:3: (otherlv_3= 'Identifiant: ' ( (lv_uid_4_0= RULE_STR ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==59) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1041:4: otherlv_3= 'Identifiant: ' ( (lv_uid_4_0= RULE_STR ) )
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEventCAccess().getIdentifiantKeyword_3_0());
                    			
                    // InternalMyDsl.g:1045:4: ( (lv_uid_4_0= RULE_STR ) )
                    // InternalMyDsl.g:1046:5: (lv_uid_4_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1046:5: (lv_uid_4_0= RULE_STR )
                    // InternalMyDsl.g:1047:6: lv_uid_4_0= RULE_STR
                    {
                    lv_uid_4_0=(Token)match(input,RULE_STR,FOLLOW_17); 

                    						newLeafNode(lv_uid_4_0, grammarAccess.getEventCAccess().getUidSTRTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"uid",
                    							lv_uid_4_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1064:3: (otherlv_5= 'Organisateur: ' ( (lv_organizer_6_0= RULE_STR ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==60) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1065:4: otherlv_5= 'Organisateur: ' ( (lv_organizer_6_0= RULE_STR ) )
                    {
                    otherlv_5=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEventCAccess().getOrganisateurKeyword_4_0());
                    			
                    // InternalMyDsl.g:1069:4: ( (lv_organizer_6_0= RULE_STR ) )
                    // InternalMyDsl.g:1070:5: (lv_organizer_6_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1070:5: (lv_organizer_6_0= RULE_STR )
                    // InternalMyDsl.g:1071:6: lv_organizer_6_0= RULE_STR
                    {
                    lv_organizer_6_0=(Token)match(input,RULE_STR,FOLLOW_18); 

                    						newLeafNode(lv_organizer_6_0, grammarAccess.getEventCAccess().getOrganizerSTRTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"organizer",
                    							lv_organizer_6_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1088:3: (otherlv_7= 'Objet: ' ( (lv_summary_8_0= RULE_STR ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==61) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1089:4: otherlv_7= 'Objet: ' ( (lv_summary_8_0= RULE_STR ) )
                    {
                    otherlv_7=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getEventCAccess().getObjetKeyword_5_0());
                    			
                    // InternalMyDsl.g:1093:4: ( (lv_summary_8_0= RULE_STR ) )
                    // InternalMyDsl.g:1094:5: (lv_summary_8_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1094:5: (lv_summary_8_0= RULE_STR )
                    // InternalMyDsl.g:1095:6: lv_summary_8_0= RULE_STR
                    {
                    lv_summary_8_0=(Token)match(input,RULE_STR,FOLLOW_19); 

                    						newLeafNode(lv_summary_8_0, grammarAccess.getEventCAccess().getSummarySTRTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"summary",
                    							lv_summary_8_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1112:3: (otherlv_9= 'URL: ' ( (lv_url_10_0= RULE_STR ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==62) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1113:4: otherlv_9= 'URL: ' ( (lv_url_10_0= RULE_STR ) )
                    {
                    otherlv_9=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getEventCAccess().getURLKeyword_6_0());
                    			
                    // InternalMyDsl.g:1117:4: ( (lv_url_10_0= RULE_STR ) )
                    // InternalMyDsl.g:1118:5: (lv_url_10_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1118:5: (lv_url_10_0= RULE_STR )
                    // InternalMyDsl.g:1119:6: lv_url_10_0= RULE_STR
                    {
                    lv_url_10_0=(Token)match(input,RULE_STR,FOLLOW_20); 

                    						newLeafNode(lv_url_10_0, grammarAccess.getEventCAccess().getUrlSTRTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_10_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1136:3: (otherlv_11= 'Attachements: ' ( (lv_attach_12_0= RULE_STR ) ) (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==63) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1137:4: otherlv_11= 'Attachements: ' ( (lv_attach_12_0= RULE_STR ) ) (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )*
                    {
                    otherlv_11=(Token)match(input,63,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEventCAccess().getAttachementsKeyword_7_0());
                    			
                    // InternalMyDsl.g:1141:4: ( (lv_attach_12_0= RULE_STR ) )
                    // InternalMyDsl.g:1142:5: (lv_attach_12_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1142:5: (lv_attach_12_0= RULE_STR )
                    // InternalMyDsl.g:1143:6: lv_attach_12_0= RULE_STR
                    {
                    lv_attach_12_0=(Token)match(input,RULE_STR,FOLLOW_21); 

                    						newLeafNode(lv_attach_12_0, grammarAccess.getEventCAccess().getAttachSTRTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"attach",
                    							lv_attach_12_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:1159:4: (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==64) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalMyDsl.g:1160:5: otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) )
                    	    {
                    	    otherlv_13=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEventCAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:1164:5: ( (lv_attach_14_0= RULE_STR ) )
                    	    // InternalMyDsl.g:1165:6: (lv_attach_14_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:1165:6: (lv_attach_14_0= RULE_STR )
                    	    // InternalMyDsl.g:1166:7: lv_attach_14_0= RULE_STR
                    	    {
                    	    lv_attach_14_0=(Token)match(input,RULE_STR,FOLLOW_21); 

                    	    							newLeafNode(lv_attach_14_0, grammarAccess.getEventCAccess().getAttachSTRTerminalRuleCall_7_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"attach",
                    	    								lv_attach_14_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1184:3: (otherlv_15= 'Invit\\u00E9s: ' ( (lv_attendee_16_0= RULE_STR ) ) (otherlv_17= ',' ( (lv_attendee_18_0= RULE_STR ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==65) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1185:4: otherlv_15= 'Invit\\u00E9s: ' ( (lv_attendee_16_0= RULE_STR ) ) (otherlv_17= ',' ( (lv_attendee_18_0= RULE_STR ) ) )*
                    {
                    otherlv_15=(Token)match(input,65,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getEventCAccess().getInvitSKeyword_8_0());
                    			
                    // InternalMyDsl.g:1189:4: ( (lv_attendee_16_0= RULE_STR ) )
                    // InternalMyDsl.g:1190:5: (lv_attendee_16_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1190:5: (lv_attendee_16_0= RULE_STR )
                    // InternalMyDsl.g:1191:6: lv_attendee_16_0= RULE_STR
                    {
                    lv_attendee_16_0=(Token)match(input,RULE_STR,FOLLOW_22); 

                    						newLeafNode(lv_attendee_16_0, grammarAccess.getEventCAccess().getAttendeeSTRTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"attendee",
                    							lv_attendee_16_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:1207:4: (otherlv_17= ',' ( (lv_attendee_18_0= RULE_STR ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==64) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMyDsl.g:1208:5: otherlv_17= ',' ( (lv_attendee_18_0= RULE_STR ) )
                    	    {
                    	    otherlv_17=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEventCAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalMyDsl.g:1212:5: ( (lv_attendee_18_0= RULE_STR ) )
                    	    // InternalMyDsl.g:1213:6: (lv_attendee_18_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:1213:6: (lv_attendee_18_0= RULE_STR )
                    	    // InternalMyDsl.g:1214:7: lv_attendee_18_0= RULE_STR
                    	    {
                    	    lv_attendee_18_0=(Token)match(input,RULE_STR,FOLLOW_22); 

                    	    							newLeafNode(lv_attendee_18_0, grammarAccess.getEventCAccess().getAttendeeSTRTerminalRuleCall_8_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"attendee",
                    	    								lv_attendee_18_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1232:3: (otherlv_19= 'Cat\\u00E9gories: ' ( (lv_categories_20_0= RULE_STR ) ) (otherlv_21= ',' ( (lv_categories_22_0= RULE_STR ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==66) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1233:4: otherlv_19= 'Cat\\u00E9gories: ' ( (lv_categories_20_0= RULE_STR ) ) (otherlv_21= ',' ( (lv_categories_22_0= RULE_STR ) ) )*
                    {
                    otherlv_19=(Token)match(input,66,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEventCAccess().getCatGoriesKeyword_9_0());
                    			
                    // InternalMyDsl.g:1237:4: ( (lv_categories_20_0= RULE_STR ) )
                    // InternalMyDsl.g:1238:5: (lv_categories_20_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1238:5: (lv_categories_20_0= RULE_STR )
                    // InternalMyDsl.g:1239:6: lv_categories_20_0= RULE_STR
                    {
                    lv_categories_20_0=(Token)match(input,RULE_STR,FOLLOW_23); 

                    						newLeafNode(lv_categories_20_0, grammarAccess.getEventCAccess().getCategoriesSTRTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"categories",
                    							lv_categories_20_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:1255:4: (otherlv_21= ',' ( (lv_categories_22_0= RULE_STR ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==64) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalMyDsl.g:1256:5: otherlv_21= ',' ( (lv_categories_22_0= RULE_STR ) )
                    	    {
                    	    otherlv_21=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getEventCAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalMyDsl.g:1260:5: ( (lv_categories_22_0= RULE_STR ) )
                    	    // InternalMyDsl.g:1261:6: (lv_categories_22_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:1261:6: (lv_categories_22_0= RULE_STR )
                    	    // InternalMyDsl.g:1262:7: lv_categories_22_0= RULE_STR
                    	    {
                    	    lv_categories_22_0=(Token)match(input,RULE_STR,FOLLOW_23); 

                    	    							newLeafNode(lv_categories_22_0, grammarAccess.getEventCAccess().getCategoriesSTRTerminalRuleCall_9_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"categories",
                    	    								lv_categories_22_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1280:3: (otherlv_23= 'Commentaire: ' ( (lv_comment_24_0= RULE_STR ) ) (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==67) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1281:4: otherlv_23= 'Commentaire: ' ( (lv_comment_24_0= RULE_STR ) ) (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )*
                    {
                    otherlv_23=(Token)match(input,67,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getEventCAccess().getCommentaireKeyword_10_0());
                    			
                    // InternalMyDsl.g:1285:4: ( (lv_comment_24_0= RULE_STR ) )
                    // InternalMyDsl.g:1286:5: (lv_comment_24_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1286:5: (lv_comment_24_0= RULE_STR )
                    // InternalMyDsl.g:1287:6: lv_comment_24_0= RULE_STR
                    {
                    lv_comment_24_0=(Token)match(input,RULE_STR,FOLLOW_24); 

                    						newLeafNode(lv_comment_24_0, grammarAccess.getEventCAccess().getCommentSTRTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"comment",
                    							lv_comment_24_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:1303:4: (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==64) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalMyDsl.g:1304:5: otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) )
                    	    {
                    	    otherlv_25=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEventCAccess().getCommaKeyword_10_2_0());
                    	    				
                    	    // InternalMyDsl.g:1308:5: ( (lv_comment_26_0= RULE_STR ) )
                    	    // InternalMyDsl.g:1309:6: (lv_comment_26_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:1309:6: (lv_comment_26_0= RULE_STR )
                    	    // InternalMyDsl.g:1310:7: lv_comment_26_0= RULE_STR
                    	    {
                    	    lv_comment_26_0=(Token)match(input,RULE_STR,FOLLOW_24); 

                    	    							newLeafNode(lv_comment_26_0, grammarAccess.getEventCAccess().getCommentSTRTerminalRuleCall_10_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"comment",
                    	    								lv_comment_26_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1328:3: (otherlv_27= 'Contact: ' ( (lv_contact_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_contact_30_0= RULE_STR ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==68) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1329:4: otherlv_27= 'Contact: ' ( (lv_contact_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_contact_30_0= RULE_STR ) ) )*
                    {
                    otherlv_27=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getEventCAccess().getContactKeyword_11_0());
                    			
                    // InternalMyDsl.g:1333:4: ( (lv_contact_28_0= RULE_STR ) )
                    // InternalMyDsl.g:1334:5: (lv_contact_28_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1334:5: (lv_contact_28_0= RULE_STR )
                    // InternalMyDsl.g:1335:6: lv_contact_28_0= RULE_STR
                    {
                    lv_contact_28_0=(Token)match(input,RULE_STR,FOLLOW_25); 

                    						newLeafNode(lv_contact_28_0, grammarAccess.getEventCAccess().getContactSTRTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"contact",
                    							lv_contact_28_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:1351:4: (otherlv_29= ',' ( (lv_contact_30_0= RULE_STR ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==64) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalMyDsl.g:1352:5: otherlv_29= ',' ( (lv_contact_30_0= RULE_STR ) )
                    	    {
                    	    otherlv_29=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getEventCAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalMyDsl.g:1356:5: ( (lv_contact_30_0= RULE_STR ) )
                    	    // InternalMyDsl.g:1357:6: (lv_contact_30_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:1357:6: (lv_contact_30_0= RULE_STR )
                    	    // InternalMyDsl.g:1358:7: lv_contact_30_0= RULE_STR
                    	    {
                    	    lv_contact_30_0=(Token)match(input,RULE_STR,FOLLOW_25); 

                    	    							newLeafNode(lv_contact_30_0, grammarAccess.getEventCAccess().getContactSTRTerminalRuleCall_11_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"contact",
                    	    								lv_contact_30_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1376:3: (otherlv_31= 'Status: ' ( (lv_rstatus_32_0= ruleEventStatus ) ) (otherlv_33= ',' ( (lv_rstatus_34_0= ruleEventStatus ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==69) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1377:4: otherlv_31= 'Status: ' ( (lv_rstatus_32_0= ruleEventStatus ) ) (otherlv_33= ',' ( (lv_rstatus_34_0= ruleEventStatus ) ) )*
                    {
                    otherlv_31=(Token)match(input,69,FOLLOW_26); 

                    				newLeafNode(otherlv_31, grammarAccess.getEventCAccess().getStatusKeyword_12_0());
                    			
                    // InternalMyDsl.g:1381:4: ( (lv_rstatus_32_0= ruleEventStatus ) )
                    // InternalMyDsl.g:1382:5: (lv_rstatus_32_0= ruleEventStatus )
                    {
                    // InternalMyDsl.g:1382:5: (lv_rstatus_32_0= ruleEventStatus )
                    // InternalMyDsl.g:1383:6: lv_rstatus_32_0= ruleEventStatus
                    {

                    						newCompositeNode(grammarAccess.getEventCAccess().getRstatusEventStatusParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_rstatus_32_0=ruleEventStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventCRule());
                    						}
                    						add(
                    							current,
                    							"rstatus",
                    							lv_rstatus_32_0,
                    							"xCalendar.MyDsl.EventStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1400:4: (otherlv_33= ',' ( (lv_rstatus_34_0= ruleEventStatus ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==64) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalMyDsl.g:1401:5: otherlv_33= ',' ( (lv_rstatus_34_0= ruleEventStatus ) )
                    	    {
                    	    otherlv_33=(Token)match(input,64,FOLLOW_26); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getEventCAccess().getCommaKeyword_12_2_0());
                    	    				
                    	    // InternalMyDsl.g:1405:5: ( (lv_rstatus_34_0= ruleEventStatus ) )
                    	    // InternalMyDsl.g:1406:6: (lv_rstatus_34_0= ruleEventStatus )
                    	    {
                    	    // InternalMyDsl.g:1406:6: (lv_rstatus_34_0= ruleEventStatus )
                    	    // InternalMyDsl.g:1407:7: lv_rstatus_34_0= ruleEventStatus
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventCAccess().getRstatusEventStatusParserRuleCall_12_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_rstatus_34_0=ruleEventStatus();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventCRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rstatus",
                    	    								lv_rstatus_34_0,
                    	    								"xCalendar.MyDsl.EventStatus");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1426:3: (otherlv_35= 'Reli\\u00E9 \\u00E0: ' ( (lv_related_36_0= RULE_STR ) ) (otherlv_37= ',' ( (lv_related_38_0= RULE_STR ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==70) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1427:4: otherlv_35= 'Reli\\u00E9 \\u00E0: ' ( (lv_related_36_0= RULE_STR ) ) (otherlv_37= ',' ( (lv_related_38_0= RULE_STR ) ) )*
                    {
                    otherlv_35=(Token)match(input,70,FOLLOW_3); 

                    				newLeafNode(otherlv_35, grammarAccess.getEventCAccess().getReliKeyword_13_0());
                    			
                    // InternalMyDsl.g:1431:4: ( (lv_related_36_0= RULE_STR ) )
                    // InternalMyDsl.g:1432:5: (lv_related_36_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1432:5: (lv_related_36_0= RULE_STR )
                    // InternalMyDsl.g:1433:6: lv_related_36_0= RULE_STR
                    {
                    lv_related_36_0=(Token)match(input,RULE_STR,FOLLOW_28); 

                    						newLeafNode(lv_related_36_0, grammarAccess.getEventCAccess().getRelatedSTRTerminalRuleCall_13_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"related",
                    							lv_related_36_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:1449:4: (otherlv_37= ',' ( (lv_related_38_0= RULE_STR ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==64) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalMyDsl.g:1450:5: otherlv_37= ',' ( (lv_related_38_0= RULE_STR ) )
                    	    {
                    	    otherlv_37=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEventCAccess().getCommaKeyword_13_2_0());
                    	    				
                    	    // InternalMyDsl.g:1454:5: ( (lv_related_38_0= RULE_STR ) )
                    	    // InternalMyDsl.g:1455:6: (lv_related_38_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:1455:6: (lv_related_38_0= RULE_STR )
                    	    // InternalMyDsl.g:1456:7: lv_related_38_0= RULE_STR
                    	    {
                    	    lv_related_38_0=(Token)match(input,RULE_STR,FOLLOW_28); 

                    	    							newLeafNode(lv_related_38_0, grammarAccess.getEventCAccess().getRelatedSTRTerminalRuleCall_13_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"related",
                    	    								lv_related_38_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1474:3: (otherlv_39= 'resources: ' ( (lv_resources_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_resources_42_0= RULE_STR ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==71) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1475:4: otherlv_39= 'resources: ' ( (lv_resources_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_resources_42_0= RULE_STR ) ) )*
                    {
                    otherlv_39=(Token)match(input,71,FOLLOW_3); 

                    				newLeafNode(otherlv_39, grammarAccess.getEventCAccess().getResourcesKeyword_14_0());
                    			
                    // InternalMyDsl.g:1479:4: ( (lv_resources_40_0= RULE_STR ) )
                    // InternalMyDsl.g:1480:5: (lv_resources_40_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1480:5: (lv_resources_40_0= RULE_STR )
                    // InternalMyDsl.g:1481:6: lv_resources_40_0= RULE_STR
                    {
                    lv_resources_40_0=(Token)match(input,RULE_STR,FOLLOW_29); 

                    						newLeafNode(lv_resources_40_0, grammarAccess.getEventCAccess().getResourcesSTRTerminalRuleCall_14_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"resources",
                    							lv_resources_40_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:1497:4: (otherlv_41= ',' ( (lv_resources_42_0= RULE_STR ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==64) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalMyDsl.g:1498:5: otherlv_41= ',' ( (lv_resources_42_0= RULE_STR ) )
                    	    {
                    	    otherlv_41=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_41, grammarAccess.getEventCAccess().getCommaKeyword_14_2_0());
                    	    				
                    	    // InternalMyDsl.g:1502:5: ( (lv_resources_42_0= RULE_STR ) )
                    	    // InternalMyDsl.g:1503:6: (lv_resources_42_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:1503:6: (lv_resources_42_0= RULE_STR )
                    	    // InternalMyDsl.g:1504:7: lv_resources_42_0= RULE_STR
                    	    {
                    	    lv_resources_42_0=(Token)match(input,RULE_STR,FOLLOW_29); 

                    	    							newLeafNode(lv_resources_42_0, grammarAccess.getEventCAccess().getResourcesSTRTerminalRuleCall_14_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"resources",
                    	    								lv_resources_42_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1522:3: (otherlv_43= 'Description: ' ( (lv_description_44_0= RULE_STR ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==72) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1523:4: otherlv_43= 'Description: ' ( (lv_description_44_0= RULE_STR ) )
                    {
                    otherlv_43=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_43, grammarAccess.getEventCAccess().getDescriptionKeyword_15_0());
                    			
                    // InternalMyDsl.g:1527:4: ( (lv_description_44_0= RULE_STR ) )
                    // InternalMyDsl.g:1528:5: (lv_description_44_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1528:5: (lv_description_44_0= RULE_STR )
                    // InternalMyDsl.g:1529:6: lv_description_44_0= RULE_STR
                    {
                    lv_description_44_0=(Token)match(input,RULE_STR,FOLLOW_30); 

                    						newLeafNode(lv_description_44_0, grammarAccess.getEventCAccess().getDescriptionSTRTerminalRuleCall_15_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_44_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1546:3: (otherlv_45= 'Priorit\\u00E9: ' ( (lv_priority_46_0= RULE_STR ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==73) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1547:4: otherlv_45= 'Priorit\\u00E9: ' ( (lv_priority_46_0= RULE_STR ) )
                    {
                    otherlv_45=(Token)match(input,73,FOLLOW_3); 

                    				newLeafNode(otherlv_45, grammarAccess.getEventCAccess().getPrioritKeyword_16_0());
                    			
                    // InternalMyDsl.g:1551:4: ( (lv_priority_46_0= RULE_STR ) )
                    // InternalMyDsl.g:1552:5: (lv_priority_46_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1552:5: (lv_priority_46_0= RULE_STR )
                    // InternalMyDsl.g:1553:6: lv_priority_46_0= RULE_STR
                    {
                    lv_priority_46_0=(Token)match(input,RULE_STR,FOLLOW_31); 

                    						newLeafNode(lv_priority_46_0, grammarAccess.getEventCAccess().getPrioritySTRTerminalRuleCall_16_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"priority",
                    							lv_priority_46_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1570:3: (otherlv_47= 'Lieu: ' ( (lv_location_48_0= RULE_STR ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==74) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:1571:4: otherlv_47= 'Lieu: ' ( (lv_location_48_0= RULE_STR ) )
                    {
                    otherlv_47=(Token)match(input,74,FOLLOW_3); 

                    				newLeafNode(otherlv_47, grammarAccess.getEventCAccess().getLieuKeyword_17_0());
                    			
                    // InternalMyDsl.g:1575:4: ( (lv_location_48_0= RULE_STR ) )
                    // InternalMyDsl.g:1576:5: (lv_location_48_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1576:5: (lv_location_48_0= RULE_STR )
                    // InternalMyDsl.g:1577:6: lv_location_48_0= RULE_STR
                    {
                    lv_location_48_0=(Token)match(input,RULE_STR,FOLLOW_32); 

                    						newLeafNode(lv_location_48_0, grammarAccess.getEventCAccess().getLocationSTRTerminalRuleCall_17_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"location",
                    							lv_location_48_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1594:3: (otherlv_49= 'Fin: ' ( (lv_dtend_50_0= ruleDateT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==75) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1595:4: otherlv_49= 'Fin: ' ( (lv_dtend_50_0= ruleDateT ) )
                    {
                    otherlv_49=(Token)match(input,75,FOLLOW_15); 

                    				newLeafNode(otherlv_49, grammarAccess.getEventCAccess().getFinKeyword_18_0());
                    			
                    // InternalMyDsl.g:1599:4: ( (lv_dtend_50_0= ruleDateT ) )
                    // InternalMyDsl.g:1600:5: (lv_dtend_50_0= ruleDateT )
                    {
                    // InternalMyDsl.g:1600:5: (lv_dtend_50_0= ruleDateT )
                    // InternalMyDsl.g:1601:6: lv_dtend_50_0= ruleDateT
                    {

                    						newCompositeNode(grammarAccess.getEventCAccess().getDtendDateTParserRuleCall_18_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_dtend_50_0=ruleDateT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventCRule());
                    						}
                    						set(
                    							current,
                    							"dtend",
                    							lv_dtend_50_0,
                    							"xCalendar.MyDsl.DateT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1619:3: (otherlv_51= 'Rappel: ' ( (lv_alarmc_52_0= ruleAlarmC ) ) (otherlv_53= ',' ( (lv_alarmc_54_0= ruleAlarmC ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==76) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:1620:4: otherlv_51= 'Rappel: ' ( (lv_alarmc_52_0= ruleAlarmC ) ) (otherlv_53= ',' ( (lv_alarmc_54_0= ruleAlarmC ) ) )*
                    {
                    otherlv_51=(Token)match(input,76,FOLLOW_5); 

                    				newLeafNode(otherlv_51, grammarAccess.getEventCAccess().getRappelKeyword_19_0());
                    			
                    // InternalMyDsl.g:1624:4: ( (lv_alarmc_52_0= ruleAlarmC ) )
                    // InternalMyDsl.g:1625:5: (lv_alarmc_52_0= ruleAlarmC )
                    {
                    // InternalMyDsl.g:1625:5: (lv_alarmc_52_0= ruleAlarmC )
                    // InternalMyDsl.g:1626:6: lv_alarmc_52_0= ruleAlarmC
                    {

                    						newCompositeNode(grammarAccess.getEventCAccess().getAlarmcAlarmCParserRuleCall_19_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_alarmc_52_0=ruleAlarmC();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventCRule());
                    						}
                    						add(
                    							current,
                    							"alarmc",
                    							lv_alarmc_52_0,
                    							"xCalendar.MyDsl.AlarmC");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1643:4: (otherlv_53= ',' ( (lv_alarmc_54_0= ruleAlarmC ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==64) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalMyDsl.g:1644:5: otherlv_53= ',' ( (lv_alarmc_54_0= ruleAlarmC ) )
                    	    {
                    	    otherlv_53=(Token)match(input,64,FOLLOW_5); 

                    	    					newLeafNode(otherlv_53, grammarAccess.getEventCAccess().getCommaKeyword_19_2_0());
                    	    				
                    	    // InternalMyDsl.g:1648:5: ( (lv_alarmc_54_0= ruleAlarmC ) )
                    	    // InternalMyDsl.g:1649:6: (lv_alarmc_54_0= ruleAlarmC )
                    	    {
                    	    // InternalMyDsl.g:1649:6: (lv_alarmc_54_0= ruleAlarmC )
                    	    // InternalMyDsl.g:1650:7: lv_alarmc_54_0= ruleAlarmC
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventCAccess().getAlarmcAlarmCParserRuleCall_19_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_alarmc_54_0=ruleAlarmC();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventCRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"alarmc",
                    	    								lv_alarmc_54_0,
                    	    								"xCalendar.MyDsl.AlarmC");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_55=(Token)match(input,14,FOLLOW_35); 

            			newLeafNode(otherlv_55, grammarAccess.getEventCAccess().getCarriageReturnCrLineFeedLfKeyword_20());
            		
            otherlv_56=(Token)match(input,77,FOLLOW_2); 

            			newLeafNode(otherlv_56, grammarAccess.getEventCAccess().getRightCurlyBracketKeyword_21());
            		

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
    // $ANTLR end "ruleEventC"


    // $ANTLR start "entryRuleAlarmC"
    // InternalMyDsl.g:1681:1: entryRuleAlarmC returns [EObject current=null] : iv_ruleAlarmC= ruleAlarmC EOF ;
    public final EObject entryRuleAlarmC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlarmC = null;


        try {
            // InternalMyDsl.g:1681:47: (iv_ruleAlarmC= ruleAlarmC EOF )
            // InternalMyDsl.g:1682:2: iv_ruleAlarmC= ruleAlarmC EOF
            {
             newCompositeNode(grammarAccess.getAlarmCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlarmC=ruleAlarmC();

            state._fsp--;

             current =iv_ruleAlarmC; 
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
    // $ANTLR end "entryRuleAlarmC"


    // $ANTLR start "ruleAlarmC"
    // InternalMyDsl.g:1688:1: ruleAlarmC returns [EObject current=null] : (otherlv_0= 'AlarmC' otherlv_1= '{' otherlv_2= 'action' ( (lv_action_3_0= RULE_STR ) ) otherlv_4= 'trigger' ( (lv_trigger_5_0= RULE_STR ) ) (otherlv_6= 'attach' ( (lv_attach_7_0= RULE_STR ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STR ) ) )? otherlv_10= 'type' ( (lv_type_11_0= ruleAlarmType ) ) (otherlv_12= 'time' ( (lv_time_13_0= ruleComponentAlarmTime ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleAlarmC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_action_3_0=null;
        Token otherlv_4=null;
        Token lv_trigger_5_0=null;
        Token otherlv_6=null;
        Token lv_attach_7_0=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_type_11_0 = null;

        EObject lv_time_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1694:2: ( (otherlv_0= 'AlarmC' otherlv_1= '{' otherlv_2= 'action' ( (lv_action_3_0= RULE_STR ) ) otherlv_4= 'trigger' ( (lv_trigger_5_0= RULE_STR ) ) (otherlv_6= 'attach' ( (lv_attach_7_0= RULE_STR ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STR ) ) )? otherlv_10= 'type' ( (lv_type_11_0= ruleAlarmType ) ) (otherlv_12= 'time' ( (lv_time_13_0= ruleComponentAlarmTime ) ) )? otherlv_14= '}' ) )
            // InternalMyDsl.g:1695:2: (otherlv_0= 'AlarmC' otherlv_1= '{' otherlv_2= 'action' ( (lv_action_3_0= RULE_STR ) ) otherlv_4= 'trigger' ( (lv_trigger_5_0= RULE_STR ) ) (otherlv_6= 'attach' ( (lv_attach_7_0= RULE_STR ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STR ) ) )? otherlv_10= 'type' ( (lv_type_11_0= ruleAlarmType ) ) (otherlv_12= 'time' ( (lv_time_13_0= ruleComponentAlarmTime ) ) )? otherlv_14= '}' )
            {
            // InternalMyDsl.g:1695:2: (otherlv_0= 'AlarmC' otherlv_1= '{' otherlv_2= 'action' ( (lv_action_3_0= RULE_STR ) ) otherlv_4= 'trigger' ( (lv_trigger_5_0= RULE_STR ) ) (otherlv_6= 'attach' ( (lv_attach_7_0= RULE_STR ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STR ) ) )? otherlv_10= 'type' ( (lv_type_11_0= ruleAlarmType ) ) (otherlv_12= 'time' ( (lv_time_13_0= ruleComponentAlarmTime ) ) )? otherlv_14= '}' )
            // InternalMyDsl.g:1696:3: otherlv_0= 'AlarmC' otherlv_1= '{' otherlv_2= 'action' ( (lv_action_3_0= RULE_STR ) ) otherlv_4= 'trigger' ( (lv_trigger_5_0= RULE_STR ) ) (otherlv_6= 'attach' ( (lv_attach_7_0= RULE_STR ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STR ) ) )? otherlv_10= 'type' ( (lv_type_11_0= ruleAlarmType ) ) (otherlv_12= 'time' ( (lv_time_13_0= ruleComponentAlarmTime ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getAlarmCAccess().getAlarmCKeyword_0());
            		
            otherlv_1=(Token)match(input,79,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getAlarmCAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAlarmCAccess().getActionKeyword_2());
            		
            // InternalMyDsl.g:1708:3: ( (lv_action_3_0= RULE_STR ) )
            // InternalMyDsl.g:1709:4: (lv_action_3_0= RULE_STR )
            {
            // InternalMyDsl.g:1709:4: (lv_action_3_0= RULE_STR )
            // InternalMyDsl.g:1710:5: lv_action_3_0= RULE_STR
            {
            lv_action_3_0=(Token)match(input,RULE_STR,FOLLOW_38); 

            					newLeafNode(lv_action_3_0, grammarAccess.getAlarmCAccess().getActionSTRTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlarmCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_3_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            otherlv_4=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAlarmCAccess().getTriggerKeyword_4());
            		
            // InternalMyDsl.g:1730:3: ( (lv_trigger_5_0= RULE_STR ) )
            // InternalMyDsl.g:1731:4: (lv_trigger_5_0= RULE_STR )
            {
            // InternalMyDsl.g:1731:4: (lv_trigger_5_0= RULE_STR )
            // InternalMyDsl.g:1732:5: lv_trigger_5_0= RULE_STR
            {
            lv_trigger_5_0=(Token)match(input,RULE_STR,FOLLOW_39); 

            					newLeafNode(lv_trigger_5_0, grammarAccess.getAlarmCAccess().getTriggerSTRTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlarmCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"trigger",
            						lv_trigger_5_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            // InternalMyDsl.g:1748:3: (otherlv_6= 'attach' ( (lv_attach_7_0= RULE_STR ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==82) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:1749:4: otherlv_6= 'attach' ( (lv_attach_7_0= RULE_STR ) )
                    {
                    otherlv_6=(Token)match(input,82,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getAlarmCAccess().getAttachKeyword_6_0());
                    			
                    // InternalMyDsl.g:1753:4: ( (lv_attach_7_0= RULE_STR ) )
                    // InternalMyDsl.g:1754:5: (lv_attach_7_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1754:5: (lv_attach_7_0= RULE_STR )
                    // InternalMyDsl.g:1755:6: lv_attach_7_0= RULE_STR
                    {
                    lv_attach_7_0=(Token)match(input,RULE_STR,FOLLOW_40); 

                    						newLeafNode(lv_attach_7_0, grammarAccess.getAlarmCAccess().getAttachSTRTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAlarmCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"attach",
                    							lv_attach_7_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1772:3: (otherlv_8= 'description' ( (lv_description_9_0= RULE_STR ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==83) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:1773:4: otherlv_8= 'description' ( (lv_description_9_0= RULE_STR ) )
                    {
                    otherlv_8=(Token)match(input,83,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getAlarmCAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalMyDsl.g:1777:4: ( (lv_description_9_0= RULE_STR ) )
                    // InternalMyDsl.g:1778:5: (lv_description_9_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1778:5: (lv_description_9_0= RULE_STR )
                    // InternalMyDsl.g:1779:6: lv_description_9_0= RULE_STR
                    {
                    lv_description_9_0=(Token)match(input,RULE_STR,FOLLOW_41); 

                    						newLeafNode(lv_description_9_0, grammarAccess.getAlarmCAccess().getDescriptionSTRTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAlarmCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,84,FOLLOW_42); 

            			newLeafNode(otherlv_10, grammarAccess.getAlarmCAccess().getTypeKeyword_8());
            		
            // InternalMyDsl.g:1800:3: ( (lv_type_11_0= ruleAlarmType ) )
            // InternalMyDsl.g:1801:4: (lv_type_11_0= ruleAlarmType )
            {
            // InternalMyDsl.g:1801:4: (lv_type_11_0= ruleAlarmType )
            // InternalMyDsl.g:1802:5: lv_type_11_0= ruleAlarmType
            {

            					newCompositeNode(grammarAccess.getAlarmCAccess().getTypeAlarmTypeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_43);
            lv_type_11_0=ruleAlarmType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlarmCRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_11_0,
            						"xCalendar.MyDsl.AlarmType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1819:3: (otherlv_12= 'time' ( (lv_time_13_0= ruleComponentAlarmTime ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==85) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:1820:4: otherlv_12= 'time' ( (lv_time_13_0= ruleComponentAlarmTime ) )
                    {
                    otherlv_12=(Token)match(input,85,FOLLOW_44); 

                    				newLeafNode(otherlv_12, grammarAccess.getAlarmCAccess().getTimeKeyword_10_0());
                    			
                    // InternalMyDsl.g:1824:4: ( (lv_time_13_0= ruleComponentAlarmTime ) )
                    // InternalMyDsl.g:1825:5: (lv_time_13_0= ruleComponentAlarmTime )
                    {
                    // InternalMyDsl.g:1825:5: (lv_time_13_0= ruleComponentAlarmTime )
                    // InternalMyDsl.g:1826:6: lv_time_13_0= ruleComponentAlarmTime
                    {

                    						newCompositeNode(grammarAccess.getAlarmCAccess().getTimeComponentAlarmTimeParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_time_13_0=ruleComponentAlarmTime();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlarmCRule());
                    						}
                    						set(
                    							current,
                    							"time",
                    							lv_time_13_0,
                    							"xCalendar.MyDsl.ComponentAlarmTime");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,77,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getAlarmCAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleAlarmC"


    // $ANTLR start "entryRuletzprop"
    // InternalMyDsl.g:1852:1: entryRuletzprop returns [EObject current=null] : iv_ruletzprop= ruletzprop EOF ;
    public final EObject entryRuletzprop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletzprop = null;


        try {
            // InternalMyDsl.g:1852:47: (iv_ruletzprop= ruletzprop EOF )
            // InternalMyDsl.g:1853:2: iv_ruletzprop= ruletzprop EOF
            {
             newCompositeNode(grammarAccess.getTzpropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletzprop=ruletzprop();

            state._fsp--;

             current =iv_ruletzprop; 
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
    // $ANTLR end "entryRuletzprop"


    // $ANTLR start "ruletzprop"
    // InternalMyDsl.g:1859:1: ruletzprop returns [EObject current=null] : (otherlv_0= 'tzprop' otherlv_1= '{' otherlv_2= 'dtstart' ( (lv_dtstart_3_0= RULE_STR ) ) otherlv_4= 'tzoffseto' ( (lv_tzoffseto_5_0= RULE_STR ) ) otherlv_6= 'tzoffsetfrom' ( (lv_tzoffsetfrom_7_0= RULE_STR ) ) (otherlv_8= 'rrule' ( (lv_rrule_9_0= RULE_STR ) ) )? (otherlv_10= 'opt' otherlv_11= '{' ( (lv_opt_12_0= ruletzpropOptional ) ) (otherlv_13= ',' ( (lv_opt_14_0= ruletzpropOptional ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruletzprop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_dtstart_3_0=null;
        Token otherlv_4=null;
        Token lv_tzoffseto_5_0=null;
        Token otherlv_6=null;
        Token lv_tzoffsetfrom_7_0=null;
        Token otherlv_8=null;
        Token lv_rrule_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_opt_12_0 = null;

        EObject lv_opt_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1865:2: ( (otherlv_0= 'tzprop' otherlv_1= '{' otherlv_2= 'dtstart' ( (lv_dtstart_3_0= RULE_STR ) ) otherlv_4= 'tzoffseto' ( (lv_tzoffseto_5_0= RULE_STR ) ) otherlv_6= 'tzoffsetfrom' ( (lv_tzoffsetfrom_7_0= RULE_STR ) ) (otherlv_8= 'rrule' ( (lv_rrule_9_0= RULE_STR ) ) )? (otherlv_10= 'opt' otherlv_11= '{' ( (lv_opt_12_0= ruletzpropOptional ) ) (otherlv_13= ',' ( (lv_opt_14_0= ruletzpropOptional ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalMyDsl.g:1866:2: (otherlv_0= 'tzprop' otherlv_1= '{' otherlv_2= 'dtstart' ( (lv_dtstart_3_0= RULE_STR ) ) otherlv_4= 'tzoffseto' ( (lv_tzoffseto_5_0= RULE_STR ) ) otherlv_6= 'tzoffsetfrom' ( (lv_tzoffsetfrom_7_0= RULE_STR ) ) (otherlv_8= 'rrule' ( (lv_rrule_9_0= RULE_STR ) ) )? (otherlv_10= 'opt' otherlv_11= '{' ( (lv_opt_12_0= ruletzpropOptional ) ) (otherlv_13= ',' ( (lv_opt_14_0= ruletzpropOptional ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalMyDsl.g:1866:2: (otherlv_0= 'tzprop' otherlv_1= '{' otherlv_2= 'dtstart' ( (lv_dtstart_3_0= RULE_STR ) ) otherlv_4= 'tzoffseto' ( (lv_tzoffseto_5_0= RULE_STR ) ) otherlv_6= 'tzoffsetfrom' ( (lv_tzoffsetfrom_7_0= RULE_STR ) ) (otherlv_8= 'rrule' ( (lv_rrule_9_0= RULE_STR ) ) )? (otherlv_10= 'opt' otherlv_11= '{' ( (lv_opt_12_0= ruletzpropOptional ) ) (otherlv_13= ',' ( (lv_opt_14_0= ruletzpropOptional ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalMyDsl.g:1867:3: otherlv_0= 'tzprop' otherlv_1= '{' otherlv_2= 'dtstart' ( (lv_dtstart_3_0= RULE_STR ) ) otherlv_4= 'tzoffseto' ( (lv_tzoffseto_5_0= RULE_STR ) ) otherlv_6= 'tzoffsetfrom' ( (lv_tzoffsetfrom_7_0= RULE_STR ) ) (otherlv_8= 'rrule' ( (lv_rrule_9_0= RULE_STR ) ) )? (otherlv_10= 'opt' otherlv_11= '{' ( (lv_opt_12_0= ruletzpropOptional ) ) (otherlv_13= ',' ( (lv_opt_14_0= ruletzpropOptional ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getTzpropAccess().getTzpropKeyword_0());
            		
            otherlv_1=(Token)match(input,79,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getTzpropAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,87,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTzpropAccess().getDtstartKeyword_2());
            		
            // InternalMyDsl.g:1879:3: ( (lv_dtstart_3_0= RULE_STR ) )
            // InternalMyDsl.g:1880:4: (lv_dtstart_3_0= RULE_STR )
            {
            // InternalMyDsl.g:1880:4: (lv_dtstart_3_0= RULE_STR )
            // InternalMyDsl.g:1881:5: lv_dtstart_3_0= RULE_STR
            {
            lv_dtstart_3_0=(Token)match(input,RULE_STR,FOLLOW_46); 

            					newLeafNode(lv_dtstart_3_0, grammarAccess.getTzpropAccess().getDtstartSTRTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTzpropRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dtstart",
            						lv_dtstart_3_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            otherlv_4=(Token)match(input,88,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTzpropAccess().getTzoffsetoKeyword_4());
            		
            // InternalMyDsl.g:1901:3: ( (lv_tzoffseto_5_0= RULE_STR ) )
            // InternalMyDsl.g:1902:4: (lv_tzoffseto_5_0= RULE_STR )
            {
            // InternalMyDsl.g:1902:4: (lv_tzoffseto_5_0= RULE_STR )
            // InternalMyDsl.g:1903:5: lv_tzoffseto_5_0= RULE_STR
            {
            lv_tzoffseto_5_0=(Token)match(input,RULE_STR,FOLLOW_47); 

            					newLeafNode(lv_tzoffseto_5_0, grammarAccess.getTzpropAccess().getTzoffsetoSTRTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTzpropRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tzoffseto",
            						lv_tzoffseto_5_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            otherlv_6=(Token)match(input,89,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTzpropAccess().getTzoffsetfromKeyword_6());
            		
            // InternalMyDsl.g:1923:3: ( (lv_tzoffsetfrom_7_0= RULE_STR ) )
            // InternalMyDsl.g:1924:4: (lv_tzoffsetfrom_7_0= RULE_STR )
            {
            // InternalMyDsl.g:1924:4: (lv_tzoffsetfrom_7_0= RULE_STR )
            // InternalMyDsl.g:1925:5: lv_tzoffsetfrom_7_0= RULE_STR
            {
            lv_tzoffsetfrom_7_0=(Token)match(input,RULE_STR,FOLLOW_48); 

            					newLeafNode(lv_tzoffsetfrom_7_0, grammarAccess.getTzpropAccess().getTzoffsetfromSTRTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTzpropRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tzoffsetfrom",
            						lv_tzoffsetfrom_7_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            // InternalMyDsl.g:1941:3: (otherlv_8= 'rrule' ( (lv_rrule_9_0= RULE_STR ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==90) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:1942:4: otherlv_8= 'rrule' ( (lv_rrule_9_0= RULE_STR ) )
                    {
                    otherlv_8=(Token)match(input,90,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getTzpropAccess().getRruleKeyword_8_0());
                    			
                    // InternalMyDsl.g:1946:4: ( (lv_rrule_9_0= RULE_STR ) )
                    // InternalMyDsl.g:1947:5: (lv_rrule_9_0= RULE_STR )
                    {
                    // InternalMyDsl.g:1947:5: (lv_rrule_9_0= RULE_STR )
                    // InternalMyDsl.g:1948:6: lv_rrule_9_0= RULE_STR
                    {
                    lv_rrule_9_0=(Token)match(input,RULE_STR,FOLLOW_49); 

                    						newLeafNode(lv_rrule_9_0, grammarAccess.getTzpropAccess().getRruleSTRTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTzpropRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"rrule",
                    							lv_rrule_9_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1965:3: (otherlv_10= 'opt' otherlv_11= '{' ( (lv_opt_12_0= ruletzpropOptional ) ) (otherlv_13= ',' ( (lv_opt_14_0= ruletzpropOptional ) ) )* otherlv_15= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==91) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:1966:4: otherlv_10= 'opt' otherlv_11= '{' ( (lv_opt_12_0= ruletzpropOptional ) ) (otherlv_13= ',' ( (lv_opt_14_0= ruletzpropOptional ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,91,FOLLOW_36); 

                    				newLeafNode(otherlv_10, grammarAccess.getTzpropAccess().getOptKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,79,FOLLOW_50); 

                    				newLeafNode(otherlv_11, grammarAccess.getTzpropAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMyDsl.g:1974:4: ( (lv_opt_12_0= ruletzpropOptional ) )
                    // InternalMyDsl.g:1975:5: (lv_opt_12_0= ruletzpropOptional )
                    {
                    // InternalMyDsl.g:1975:5: (lv_opt_12_0= ruletzpropOptional )
                    // InternalMyDsl.g:1976:6: lv_opt_12_0= ruletzpropOptional
                    {

                    						newCompositeNode(grammarAccess.getTzpropAccess().getOptTzpropOptionalParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_opt_12_0=ruletzpropOptional();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTzpropRule());
                    						}
                    						add(
                    							current,
                    							"opt",
                    							lv_opt_12_0,
                    							"xCalendar.MyDsl.tzpropOptional");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1993:4: (otherlv_13= ',' ( (lv_opt_14_0= ruletzpropOptional ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==64) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalMyDsl.g:1994:5: otherlv_13= ',' ( (lv_opt_14_0= ruletzpropOptional ) )
                    	    {
                    	    otherlv_13=(Token)match(input,64,FOLLOW_50); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getTzpropAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMyDsl.g:1998:5: ( (lv_opt_14_0= ruletzpropOptional ) )
                    	    // InternalMyDsl.g:1999:6: (lv_opt_14_0= ruletzpropOptional )
                    	    {
                    	    // InternalMyDsl.g:1999:6: (lv_opt_14_0= ruletzpropOptional )
                    	    // InternalMyDsl.g:2000:7: lv_opt_14_0= ruletzpropOptional
                    	    {

                    	    							newCompositeNode(grammarAccess.getTzpropAccess().getOptTzpropOptionalParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_51);
                    	    lv_opt_14_0=ruletzpropOptional();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTzpropRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"opt",
                    	    								lv_opt_14_0,
                    	    								"xCalendar.MyDsl.tzpropOptional");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,77,FOLLOW_35); 

                    				newLeafNode(otherlv_15, grammarAccess.getTzpropAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,77,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getTzpropAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruletzprop"


    // $ANTLR start "entryRuletzpropOptional"
    // InternalMyDsl.g:2031:1: entryRuletzpropOptional returns [EObject current=null] : iv_ruletzpropOptional= ruletzpropOptional EOF ;
    public final EObject entryRuletzpropOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletzpropOptional = null;


        try {
            // InternalMyDsl.g:2031:55: (iv_ruletzpropOptional= ruletzpropOptional EOF )
            // InternalMyDsl.g:2032:2: iv_ruletzpropOptional= ruletzpropOptional EOF
            {
             newCompositeNode(grammarAccess.getTzpropOptionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletzpropOptional=ruletzpropOptional();

            state._fsp--;

             current =iv_ruletzpropOptional; 
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
    // $ANTLR end "entryRuletzpropOptional"


    // $ANTLR start "ruletzpropOptional"
    // InternalMyDsl.g:2038:1: ruletzpropOptional returns [EObject current=null] : ( () otherlv_1= 'tzpropOptional' otherlv_2= '{' (otherlv_3= 'comment' ( (lv_comment_4_0= RULE_STR ) ) )? (otherlv_5= 'rdate' ( (lv_rdate_6_0= RULE_STR ) ) )? (otherlv_7= 'tzname' ( (lv_tzname_8_0= RULE_STR ) ) )? (otherlv_9= 'x_prop' ( (lv_x_prop_10_0= RULE_STR ) ) )? (otherlv_11= 'iana_prop' ( (lv_iana_prop_12_0= RULE_STR ) ) )? otherlv_13= '}' ) ;
    public final EObject ruletzpropOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_comment_4_0=null;
        Token otherlv_5=null;
        Token lv_rdate_6_0=null;
        Token otherlv_7=null;
        Token lv_tzname_8_0=null;
        Token otherlv_9=null;
        Token lv_x_prop_10_0=null;
        Token otherlv_11=null;
        Token lv_iana_prop_12_0=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2044:2: ( ( () otherlv_1= 'tzpropOptional' otherlv_2= '{' (otherlv_3= 'comment' ( (lv_comment_4_0= RULE_STR ) ) )? (otherlv_5= 'rdate' ( (lv_rdate_6_0= RULE_STR ) ) )? (otherlv_7= 'tzname' ( (lv_tzname_8_0= RULE_STR ) ) )? (otherlv_9= 'x_prop' ( (lv_x_prop_10_0= RULE_STR ) ) )? (otherlv_11= 'iana_prop' ( (lv_iana_prop_12_0= RULE_STR ) ) )? otherlv_13= '}' ) )
            // InternalMyDsl.g:2045:2: ( () otherlv_1= 'tzpropOptional' otherlv_2= '{' (otherlv_3= 'comment' ( (lv_comment_4_0= RULE_STR ) ) )? (otherlv_5= 'rdate' ( (lv_rdate_6_0= RULE_STR ) ) )? (otherlv_7= 'tzname' ( (lv_tzname_8_0= RULE_STR ) ) )? (otherlv_9= 'x_prop' ( (lv_x_prop_10_0= RULE_STR ) ) )? (otherlv_11= 'iana_prop' ( (lv_iana_prop_12_0= RULE_STR ) ) )? otherlv_13= '}' )
            {
            // InternalMyDsl.g:2045:2: ( () otherlv_1= 'tzpropOptional' otherlv_2= '{' (otherlv_3= 'comment' ( (lv_comment_4_0= RULE_STR ) ) )? (otherlv_5= 'rdate' ( (lv_rdate_6_0= RULE_STR ) ) )? (otherlv_7= 'tzname' ( (lv_tzname_8_0= RULE_STR ) ) )? (otherlv_9= 'x_prop' ( (lv_x_prop_10_0= RULE_STR ) ) )? (otherlv_11= 'iana_prop' ( (lv_iana_prop_12_0= RULE_STR ) ) )? otherlv_13= '}' )
            // InternalMyDsl.g:2046:3: () otherlv_1= 'tzpropOptional' otherlv_2= '{' (otherlv_3= 'comment' ( (lv_comment_4_0= RULE_STR ) ) )? (otherlv_5= 'rdate' ( (lv_rdate_6_0= RULE_STR ) ) )? (otherlv_7= 'tzname' ( (lv_tzname_8_0= RULE_STR ) ) )? (otherlv_9= 'x_prop' ( (lv_x_prop_10_0= RULE_STR ) ) )? (otherlv_11= 'iana_prop' ( (lv_iana_prop_12_0= RULE_STR ) ) )? otherlv_13= '}'
            {
            // InternalMyDsl.g:2046:3: ()
            // InternalMyDsl.g:2047:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTzpropOptionalAccess().getTzpropOptionalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,92,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getTzpropOptionalAccess().getTzpropOptionalKeyword_1());
            		
            otherlv_2=(Token)match(input,79,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getTzpropOptionalAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2061:3: (otherlv_3= 'comment' ( (lv_comment_4_0= RULE_STR ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==93) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:2062:4: otherlv_3= 'comment' ( (lv_comment_4_0= RULE_STR ) )
                    {
                    otherlv_3=(Token)match(input,93,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTzpropOptionalAccess().getCommentKeyword_3_0());
                    			
                    // InternalMyDsl.g:2066:4: ( (lv_comment_4_0= RULE_STR ) )
                    // InternalMyDsl.g:2067:5: (lv_comment_4_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2067:5: (lv_comment_4_0= RULE_STR )
                    // InternalMyDsl.g:2068:6: lv_comment_4_0= RULE_STR
                    {
                    lv_comment_4_0=(Token)match(input,RULE_STR,FOLLOW_53); 

                    						newLeafNode(lv_comment_4_0, grammarAccess.getTzpropOptionalAccess().getCommentSTRTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTzpropOptionalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"comment",
                    							lv_comment_4_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2085:3: (otherlv_5= 'rdate' ( (lv_rdate_6_0= RULE_STR ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==94) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:2086:4: otherlv_5= 'rdate' ( (lv_rdate_6_0= RULE_STR ) )
                    {
                    otherlv_5=(Token)match(input,94,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTzpropOptionalAccess().getRdateKeyword_4_0());
                    			
                    // InternalMyDsl.g:2090:4: ( (lv_rdate_6_0= RULE_STR ) )
                    // InternalMyDsl.g:2091:5: (lv_rdate_6_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2091:5: (lv_rdate_6_0= RULE_STR )
                    // InternalMyDsl.g:2092:6: lv_rdate_6_0= RULE_STR
                    {
                    lv_rdate_6_0=(Token)match(input,RULE_STR,FOLLOW_54); 

                    						newLeafNode(lv_rdate_6_0, grammarAccess.getTzpropOptionalAccess().getRdateSTRTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTzpropOptionalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"rdate",
                    							lv_rdate_6_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2109:3: (otherlv_7= 'tzname' ( (lv_tzname_8_0= RULE_STR ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==95) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:2110:4: otherlv_7= 'tzname' ( (lv_tzname_8_0= RULE_STR ) )
                    {
                    otherlv_7=(Token)match(input,95,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getTzpropOptionalAccess().getTznameKeyword_5_0());
                    			
                    // InternalMyDsl.g:2114:4: ( (lv_tzname_8_0= RULE_STR ) )
                    // InternalMyDsl.g:2115:5: (lv_tzname_8_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2115:5: (lv_tzname_8_0= RULE_STR )
                    // InternalMyDsl.g:2116:6: lv_tzname_8_0= RULE_STR
                    {
                    lv_tzname_8_0=(Token)match(input,RULE_STR,FOLLOW_55); 

                    						newLeafNode(lv_tzname_8_0, grammarAccess.getTzpropOptionalAccess().getTznameSTRTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTzpropOptionalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tzname",
                    							lv_tzname_8_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2133:3: (otherlv_9= 'x_prop' ( (lv_x_prop_10_0= RULE_STR ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==96) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:2134:4: otherlv_9= 'x_prop' ( (lv_x_prop_10_0= RULE_STR ) )
                    {
                    otherlv_9=(Token)match(input,96,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getTzpropOptionalAccess().getX_propKeyword_6_0());
                    			
                    // InternalMyDsl.g:2138:4: ( (lv_x_prop_10_0= RULE_STR ) )
                    // InternalMyDsl.g:2139:5: (lv_x_prop_10_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2139:5: (lv_x_prop_10_0= RULE_STR )
                    // InternalMyDsl.g:2140:6: lv_x_prop_10_0= RULE_STR
                    {
                    lv_x_prop_10_0=(Token)match(input,RULE_STR,FOLLOW_56); 

                    						newLeafNode(lv_x_prop_10_0, grammarAccess.getTzpropOptionalAccess().getX_propSTRTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTzpropOptionalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"x_prop",
                    							lv_x_prop_10_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2157:3: (otherlv_11= 'iana_prop' ( (lv_iana_prop_12_0= RULE_STR ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==97) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:2158:4: otherlv_11= 'iana_prop' ( (lv_iana_prop_12_0= RULE_STR ) )
                    {
                    otherlv_11=(Token)match(input,97,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getTzpropOptionalAccess().getIana_propKeyword_7_0());
                    			
                    // InternalMyDsl.g:2162:4: ( (lv_iana_prop_12_0= RULE_STR ) )
                    // InternalMyDsl.g:2163:5: (lv_iana_prop_12_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2163:5: (lv_iana_prop_12_0= RULE_STR )
                    // InternalMyDsl.g:2164:6: lv_iana_prop_12_0= RULE_STR
                    {
                    lv_iana_prop_12_0=(Token)match(input,RULE_STR,FOLLOW_35); 

                    						newLeafNode(lv_iana_prop_12_0, grammarAccess.getTzpropOptionalAccess().getIana_propSTRTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTzpropOptionalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"iana_prop",
                    							lv_iana_prop_12_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,77,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getTzpropOptionalAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruletzpropOptional"


    // $ANTLR start "entryRuleComponentAlarmTime"
    // InternalMyDsl.g:2189:1: entryRuleComponentAlarmTime returns [EObject current=null] : iv_ruleComponentAlarmTime= ruleComponentAlarmTime EOF ;
    public final EObject entryRuleComponentAlarmTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentAlarmTime = null;


        try {
            // InternalMyDsl.g:2189:59: (iv_ruleComponentAlarmTime= ruleComponentAlarmTime EOF )
            // InternalMyDsl.g:2190:2: iv_ruleComponentAlarmTime= ruleComponentAlarmTime EOF
            {
             newCompositeNode(grammarAccess.getComponentAlarmTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentAlarmTime=ruleComponentAlarmTime();

            state._fsp--;

             current =iv_ruleComponentAlarmTime; 
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
    // $ANTLR end "entryRuleComponentAlarmTime"


    // $ANTLR start "ruleComponentAlarmTime"
    // InternalMyDsl.g:2196:1: ruleComponentAlarmTime returns [EObject current=null] : ( () otherlv_1= 'ComponentAlarmTime' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= RULE_STR ) ) )? (otherlv_5= 'repeat' ( (lv_repeat_6_0= RULE_STR ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleComponentAlarmTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_duration_4_0=null;
        Token otherlv_5=null;
        Token lv_repeat_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2202:2: ( ( () otherlv_1= 'ComponentAlarmTime' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= RULE_STR ) ) )? (otherlv_5= 'repeat' ( (lv_repeat_6_0= RULE_STR ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:2203:2: ( () otherlv_1= 'ComponentAlarmTime' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= RULE_STR ) ) )? (otherlv_5= 'repeat' ( (lv_repeat_6_0= RULE_STR ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:2203:2: ( () otherlv_1= 'ComponentAlarmTime' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= RULE_STR ) ) )? (otherlv_5= 'repeat' ( (lv_repeat_6_0= RULE_STR ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:2204:3: () otherlv_1= 'ComponentAlarmTime' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= RULE_STR ) ) )? (otherlv_5= 'repeat' ( (lv_repeat_6_0= RULE_STR ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:2204:3: ()
            // InternalMyDsl.g:2205:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAlarmTimeAccess().getComponentAlarmTimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,98,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAlarmTimeAccess().getComponentAlarmTimeKeyword_1());
            		
            otherlv_2=(Token)match(input,79,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAlarmTimeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2219:3: (otherlv_3= 'duration' ( (lv_duration_4_0= RULE_STR ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==99) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:2220:4: otherlv_3= 'duration' ( (lv_duration_4_0= RULE_STR ) )
                    {
                    otherlv_3=(Token)match(input,99,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentAlarmTimeAccess().getDurationKeyword_3_0());
                    			
                    // InternalMyDsl.g:2224:4: ( (lv_duration_4_0= RULE_STR ) )
                    // InternalMyDsl.g:2225:5: (lv_duration_4_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2225:5: (lv_duration_4_0= RULE_STR )
                    // InternalMyDsl.g:2226:6: lv_duration_4_0= RULE_STR
                    {
                    lv_duration_4_0=(Token)match(input,RULE_STR,FOLLOW_58); 

                    						newLeafNode(lv_duration_4_0, grammarAccess.getComponentAlarmTimeAccess().getDurationSTRTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentAlarmTimeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"duration",
                    							lv_duration_4_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2243:3: (otherlv_5= 'repeat' ( (lv_repeat_6_0= RULE_STR ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==100) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:2244:4: otherlv_5= 'repeat' ( (lv_repeat_6_0= RULE_STR ) )
                    {
                    otherlv_5=(Token)match(input,100,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getComponentAlarmTimeAccess().getRepeatKeyword_4_0());
                    			
                    // InternalMyDsl.g:2248:4: ( (lv_repeat_6_0= RULE_STR ) )
                    // InternalMyDsl.g:2249:5: (lv_repeat_6_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2249:5: (lv_repeat_6_0= RULE_STR )
                    // InternalMyDsl.g:2250:6: lv_repeat_6_0= RULE_STR
                    {
                    lv_repeat_6_0=(Token)match(input,RULE_STR,FOLLOW_35); 

                    						newLeafNode(lv_repeat_6_0, grammarAccess.getComponentAlarmTimeAccess().getRepeatSTRTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentAlarmTimeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"repeat",
                    							lv_repeat_6_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,77,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentAlarmTimeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleComponentAlarmTime"


    // $ANTLR start "entryRuleComponentAlarmAudioProperty"
    // InternalMyDsl.g:2275:1: entryRuleComponentAlarmAudioProperty returns [EObject current=null] : iv_ruleComponentAlarmAudioProperty= ruleComponentAlarmAudioProperty EOF ;
    public final EObject entryRuleComponentAlarmAudioProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentAlarmAudioProperty = null;


        try {
            // InternalMyDsl.g:2275:68: (iv_ruleComponentAlarmAudioProperty= ruleComponentAlarmAudioProperty EOF )
            // InternalMyDsl.g:2276:2: iv_ruleComponentAlarmAudioProperty= ruleComponentAlarmAudioProperty EOF
            {
             newCompositeNode(grammarAccess.getComponentAlarmAudioPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentAlarmAudioProperty=ruleComponentAlarmAudioProperty();

            state._fsp--;

             current =iv_ruleComponentAlarmAudioProperty; 
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
    // $ANTLR end "entryRuleComponentAlarmAudioProperty"


    // $ANTLR start "ruleComponentAlarmAudioProperty"
    // InternalMyDsl.g:2282:1: ruleComponentAlarmAudioProperty returns [EObject current=null] : ( () otherlv_1= 'ComponentAlarmAudioProperty' otherlv_2= '{' (otherlv_3= 'attach' ( (lv_attach_4_0= RULE_STR ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleComponentAlarmAudioProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_attach_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2288:2: ( ( () otherlv_1= 'ComponentAlarmAudioProperty' otherlv_2= '{' (otherlv_3= 'attach' ( (lv_attach_4_0= RULE_STR ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:2289:2: ( () otherlv_1= 'ComponentAlarmAudioProperty' otherlv_2= '{' (otherlv_3= 'attach' ( (lv_attach_4_0= RULE_STR ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:2289:2: ( () otherlv_1= 'ComponentAlarmAudioProperty' otherlv_2= '{' (otherlv_3= 'attach' ( (lv_attach_4_0= RULE_STR ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:2290:3: () otherlv_1= 'ComponentAlarmAudioProperty' otherlv_2= '{' (otherlv_3= 'attach' ( (lv_attach_4_0= RULE_STR ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:2290:3: ()
            // InternalMyDsl.g:2291:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAlarmAudioPropertyAccess().getComponentAlarmAudioPropertyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,101,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAlarmAudioPropertyAccess().getComponentAlarmAudioPropertyKeyword_1());
            		
            otherlv_2=(Token)match(input,79,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAlarmAudioPropertyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2305:3: (otherlv_3= 'attach' ( (lv_attach_4_0= RULE_STR ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==82) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:2306:4: otherlv_3= 'attach' ( (lv_attach_4_0= RULE_STR ) )
                    {
                    otherlv_3=(Token)match(input,82,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentAlarmAudioPropertyAccess().getAttachKeyword_3_0());
                    			
                    // InternalMyDsl.g:2310:4: ( (lv_attach_4_0= RULE_STR ) )
                    // InternalMyDsl.g:2311:5: (lv_attach_4_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2311:5: (lv_attach_4_0= RULE_STR )
                    // InternalMyDsl.g:2312:6: lv_attach_4_0= RULE_STR
                    {
                    lv_attach_4_0=(Token)match(input,RULE_STR,FOLLOW_35); 

                    						newLeafNode(lv_attach_4_0, grammarAccess.getComponentAlarmAudioPropertyAccess().getAttachSTRTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentAlarmAudioPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"attach",
                    							lv_attach_4_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,77,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentAlarmAudioPropertyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleComponentAlarmAudioProperty"


    // $ANTLR start "entryRuleComponentAlarmDispProperty"
    // InternalMyDsl.g:2337:1: entryRuleComponentAlarmDispProperty returns [EObject current=null] : iv_ruleComponentAlarmDispProperty= ruleComponentAlarmDispProperty EOF ;
    public final EObject entryRuleComponentAlarmDispProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentAlarmDispProperty = null;


        try {
            // InternalMyDsl.g:2337:67: (iv_ruleComponentAlarmDispProperty= ruleComponentAlarmDispProperty EOF )
            // InternalMyDsl.g:2338:2: iv_ruleComponentAlarmDispProperty= ruleComponentAlarmDispProperty EOF
            {
             newCompositeNode(grammarAccess.getComponentAlarmDispPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentAlarmDispProperty=ruleComponentAlarmDispProperty();

            state._fsp--;

             current =iv_ruleComponentAlarmDispProperty; 
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
    // $ANTLR end "entryRuleComponentAlarmDispProperty"


    // $ANTLR start "ruleComponentAlarmDispProperty"
    // InternalMyDsl.g:2344:1: ruleComponentAlarmDispProperty returns [EObject current=null] : (otherlv_0= 'ComponentAlarmDispProperty' otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= RULE_STR ) ) otherlv_4= '}' ) ;
    public final EObject ruleComponentAlarmDispProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2350:2: ( (otherlv_0= 'ComponentAlarmDispProperty' otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= RULE_STR ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:2351:2: (otherlv_0= 'ComponentAlarmDispProperty' otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= RULE_STR ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:2351:2: (otherlv_0= 'ComponentAlarmDispProperty' otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= RULE_STR ) ) otherlv_4= '}' )
            // InternalMyDsl.g:2352:3: otherlv_0= 'ComponentAlarmDispProperty' otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= RULE_STR ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,102,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAlarmDispPropertyAccess().getComponentAlarmDispPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,79,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAlarmDispPropertyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAlarmDispPropertyAccess().getDescriptionKeyword_2());
            		
            // InternalMyDsl.g:2364:3: ( (lv_description_3_0= RULE_STR ) )
            // InternalMyDsl.g:2365:4: (lv_description_3_0= RULE_STR )
            {
            // InternalMyDsl.g:2365:4: (lv_description_3_0= RULE_STR )
            // InternalMyDsl.g:2366:5: lv_description_3_0= RULE_STR
            {
            lv_description_3_0=(Token)match(input,RULE_STR,FOLLOW_35); 

            					newLeafNode(lv_description_3_0, grammarAccess.getComponentAlarmDispPropertyAccess().getDescriptionSTRTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentAlarmDispPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            otherlv_4=(Token)match(input,77,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentAlarmDispPropertyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleComponentAlarmDispProperty"


    // $ANTLR start "entryRuleComponentAlarmEmailProperty"
    // InternalMyDsl.g:2390:1: entryRuleComponentAlarmEmailProperty returns [EObject current=null] : iv_ruleComponentAlarmEmailProperty= ruleComponentAlarmEmailProperty EOF ;
    public final EObject entryRuleComponentAlarmEmailProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentAlarmEmailProperty = null;


        try {
            // InternalMyDsl.g:2390:68: (iv_ruleComponentAlarmEmailProperty= ruleComponentAlarmEmailProperty EOF )
            // InternalMyDsl.g:2391:2: iv_ruleComponentAlarmEmailProperty= ruleComponentAlarmEmailProperty EOF
            {
             newCompositeNode(grammarAccess.getComponentAlarmEmailPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentAlarmEmailProperty=ruleComponentAlarmEmailProperty();

            state._fsp--;

             current =iv_ruleComponentAlarmEmailProperty; 
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
    // $ANTLR end "entryRuleComponentAlarmEmailProperty"


    // $ANTLR start "ruleComponentAlarmEmailProperty"
    // InternalMyDsl.g:2397:1: ruleComponentAlarmEmailProperty returns [EObject current=null] : (otherlv_0= 'ComponentAlarmEmailProperty' otherlv_1= '{' otherlv_2= 'attendee' otherlv_3= '{' ( (lv_attendee_4_0= RULE_STR ) ) (otherlv_5= ',' ( (lv_attendee_6_0= RULE_STR ) ) )* otherlv_7= '}' otherlv_8= 'description' ( (lv_description_9_0= RULE_STR ) ) (otherlv_10= 'attach' otherlv_11= '{' ( (lv_attach_12_0= RULE_STR ) ) (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleComponentAlarmEmailProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_attendee_4_0=null;
        Token otherlv_5=null;
        Token lv_attendee_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_attach_12_0=null;
        Token otherlv_13=null;
        Token lv_attach_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2403:2: ( (otherlv_0= 'ComponentAlarmEmailProperty' otherlv_1= '{' otherlv_2= 'attendee' otherlv_3= '{' ( (lv_attendee_4_0= RULE_STR ) ) (otherlv_5= ',' ( (lv_attendee_6_0= RULE_STR ) ) )* otherlv_7= '}' otherlv_8= 'description' ( (lv_description_9_0= RULE_STR ) ) (otherlv_10= 'attach' otherlv_11= '{' ( (lv_attach_12_0= RULE_STR ) ) (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalMyDsl.g:2404:2: (otherlv_0= 'ComponentAlarmEmailProperty' otherlv_1= '{' otherlv_2= 'attendee' otherlv_3= '{' ( (lv_attendee_4_0= RULE_STR ) ) (otherlv_5= ',' ( (lv_attendee_6_0= RULE_STR ) ) )* otherlv_7= '}' otherlv_8= 'description' ( (lv_description_9_0= RULE_STR ) ) (otherlv_10= 'attach' otherlv_11= '{' ( (lv_attach_12_0= RULE_STR ) ) (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalMyDsl.g:2404:2: (otherlv_0= 'ComponentAlarmEmailProperty' otherlv_1= '{' otherlv_2= 'attendee' otherlv_3= '{' ( (lv_attendee_4_0= RULE_STR ) ) (otherlv_5= ',' ( (lv_attendee_6_0= RULE_STR ) ) )* otherlv_7= '}' otherlv_8= 'description' ( (lv_description_9_0= RULE_STR ) ) (otherlv_10= 'attach' otherlv_11= '{' ( (lv_attach_12_0= RULE_STR ) ) (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalMyDsl.g:2405:3: otherlv_0= 'ComponentAlarmEmailProperty' otherlv_1= '{' otherlv_2= 'attendee' otherlv_3= '{' ( (lv_attendee_4_0= RULE_STR ) ) (otherlv_5= ',' ( (lv_attendee_6_0= RULE_STR ) ) )* otherlv_7= '}' otherlv_8= 'description' ( (lv_description_9_0= RULE_STR ) ) (otherlv_10= 'attach' otherlv_11= '{' ( (lv_attach_12_0= RULE_STR ) ) (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,103,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAlarmEmailPropertyAccess().getComponentAlarmEmailPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,79,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAlarmEmailPropertyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,104,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAlarmEmailPropertyAccess().getAttendeeKeyword_2());
            		
            otherlv_3=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentAlarmEmailPropertyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:2421:3: ( (lv_attendee_4_0= RULE_STR ) )
            // InternalMyDsl.g:2422:4: (lv_attendee_4_0= RULE_STR )
            {
            // InternalMyDsl.g:2422:4: (lv_attendee_4_0= RULE_STR )
            // InternalMyDsl.g:2423:5: lv_attendee_4_0= RULE_STR
            {
            lv_attendee_4_0=(Token)match(input,RULE_STR,FOLLOW_51); 

            					newLeafNode(lv_attendee_4_0, grammarAccess.getComponentAlarmEmailPropertyAccess().getAttendeeSTRTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentAlarmEmailPropertyRule());
            					}
            					addWithLastConsumed(
            						current,
            						"attendee",
            						lv_attendee_4_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            // InternalMyDsl.g:2439:3: (otherlv_5= ',' ( (lv_attendee_6_0= RULE_STR ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==64) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalMyDsl.g:2440:4: otherlv_5= ',' ( (lv_attendee_6_0= RULE_STR ) )
            	    {
            	    otherlv_5=(Token)match(input,64,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getComponentAlarmEmailPropertyAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMyDsl.g:2444:4: ( (lv_attendee_6_0= RULE_STR ) )
            	    // InternalMyDsl.g:2445:5: (lv_attendee_6_0= RULE_STR )
            	    {
            	    // InternalMyDsl.g:2445:5: (lv_attendee_6_0= RULE_STR )
            	    // InternalMyDsl.g:2446:6: lv_attendee_6_0= RULE_STR
            	    {
            	    lv_attendee_6_0=(Token)match(input,RULE_STR,FOLLOW_51); 

            	    						newLeafNode(lv_attendee_6_0, grammarAccess.getComponentAlarmEmailPropertyAccess().getAttendeeSTRTerminalRuleCall_5_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getComponentAlarmEmailPropertyRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"attendee",
            	    							lv_attendee_6_0,
            	    							"xCalendar.MyDsl.STR");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_7=(Token)match(input,77,FOLLOW_60); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentAlarmEmailPropertyAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getComponentAlarmEmailPropertyAccess().getDescriptionKeyword_7());
            		
            // InternalMyDsl.g:2471:3: ( (lv_description_9_0= RULE_STR ) )
            // InternalMyDsl.g:2472:4: (lv_description_9_0= RULE_STR )
            {
            // InternalMyDsl.g:2472:4: (lv_description_9_0= RULE_STR )
            // InternalMyDsl.g:2473:5: lv_description_9_0= RULE_STR
            {
            lv_description_9_0=(Token)match(input,RULE_STR,FOLLOW_59); 

            					newLeafNode(lv_description_9_0, grammarAccess.getComponentAlarmEmailPropertyAccess().getDescriptionSTRTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentAlarmEmailPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_9_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            // InternalMyDsl.g:2489:3: (otherlv_10= 'attach' otherlv_11= '{' ( (lv_attach_12_0= RULE_STR ) ) (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )* otherlv_15= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==82) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:2490:4: otherlv_10= 'attach' otherlv_11= '{' ( (lv_attach_12_0= RULE_STR ) ) (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,82,FOLLOW_36); 

                    				newLeafNode(otherlv_10, grammarAccess.getComponentAlarmEmailPropertyAccess().getAttachKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentAlarmEmailPropertyAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMyDsl.g:2498:4: ( (lv_attach_12_0= RULE_STR ) )
                    // InternalMyDsl.g:2499:5: (lv_attach_12_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2499:5: (lv_attach_12_0= RULE_STR )
                    // InternalMyDsl.g:2500:6: lv_attach_12_0= RULE_STR
                    {
                    lv_attach_12_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_attach_12_0, grammarAccess.getComponentAlarmEmailPropertyAccess().getAttachSTRTerminalRuleCall_9_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentAlarmEmailPropertyRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"attach",
                    							lv_attach_12_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:2516:4: (otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==64) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalMyDsl.g:2517:5: otherlv_13= ',' ( (lv_attach_14_0= RULE_STR ) )
                    	    {
                    	    otherlv_13=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getComponentAlarmEmailPropertyAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMyDsl.g:2521:5: ( (lv_attach_14_0= RULE_STR ) )
                    	    // InternalMyDsl.g:2522:6: (lv_attach_14_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:2522:6: (lv_attach_14_0= RULE_STR )
                    	    // InternalMyDsl.g:2523:7: lv_attach_14_0= RULE_STR
                    	    {
                    	    lv_attach_14_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_attach_14_0, grammarAccess.getComponentAlarmEmailPropertyAccess().getAttachSTRTerminalRuleCall_9_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComponentAlarmEmailPropertyRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"attach",
                    	    								lv_attach_14_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,77,FOLLOW_35); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponentAlarmEmailPropertyAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,77,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getComponentAlarmEmailPropertyAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleComponentAlarmEmailProperty"


    // $ANTLR start "entryRuleToDoC"
    // InternalMyDsl.g:2553:1: entryRuleToDoC returns [EObject current=null] : iv_ruleToDoC= ruleToDoC EOF ;
    public final EObject entryRuleToDoC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToDoC = null;


        try {
            // InternalMyDsl.g:2553:46: (iv_ruleToDoC= ruleToDoC EOF )
            // InternalMyDsl.g:2554:2: iv_ruleToDoC= ruleToDoC EOF
            {
             newCompositeNode(grammarAccess.getToDoCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToDoC=ruleToDoC();

            state._fsp--;

             current =iv_ruleToDoC; 
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
    // $ANTLR end "entryRuleToDoC"


    // $ANTLR start "ruleToDoC"
    // InternalMyDsl.g:2560:1: ruleToDoC returns [EObject current=null] : (otherlv_0= 'ToDoC' otherlv_1= '{' otherlv_2= 'dtstamp' ( (lv_dtstamp_3_0= RULE_STR ) ) otherlv_4= 'uid' ( (lv_uid_5_0= RULE_STR ) ) (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STR ) ) )? (otherlv_10= 'created' ( (lv_created_11_0= RULE_STR ) ) )? (otherlv_12= 'last_mod' ( (lv_last_mod_13_0= RULE_STR ) ) )? (otherlv_14= 'organizer' ( (lv_organizer_15_0= RULE_STR ) ) )? (otherlv_16= 'seq' ( (lv_seq_17_0= RULE_STR ) ) )? (otherlv_18= 'status' ( (lv_status_19_0= RULE_STR ) ) )? (otherlv_20= 'summary' ( (lv_summary_21_0= RULE_STR ) ) )? (otherlv_22= 'url' ( (lv_url_23_0= RULE_STR ) ) )? (otherlv_24= 'recurid' ( (lv_recurid_25_0= RULE_STR ) ) )? (otherlv_26= 'rrule' otherlv_27= '{' ( (lv_rrule_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )* otherlv_31= '}' )? (otherlv_32= 'attach' otherlv_33= '{' ( (lv_attach_34_0= RULE_STR ) ) (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )* otherlv_37= '}' )? (otherlv_38= 'attendee' otherlv_39= '{' ( (lv_attendee_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )* otherlv_43= '}' )? (otherlv_44= 'categories' otherlv_45= '{' ( (lv_categories_46_0= RULE_STR ) ) (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )* otherlv_49= '}' )? (otherlv_50= 'comment' otherlv_51= '{' ( (lv_comment_52_0= RULE_STR ) ) (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )* otherlv_55= '}' )? (otherlv_56= 'contact' otherlv_57= '{' ( (lv_contact_58_0= RULE_STR ) ) (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )* otherlv_61= '}' )? (otherlv_62= 'exdate' otherlv_63= '{' ( (lv_exdate_64_0= RULE_STR ) ) (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )* otherlv_67= '}' )? (otherlv_68= 'rstatus' otherlv_69= '{' ( (lv_rstatus_70_0= RULE_STR ) ) (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )* otherlv_73= '}' )? (otherlv_74= 'related' otherlv_75= '{' ( (lv_related_76_0= RULE_STR ) ) (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )* otherlv_79= '}' )? (otherlv_80= 'resources' otherlv_81= '{' ( (lv_resources_82_0= RULE_STR ) ) (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )* otherlv_85= '}' )? (otherlv_86= 'rdate' otherlv_87= '{' ( (lv_rdate_88_0= RULE_STR ) ) (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )* otherlv_91= '}' )? (otherlv_92= 'x_prop' otherlv_93= '{' ( (lv_x_prop_94_0= RULE_STR ) ) (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )* otherlv_97= '}' )? (otherlv_98= 'iana_prop' otherlv_99= '{' ( (lv_iana_prop_100_0= RULE_STR ) ) (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )* otherlv_103= '}' )? (otherlv_104= 'description' ( (lv_description_105_0= RULE_STR ) ) )? (otherlv_106= 'completed' ( (lv_completed_107_0= RULE_STR ) ) )? (otherlv_108= 'priority' ( (lv_priority_109_0= RULE_STR ) ) )? (otherlv_110= 'geo' ( (lv_geo_111_0= RULE_STR ) ) )? (otherlv_112= 'location' ( (lv_location_113_0= RULE_STR ) ) )? (otherlv_114= 'dtend' ( (lv_dtend_115_0= ruleDateT ) ) )? (otherlv_116= 'alarmc' otherlv_117= '{' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* otherlv_121= '}' )? otherlv_122= '}' ) ;
    public final EObject ruleToDoC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_dtstamp_3_0=null;
        Token otherlv_4=null;
        Token lv_uid_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_class_9_0=null;
        Token otherlv_10=null;
        Token lv_created_11_0=null;
        Token otherlv_12=null;
        Token lv_last_mod_13_0=null;
        Token otherlv_14=null;
        Token lv_organizer_15_0=null;
        Token otherlv_16=null;
        Token lv_seq_17_0=null;
        Token otherlv_18=null;
        Token lv_status_19_0=null;
        Token otherlv_20=null;
        Token lv_summary_21_0=null;
        Token otherlv_22=null;
        Token lv_url_23_0=null;
        Token otherlv_24=null;
        Token lv_recurid_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_rrule_28_0=null;
        Token otherlv_29=null;
        Token lv_rrule_30_0=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token lv_attach_34_0=null;
        Token otherlv_35=null;
        Token lv_attach_36_0=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token lv_attendee_40_0=null;
        Token otherlv_41=null;
        Token lv_attendee_42_0=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token lv_categories_46_0=null;
        Token otherlv_47=null;
        Token lv_categories_48_0=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token lv_comment_52_0=null;
        Token otherlv_53=null;
        Token lv_comment_54_0=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token lv_contact_58_0=null;
        Token otherlv_59=null;
        Token lv_contact_60_0=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token otherlv_63=null;
        Token lv_exdate_64_0=null;
        Token otherlv_65=null;
        Token lv_exdate_66_0=null;
        Token otherlv_67=null;
        Token otherlv_68=null;
        Token otherlv_69=null;
        Token lv_rstatus_70_0=null;
        Token otherlv_71=null;
        Token lv_rstatus_72_0=null;
        Token otherlv_73=null;
        Token otherlv_74=null;
        Token otherlv_75=null;
        Token lv_related_76_0=null;
        Token otherlv_77=null;
        Token lv_related_78_0=null;
        Token otherlv_79=null;
        Token otherlv_80=null;
        Token otherlv_81=null;
        Token lv_resources_82_0=null;
        Token otherlv_83=null;
        Token lv_resources_84_0=null;
        Token otherlv_85=null;
        Token otherlv_86=null;
        Token otherlv_87=null;
        Token lv_rdate_88_0=null;
        Token otherlv_89=null;
        Token lv_rdate_90_0=null;
        Token otherlv_91=null;
        Token otherlv_92=null;
        Token otherlv_93=null;
        Token lv_x_prop_94_0=null;
        Token otherlv_95=null;
        Token lv_x_prop_96_0=null;
        Token otherlv_97=null;
        Token otherlv_98=null;
        Token otherlv_99=null;
        Token lv_iana_prop_100_0=null;
        Token otherlv_101=null;
        Token lv_iana_prop_102_0=null;
        Token otherlv_103=null;
        Token otherlv_104=null;
        Token lv_description_105_0=null;
        Token otherlv_106=null;
        Token lv_completed_107_0=null;
        Token otherlv_108=null;
        Token lv_priority_109_0=null;
        Token otherlv_110=null;
        Token lv_geo_111_0=null;
        Token otherlv_112=null;
        Token lv_location_113_0=null;
        Token otherlv_114=null;
        Token otherlv_116=null;
        Token otherlv_117=null;
        Token otherlv_119=null;
        Token otherlv_121=null;
        Token otherlv_122=null;
        EObject lv_dtstart_7_0 = null;

        EObject lv_dtend_115_0 = null;

        EObject lv_alarmc_118_0 = null;

        EObject lv_alarmc_120_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2566:2: ( (otherlv_0= 'ToDoC' otherlv_1= '{' otherlv_2= 'dtstamp' ( (lv_dtstamp_3_0= RULE_STR ) ) otherlv_4= 'uid' ( (lv_uid_5_0= RULE_STR ) ) (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STR ) ) )? (otherlv_10= 'created' ( (lv_created_11_0= RULE_STR ) ) )? (otherlv_12= 'last_mod' ( (lv_last_mod_13_0= RULE_STR ) ) )? (otherlv_14= 'organizer' ( (lv_organizer_15_0= RULE_STR ) ) )? (otherlv_16= 'seq' ( (lv_seq_17_0= RULE_STR ) ) )? (otherlv_18= 'status' ( (lv_status_19_0= RULE_STR ) ) )? (otherlv_20= 'summary' ( (lv_summary_21_0= RULE_STR ) ) )? (otherlv_22= 'url' ( (lv_url_23_0= RULE_STR ) ) )? (otherlv_24= 'recurid' ( (lv_recurid_25_0= RULE_STR ) ) )? (otherlv_26= 'rrule' otherlv_27= '{' ( (lv_rrule_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )* otherlv_31= '}' )? (otherlv_32= 'attach' otherlv_33= '{' ( (lv_attach_34_0= RULE_STR ) ) (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )* otherlv_37= '}' )? (otherlv_38= 'attendee' otherlv_39= '{' ( (lv_attendee_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )* otherlv_43= '}' )? (otherlv_44= 'categories' otherlv_45= '{' ( (lv_categories_46_0= RULE_STR ) ) (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )* otherlv_49= '}' )? (otherlv_50= 'comment' otherlv_51= '{' ( (lv_comment_52_0= RULE_STR ) ) (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )* otherlv_55= '}' )? (otherlv_56= 'contact' otherlv_57= '{' ( (lv_contact_58_0= RULE_STR ) ) (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )* otherlv_61= '}' )? (otherlv_62= 'exdate' otherlv_63= '{' ( (lv_exdate_64_0= RULE_STR ) ) (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )* otherlv_67= '}' )? (otherlv_68= 'rstatus' otherlv_69= '{' ( (lv_rstatus_70_0= RULE_STR ) ) (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )* otherlv_73= '}' )? (otherlv_74= 'related' otherlv_75= '{' ( (lv_related_76_0= RULE_STR ) ) (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )* otherlv_79= '}' )? (otherlv_80= 'resources' otherlv_81= '{' ( (lv_resources_82_0= RULE_STR ) ) (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )* otherlv_85= '}' )? (otherlv_86= 'rdate' otherlv_87= '{' ( (lv_rdate_88_0= RULE_STR ) ) (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )* otherlv_91= '}' )? (otherlv_92= 'x_prop' otherlv_93= '{' ( (lv_x_prop_94_0= RULE_STR ) ) (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )* otherlv_97= '}' )? (otherlv_98= 'iana_prop' otherlv_99= '{' ( (lv_iana_prop_100_0= RULE_STR ) ) (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )* otherlv_103= '}' )? (otherlv_104= 'description' ( (lv_description_105_0= RULE_STR ) ) )? (otherlv_106= 'completed' ( (lv_completed_107_0= RULE_STR ) ) )? (otherlv_108= 'priority' ( (lv_priority_109_0= RULE_STR ) ) )? (otherlv_110= 'geo' ( (lv_geo_111_0= RULE_STR ) ) )? (otherlv_112= 'location' ( (lv_location_113_0= RULE_STR ) ) )? (otherlv_114= 'dtend' ( (lv_dtend_115_0= ruleDateT ) ) )? (otherlv_116= 'alarmc' otherlv_117= '{' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* otherlv_121= '}' )? otherlv_122= '}' ) )
            // InternalMyDsl.g:2567:2: (otherlv_0= 'ToDoC' otherlv_1= '{' otherlv_2= 'dtstamp' ( (lv_dtstamp_3_0= RULE_STR ) ) otherlv_4= 'uid' ( (lv_uid_5_0= RULE_STR ) ) (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STR ) ) )? (otherlv_10= 'created' ( (lv_created_11_0= RULE_STR ) ) )? (otherlv_12= 'last_mod' ( (lv_last_mod_13_0= RULE_STR ) ) )? (otherlv_14= 'organizer' ( (lv_organizer_15_0= RULE_STR ) ) )? (otherlv_16= 'seq' ( (lv_seq_17_0= RULE_STR ) ) )? (otherlv_18= 'status' ( (lv_status_19_0= RULE_STR ) ) )? (otherlv_20= 'summary' ( (lv_summary_21_0= RULE_STR ) ) )? (otherlv_22= 'url' ( (lv_url_23_0= RULE_STR ) ) )? (otherlv_24= 'recurid' ( (lv_recurid_25_0= RULE_STR ) ) )? (otherlv_26= 'rrule' otherlv_27= '{' ( (lv_rrule_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )* otherlv_31= '}' )? (otherlv_32= 'attach' otherlv_33= '{' ( (lv_attach_34_0= RULE_STR ) ) (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )* otherlv_37= '}' )? (otherlv_38= 'attendee' otherlv_39= '{' ( (lv_attendee_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )* otherlv_43= '}' )? (otherlv_44= 'categories' otherlv_45= '{' ( (lv_categories_46_0= RULE_STR ) ) (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )* otherlv_49= '}' )? (otherlv_50= 'comment' otherlv_51= '{' ( (lv_comment_52_0= RULE_STR ) ) (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )* otherlv_55= '}' )? (otherlv_56= 'contact' otherlv_57= '{' ( (lv_contact_58_0= RULE_STR ) ) (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )* otherlv_61= '}' )? (otherlv_62= 'exdate' otherlv_63= '{' ( (lv_exdate_64_0= RULE_STR ) ) (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )* otherlv_67= '}' )? (otherlv_68= 'rstatus' otherlv_69= '{' ( (lv_rstatus_70_0= RULE_STR ) ) (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )* otherlv_73= '}' )? (otherlv_74= 'related' otherlv_75= '{' ( (lv_related_76_0= RULE_STR ) ) (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )* otherlv_79= '}' )? (otherlv_80= 'resources' otherlv_81= '{' ( (lv_resources_82_0= RULE_STR ) ) (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )* otherlv_85= '}' )? (otherlv_86= 'rdate' otherlv_87= '{' ( (lv_rdate_88_0= RULE_STR ) ) (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )* otherlv_91= '}' )? (otherlv_92= 'x_prop' otherlv_93= '{' ( (lv_x_prop_94_0= RULE_STR ) ) (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )* otherlv_97= '}' )? (otherlv_98= 'iana_prop' otherlv_99= '{' ( (lv_iana_prop_100_0= RULE_STR ) ) (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )* otherlv_103= '}' )? (otherlv_104= 'description' ( (lv_description_105_0= RULE_STR ) ) )? (otherlv_106= 'completed' ( (lv_completed_107_0= RULE_STR ) ) )? (otherlv_108= 'priority' ( (lv_priority_109_0= RULE_STR ) ) )? (otherlv_110= 'geo' ( (lv_geo_111_0= RULE_STR ) ) )? (otherlv_112= 'location' ( (lv_location_113_0= RULE_STR ) ) )? (otherlv_114= 'dtend' ( (lv_dtend_115_0= ruleDateT ) ) )? (otherlv_116= 'alarmc' otherlv_117= '{' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* otherlv_121= '}' )? otherlv_122= '}' )
            {
            // InternalMyDsl.g:2567:2: (otherlv_0= 'ToDoC' otherlv_1= '{' otherlv_2= 'dtstamp' ( (lv_dtstamp_3_0= RULE_STR ) ) otherlv_4= 'uid' ( (lv_uid_5_0= RULE_STR ) ) (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STR ) ) )? (otherlv_10= 'created' ( (lv_created_11_0= RULE_STR ) ) )? (otherlv_12= 'last_mod' ( (lv_last_mod_13_0= RULE_STR ) ) )? (otherlv_14= 'organizer' ( (lv_organizer_15_0= RULE_STR ) ) )? (otherlv_16= 'seq' ( (lv_seq_17_0= RULE_STR ) ) )? (otherlv_18= 'status' ( (lv_status_19_0= RULE_STR ) ) )? (otherlv_20= 'summary' ( (lv_summary_21_0= RULE_STR ) ) )? (otherlv_22= 'url' ( (lv_url_23_0= RULE_STR ) ) )? (otherlv_24= 'recurid' ( (lv_recurid_25_0= RULE_STR ) ) )? (otherlv_26= 'rrule' otherlv_27= '{' ( (lv_rrule_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )* otherlv_31= '}' )? (otherlv_32= 'attach' otherlv_33= '{' ( (lv_attach_34_0= RULE_STR ) ) (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )* otherlv_37= '}' )? (otherlv_38= 'attendee' otherlv_39= '{' ( (lv_attendee_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )* otherlv_43= '}' )? (otherlv_44= 'categories' otherlv_45= '{' ( (lv_categories_46_0= RULE_STR ) ) (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )* otherlv_49= '}' )? (otherlv_50= 'comment' otherlv_51= '{' ( (lv_comment_52_0= RULE_STR ) ) (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )* otherlv_55= '}' )? (otherlv_56= 'contact' otherlv_57= '{' ( (lv_contact_58_0= RULE_STR ) ) (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )* otherlv_61= '}' )? (otherlv_62= 'exdate' otherlv_63= '{' ( (lv_exdate_64_0= RULE_STR ) ) (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )* otherlv_67= '}' )? (otherlv_68= 'rstatus' otherlv_69= '{' ( (lv_rstatus_70_0= RULE_STR ) ) (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )* otherlv_73= '}' )? (otherlv_74= 'related' otherlv_75= '{' ( (lv_related_76_0= RULE_STR ) ) (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )* otherlv_79= '}' )? (otherlv_80= 'resources' otherlv_81= '{' ( (lv_resources_82_0= RULE_STR ) ) (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )* otherlv_85= '}' )? (otherlv_86= 'rdate' otherlv_87= '{' ( (lv_rdate_88_0= RULE_STR ) ) (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )* otherlv_91= '}' )? (otherlv_92= 'x_prop' otherlv_93= '{' ( (lv_x_prop_94_0= RULE_STR ) ) (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )* otherlv_97= '}' )? (otherlv_98= 'iana_prop' otherlv_99= '{' ( (lv_iana_prop_100_0= RULE_STR ) ) (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )* otherlv_103= '}' )? (otherlv_104= 'description' ( (lv_description_105_0= RULE_STR ) ) )? (otherlv_106= 'completed' ( (lv_completed_107_0= RULE_STR ) ) )? (otherlv_108= 'priority' ( (lv_priority_109_0= RULE_STR ) ) )? (otherlv_110= 'geo' ( (lv_geo_111_0= RULE_STR ) ) )? (otherlv_112= 'location' ( (lv_location_113_0= RULE_STR ) ) )? (otherlv_114= 'dtend' ( (lv_dtend_115_0= ruleDateT ) ) )? (otherlv_116= 'alarmc' otherlv_117= '{' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* otherlv_121= '}' )? otherlv_122= '}' )
            // InternalMyDsl.g:2568:3: otherlv_0= 'ToDoC' otherlv_1= '{' otherlv_2= 'dtstamp' ( (lv_dtstamp_3_0= RULE_STR ) ) otherlv_4= 'uid' ( (lv_uid_5_0= RULE_STR ) ) (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STR ) ) )? (otherlv_10= 'created' ( (lv_created_11_0= RULE_STR ) ) )? (otherlv_12= 'last_mod' ( (lv_last_mod_13_0= RULE_STR ) ) )? (otherlv_14= 'organizer' ( (lv_organizer_15_0= RULE_STR ) ) )? (otherlv_16= 'seq' ( (lv_seq_17_0= RULE_STR ) ) )? (otherlv_18= 'status' ( (lv_status_19_0= RULE_STR ) ) )? (otherlv_20= 'summary' ( (lv_summary_21_0= RULE_STR ) ) )? (otherlv_22= 'url' ( (lv_url_23_0= RULE_STR ) ) )? (otherlv_24= 'recurid' ( (lv_recurid_25_0= RULE_STR ) ) )? (otherlv_26= 'rrule' otherlv_27= '{' ( (lv_rrule_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )* otherlv_31= '}' )? (otherlv_32= 'attach' otherlv_33= '{' ( (lv_attach_34_0= RULE_STR ) ) (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )* otherlv_37= '}' )? (otherlv_38= 'attendee' otherlv_39= '{' ( (lv_attendee_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )* otherlv_43= '}' )? (otherlv_44= 'categories' otherlv_45= '{' ( (lv_categories_46_0= RULE_STR ) ) (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )* otherlv_49= '}' )? (otherlv_50= 'comment' otherlv_51= '{' ( (lv_comment_52_0= RULE_STR ) ) (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )* otherlv_55= '}' )? (otherlv_56= 'contact' otherlv_57= '{' ( (lv_contact_58_0= RULE_STR ) ) (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )* otherlv_61= '}' )? (otherlv_62= 'exdate' otherlv_63= '{' ( (lv_exdate_64_0= RULE_STR ) ) (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )* otherlv_67= '}' )? (otherlv_68= 'rstatus' otherlv_69= '{' ( (lv_rstatus_70_0= RULE_STR ) ) (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )* otherlv_73= '}' )? (otherlv_74= 'related' otherlv_75= '{' ( (lv_related_76_0= RULE_STR ) ) (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )* otherlv_79= '}' )? (otherlv_80= 'resources' otherlv_81= '{' ( (lv_resources_82_0= RULE_STR ) ) (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )* otherlv_85= '}' )? (otherlv_86= 'rdate' otherlv_87= '{' ( (lv_rdate_88_0= RULE_STR ) ) (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )* otherlv_91= '}' )? (otherlv_92= 'x_prop' otherlv_93= '{' ( (lv_x_prop_94_0= RULE_STR ) ) (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )* otherlv_97= '}' )? (otherlv_98= 'iana_prop' otherlv_99= '{' ( (lv_iana_prop_100_0= RULE_STR ) ) (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )* otherlv_103= '}' )? (otherlv_104= 'description' ( (lv_description_105_0= RULE_STR ) ) )? (otherlv_106= 'completed' ( (lv_completed_107_0= RULE_STR ) ) )? (otherlv_108= 'priority' ( (lv_priority_109_0= RULE_STR ) ) )? (otherlv_110= 'geo' ( (lv_geo_111_0= RULE_STR ) ) )? (otherlv_112= 'location' ( (lv_location_113_0= RULE_STR ) ) )? (otherlv_114= 'dtend' ( (lv_dtend_115_0= ruleDateT ) ) )? (otherlv_116= 'alarmc' otherlv_117= '{' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* otherlv_121= '}' )? otherlv_122= '}'
            {
            otherlv_0=(Token)match(input,105,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getToDoCAccess().getToDoCKeyword_0());
            		
            otherlv_1=(Token)match(input,79,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,106,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getToDoCAccess().getDtstampKeyword_2());
            		
            // InternalMyDsl.g:2580:3: ( (lv_dtstamp_3_0= RULE_STR ) )
            // InternalMyDsl.g:2581:4: (lv_dtstamp_3_0= RULE_STR )
            {
            // InternalMyDsl.g:2581:4: (lv_dtstamp_3_0= RULE_STR )
            // InternalMyDsl.g:2582:5: lv_dtstamp_3_0= RULE_STR
            {
            lv_dtstamp_3_0=(Token)match(input,RULE_STR,FOLLOW_63); 

            					newLeafNode(lv_dtstamp_3_0, grammarAccess.getToDoCAccess().getDtstampSTRTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getToDoCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dtstamp",
            						lv_dtstamp_3_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            otherlv_4=(Token)match(input,107,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getToDoCAccess().getUidKeyword_4());
            		
            // InternalMyDsl.g:2602:3: ( (lv_uid_5_0= RULE_STR ) )
            // InternalMyDsl.g:2603:4: (lv_uid_5_0= RULE_STR )
            {
            // InternalMyDsl.g:2603:4: (lv_uid_5_0= RULE_STR )
            // InternalMyDsl.g:2604:5: lv_uid_5_0= RULE_STR
            {
            lv_uid_5_0=(Token)match(input,RULE_STR,FOLLOW_64); 

            					newLeafNode(lv_uid_5_0, grammarAccess.getToDoCAccess().getUidSTRTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getToDoCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uid",
            						lv_uid_5_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            // InternalMyDsl.g:2620:3: (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==87) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:2621:4: otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) )
                    {
                    otherlv_6=(Token)match(input,87,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getToDoCAccess().getDtstartKeyword_6_0());
                    			
                    // InternalMyDsl.g:2625:4: ( (lv_dtstart_7_0= ruleDateT ) )
                    // InternalMyDsl.g:2626:5: (lv_dtstart_7_0= ruleDateT )
                    {
                    // InternalMyDsl.g:2626:5: (lv_dtstart_7_0= ruleDateT )
                    // InternalMyDsl.g:2627:6: lv_dtstart_7_0= ruleDateT
                    {

                    						newCompositeNode(grammarAccess.getToDoCAccess().getDtstartDateTParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_dtstart_7_0=ruleDateT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getToDoCRule());
                    						}
                    						set(
                    							current,
                    							"dtstart",
                    							lv_dtstart_7_0,
                    							"xCalendar.MyDsl.DateT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2645:3: (otherlv_8= 'class' ( (lv_class_9_0= RULE_STR ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==108) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMyDsl.g:2646:4: otherlv_8= 'class' ( (lv_class_9_0= RULE_STR ) )
                    {
                    otherlv_8=(Token)match(input,108,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getToDoCAccess().getClassKeyword_7_0());
                    			
                    // InternalMyDsl.g:2650:4: ( (lv_class_9_0= RULE_STR ) )
                    // InternalMyDsl.g:2651:5: (lv_class_9_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2651:5: (lv_class_9_0= RULE_STR )
                    // InternalMyDsl.g:2652:6: lv_class_9_0= RULE_STR
                    {
                    lv_class_9_0=(Token)match(input,RULE_STR,FOLLOW_66); 

                    						newLeafNode(lv_class_9_0, grammarAccess.getToDoCAccess().getClassSTRTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"class",
                    							lv_class_9_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2669:3: (otherlv_10= 'created' ( (lv_created_11_0= RULE_STR ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==109) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMyDsl.g:2670:4: otherlv_10= 'created' ( (lv_created_11_0= RULE_STR ) )
                    {
                    otherlv_10=(Token)match(input,109,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getToDoCAccess().getCreatedKeyword_8_0());
                    			
                    // InternalMyDsl.g:2674:4: ( (lv_created_11_0= RULE_STR ) )
                    // InternalMyDsl.g:2675:5: (lv_created_11_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2675:5: (lv_created_11_0= RULE_STR )
                    // InternalMyDsl.g:2676:6: lv_created_11_0= RULE_STR
                    {
                    lv_created_11_0=(Token)match(input,RULE_STR,FOLLOW_67); 

                    						newLeafNode(lv_created_11_0, grammarAccess.getToDoCAccess().getCreatedSTRTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"created",
                    							lv_created_11_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2693:3: (otherlv_12= 'last_mod' ( (lv_last_mod_13_0= RULE_STR ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==110) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMyDsl.g:2694:4: otherlv_12= 'last_mod' ( (lv_last_mod_13_0= RULE_STR ) )
                    {
                    otherlv_12=(Token)match(input,110,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getToDoCAccess().getLast_modKeyword_9_0());
                    			
                    // InternalMyDsl.g:2698:4: ( (lv_last_mod_13_0= RULE_STR ) )
                    // InternalMyDsl.g:2699:5: (lv_last_mod_13_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2699:5: (lv_last_mod_13_0= RULE_STR )
                    // InternalMyDsl.g:2700:6: lv_last_mod_13_0= RULE_STR
                    {
                    lv_last_mod_13_0=(Token)match(input,RULE_STR,FOLLOW_68); 

                    						newLeafNode(lv_last_mod_13_0, grammarAccess.getToDoCAccess().getLast_modSTRTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"last_mod",
                    							lv_last_mod_13_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2717:3: (otherlv_14= 'organizer' ( (lv_organizer_15_0= RULE_STR ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==111) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyDsl.g:2718:4: otherlv_14= 'organizer' ( (lv_organizer_15_0= RULE_STR ) )
                    {
                    otherlv_14=(Token)match(input,111,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getToDoCAccess().getOrganizerKeyword_10_0());
                    			
                    // InternalMyDsl.g:2722:4: ( (lv_organizer_15_0= RULE_STR ) )
                    // InternalMyDsl.g:2723:5: (lv_organizer_15_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2723:5: (lv_organizer_15_0= RULE_STR )
                    // InternalMyDsl.g:2724:6: lv_organizer_15_0= RULE_STR
                    {
                    lv_organizer_15_0=(Token)match(input,RULE_STR,FOLLOW_69); 

                    						newLeafNode(lv_organizer_15_0, grammarAccess.getToDoCAccess().getOrganizerSTRTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"organizer",
                    							lv_organizer_15_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2741:3: (otherlv_16= 'seq' ( (lv_seq_17_0= RULE_STR ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==112) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMyDsl.g:2742:4: otherlv_16= 'seq' ( (lv_seq_17_0= RULE_STR ) )
                    {
                    otherlv_16=(Token)match(input,112,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getToDoCAccess().getSeqKeyword_11_0());
                    			
                    // InternalMyDsl.g:2746:4: ( (lv_seq_17_0= RULE_STR ) )
                    // InternalMyDsl.g:2747:5: (lv_seq_17_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2747:5: (lv_seq_17_0= RULE_STR )
                    // InternalMyDsl.g:2748:6: lv_seq_17_0= RULE_STR
                    {
                    lv_seq_17_0=(Token)match(input,RULE_STR,FOLLOW_70); 

                    						newLeafNode(lv_seq_17_0, grammarAccess.getToDoCAccess().getSeqSTRTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"seq",
                    							lv_seq_17_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2765:3: (otherlv_18= 'status' ( (lv_status_19_0= RULE_STR ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==113) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyDsl.g:2766:4: otherlv_18= 'status' ( (lv_status_19_0= RULE_STR ) )
                    {
                    otherlv_18=(Token)match(input,113,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getToDoCAccess().getStatusKeyword_12_0());
                    			
                    // InternalMyDsl.g:2770:4: ( (lv_status_19_0= RULE_STR ) )
                    // InternalMyDsl.g:2771:5: (lv_status_19_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2771:5: (lv_status_19_0= RULE_STR )
                    // InternalMyDsl.g:2772:6: lv_status_19_0= RULE_STR
                    {
                    lv_status_19_0=(Token)match(input,RULE_STR,FOLLOW_71); 

                    						newLeafNode(lv_status_19_0, grammarAccess.getToDoCAccess().getStatusSTRTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"status",
                    							lv_status_19_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2789:3: (otherlv_20= 'summary' ( (lv_summary_21_0= RULE_STR ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==114) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyDsl.g:2790:4: otherlv_20= 'summary' ( (lv_summary_21_0= RULE_STR ) )
                    {
                    otherlv_20=(Token)match(input,114,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getToDoCAccess().getSummaryKeyword_13_0());
                    			
                    // InternalMyDsl.g:2794:4: ( (lv_summary_21_0= RULE_STR ) )
                    // InternalMyDsl.g:2795:5: (lv_summary_21_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2795:5: (lv_summary_21_0= RULE_STR )
                    // InternalMyDsl.g:2796:6: lv_summary_21_0= RULE_STR
                    {
                    lv_summary_21_0=(Token)match(input,RULE_STR,FOLLOW_72); 

                    						newLeafNode(lv_summary_21_0, grammarAccess.getToDoCAccess().getSummarySTRTerminalRuleCall_13_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"summary",
                    							lv_summary_21_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2813:3: (otherlv_22= 'url' ( (lv_url_23_0= RULE_STR ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==115) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyDsl.g:2814:4: otherlv_22= 'url' ( (lv_url_23_0= RULE_STR ) )
                    {
                    otherlv_22=(Token)match(input,115,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getToDoCAccess().getUrlKeyword_14_0());
                    			
                    // InternalMyDsl.g:2818:4: ( (lv_url_23_0= RULE_STR ) )
                    // InternalMyDsl.g:2819:5: (lv_url_23_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2819:5: (lv_url_23_0= RULE_STR )
                    // InternalMyDsl.g:2820:6: lv_url_23_0= RULE_STR
                    {
                    lv_url_23_0=(Token)match(input,RULE_STR,FOLLOW_73); 

                    						newLeafNode(lv_url_23_0, grammarAccess.getToDoCAccess().getUrlSTRTerminalRuleCall_14_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_23_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2837:3: (otherlv_24= 'recurid' ( (lv_recurid_25_0= RULE_STR ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==116) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMyDsl.g:2838:4: otherlv_24= 'recurid' ( (lv_recurid_25_0= RULE_STR ) )
                    {
                    otherlv_24=(Token)match(input,116,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getToDoCAccess().getRecuridKeyword_15_0());
                    			
                    // InternalMyDsl.g:2842:4: ( (lv_recurid_25_0= RULE_STR ) )
                    // InternalMyDsl.g:2843:5: (lv_recurid_25_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2843:5: (lv_recurid_25_0= RULE_STR )
                    // InternalMyDsl.g:2844:6: lv_recurid_25_0= RULE_STR
                    {
                    lv_recurid_25_0=(Token)match(input,RULE_STR,FOLLOW_74); 

                    						newLeafNode(lv_recurid_25_0, grammarAccess.getToDoCAccess().getRecuridSTRTerminalRuleCall_15_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"recurid",
                    							lv_recurid_25_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2861:3: (otherlv_26= 'rrule' otherlv_27= '{' ( (lv_rrule_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )* otherlv_31= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==90) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalMyDsl.g:2862:4: otherlv_26= 'rrule' otherlv_27= '{' ( (lv_rrule_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,90,FOLLOW_36); 

                    				newLeafNode(otherlv_26, grammarAccess.getToDoCAccess().getRruleKeyword_16_0());
                    			
                    otherlv_27=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalMyDsl.g:2870:4: ( (lv_rrule_28_0= RULE_STR ) )
                    // InternalMyDsl.g:2871:5: (lv_rrule_28_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2871:5: (lv_rrule_28_0= RULE_STR )
                    // InternalMyDsl.g:2872:6: lv_rrule_28_0= RULE_STR
                    {
                    lv_rrule_28_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_rrule_28_0, grammarAccess.getToDoCAccess().getRruleSTRTerminalRuleCall_16_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"rrule",
                    							lv_rrule_28_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:2888:4: (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==64) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalMyDsl.g:2889:5: otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) )
                    	    {
                    	    otherlv_29=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getToDoCAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalMyDsl.g:2893:5: ( (lv_rrule_30_0= RULE_STR ) )
                    	    // InternalMyDsl.g:2894:6: (lv_rrule_30_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:2894:6: (lv_rrule_30_0= RULE_STR )
                    	    // InternalMyDsl.g:2895:7: lv_rrule_30_0= RULE_STR
                    	    {
                    	    lv_rrule_30_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_rrule_30_0, grammarAccess.getToDoCAccess().getRruleSTRTerminalRuleCall_16_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getToDoCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"rrule",
                    	    								lv_rrule_30_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,77,FOLLOW_75); 

                    				newLeafNode(otherlv_31, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2917:3: (otherlv_32= 'attach' otherlv_33= '{' ( (lv_attach_34_0= RULE_STR ) ) (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )* otherlv_37= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==82) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalMyDsl.g:2918:4: otherlv_32= 'attach' otherlv_33= '{' ( (lv_attach_34_0= RULE_STR ) ) (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )* otherlv_37= '}'
                    {
                    otherlv_32=(Token)match(input,82,FOLLOW_36); 

                    				newLeafNode(otherlv_32, grammarAccess.getToDoCAccess().getAttachKeyword_17_0());
                    			
                    otherlv_33=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_33, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_17_1());
                    			
                    // InternalMyDsl.g:2926:4: ( (lv_attach_34_0= RULE_STR ) )
                    // InternalMyDsl.g:2927:5: (lv_attach_34_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2927:5: (lv_attach_34_0= RULE_STR )
                    // InternalMyDsl.g:2928:6: lv_attach_34_0= RULE_STR
                    {
                    lv_attach_34_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_attach_34_0, grammarAccess.getToDoCAccess().getAttachSTRTerminalRuleCall_17_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"attach",
                    							lv_attach_34_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:2944:4: (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==64) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalMyDsl.g:2945:5: otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) )
                    	    {
                    	    otherlv_35=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_35, grammarAccess.getToDoCAccess().getCommaKeyword_17_3_0());
                    	    				
                    	    // InternalMyDsl.g:2949:5: ( (lv_attach_36_0= RULE_STR ) )
                    	    // InternalMyDsl.g:2950:6: (lv_attach_36_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:2950:6: (lv_attach_36_0= RULE_STR )
                    	    // InternalMyDsl.g:2951:7: lv_attach_36_0= RULE_STR
                    	    {
                    	    lv_attach_36_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_attach_36_0, grammarAccess.getToDoCAccess().getAttachSTRTerminalRuleCall_17_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getToDoCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"attach",
                    	    								lv_attach_36_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,77,FOLLOW_76); 

                    				newLeafNode(otherlv_37, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_17_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2973:3: (otherlv_38= 'attendee' otherlv_39= '{' ( (lv_attendee_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )* otherlv_43= '}' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==104) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalMyDsl.g:2974:4: otherlv_38= 'attendee' otherlv_39= '{' ( (lv_attendee_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )* otherlv_43= '}'
                    {
                    otherlv_38=(Token)match(input,104,FOLLOW_36); 

                    				newLeafNode(otherlv_38, grammarAccess.getToDoCAccess().getAttendeeKeyword_18_0());
                    			
                    otherlv_39=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_39, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_18_1());
                    			
                    // InternalMyDsl.g:2982:4: ( (lv_attendee_40_0= RULE_STR ) )
                    // InternalMyDsl.g:2983:5: (lv_attendee_40_0= RULE_STR )
                    {
                    // InternalMyDsl.g:2983:5: (lv_attendee_40_0= RULE_STR )
                    // InternalMyDsl.g:2984:6: lv_attendee_40_0= RULE_STR
                    {
                    lv_attendee_40_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_attendee_40_0, grammarAccess.getToDoCAccess().getAttendeeSTRTerminalRuleCall_18_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"attendee",
                    							lv_attendee_40_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:3000:4: (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==64) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalMyDsl.g:3001:5: otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) )
                    	    {
                    	    otherlv_41=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_41, grammarAccess.getToDoCAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalMyDsl.g:3005:5: ( (lv_attendee_42_0= RULE_STR ) )
                    	    // InternalMyDsl.g:3006:6: (lv_attendee_42_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:3006:6: (lv_attendee_42_0= RULE_STR )
                    	    // InternalMyDsl.g:3007:7: lv_attendee_42_0= RULE_STR
                    	    {
                    	    lv_attendee_42_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_attendee_42_0, grammarAccess.getToDoCAccess().getAttendeeSTRTerminalRuleCall_18_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getToDoCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"attendee",
                    	    								lv_attendee_42_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_43=(Token)match(input,77,FOLLOW_77); 

                    				newLeafNode(otherlv_43, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_18_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3029:3: (otherlv_44= 'categories' otherlv_45= '{' ( (lv_categories_46_0= RULE_STR ) ) (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )* otherlv_49= '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==117) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalMyDsl.g:3030:4: otherlv_44= 'categories' otherlv_45= '{' ( (lv_categories_46_0= RULE_STR ) ) (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )* otherlv_49= '}'
                    {
                    otherlv_44=(Token)match(input,117,FOLLOW_36); 

                    				newLeafNode(otherlv_44, grammarAccess.getToDoCAccess().getCategoriesKeyword_19_0());
                    			
                    otherlv_45=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_45, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_19_1());
                    			
                    // InternalMyDsl.g:3038:4: ( (lv_categories_46_0= RULE_STR ) )
                    // InternalMyDsl.g:3039:5: (lv_categories_46_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3039:5: (lv_categories_46_0= RULE_STR )
                    // InternalMyDsl.g:3040:6: lv_categories_46_0= RULE_STR
                    {
                    lv_categories_46_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_categories_46_0, grammarAccess.getToDoCAccess().getCategoriesSTRTerminalRuleCall_19_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"categories",
                    							lv_categories_46_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:3056:4: (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==64) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalMyDsl.g:3057:5: otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) )
                    	    {
                    	    otherlv_47=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_47, grammarAccess.getToDoCAccess().getCommaKeyword_19_3_0());
                    	    				
                    	    // InternalMyDsl.g:3061:5: ( (lv_categories_48_0= RULE_STR ) )
                    	    // InternalMyDsl.g:3062:6: (lv_categories_48_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:3062:6: (lv_categories_48_0= RULE_STR )
                    	    // InternalMyDsl.g:3063:7: lv_categories_48_0= RULE_STR
                    	    {
                    	    lv_categories_48_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_categories_48_0, grammarAccess.getToDoCAccess().getCategoriesSTRTerminalRuleCall_19_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getToDoCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"categories",
                    	    								lv_categories_48_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_49=(Token)match(input,77,FOLLOW_78); 

                    				newLeafNode(otherlv_49, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_19_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3085:3: (otherlv_50= 'comment' otherlv_51= '{' ( (lv_comment_52_0= RULE_STR ) ) (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )* otherlv_55= '}' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==93) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalMyDsl.g:3086:4: otherlv_50= 'comment' otherlv_51= '{' ( (lv_comment_52_0= RULE_STR ) ) (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )* otherlv_55= '}'
                    {
                    otherlv_50=(Token)match(input,93,FOLLOW_36); 

                    				newLeafNode(otherlv_50, grammarAccess.getToDoCAccess().getCommentKeyword_20_0());
                    			
                    otherlv_51=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_51, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_20_1());
                    			
                    // InternalMyDsl.g:3094:4: ( (lv_comment_52_0= RULE_STR ) )
                    // InternalMyDsl.g:3095:5: (lv_comment_52_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3095:5: (lv_comment_52_0= RULE_STR )
                    // InternalMyDsl.g:3096:6: lv_comment_52_0= RULE_STR
                    {
                    lv_comment_52_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_comment_52_0, grammarAccess.getToDoCAccess().getCommentSTRTerminalRuleCall_20_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"comment",
                    							lv_comment_52_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:3112:4: (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==64) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalMyDsl.g:3113:5: otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) )
                    	    {
                    	    otherlv_53=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_53, grammarAccess.getToDoCAccess().getCommaKeyword_20_3_0());
                    	    				
                    	    // InternalMyDsl.g:3117:5: ( (lv_comment_54_0= RULE_STR ) )
                    	    // InternalMyDsl.g:3118:6: (lv_comment_54_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:3118:6: (lv_comment_54_0= RULE_STR )
                    	    // InternalMyDsl.g:3119:7: lv_comment_54_0= RULE_STR
                    	    {
                    	    lv_comment_54_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_comment_54_0, grammarAccess.getToDoCAccess().getCommentSTRTerminalRuleCall_20_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getToDoCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"comment",
                    	    								lv_comment_54_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_55=(Token)match(input,77,FOLLOW_79); 

                    				newLeafNode(otherlv_55, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_20_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3141:3: (otherlv_56= 'contact' otherlv_57= '{' ( (lv_contact_58_0= RULE_STR ) ) (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )* otherlv_61= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==118) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalMyDsl.g:3142:4: otherlv_56= 'contact' otherlv_57= '{' ( (lv_contact_58_0= RULE_STR ) ) (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )* otherlv_61= '}'
                    {
                    otherlv_56=(Token)match(input,118,FOLLOW_36); 

                    				newLeafNode(otherlv_56, grammarAccess.getToDoCAccess().getContactKeyword_21_0());
                    			
                    otherlv_57=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_57, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_21_1());
                    			
                    // InternalMyDsl.g:3150:4: ( (lv_contact_58_0= RULE_STR ) )
                    // InternalMyDsl.g:3151:5: (lv_contact_58_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3151:5: (lv_contact_58_0= RULE_STR )
                    // InternalMyDsl.g:3152:6: lv_contact_58_0= RULE_STR
                    {
                    lv_contact_58_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_contact_58_0, grammarAccess.getToDoCAccess().getContactSTRTerminalRuleCall_21_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"contact",
                    							lv_contact_58_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:3168:4: (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==64) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalMyDsl.g:3169:5: otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) )
                    	    {
                    	    otherlv_59=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_59, grammarAccess.getToDoCAccess().getCommaKeyword_21_3_0());
                    	    				
                    	    // InternalMyDsl.g:3173:5: ( (lv_contact_60_0= RULE_STR ) )
                    	    // InternalMyDsl.g:3174:6: (lv_contact_60_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:3174:6: (lv_contact_60_0= RULE_STR )
                    	    // InternalMyDsl.g:3175:7: lv_contact_60_0= RULE_STR
                    	    {
                    	    lv_contact_60_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_contact_60_0, grammarAccess.getToDoCAccess().getContactSTRTerminalRuleCall_21_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getToDoCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"contact",
                    	    								lv_contact_60_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_61=(Token)match(input,77,FOLLOW_80); 

                    				newLeafNode(otherlv_61, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_21_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3197:3: (otherlv_62= 'exdate' otherlv_63= '{' ( (lv_exdate_64_0= RULE_STR ) ) (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )* otherlv_67= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==119) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalMyDsl.g:3198:4: otherlv_62= 'exdate' otherlv_63= '{' ( (lv_exdate_64_0= RULE_STR ) ) (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )* otherlv_67= '}'
                    {
                    otherlv_62=(Token)match(input,119,FOLLOW_36); 

                    				newLeafNode(otherlv_62, grammarAccess.getToDoCAccess().getExdateKeyword_22_0());
                    			
                    otherlv_63=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_63, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_22_1());
                    			
                    // InternalMyDsl.g:3206:4: ( (lv_exdate_64_0= RULE_STR ) )
                    // InternalMyDsl.g:3207:5: (lv_exdate_64_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3207:5: (lv_exdate_64_0= RULE_STR )
                    // InternalMyDsl.g:3208:6: lv_exdate_64_0= RULE_STR
                    {
                    lv_exdate_64_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_exdate_64_0, grammarAccess.getToDoCAccess().getExdateSTRTerminalRuleCall_22_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"exdate",
                    							lv_exdate_64_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:3224:4: (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==64) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalMyDsl.g:3225:5: otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) )
                    	    {
                    	    otherlv_65=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_65, grammarAccess.getToDoCAccess().getCommaKeyword_22_3_0());
                    	    				
                    	    // InternalMyDsl.g:3229:5: ( (lv_exdate_66_0= RULE_STR ) )
                    	    // InternalMyDsl.g:3230:6: (lv_exdate_66_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:3230:6: (lv_exdate_66_0= RULE_STR )
                    	    // InternalMyDsl.g:3231:7: lv_exdate_66_0= RULE_STR
                    	    {
                    	    lv_exdate_66_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_exdate_66_0, grammarAccess.getToDoCAccess().getExdateSTRTerminalRuleCall_22_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getToDoCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"exdate",
                    	    								lv_exdate_66_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_67=(Token)match(input,77,FOLLOW_81); 

                    				newLeafNode(otherlv_67, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_22_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3253:3: (otherlv_68= 'rstatus' otherlv_69= '{' ( (lv_rstatus_70_0= RULE_STR ) ) (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )* otherlv_73= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==120) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalMyDsl.g:3254:4: otherlv_68= 'rstatus' otherlv_69= '{' ( (lv_rstatus_70_0= RULE_STR ) ) (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )* otherlv_73= '}'
                    {
                    otherlv_68=(Token)match(input,120,FOLLOW_36); 

                    				newLeafNode(otherlv_68, grammarAccess.getToDoCAccess().getRstatusKeyword_23_0());
                    			
                    otherlv_69=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_69, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_23_1());
                    			
                    // InternalMyDsl.g:3262:4: ( (lv_rstatus_70_0= RULE_STR ) )
                    // InternalMyDsl.g:3263:5: (lv_rstatus_70_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3263:5: (lv_rstatus_70_0= RULE_STR )
                    // InternalMyDsl.g:3264:6: lv_rstatus_70_0= RULE_STR
                    {
                    lv_rstatus_70_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_rstatus_70_0, grammarAccess.getToDoCAccess().getRstatusSTRTerminalRuleCall_23_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"rstatus",
                    							lv_rstatus_70_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:3280:4: (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==64) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalMyDsl.g:3281:5: otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) )
                    	    {
                    	    otherlv_71=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_71, grammarAccess.getToDoCAccess().getCommaKeyword_23_3_0());
                    	    				
                    	    // InternalMyDsl.g:3285:5: ( (lv_rstatus_72_0= RULE_STR ) )
                    	    // InternalMyDsl.g:3286:6: (lv_rstatus_72_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:3286:6: (lv_rstatus_72_0= RULE_STR )
                    	    // InternalMyDsl.g:3287:7: lv_rstatus_72_0= RULE_STR
                    	    {
                    	    lv_rstatus_72_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_rstatus_72_0, grammarAccess.getToDoCAccess().getRstatusSTRTerminalRuleCall_23_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getToDoCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"rstatus",
                    	    								lv_rstatus_72_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_73=(Token)match(input,77,FOLLOW_82); 

                    				newLeafNode(otherlv_73, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_23_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3309:3: (otherlv_74= 'related' otherlv_75= '{' ( (lv_related_76_0= RULE_STR ) ) (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )* otherlv_79= '}' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==121) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalMyDsl.g:3310:4: otherlv_74= 'related' otherlv_75= '{' ( (lv_related_76_0= RULE_STR ) ) (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )* otherlv_79= '}'
                    {
                    otherlv_74=(Token)match(input,121,FOLLOW_36); 

                    				newLeafNode(otherlv_74, grammarAccess.getToDoCAccess().getRelatedKeyword_24_0());
                    			
                    otherlv_75=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_75, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_24_1());
                    			
                    // InternalMyDsl.g:3318:4: ( (lv_related_76_0= RULE_STR ) )
                    // InternalMyDsl.g:3319:5: (lv_related_76_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3319:5: (lv_related_76_0= RULE_STR )
                    // InternalMyDsl.g:3320:6: lv_related_76_0= RULE_STR
                    {
                    lv_related_76_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_related_76_0, grammarAccess.getToDoCAccess().getRelatedSTRTerminalRuleCall_24_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"related",
                    							lv_related_76_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:3336:4: (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==64) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalMyDsl.g:3337:5: otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) )
                    	    {
                    	    otherlv_77=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_77, grammarAccess.getToDoCAccess().getCommaKeyword_24_3_0());
                    	    				
                    	    // InternalMyDsl.g:3341:5: ( (lv_related_78_0= RULE_STR ) )
                    	    // InternalMyDsl.g:3342:6: (lv_related_78_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:3342:6: (lv_related_78_0= RULE_STR )
                    	    // InternalMyDsl.g:3343:7: lv_related_78_0= RULE_STR
                    	    {
                    	    lv_related_78_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_related_78_0, grammarAccess.getToDoCAccess().getRelatedSTRTerminalRuleCall_24_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getToDoCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"related",
                    	    								lv_related_78_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_79=(Token)match(input,77,FOLLOW_83); 

                    				newLeafNode(otherlv_79, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_24_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3365:3: (otherlv_80= 'resources' otherlv_81= '{' ( (lv_resources_82_0= RULE_STR ) ) (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )* otherlv_85= '}' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==122) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalMyDsl.g:3366:4: otherlv_80= 'resources' otherlv_81= '{' ( (lv_resources_82_0= RULE_STR ) ) (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )* otherlv_85= '}'
                    {
                    otherlv_80=(Token)match(input,122,FOLLOW_36); 

                    				newLeafNode(otherlv_80, grammarAccess.getToDoCAccess().getResourcesKeyword_25_0());
                    			
                    otherlv_81=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_81, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_25_1());
                    			
                    // InternalMyDsl.g:3374:4: ( (lv_resources_82_0= RULE_STR ) )
                    // InternalMyDsl.g:3375:5: (lv_resources_82_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3375:5: (lv_resources_82_0= RULE_STR )
                    // InternalMyDsl.g:3376:6: lv_resources_82_0= RULE_STR
                    {
                    lv_resources_82_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_resources_82_0, grammarAccess.getToDoCAccess().getResourcesSTRTerminalRuleCall_25_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"resources",
                    							lv_resources_82_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:3392:4: (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==64) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalMyDsl.g:3393:5: otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) )
                    	    {
                    	    otherlv_83=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_83, grammarAccess.getToDoCAccess().getCommaKeyword_25_3_0());
                    	    				
                    	    // InternalMyDsl.g:3397:5: ( (lv_resources_84_0= RULE_STR ) )
                    	    // InternalMyDsl.g:3398:6: (lv_resources_84_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:3398:6: (lv_resources_84_0= RULE_STR )
                    	    // InternalMyDsl.g:3399:7: lv_resources_84_0= RULE_STR
                    	    {
                    	    lv_resources_84_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_resources_84_0, grammarAccess.getToDoCAccess().getResourcesSTRTerminalRuleCall_25_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getToDoCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"resources",
                    	    								lv_resources_84_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    otherlv_85=(Token)match(input,77,FOLLOW_84); 

                    				newLeafNode(otherlv_85, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_25_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3421:3: (otherlv_86= 'rdate' otherlv_87= '{' ( (lv_rdate_88_0= RULE_STR ) ) (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )* otherlv_91= '}' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==94) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalMyDsl.g:3422:4: otherlv_86= 'rdate' otherlv_87= '{' ( (lv_rdate_88_0= RULE_STR ) ) (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )* otherlv_91= '}'
                    {
                    otherlv_86=(Token)match(input,94,FOLLOW_36); 

                    				newLeafNode(otherlv_86, grammarAccess.getToDoCAccess().getRdateKeyword_26_0());
                    			
                    otherlv_87=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_87, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_26_1());
                    			
                    // InternalMyDsl.g:3430:4: ( (lv_rdate_88_0= RULE_STR ) )
                    // InternalMyDsl.g:3431:5: (lv_rdate_88_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3431:5: (lv_rdate_88_0= RULE_STR )
                    // InternalMyDsl.g:3432:6: lv_rdate_88_0= RULE_STR
                    {
                    lv_rdate_88_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_rdate_88_0, grammarAccess.getToDoCAccess().getRdateSTRTerminalRuleCall_26_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"rdate",
                    							lv_rdate_88_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:3448:4: (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==64) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalMyDsl.g:3449:5: otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) )
                    	    {
                    	    otherlv_89=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_89, grammarAccess.getToDoCAccess().getCommaKeyword_26_3_0());
                    	    				
                    	    // InternalMyDsl.g:3453:5: ( (lv_rdate_90_0= RULE_STR ) )
                    	    // InternalMyDsl.g:3454:6: (lv_rdate_90_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:3454:6: (lv_rdate_90_0= RULE_STR )
                    	    // InternalMyDsl.g:3455:7: lv_rdate_90_0= RULE_STR
                    	    {
                    	    lv_rdate_90_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_rdate_90_0, grammarAccess.getToDoCAccess().getRdateSTRTerminalRuleCall_26_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getToDoCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"rdate",
                    	    								lv_rdate_90_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_91=(Token)match(input,77,FOLLOW_85); 

                    				newLeafNode(otherlv_91, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_26_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3477:3: (otherlv_92= 'x_prop' otherlv_93= '{' ( (lv_x_prop_94_0= RULE_STR ) ) (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )* otherlv_97= '}' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==96) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalMyDsl.g:3478:4: otherlv_92= 'x_prop' otherlv_93= '{' ( (lv_x_prop_94_0= RULE_STR ) ) (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )* otherlv_97= '}'
                    {
                    otherlv_92=(Token)match(input,96,FOLLOW_36); 

                    				newLeafNode(otherlv_92, grammarAccess.getToDoCAccess().getX_propKeyword_27_0());
                    			
                    otherlv_93=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_93, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_27_1());
                    			
                    // InternalMyDsl.g:3486:4: ( (lv_x_prop_94_0= RULE_STR ) )
                    // InternalMyDsl.g:3487:5: (lv_x_prop_94_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3487:5: (lv_x_prop_94_0= RULE_STR )
                    // InternalMyDsl.g:3488:6: lv_x_prop_94_0= RULE_STR
                    {
                    lv_x_prop_94_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_x_prop_94_0, grammarAccess.getToDoCAccess().getX_propSTRTerminalRuleCall_27_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"x_prop",
                    							lv_x_prop_94_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:3504:4: (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==64) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalMyDsl.g:3505:5: otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) )
                    	    {
                    	    otherlv_95=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_95, grammarAccess.getToDoCAccess().getCommaKeyword_27_3_0());
                    	    				
                    	    // InternalMyDsl.g:3509:5: ( (lv_x_prop_96_0= RULE_STR ) )
                    	    // InternalMyDsl.g:3510:6: (lv_x_prop_96_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:3510:6: (lv_x_prop_96_0= RULE_STR )
                    	    // InternalMyDsl.g:3511:7: lv_x_prop_96_0= RULE_STR
                    	    {
                    	    lv_x_prop_96_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_x_prop_96_0, grammarAccess.getToDoCAccess().getX_propSTRTerminalRuleCall_27_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getToDoCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"x_prop",
                    	    								lv_x_prop_96_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);

                    otherlv_97=(Token)match(input,77,FOLLOW_86); 

                    				newLeafNode(otherlv_97, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_27_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3533:3: (otherlv_98= 'iana_prop' otherlv_99= '{' ( (lv_iana_prop_100_0= RULE_STR ) ) (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )* otherlv_103= '}' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==97) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalMyDsl.g:3534:4: otherlv_98= 'iana_prop' otherlv_99= '{' ( (lv_iana_prop_100_0= RULE_STR ) ) (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )* otherlv_103= '}'
                    {
                    otherlv_98=(Token)match(input,97,FOLLOW_36); 

                    				newLeafNode(otherlv_98, grammarAccess.getToDoCAccess().getIana_propKeyword_28_0());
                    			
                    otherlv_99=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_99, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_28_1());
                    			
                    // InternalMyDsl.g:3542:4: ( (lv_iana_prop_100_0= RULE_STR ) )
                    // InternalMyDsl.g:3543:5: (lv_iana_prop_100_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3543:5: (lv_iana_prop_100_0= RULE_STR )
                    // InternalMyDsl.g:3544:6: lv_iana_prop_100_0= RULE_STR
                    {
                    lv_iana_prop_100_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_iana_prop_100_0, grammarAccess.getToDoCAccess().getIana_propSTRTerminalRuleCall_28_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"iana_prop",
                    							lv_iana_prop_100_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:3560:4: (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==64) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalMyDsl.g:3561:5: otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) )
                    	    {
                    	    otherlv_101=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_101, grammarAccess.getToDoCAccess().getCommaKeyword_28_3_0());
                    	    				
                    	    // InternalMyDsl.g:3565:5: ( (lv_iana_prop_102_0= RULE_STR ) )
                    	    // InternalMyDsl.g:3566:6: (lv_iana_prop_102_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:3566:6: (lv_iana_prop_102_0= RULE_STR )
                    	    // InternalMyDsl.g:3567:7: lv_iana_prop_102_0= RULE_STR
                    	    {
                    	    lv_iana_prop_102_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_iana_prop_102_0, grammarAccess.getToDoCAccess().getIana_propSTRTerminalRuleCall_28_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getToDoCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"iana_prop",
                    	    								lv_iana_prop_102_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_103=(Token)match(input,77,FOLLOW_87); 

                    				newLeafNode(otherlv_103, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_28_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3589:3: (otherlv_104= 'description' ( (lv_description_105_0= RULE_STR ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==83) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalMyDsl.g:3590:4: otherlv_104= 'description' ( (lv_description_105_0= RULE_STR ) )
                    {
                    otherlv_104=(Token)match(input,83,FOLLOW_3); 

                    				newLeafNode(otherlv_104, grammarAccess.getToDoCAccess().getDescriptionKeyword_29_0());
                    			
                    // InternalMyDsl.g:3594:4: ( (lv_description_105_0= RULE_STR ) )
                    // InternalMyDsl.g:3595:5: (lv_description_105_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3595:5: (lv_description_105_0= RULE_STR )
                    // InternalMyDsl.g:3596:6: lv_description_105_0= RULE_STR
                    {
                    lv_description_105_0=(Token)match(input,RULE_STR,FOLLOW_88); 

                    						newLeafNode(lv_description_105_0, grammarAccess.getToDoCAccess().getDescriptionSTRTerminalRuleCall_29_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_105_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:3613:3: (otherlv_106= 'completed' ( (lv_completed_107_0= RULE_STR ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==123) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalMyDsl.g:3614:4: otherlv_106= 'completed' ( (lv_completed_107_0= RULE_STR ) )
                    {
                    otherlv_106=(Token)match(input,123,FOLLOW_3); 

                    				newLeafNode(otherlv_106, grammarAccess.getToDoCAccess().getCompletedKeyword_30_0());
                    			
                    // InternalMyDsl.g:3618:4: ( (lv_completed_107_0= RULE_STR ) )
                    // InternalMyDsl.g:3619:5: (lv_completed_107_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3619:5: (lv_completed_107_0= RULE_STR )
                    // InternalMyDsl.g:3620:6: lv_completed_107_0= RULE_STR
                    {
                    lv_completed_107_0=(Token)match(input,RULE_STR,FOLLOW_89); 

                    						newLeafNode(lv_completed_107_0, grammarAccess.getToDoCAccess().getCompletedSTRTerminalRuleCall_30_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"completed",
                    							lv_completed_107_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:3637:3: (otherlv_108= 'priority' ( (lv_priority_109_0= RULE_STR ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==124) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalMyDsl.g:3638:4: otherlv_108= 'priority' ( (lv_priority_109_0= RULE_STR ) )
                    {
                    otherlv_108=(Token)match(input,124,FOLLOW_3); 

                    				newLeafNode(otherlv_108, grammarAccess.getToDoCAccess().getPriorityKeyword_31_0());
                    			
                    // InternalMyDsl.g:3642:4: ( (lv_priority_109_0= RULE_STR ) )
                    // InternalMyDsl.g:3643:5: (lv_priority_109_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3643:5: (lv_priority_109_0= RULE_STR )
                    // InternalMyDsl.g:3644:6: lv_priority_109_0= RULE_STR
                    {
                    lv_priority_109_0=(Token)match(input,RULE_STR,FOLLOW_90); 

                    						newLeafNode(lv_priority_109_0, grammarAccess.getToDoCAccess().getPrioritySTRTerminalRuleCall_31_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"priority",
                    							lv_priority_109_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:3661:3: (otherlv_110= 'geo' ( (lv_geo_111_0= RULE_STR ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==125) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalMyDsl.g:3662:4: otherlv_110= 'geo' ( (lv_geo_111_0= RULE_STR ) )
                    {
                    otherlv_110=(Token)match(input,125,FOLLOW_3); 

                    				newLeafNode(otherlv_110, grammarAccess.getToDoCAccess().getGeoKeyword_32_0());
                    			
                    // InternalMyDsl.g:3666:4: ( (lv_geo_111_0= RULE_STR ) )
                    // InternalMyDsl.g:3667:5: (lv_geo_111_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3667:5: (lv_geo_111_0= RULE_STR )
                    // InternalMyDsl.g:3668:6: lv_geo_111_0= RULE_STR
                    {
                    lv_geo_111_0=(Token)match(input,RULE_STR,FOLLOW_91); 

                    						newLeafNode(lv_geo_111_0, grammarAccess.getToDoCAccess().getGeoSTRTerminalRuleCall_32_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"geo",
                    							lv_geo_111_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:3685:3: (otherlv_112= 'location' ( (lv_location_113_0= RULE_STR ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==126) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalMyDsl.g:3686:4: otherlv_112= 'location' ( (lv_location_113_0= RULE_STR ) )
                    {
                    otherlv_112=(Token)match(input,126,FOLLOW_3); 

                    				newLeafNode(otherlv_112, grammarAccess.getToDoCAccess().getLocationKeyword_33_0());
                    			
                    // InternalMyDsl.g:3690:4: ( (lv_location_113_0= RULE_STR ) )
                    // InternalMyDsl.g:3691:5: (lv_location_113_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3691:5: (lv_location_113_0= RULE_STR )
                    // InternalMyDsl.g:3692:6: lv_location_113_0= RULE_STR
                    {
                    lv_location_113_0=(Token)match(input,RULE_STR,FOLLOW_92); 

                    						newLeafNode(lv_location_113_0, grammarAccess.getToDoCAccess().getLocationSTRTerminalRuleCall_33_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getToDoCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"location",
                    							lv_location_113_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:3709:3: (otherlv_114= 'dtend' ( (lv_dtend_115_0= ruleDateT ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==127) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalMyDsl.g:3710:4: otherlv_114= 'dtend' ( (lv_dtend_115_0= ruleDateT ) )
                    {
                    otherlv_114=(Token)match(input,127,FOLLOW_15); 

                    				newLeafNode(otherlv_114, grammarAccess.getToDoCAccess().getDtendKeyword_34_0());
                    			
                    // InternalMyDsl.g:3714:4: ( (lv_dtend_115_0= ruleDateT ) )
                    // InternalMyDsl.g:3715:5: (lv_dtend_115_0= ruleDateT )
                    {
                    // InternalMyDsl.g:3715:5: (lv_dtend_115_0= ruleDateT )
                    // InternalMyDsl.g:3716:6: lv_dtend_115_0= ruleDateT
                    {

                    						newCompositeNode(grammarAccess.getToDoCAccess().getDtendDateTParserRuleCall_34_1_0());
                    					
                    pushFollow(FOLLOW_93);
                    lv_dtend_115_0=ruleDateT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getToDoCRule());
                    						}
                    						set(
                    							current,
                    							"dtend",
                    							lv_dtend_115_0,
                    							"xCalendar.MyDsl.DateT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:3734:3: (otherlv_116= 'alarmc' otherlv_117= '{' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* otherlv_121= '}' )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==128) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalMyDsl.g:3735:4: otherlv_116= 'alarmc' otherlv_117= '{' ( (lv_alarmc_118_0= ruleAlarmC ) ) (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )* otherlv_121= '}'
                    {
                    otherlv_116=(Token)match(input,128,FOLLOW_36); 

                    				newLeafNode(otherlv_116, grammarAccess.getToDoCAccess().getAlarmcKeyword_35_0());
                    			
                    otherlv_117=(Token)match(input,79,FOLLOW_5); 

                    				newLeafNode(otherlv_117, grammarAccess.getToDoCAccess().getLeftCurlyBracketKeyword_35_1());
                    			
                    // InternalMyDsl.g:3743:4: ( (lv_alarmc_118_0= ruleAlarmC ) )
                    // InternalMyDsl.g:3744:5: (lv_alarmc_118_0= ruleAlarmC )
                    {
                    // InternalMyDsl.g:3744:5: (lv_alarmc_118_0= ruleAlarmC )
                    // InternalMyDsl.g:3745:6: lv_alarmc_118_0= ruleAlarmC
                    {

                    						newCompositeNode(grammarAccess.getToDoCAccess().getAlarmcAlarmCParserRuleCall_35_2_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_alarmc_118_0=ruleAlarmC();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getToDoCRule());
                    						}
                    						add(
                    							current,
                    							"alarmc",
                    							lv_alarmc_118_0,
                    							"xCalendar.MyDsl.AlarmC");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:3762:4: (otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==64) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalMyDsl.g:3763:5: otherlv_119= ',' ( (lv_alarmc_120_0= ruleAlarmC ) )
                    	    {
                    	    otherlv_119=(Token)match(input,64,FOLLOW_5); 

                    	    					newLeafNode(otherlv_119, grammarAccess.getToDoCAccess().getCommaKeyword_35_3_0());
                    	    				
                    	    // InternalMyDsl.g:3767:5: ( (lv_alarmc_120_0= ruleAlarmC ) )
                    	    // InternalMyDsl.g:3768:6: (lv_alarmc_120_0= ruleAlarmC )
                    	    {
                    	    // InternalMyDsl.g:3768:6: (lv_alarmc_120_0= ruleAlarmC )
                    	    // InternalMyDsl.g:3769:7: lv_alarmc_120_0= ruleAlarmC
                    	    {

                    	    							newCompositeNode(grammarAccess.getToDoCAccess().getAlarmcAlarmCParserRuleCall_35_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_51);
                    	    lv_alarmc_120_0=ruleAlarmC();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getToDoCRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"alarmc",
                    	    								lv_alarmc_120_0,
                    	    								"xCalendar.MyDsl.AlarmC");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);

                    otherlv_121=(Token)match(input,77,FOLLOW_35); 

                    				newLeafNode(otherlv_121, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_35_4());
                    			

                    }
                    break;

            }

            otherlv_122=(Token)match(input,77,FOLLOW_2); 

            			newLeafNode(otherlv_122, grammarAccess.getToDoCAccess().getRightCurlyBracketKeyword_36());
            		

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
    // $ANTLR end "ruleToDoC"


    // $ANTLR start "entryRuleJournalC"
    // InternalMyDsl.g:3800:1: entryRuleJournalC returns [EObject current=null] : iv_ruleJournalC= ruleJournalC EOF ;
    public final EObject entryRuleJournalC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJournalC = null;


        try {
            // InternalMyDsl.g:3800:49: (iv_ruleJournalC= ruleJournalC EOF )
            // InternalMyDsl.g:3801:2: iv_ruleJournalC= ruleJournalC EOF
            {
             newCompositeNode(grammarAccess.getJournalCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJournalC=ruleJournalC();

            state._fsp--;

             current =iv_ruleJournalC; 
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
    // $ANTLR end "entryRuleJournalC"


    // $ANTLR start "ruleJournalC"
    // InternalMyDsl.g:3807:1: ruleJournalC returns [EObject current=null] : (otherlv_0= 'JournalC' otherlv_1= '{' otherlv_2= 'dtstamp' ( (lv_dtstamp_3_0= RULE_STR ) ) otherlv_4= 'uid' ( (lv_uid_5_0= RULE_STR ) ) (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STR ) ) )? (otherlv_10= 'created' ( (lv_created_11_0= RULE_STR ) ) )? (otherlv_12= 'last_mod' ( (lv_last_mod_13_0= RULE_STR ) ) )? (otherlv_14= 'organizer' ( (lv_organizer_15_0= RULE_STR ) ) )? (otherlv_16= 'seq' ( (lv_seq_17_0= RULE_STR ) ) )? (otherlv_18= 'status' ( (lv_status_19_0= RULE_STR ) ) )? (otherlv_20= 'summary' ( (lv_summary_21_0= RULE_STR ) ) )? (otherlv_22= 'url' ( (lv_url_23_0= RULE_STR ) ) )? (otherlv_24= 'recurid' ( (lv_recurid_25_0= RULE_STR ) ) )? (otherlv_26= 'rrule' otherlv_27= '{' ( (lv_rrule_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )* otherlv_31= '}' )? (otherlv_32= 'attach' otherlv_33= '{' ( (lv_attach_34_0= RULE_STR ) ) (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )* otherlv_37= '}' )? (otherlv_38= 'attendee' otherlv_39= '{' ( (lv_attendee_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )* otherlv_43= '}' )? (otherlv_44= 'categories' otherlv_45= '{' ( (lv_categories_46_0= RULE_STR ) ) (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )* otherlv_49= '}' )? (otherlv_50= 'comment' otherlv_51= '{' ( (lv_comment_52_0= RULE_STR ) ) (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )* otherlv_55= '}' )? (otherlv_56= 'contact' otherlv_57= '{' ( (lv_contact_58_0= RULE_STR ) ) (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )* otherlv_61= '}' )? (otherlv_62= 'exdate' otherlv_63= '{' ( (lv_exdate_64_0= RULE_STR ) ) (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )* otherlv_67= '}' )? (otherlv_68= 'rstatus' otherlv_69= '{' ( (lv_rstatus_70_0= RULE_STR ) ) (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )* otherlv_73= '}' )? (otherlv_74= 'related' otherlv_75= '{' ( (lv_related_76_0= RULE_STR ) ) (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )* otherlv_79= '}' )? (otherlv_80= 'resources' otherlv_81= '{' ( (lv_resources_82_0= RULE_STR ) ) (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )* otherlv_85= '}' )? (otherlv_86= 'rdate' otherlv_87= '{' ( (lv_rdate_88_0= RULE_STR ) ) (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )* otherlv_91= '}' )? (otherlv_92= 'x_prop' otherlv_93= '{' ( (lv_x_prop_94_0= RULE_STR ) ) (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )* otherlv_97= '}' )? (otherlv_98= 'iana_prop' otherlv_99= '{' ( (lv_iana_prop_100_0= RULE_STR ) ) (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )* otherlv_103= '}' )? (otherlv_104= 'description' ( (lv_description_105_0= RULE_STR ) ) )? otherlv_106= '}' ) ;
    public final EObject ruleJournalC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_dtstamp_3_0=null;
        Token otherlv_4=null;
        Token lv_uid_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_class_9_0=null;
        Token otherlv_10=null;
        Token lv_created_11_0=null;
        Token otherlv_12=null;
        Token lv_last_mod_13_0=null;
        Token otherlv_14=null;
        Token lv_organizer_15_0=null;
        Token otherlv_16=null;
        Token lv_seq_17_0=null;
        Token otherlv_18=null;
        Token lv_status_19_0=null;
        Token otherlv_20=null;
        Token lv_summary_21_0=null;
        Token otherlv_22=null;
        Token lv_url_23_0=null;
        Token otherlv_24=null;
        Token lv_recurid_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_rrule_28_0=null;
        Token otherlv_29=null;
        Token lv_rrule_30_0=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token lv_attach_34_0=null;
        Token otherlv_35=null;
        Token lv_attach_36_0=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token lv_attendee_40_0=null;
        Token otherlv_41=null;
        Token lv_attendee_42_0=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token lv_categories_46_0=null;
        Token otherlv_47=null;
        Token lv_categories_48_0=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token lv_comment_52_0=null;
        Token otherlv_53=null;
        Token lv_comment_54_0=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token lv_contact_58_0=null;
        Token otherlv_59=null;
        Token lv_contact_60_0=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token otherlv_63=null;
        Token lv_exdate_64_0=null;
        Token otherlv_65=null;
        Token lv_exdate_66_0=null;
        Token otherlv_67=null;
        Token otherlv_68=null;
        Token otherlv_69=null;
        Token lv_rstatus_70_0=null;
        Token otherlv_71=null;
        Token lv_rstatus_72_0=null;
        Token otherlv_73=null;
        Token otherlv_74=null;
        Token otherlv_75=null;
        Token lv_related_76_0=null;
        Token otherlv_77=null;
        Token lv_related_78_0=null;
        Token otherlv_79=null;
        Token otherlv_80=null;
        Token otherlv_81=null;
        Token lv_resources_82_0=null;
        Token otherlv_83=null;
        Token lv_resources_84_0=null;
        Token otherlv_85=null;
        Token otherlv_86=null;
        Token otherlv_87=null;
        Token lv_rdate_88_0=null;
        Token otherlv_89=null;
        Token lv_rdate_90_0=null;
        Token otherlv_91=null;
        Token otherlv_92=null;
        Token otherlv_93=null;
        Token lv_x_prop_94_0=null;
        Token otherlv_95=null;
        Token lv_x_prop_96_0=null;
        Token otherlv_97=null;
        Token otherlv_98=null;
        Token otherlv_99=null;
        Token lv_iana_prop_100_0=null;
        Token otherlv_101=null;
        Token lv_iana_prop_102_0=null;
        Token otherlv_103=null;
        Token otherlv_104=null;
        Token lv_description_105_0=null;
        Token otherlv_106=null;
        EObject lv_dtstart_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3813:2: ( (otherlv_0= 'JournalC' otherlv_1= '{' otherlv_2= 'dtstamp' ( (lv_dtstamp_3_0= RULE_STR ) ) otherlv_4= 'uid' ( (lv_uid_5_0= RULE_STR ) ) (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STR ) ) )? (otherlv_10= 'created' ( (lv_created_11_0= RULE_STR ) ) )? (otherlv_12= 'last_mod' ( (lv_last_mod_13_0= RULE_STR ) ) )? (otherlv_14= 'organizer' ( (lv_organizer_15_0= RULE_STR ) ) )? (otherlv_16= 'seq' ( (lv_seq_17_0= RULE_STR ) ) )? (otherlv_18= 'status' ( (lv_status_19_0= RULE_STR ) ) )? (otherlv_20= 'summary' ( (lv_summary_21_0= RULE_STR ) ) )? (otherlv_22= 'url' ( (lv_url_23_0= RULE_STR ) ) )? (otherlv_24= 'recurid' ( (lv_recurid_25_0= RULE_STR ) ) )? (otherlv_26= 'rrule' otherlv_27= '{' ( (lv_rrule_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )* otherlv_31= '}' )? (otherlv_32= 'attach' otherlv_33= '{' ( (lv_attach_34_0= RULE_STR ) ) (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )* otherlv_37= '}' )? (otherlv_38= 'attendee' otherlv_39= '{' ( (lv_attendee_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )* otherlv_43= '}' )? (otherlv_44= 'categories' otherlv_45= '{' ( (lv_categories_46_0= RULE_STR ) ) (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )* otherlv_49= '}' )? (otherlv_50= 'comment' otherlv_51= '{' ( (lv_comment_52_0= RULE_STR ) ) (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )* otherlv_55= '}' )? (otherlv_56= 'contact' otherlv_57= '{' ( (lv_contact_58_0= RULE_STR ) ) (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )* otherlv_61= '}' )? (otherlv_62= 'exdate' otherlv_63= '{' ( (lv_exdate_64_0= RULE_STR ) ) (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )* otherlv_67= '}' )? (otherlv_68= 'rstatus' otherlv_69= '{' ( (lv_rstatus_70_0= RULE_STR ) ) (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )* otherlv_73= '}' )? (otherlv_74= 'related' otherlv_75= '{' ( (lv_related_76_0= RULE_STR ) ) (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )* otherlv_79= '}' )? (otherlv_80= 'resources' otherlv_81= '{' ( (lv_resources_82_0= RULE_STR ) ) (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )* otherlv_85= '}' )? (otherlv_86= 'rdate' otherlv_87= '{' ( (lv_rdate_88_0= RULE_STR ) ) (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )* otherlv_91= '}' )? (otherlv_92= 'x_prop' otherlv_93= '{' ( (lv_x_prop_94_0= RULE_STR ) ) (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )* otherlv_97= '}' )? (otherlv_98= 'iana_prop' otherlv_99= '{' ( (lv_iana_prop_100_0= RULE_STR ) ) (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )* otherlv_103= '}' )? (otherlv_104= 'description' ( (lv_description_105_0= RULE_STR ) ) )? otherlv_106= '}' ) )
            // InternalMyDsl.g:3814:2: (otherlv_0= 'JournalC' otherlv_1= '{' otherlv_2= 'dtstamp' ( (lv_dtstamp_3_0= RULE_STR ) ) otherlv_4= 'uid' ( (lv_uid_5_0= RULE_STR ) ) (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STR ) ) )? (otherlv_10= 'created' ( (lv_created_11_0= RULE_STR ) ) )? (otherlv_12= 'last_mod' ( (lv_last_mod_13_0= RULE_STR ) ) )? (otherlv_14= 'organizer' ( (lv_organizer_15_0= RULE_STR ) ) )? (otherlv_16= 'seq' ( (lv_seq_17_0= RULE_STR ) ) )? (otherlv_18= 'status' ( (lv_status_19_0= RULE_STR ) ) )? (otherlv_20= 'summary' ( (lv_summary_21_0= RULE_STR ) ) )? (otherlv_22= 'url' ( (lv_url_23_0= RULE_STR ) ) )? (otherlv_24= 'recurid' ( (lv_recurid_25_0= RULE_STR ) ) )? (otherlv_26= 'rrule' otherlv_27= '{' ( (lv_rrule_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )* otherlv_31= '}' )? (otherlv_32= 'attach' otherlv_33= '{' ( (lv_attach_34_0= RULE_STR ) ) (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )* otherlv_37= '}' )? (otherlv_38= 'attendee' otherlv_39= '{' ( (lv_attendee_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )* otherlv_43= '}' )? (otherlv_44= 'categories' otherlv_45= '{' ( (lv_categories_46_0= RULE_STR ) ) (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )* otherlv_49= '}' )? (otherlv_50= 'comment' otherlv_51= '{' ( (lv_comment_52_0= RULE_STR ) ) (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )* otherlv_55= '}' )? (otherlv_56= 'contact' otherlv_57= '{' ( (lv_contact_58_0= RULE_STR ) ) (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )* otherlv_61= '}' )? (otherlv_62= 'exdate' otherlv_63= '{' ( (lv_exdate_64_0= RULE_STR ) ) (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )* otherlv_67= '}' )? (otherlv_68= 'rstatus' otherlv_69= '{' ( (lv_rstatus_70_0= RULE_STR ) ) (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )* otherlv_73= '}' )? (otherlv_74= 'related' otherlv_75= '{' ( (lv_related_76_0= RULE_STR ) ) (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )* otherlv_79= '}' )? (otherlv_80= 'resources' otherlv_81= '{' ( (lv_resources_82_0= RULE_STR ) ) (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )* otherlv_85= '}' )? (otherlv_86= 'rdate' otherlv_87= '{' ( (lv_rdate_88_0= RULE_STR ) ) (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )* otherlv_91= '}' )? (otherlv_92= 'x_prop' otherlv_93= '{' ( (lv_x_prop_94_0= RULE_STR ) ) (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )* otherlv_97= '}' )? (otherlv_98= 'iana_prop' otherlv_99= '{' ( (lv_iana_prop_100_0= RULE_STR ) ) (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )* otherlv_103= '}' )? (otherlv_104= 'description' ( (lv_description_105_0= RULE_STR ) ) )? otherlv_106= '}' )
            {
            // InternalMyDsl.g:3814:2: (otherlv_0= 'JournalC' otherlv_1= '{' otherlv_2= 'dtstamp' ( (lv_dtstamp_3_0= RULE_STR ) ) otherlv_4= 'uid' ( (lv_uid_5_0= RULE_STR ) ) (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STR ) ) )? (otherlv_10= 'created' ( (lv_created_11_0= RULE_STR ) ) )? (otherlv_12= 'last_mod' ( (lv_last_mod_13_0= RULE_STR ) ) )? (otherlv_14= 'organizer' ( (lv_organizer_15_0= RULE_STR ) ) )? (otherlv_16= 'seq' ( (lv_seq_17_0= RULE_STR ) ) )? (otherlv_18= 'status' ( (lv_status_19_0= RULE_STR ) ) )? (otherlv_20= 'summary' ( (lv_summary_21_0= RULE_STR ) ) )? (otherlv_22= 'url' ( (lv_url_23_0= RULE_STR ) ) )? (otherlv_24= 'recurid' ( (lv_recurid_25_0= RULE_STR ) ) )? (otherlv_26= 'rrule' otherlv_27= '{' ( (lv_rrule_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )* otherlv_31= '}' )? (otherlv_32= 'attach' otherlv_33= '{' ( (lv_attach_34_0= RULE_STR ) ) (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )* otherlv_37= '}' )? (otherlv_38= 'attendee' otherlv_39= '{' ( (lv_attendee_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )* otherlv_43= '}' )? (otherlv_44= 'categories' otherlv_45= '{' ( (lv_categories_46_0= RULE_STR ) ) (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )* otherlv_49= '}' )? (otherlv_50= 'comment' otherlv_51= '{' ( (lv_comment_52_0= RULE_STR ) ) (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )* otherlv_55= '}' )? (otherlv_56= 'contact' otherlv_57= '{' ( (lv_contact_58_0= RULE_STR ) ) (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )* otherlv_61= '}' )? (otherlv_62= 'exdate' otherlv_63= '{' ( (lv_exdate_64_0= RULE_STR ) ) (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )* otherlv_67= '}' )? (otherlv_68= 'rstatus' otherlv_69= '{' ( (lv_rstatus_70_0= RULE_STR ) ) (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )* otherlv_73= '}' )? (otherlv_74= 'related' otherlv_75= '{' ( (lv_related_76_0= RULE_STR ) ) (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )* otherlv_79= '}' )? (otherlv_80= 'resources' otherlv_81= '{' ( (lv_resources_82_0= RULE_STR ) ) (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )* otherlv_85= '}' )? (otherlv_86= 'rdate' otherlv_87= '{' ( (lv_rdate_88_0= RULE_STR ) ) (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )* otherlv_91= '}' )? (otherlv_92= 'x_prop' otherlv_93= '{' ( (lv_x_prop_94_0= RULE_STR ) ) (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )* otherlv_97= '}' )? (otherlv_98= 'iana_prop' otherlv_99= '{' ( (lv_iana_prop_100_0= RULE_STR ) ) (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )* otherlv_103= '}' )? (otherlv_104= 'description' ( (lv_description_105_0= RULE_STR ) ) )? otherlv_106= '}' )
            // InternalMyDsl.g:3815:3: otherlv_0= 'JournalC' otherlv_1= '{' otherlv_2= 'dtstamp' ( (lv_dtstamp_3_0= RULE_STR ) ) otherlv_4= 'uid' ( (lv_uid_5_0= RULE_STR ) ) (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STR ) ) )? (otherlv_10= 'created' ( (lv_created_11_0= RULE_STR ) ) )? (otherlv_12= 'last_mod' ( (lv_last_mod_13_0= RULE_STR ) ) )? (otherlv_14= 'organizer' ( (lv_organizer_15_0= RULE_STR ) ) )? (otherlv_16= 'seq' ( (lv_seq_17_0= RULE_STR ) ) )? (otherlv_18= 'status' ( (lv_status_19_0= RULE_STR ) ) )? (otherlv_20= 'summary' ( (lv_summary_21_0= RULE_STR ) ) )? (otherlv_22= 'url' ( (lv_url_23_0= RULE_STR ) ) )? (otherlv_24= 'recurid' ( (lv_recurid_25_0= RULE_STR ) ) )? (otherlv_26= 'rrule' otherlv_27= '{' ( (lv_rrule_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )* otherlv_31= '}' )? (otherlv_32= 'attach' otherlv_33= '{' ( (lv_attach_34_0= RULE_STR ) ) (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )* otherlv_37= '}' )? (otherlv_38= 'attendee' otherlv_39= '{' ( (lv_attendee_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )* otherlv_43= '}' )? (otherlv_44= 'categories' otherlv_45= '{' ( (lv_categories_46_0= RULE_STR ) ) (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )* otherlv_49= '}' )? (otherlv_50= 'comment' otherlv_51= '{' ( (lv_comment_52_0= RULE_STR ) ) (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )* otherlv_55= '}' )? (otherlv_56= 'contact' otherlv_57= '{' ( (lv_contact_58_0= RULE_STR ) ) (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )* otherlv_61= '}' )? (otherlv_62= 'exdate' otherlv_63= '{' ( (lv_exdate_64_0= RULE_STR ) ) (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )* otherlv_67= '}' )? (otherlv_68= 'rstatus' otherlv_69= '{' ( (lv_rstatus_70_0= RULE_STR ) ) (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )* otherlv_73= '}' )? (otherlv_74= 'related' otherlv_75= '{' ( (lv_related_76_0= RULE_STR ) ) (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )* otherlv_79= '}' )? (otherlv_80= 'resources' otherlv_81= '{' ( (lv_resources_82_0= RULE_STR ) ) (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )* otherlv_85= '}' )? (otherlv_86= 'rdate' otherlv_87= '{' ( (lv_rdate_88_0= RULE_STR ) ) (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )* otherlv_91= '}' )? (otherlv_92= 'x_prop' otherlv_93= '{' ( (lv_x_prop_94_0= RULE_STR ) ) (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )* otherlv_97= '}' )? (otherlv_98= 'iana_prop' otherlv_99= '{' ( (lv_iana_prop_100_0= RULE_STR ) ) (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )* otherlv_103= '}' )? (otherlv_104= 'description' ( (lv_description_105_0= RULE_STR ) ) )? otherlv_106= '}'
            {
            otherlv_0=(Token)match(input,129,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getJournalCAccess().getJournalCKeyword_0());
            		
            otherlv_1=(Token)match(input,79,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,106,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getJournalCAccess().getDtstampKeyword_2());
            		
            // InternalMyDsl.g:3827:3: ( (lv_dtstamp_3_0= RULE_STR ) )
            // InternalMyDsl.g:3828:4: (lv_dtstamp_3_0= RULE_STR )
            {
            // InternalMyDsl.g:3828:4: (lv_dtstamp_3_0= RULE_STR )
            // InternalMyDsl.g:3829:5: lv_dtstamp_3_0= RULE_STR
            {
            lv_dtstamp_3_0=(Token)match(input,RULE_STR,FOLLOW_63); 

            					newLeafNode(lv_dtstamp_3_0, grammarAccess.getJournalCAccess().getDtstampSTRTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJournalCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dtstamp",
            						lv_dtstamp_3_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            otherlv_4=(Token)match(input,107,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getJournalCAccess().getUidKeyword_4());
            		
            // InternalMyDsl.g:3849:3: ( (lv_uid_5_0= RULE_STR ) )
            // InternalMyDsl.g:3850:4: (lv_uid_5_0= RULE_STR )
            {
            // InternalMyDsl.g:3850:4: (lv_uid_5_0= RULE_STR )
            // InternalMyDsl.g:3851:5: lv_uid_5_0= RULE_STR
            {
            lv_uid_5_0=(Token)match(input,RULE_STR,FOLLOW_94); 

            					newLeafNode(lv_uid_5_0, grammarAccess.getJournalCAccess().getUidSTRTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJournalCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uid",
            						lv_uid_5_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            // InternalMyDsl.g:3867:3: (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==87) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalMyDsl.g:3868:4: otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) )
                    {
                    otherlv_6=(Token)match(input,87,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getJournalCAccess().getDtstartKeyword_6_0());
                    			
                    // InternalMyDsl.g:3872:4: ( (lv_dtstart_7_0= ruleDateT ) )
                    // InternalMyDsl.g:3873:5: (lv_dtstart_7_0= ruleDateT )
                    {
                    // InternalMyDsl.g:3873:5: (lv_dtstart_7_0= ruleDateT )
                    // InternalMyDsl.g:3874:6: lv_dtstart_7_0= ruleDateT
                    {

                    						newCompositeNode(grammarAccess.getJournalCAccess().getDtstartDateTParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_95);
                    lv_dtstart_7_0=ruleDateT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJournalCRule());
                    						}
                    						set(
                    							current,
                    							"dtstart",
                    							lv_dtstart_7_0,
                    							"xCalendar.MyDsl.DateT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:3892:3: (otherlv_8= 'class' ( (lv_class_9_0= RULE_STR ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==108) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalMyDsl.g:3893:4: otherlv_8= 'class' ( (lv_class_9_0= RULE_STR ) )
                    {
                    otherlv_8=(Token)match(input,108,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getJournalCAccess().getClassKeyword_7_0());
                    			
                    // InternalMyDsl.g:3897:4: ( (lv_class_9_0= RULE_STR ) )
                    // InternalMyDsl.g:3898:5: (lv_class_9_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3898:5: (lv_class_9_0= RULE_STR )
                    // InternalMyDsl.g:3899:6: lv_class_9_0= RULE_STR
                    {
                    lv_class_9_0=(Token)match(input,RULE_STR,FOLLOW_96); 

                    						newLeafNode(lv_class_9_0, grammarAccess.getJournalCAccess().getClassSTRTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"class",
                    							lv_class_9_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:3916:3: (otherlv_10= 'created' ( (lv_created_11_0= RULE_STR ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==109) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalMyDsl.g:3917:4: otherlv_10= 'created' ( (lv_created_11_0= RULE_STR ) )
                    {
                    otherlv_10=(Token)match(input,109,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getJournalCAccess().getCreatedKeyword_8_0());
                    			
                    // InternalMyDsl.g:3921:4: ( (lv_created_11_0= RULE_STR ) )
                    // InternalMyDsl.g:3922:5: (lv_created_11_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3922:5: (lv_created_11_0= RULE_STR )
                    // InternalMyDsl.g:3923:6: lv_created_11_0= RULE_STR
                    {
                    lv_created_11_0=(Token)match(input,RULE_STR,FOLLOW_97); 

                    						newLeafNode(lv_created_11_0, grammarAccess.getJournalCAccess().getCreatedSTRTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"created",
                    							lv_created_11_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:3940:3: (otherlv_12= 'last_mod' ( (lv_last_mod_13_0= RULE_STR ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==110) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalMyDsl.g:3941:4: otherlv_12= 'last_mod' ( (lv_last_mod_13_0= RULE_STR ) )
                    {
                    otherlv_12=(Token)match(input,110,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getJournalCAccess().getLast_modKeyword_9_0());
                    			
                    // InternalMyDsl.g:3945:4: ( (lv_last_mod_13_0= RULE_STR ) )
                    // InternalMyDsl.g:3946:5: (lv_last_mod_13_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3946:5: (lv_last_mod_13_0= RULE_STR )
                    // InternalMyDsl.g:3947:6: lv_last_mod_13_0= RULE_STR
                    {
                    lv_last_mod_13_0=(Token)match(input,RULE_STR,FOLLOW_98); 

                    						newLeafNode(lv_last_mod_13_0, grammarAccess.getJournalCAccess().getLast_modSTRTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"last_mod",
                    							lv_last_mod_13_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:3964:3: (otherlv_14= 'organizer' ( (lv_organizer_15_0= RULE_STR ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==111) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalMyDsl.g:3965:4: otherlv_14= 'organizer' ( (lv_organizer_15_0= RULE_STR ) )
                    {
                    otherlv_14=(Token)match(input,111,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getJournalCAccess().getOrganizerKeyword_10_0());
                    			
                    // InternalMyDsl.g:3969:4: ( (lv_organizer_15_0= RULE_STR ) )
                    // InternalMyDsl.g:3970:5: (lv_organizer_15_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3970:5: (lv_organizer_15_0= RULE_STR )
                    // InternalMyDsl.g:3971:6: lv_organizer_15_0= RULE_STR
                    {
                    lv_organizer_15_0=(Token)match(input,RULE_STR,FOLLOW_99); 

                    						newLeafNode(lv_organizer_15_0, grammarAccess.getJournalCAccess().getOrganizerSTRTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"organizer",
                    							lv_organizer_15_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:3988:3: (otherlv_16= 'seq' ( (lv_seq_17_0= RULE_STR ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==112) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalMyDsl.g:3989:4: otherlv_16= 'seq' ( (lv_seq_17_0= RULE_STR ) )
                    {
                    otherlv_16=(Token)match(input,112,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getJournalCAccess().getSeqKeyword_11_0());
                    			
                    // InternalMyDsl.g:3993:4: ( (lv_seq_17_0= RULE_STR ) )
                    // InternalMyDsl.g:3994:5: (lv_seq_17_0= RULE_STR )
                    {
                    // InternalMyDsl.g:3994:5: (lv_seq_17_0= RULE_STR )
                    // InternalMyDsl.g:3995:6: lv_seq_17_0= RULE_STR
                    {
                    lv_seq_17_0=(Token)match(input,RULE_STR,FOLLOW_100); 

                    						newLeafNode(lv_seq_17_0, grammarAccess.getJournalCAccess().getSeqSTRTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"seq",
                    							lv_seq_17_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:4012:3: (otherlv_18= 'status' ( (lv_status_19_0= RULE_STR ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==113) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalMyDsl.g:4013:4: otherlv_18= 'status' ( (lv_status_19_0= RULE_STR ) )
                    {
                    otherlv_18=(Token)match(input,113,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getJournalCAccess().getStatusKeyword_12_0());
                    			
                    // InternalMyDsl.g:4017:4: ( (lv_status_19_0= RULE_STR ) )
                    // InternalMyDsl.g:4018:5: (lv_status_19_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4018:5: (lv_status_19_0= RULE_STR )
                    // InternalMyDsl.g:4019:6: lv_status_19_0= RULE_STR
                    {
                    lv_status_19_0=(Token)match(input,RULE_STR,FOLLOW_101); 

                    						newLeafNode(lv_status_19_0, grammarAccess.getJournalCAccess().getStatusSTRTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"status",
                    							lv_status_19_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:4036:3: (otherlv_20= 'summary' ( (lv_summary_21_0= RULE_STR ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==114) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalMyDsl.g:4037:4: otherlv_20= 'summary' ( (lv_summary_21_0= RULE_STR ) )
                    {
                    otherlv_20=(Token)match(input,114,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getJournalCAccess().getSummaryKeyword_13_0());
                    			
                    // InternalMyDsl.g:4041:4: ( (lv_summary_21_0= RULE_STR ) )
                    // InternalMyDsl.g:4042:5: (lv_summary_21_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4042:5: (lv_summary_21_0= RULE_STR )
                    // InternalMyDsl.g:4043:6: lv_summary_21_0= RULE_STR
                    {
                    lv_summary_21_0=(Token)match(input,RULE_STR,FOLLOW_102); 

                    						newLeafNode(lv_summary_21_0, grammarAccess.getJournalCAccess().getSummarySTRTerminalRuleCall_13_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"summary",
                    							lv_summary_21_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:4060:3: (otherlv_22= 'url' ( (lv_url_23_0= RULE_STR ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==115) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalMyDsl.g:4061:4: otherlv_22= 'url' ( (lv_url_23_0= RULE_STR ) )
                    {
                    otherlv_22=(Token)match(input,115,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getJournalCAccess().getUrlKeyword_14_0());
                    			
                    // InternalMyDsl.g:4065:4: ( (lv_url_23_0= RULE_STR ) )
                    // InternalMyDsl.g:4066:5: (lv_url_23_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4066:5: (lv_url_23_0= RULE_STR )
                    // InternalMyDsl.g:4067:6: lv_url_23_0= RULE_STR
                    {
                    lv_url_23_0=(Token)match(input,RULE_STR,FOLLOW_103); 

                    						newLeafNode(lv_url_23_0, grammarAccess.getJournalCAccess().getUrlSTRTerminalRuleCall_14_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_23_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:4084:3: (otherlv_24= 'recurid' ( (lv_recurid_25_0= RULE_STR ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==116) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalMyDsl.g:4085:4: otherlv_24= 'recurid' ( (lv_recurid_25_0= RULE_STR ) )
                    {
                    otherlv_24=(Token)match(input,116,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getJournalCAccess().getRecuridKeyword_15_0());
                    			
                    // InternalMyDsl.g:4089:4: ( (lv_recurid_25_0= RULE_STR ) )
                    // InternalMyDsl.g:4090:5: (lv_recurid_25_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4090:5: (lv_recurid_25_0= RULE_STR )
                    // InternalMyDsl.g:4091:6: lv_recurid_25_0= RULE_STR
                    {
                    lv_recurid_25_0=(Token)match(input,RULE_STR,FOLLOW_104); 

                    						newLeafNode(lv_recurid_25_0, grammarAccess.getJournalCAccess().getRecuridSTRTerminalRuleCall_15_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"recurid",
                    							lv_recurid_25_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:4108:3: (otherlv_26= 'rrule' otherlv_27= '{' ( (lv_rrule_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )* otherlv_31= '}' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==90) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalMyDsl.g:4109:4: otherlv_26= 'rrule' otherlv_27= '{' ( (lv_rrule_28_0= RULE_STR ) ) (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,90,FOLLOW_36); 

                    				newLeafNode(otherlv_26, grammarAccess.getJournalCAccess().getRruleKeyword_16_0());
                    			
                    otherlv_27=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalMyDsl.g:4117:4: ( (lv_rrule_28_0= RULE_STR ) )
                    // InternalMyDsl.g:4118:5: (lv_rrule_28_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4118:5: (lv_rrule_28_0= RULE_STR )
                    // InternalMyDsl.g:4119:6: lv_rrule_28_0= RULE_STR
                    {
                    lv_rrule_28_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_rrule_28_0, grammarAccess.getJournalCAccess().getRruleSTRTerminalRuleCall_16_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"rrule",
                    							lv_rrule_28_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:4135:4: (otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) ) )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==64) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // InternalMyDsl.g:4136:5: otherlv_29= ',' ( (lv_rrule_30_0= RULE_STR ) )
                    	    {
                    	    otherlv_29=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getJournalCAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalMyDsl.g:4140:5: ( (lv_rrule_30_0= RULE_STR ) )
                    	    // InternalMyDsl.g:4141:6: (lv_rrule_30_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:4141:6: (lv_rrule_30_0= RULE_STR )
                    	    // InternalMyDsl.g:4142:7: lv_rrule_30_0= RULE_STR
                    	    {
                    	    lv_rrule_30_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_rrule_30_0, grammarAccess.getJournalCAccess().getRruleSTRTerminalRuleCall_16_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJournalCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"rrule",
                    	    								lv_rrule_30_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,77,FOLLOW_105); 

                    				newLeafNode(otherlv_31, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4164:3: (otherlv_32= 'attach' otherlv_33= '{' ( (lv_attach_34_0= RULE_STR ) ) (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )* otherlv_37= '}' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==82) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalMyDsl.g:4165:4: otherlv_32= 'attach' otherlv_33= '{' ( (lv_attach_34_0= RULE_STR ) ) (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )* otherlv_37= '}'
                    {
                    otherlv_32=(Token)match(input,82,FOLLOW_36); 

                    				newLeafNode(otherlv_32, grammarAccess.getJournalCAccess().getAttachKeyword_17_0());
                    			
                    otherlv_33=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_33, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_17_1());
                    			
                    // InternalMyDsl.g:4173:4: ( (lv_attach_34_0= RULE_STR ) )
                    // InternalMyDsl.g:4174:5: (lv_attach_34_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4174:5: (lv_attach_34_0= RULE_STR )
                    // InternalMyDsl.g:4175:6: lv_attach_34_0= RULE_STR
                    {
                    lv_attach_34_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_attach_34_0, grammarAccess.getJournalCAccess().getAttachSTRTerminalRuleCall_17_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"attach",
                    							lv_attach_34_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:4191:4: (otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==64) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // InternalMyDsl.g:4192:5: otherlv_35= ',' ( (lv_attach_36_0= RULE_STR ) )
                    	    {
                    	    otherlv_35=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_35, grammarAccess.getJournalCAccess().getCommaKeyword_17_3_0());
                    	    				
                    	    // InternalMyDsl.g:4196:5: ( (lv_attach_36_0= RULE_STR ) )
                    	    // InternalMyDsl.g:4197:6: (lv_attach_36_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:4197:6: (lv_attach_36_0= RULE_STR )
                    	    // InternalMyDsl.g:4198:7: lv_attach_36_0= RULE_STR
                    	    {
                    	    lv_attach_36_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_attach_36_0, grammarAccess.getJournalCAccess().getAttachSTRTerminalRuleCall_17_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJournalCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"attach",
                    	    								lv_attach_36_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,77,FOLLOW_106); 

                    				newLeafNode(otherlv_37, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_17_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4220:3: (otherlv_38= 'attendee' otherlv_39= '{' ( (lv_attendee_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )* otherlv_43= '}' )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==104) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalMyDsl.g:4221:4: otherlv_38= 'attendee' otherlv_39= '{' ( (lv_attendee_40_0= RULE_STR ) ) (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )* otherlv_43= '}'
                    {
                    otherlv_38=(Token)match(input,104,FOLLOW_36); 

                    				newLeafNode(otherlv_38, grammarAccess.getJournalCAccess().getAttendeeKeyword_18_0());
                    			
                    otherlv_39=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_39, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_18_1());
                    			
                    // InternalMyDsl.g:4229:4: ( (lv_attendee_40_0= RULE_STR ) )
                    // InternalMyDsl.g:4230:5: (lv_attendee_40_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4230:5: (lv_attendee_40_0= RULE_STR )
                    // InternalMyDsl.g:4231:6: lv_attendee_40_0= RULE_STR
                    {
                    lv_attendee_40_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_attendee_40_0, grammarAccess.getJournalCAccess().getAttendeeSTRTerminalRuleCall_18_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"attendee",
                    							lv_attendee_40_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:4247:4: (otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==64) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // InternalMyDsl.g:4248:5: otherlv_41= ',' ( (lv_attendee_42_0= RULE_STR ) )
                    	    {
                    	    otherlv_41=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_41, grammarAccess.getJournalCAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalMyDsl.g:4252:5: ( (lv_attendee_42_0= RULE_STR ) )
                    	    // InternalMyDsl.g:4253:6: (lv_attendee_42_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:4253:6: (lv_attendee_42_0= RULE_STR )
                    	    // InternalMyDsl.g:4254:7: lv_attendee_42_0= RULE_STR
                    	    {
                    	    lv_attendee_42_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_attendee_42_0, grammarAccess.getJournalCAccess().getAttendeeSTRTerminalRuleCall_18_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJournalCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"attendee",
                    	    								lv_attendee_42_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);

                    otherlv_43=(Token)match(input,77,FOLLOW_107); 

                    				newLeafNode(otherlv_43, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_18_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4276:3: (otherlv_44= 'categories' otherlv_45= '{' ( (lv_categories_46_0= RULE_STR ) ) (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )* otherlv_49= '}' )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==117) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalMyDsl.g:4277:4: otherlv_44= 'categories' otherlv_45= '{' ( (lv_categories_46_0= RULE_STR ) ) (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )* otherlv_49= '}'
                    {
                    otherlv_44=(Token)match(input,117,FOLLOW_36); 

                    				newLeafNode(otherlv_44, grammarAccess.getJournalCAccess().getCategoriesKeyword_19_0());
                    			
                    otherlv_45=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_45, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_19_1());
                    			
                    // InternalMyDsl.g:4285:4: ( (lv_categories_46_0= RULE_STR ) )
                    // InternalMyDsl.g:4286:5: (lv_categories_46_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4286:5: (lv_categories_46_0= RULE_STR )
                    // InternalMyDsl.g:4287:6: lv_categories_46_0= RULE_STR
                    {
                    lv_categories_46_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_categories_46_0, grammarAccess.getJournalCAccess().getCategoriesSTRTerminalRuleCall_19_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"categories",
                    							lv_categories_46_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:4303:4: (otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) ) )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==64) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // InternalMyDsl.g:4304:5: otherlv_47= ',' ( (lv_categories_48_0= RULE_STR ) )
                    	    {
                    	    otherlv_47=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_47, grammarAccess.getJournalCAccess().getCommaKeyword_19_3_0());
                    	    				
                    	    // InternalMyDsl.g:4308:5: ( (lv_categories_48_0= RULE_STR ) )
                    	    // InternalMyDsl.g:4309:6: (lv_categories_48_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:4309:6: (lv_categories_48_0= RULE_STR )
                    	    // InternalMyDsl.g:4310:7: lv_categories_48_0= RULE_STR
                    	    {
                    	    lv_categories_48_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_categories_48_0, grammarAccess.getJournalCAccess().getCategoriesSTRTerminalRuleCall_19_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJournalCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"categories",
                    	    								lv_categories_48_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop121;
                        }
                    } while (true);

                    otherlv_49=(Token)match(input,77,FOLLOW_108); 

                    				newLeafNode(otherlv_49, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_19_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4332:3: (otherlv_50= 'comment' otherlv_51= '{' ( (lv_comment_52_0= RULE_STR ) ) (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )* otherlv_55= '}' )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==93) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalMyDsl.g:4333:4: otherlv_50= 'comment' otherlv_51= '{' ( (lv_comment_52_0= RULE_STR ) ) (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )* otherlv_55= '}'
                    {
                    otherlv_50=(Token)match(input,93,FOLLOW_36); 

                    				newLeafNode(otherlv_50, grammarAccess.getJournalCAccess().getCommentKeyword_20_0());
                    			
                    otherlv_51=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_51, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_20_1());
                    			
                    // InternalMyDsl.g:4341:4: ( (lv_comment_52_0= RULE_STR ) )
                    // InternalMyDsl.g:4342:5: (lv_comment_52_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4342:5: (lv_comment_52_0= RULE_STR )
                    // InternalMyDsl.g:4343:6: lv_comment_52_0= RULE_STR
                    {
                    lv_comment_52_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_comment_52_0, grammarAccess.getJournalCAccess().getCommentSTRTerminalRuleCall_20_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"comment",
                    							lv_comment_52_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:4359:4: (otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==64) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // InternalMyDsl.g:4360:5: otherlv_53= ',' ( (lv_comment_54_0= RULE_STR ) )
                    	    {
                    	    otherlv_53=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_53, grammarAccess.getJournalCAccess().getCommaKeyword_20_3_0());
                    	    				
                    	    // InternalMyDsl.g:4364:5: ( (lv_comment_54_0= RULE_STR ) )
                    	    // InternalMyDsl.g:4365:6: (lv_comment_54_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:4365:6: (lv_comment_54_0= RULE_STR )
                    	    // InternalMyDsl.g:4366:7: lv_comment_54_0= RULE_STR
                    	    {
                    	    lv_comment_54_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_comment_54_0, grammarAccess.getJournalCAccess().getCommentSTRTerminalRuleCall_20_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJournalCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"comment",
                    	    								lv_comment_54_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);

                    otherlv_55=(Token)match(input,77,FOLLOW_109); 

                    				newLeafNode(otherlv_55, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_20_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4388:3: (otherlv_56= 'contact' otherlv_57= '{' ( (lv_contact_58_0= RULE_STR ) ) (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )* otherlv_61= '}' )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==118) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalMyDsl.g:4389:4: otherlv_56= 'contact' otherlv_57= '{' ( (lv_contact_58_0= RULE_STR ) ) (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )* otherlv_61= '}'
                    {
                    otherlv_56=(Token)match(input,118,FOLLOW_36); 

                    				newLeafNode(otherlv_56, grammarAccess.getJournalCAccess().getContactKeyword_21_0());
                    			
                    otherlv_57=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_57, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_21_1());
                    			
                    // InternalMyDsl.g:4397:4: ( (lv_contact_58_0= RULE_STR ) )
                    // InternalMyDsl.g:4398:5: (lv_contact_58_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4398:5: (lv_contact_58_0= RULE_STR )
                    // InternalMyDsl.g:4399:6: lv_contact_58_0= RULE_STR
                    {
                    lv_contact_58_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_contact_58_0, grammarAccess.getJournalCAccess().getContactSTRTerminalRuleCall_21_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"contact",
                    							lv_contact_58_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:4415:4: (otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) ) )*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==64) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // InternalMyDsl.g:4416:5: otherlv_59= ',' ( (lv_contact_60_0= RULE_STR ) )
                    	    {
                    	    otherlv_59=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_59, grammarAccess.getJournalCAccess().getCommaKeyword_21_3_0());
                    	    				
                    	    // InternalMyDsl.g:4420:5: ( (lv_contact_60_0= RULE_STR ) )
                    	    // InternalMyDsl.g:4421:6: (lv_contact_60_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:4421:6: (lv_contact_60_0= RULE_STR )
                    	    // InternalMyDsl.g:4422:7: lv_contact_60_0= RULE_STR
                    	    {
                    	    lv_contact_60_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_contact_60_0, grammarAccess.getJournalCAccess().getContactSTRTerminalRuleCall_21_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJournalCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"contact",
                    	    								lv_contact_60_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop125;
                        }
                    } while (true);

                    otherlv_61=(Token)match(input,77,FOLLOW_110); 

                    				newLeafNode(otherlv_61, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_21_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4444:3: (otherlv_62= 'exdate' otherlv_63= '{' ( (lv_exdate_64_0= RULE_STR ) ) (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )* otherlv_67= '}' )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==119) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalMyDsl.g:4445:4: otherlv_62= 'exdate' otherlv_63= '{' ( (lv_exdate_64_0= RULE_STR ) ) (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )* otherlv_67= '}'
                    {
                    otherlv_62=(Token)match(input,119,FOLLOW_36); 

                    				newLeafNode(otherlv_62, grammarAccess.getJournalCAccess().getExdateKeyword_22_0());
                    			
                    otherlv_63=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_63, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_22_1());
                    			
                    // InternalMyDsl.g:4453:4: ( (lv_exdate_64_0= RULE_STR ) )
                    // InternalMyDsl.g:4454:5: (lv_exdate_64_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4454:5: (lv_exdate_64_0= RULE_STR )
                    // InternalMyDsl.g:4455:6: lv_exdate_64_0= RULE_STR
                    {
                    lv_exdate_64_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_exdate_64_0, grammarAccess.getJournalCAccess().getExdateSTRTerminalRuleCall_22_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"exdate",
                    							lv_exdate_64_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:4471:4: (otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) ) )*
                    loop127:
                    do {
                        int alt127=2;
                        int LA127_0 = input.LA(1);

                        if ( (LA127_0==64) ) {
                            alt127=1;
                        }


                        switch (alt127) {
                    	case 1 :
                    	    // InternalMyDsl.g:4472:5: otherlv_65= ',' ( (lv_exdate_66_0= RULE_STR ) )
                    	    {
                    	    otherlv_65=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_65, grammarAccess.getJournalCAccess().getCommaKeyword_22_3_0());
                    	    				
                    	    // InternalMyDsl.g:4476:5: ( (lv_exdate_66_0= RULE_STR ) )
                    	    // InternalMyDsl.g:4477:6: (lv_exdate_66_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:4477:6: (lv_exdate_66_0= RULE_STR )
                    	    // InternalMyDsl.g:4478:7: lv_exdate_66_0= RULE_STR
                    	    {
                    	    lv_exdate_66_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_exdate_66_0, grammarAccess.getJournalCAccess().getExdateSTRTerminalRuleCall_22_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJournalCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"exdate",
                    	    								lv_exdate_66_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop127;
                        }
                    } while (true);

                    otherlv_67=(Token)match(input,77,FOLLOW_111); 

                    				newLeafNode(otherlv_67, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_22_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4500:3: (otherlv_68= 'rstatus' otherlv_69= '{' ( (lv_rstatus_70_0= RULE_STR ) ) (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )* otherlv_73= '}' )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==120) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalMyDsl.g:4501:4: otherlv_68= 'rstatus' otherlv_69= '{' ( (lv_rstatus_70_0= RULE_STR ) ) (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )* otherlv_73= '}'
                    {
                    otherlv_68=(Token)match(input,120,FOLLOW_36); 

                    				newLeafNode(otherlv_68, grammarAccess.getJournalCAccess().getRstatusKeyword_23_0());
                    			
                    otherlv_69=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_69, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_23_1());
                    			
                    // InternalMyDsl.g:4509:4: ( (lv_rstatus_70_0= RULE_STR ) )
                    // InternalMyDsl.g:4510:5: (lv_rstatus_70_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4510:5: (lv_rstatus_70_0= RULE_STR )
                    // InternalMyDsl.g:4511:6: lv_rstatus_70_0= RULE_STR
                    {
                    lv_rstatus_70_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_rstatus_70_0, grammarAccess.getJournalCAccess().getRstatusSTRTerminalRuleCall_23_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"rstatus",
                    							lv_rstatus_70_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:4527:4: (otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) ) )*
                    loop129:
                    do {
                        int alt129=2;
                        int LA129_0 = input.LA(1);

                        if ( (LA129_0==64) ) {
                            alt129=1;
                        }


                        switch (alt129) {
                    	case 1 :
                    	    // InternalMyDsl.g:4528:5: otherlv_71= ',' ( (lv_rstatus_72_0= RULE_STR ) )
                    	    {
                    	    otherlv_71=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_71, grammarAccess.getJournalCAccess().getCommaKeyword_23_3_0());
                    	    				
                    	    // InternalMyDsl.g:4532:5: ( (lv_rstatus_72_0= RULE_STR ) )
                    	    // InternalMyDsl.g:4533:6: (lv_rstatus_72_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:4533:6: (lv_rstatus_72_0= RULE_STR )
                    	    // InternalMyDsl.g:4534:7: lv_rstatus_72_0= RULE_STR
                    	    {
                    	    lv_rstatus_72_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_rstatus_72_0, grammarAccess.getJournalCAccess().getRstatusSTRTerminalRuleCall_23_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJournalCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"rstatus",
                    	    								lv_rstatus_72_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop129;
                        }
                    } while (true);

                    otherlv_73=(Token)match(input,77,FOLLOW_112); 

                    				newLeafNode(otherlv_73, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_23_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4556:3: (otherlv_74= 'related' otherlv_75= '{' ( (lv_related_76_0= RULE_STR ) ) (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )* otherlv_79= '}' )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==121) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalMyDsl.g:4557:4: otherlv_74= 'related' otherlv_75= '{' ( (lv_related_76_0= RULE_STR ) ) (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )* otherlv_79= '}'
                    {
                    otherlv_74=(Token)match(input,121,FOLLOW_36); 

                    				newLeafNode(otherlv_74, grammarAccess.getJournalCAccess().getRelatedKeyword_24_0());
                    			
                    otherlv_75=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_75, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_24_1());
                    			
                    // InternalMyDsl.g:4565:4: ( (lv_related_76_0= RULE_STR ) )
                    // InternalMyDsl.g:4566:5: (lv_related_76_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4566:5: (lv_related_76_0= RULE_STR )
                    // InternalMyDsl.g:4567:6: lv_related_76_0= RULE_STR
                    {
                    lv_related_76_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_related_76_0, grammarAccess.getJournalCAccess().getRelatedSTRTerminalRuleCall_24_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"related",
                    							lv_related_76_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:4583:4: (otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==64) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // InternalMyDsl.g:4584:5: otherlv_77= ',' ( (lv_related_78_0= RULE_STR ) )
                    	    {
                    	    otherlv_77=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_77, grammarAccess.getJournalCAccess().getCommaKeyword_24_3_0());
                    	    				
                    	    // InternalMyDsl.g:4588:5: ( (lv_related_78_0= RULE_STR ) )
                    	    // InternalMyDsl.g:4589:6: (lv_related_78_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:4589:6: (lv_related_78_0= RULE_STR )
                    	    // InternalMyDsl.g:4590:7: lv_related_78_0= RULE_STR
                    	    {
                    	    lv_related_78_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_related_78_0, grammarAccess.getJournalCAccess().getRelatedSTRTerminalRuleCall_24_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJournalCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"related",
                    	    								lv_related_78_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop131;
                        }
                    } while (true);

                    otherlv_79=(Token)match(input,77,FOLLOW_113); 

                    				newLeafNode(otherlv_79, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_24_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4612:3: (otherlv_80= 'resources' otherlv_81= '{' ( (lv_resources_82_0= RULE_STR ) ) (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )* otherlv_85= '}' )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==122) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalMyDsl.g:4613:4: otherlv_80= 'resources' otherlv_81= '{' ( (lv_resources_82_0= RULE_STR ) ) (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )* otherlv_85= '}'
                    {
                    otherlv_80=(Token)match(input,122,FOLLOW_36); 

                    				newLeafNode(otherlv_80, grammarAccess.getJournalCAccess().getResourcesKeyword_25_0());
                    			
                    otherlv_81=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_81, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_25_1());
                    			
                    // InternalMyDsl.g:4621:4: ( (lv_resources_82_0= RULE_STR ) )
                    // InternalMyDsl.g:4622:5: (lv_resources_82_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4622:5: (lv_resources_82_0= RULE_STR )
                    // InternalMyDsl.g:4623:6: lv_resources_82_0= RULE_STR
                    {
                    lv_resources_82_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_resources_82_0, grammarAccess.getJournalCAccess().getResourcesSTRTerminalRuleCall_25_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"resources",
                    							lv_resources_82_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:4639:4: (otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) ) )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==64) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // InternalMyDsl.g:4640:5: otherlv_83= ',' ( (lv_resources_84_0= RULE_STR ) )
                    	    {
                    	    otherlv_83=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_83, grammarAccess.getJournalCAccess().getCommaKeyword_25_3_0());
                    	    				
                    	    // InternalMyDsl.g:4644:5: ( (lv_resources_84_0= RULE_STR ) )
                    	    // InternalMyDsl.g:4645:6: (lv_resources_84_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:4645:6: (lv_resources_84_0= RULE_STR )
                    	    // InternalMyDsl.g:4646:7: lv_resources_84_0= RULE_STR
                    	    {
                    	    lv_resources_84_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_resources_84_0, grammarAccess.getJournalCAccess().getResourcesSTRTerminalRuleCall_25_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJournalCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"resources",
                    	    								lv_resources_84_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop133;
                        }
                    } while (true);

                    otherlv_85=(Token)match(input,77,FOLLOW_114); 

                    				newLeafNode(otherlv_85, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_25_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4668:3: (otherlv_86= 'rdate' otherlv_87= '{' ( (lv_rdate_88_0= RULE_STR ) ) (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )* otherlv_91= '}' )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==94) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalMyDsl.g:4669:4: otherlv_86= 'rdate' otherlv_87= '{' ( (lv_rdate_88_0= RULE_STR ) ) (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )* otherlv_91= '}'
                    {
                    otherlv_86=(Token)match(input,94,FOLLOW_36); 

                    				newLeafNode(otherlv_86, grammarAccess.getJournalCAccess().getRdateKeyword_26_0());
                    			
                    otherlv_87=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_87, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_26_1());
                    			
                    // InternalMyDsl.g:4677:4: ( (lv_rdate_88_0= RULE_STR ) )
                    // InternalMyDsl.g:4678:5: (lv_rdate_88_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4678:5: (lv_rdate_88_0= RULE_STR )
                    // InternalMyDsl.g:4679:6: lv_rdate_88_0= RULE_STR
                    {
                    lv_rdate_88_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_rdate_88_0, grammarAccess.getJournalCAccess().getRdateSTRTerminalRuleCall_26_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"rdate",
                    							lv_rdate_88_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:4695:4: (otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) ) )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==64) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // InternalMyDsl.g:4696:5: otherlv_89= ',' ( (lv_rdate_90_0= RULE_STR ) )
                    	    {
                    	    otherlv_89=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_89, grammarAccess.getJournalCAccess().getCommaKeyword_26_3_0());
                    	    				
                    	    // InternalMyDsl.g:4700:5: ( (lv_rdate_90_0= RULE_STR ) )
                    	    // InternalMyDsl.g:4701:6: (lv_rdate_90_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:4701:6: (lv_rdate_90_0= RULE_STR )
                    	    // InternalMyDsl.g:4702:7: lv_rdate_90_0= RULE_STR
                    	    {
                    	    lv_rdate_90_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_rdate_90_0, grammarAccess.getJournalCAccess().getRdateSTRTerminalRuleCall_26_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJournalCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"rdate",
                    	    								lv_rdate_90_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);

                    otherlv_91=(Token)match(input,77,FOLLOW_115); 

                    				newLeafNode(otherlv_91, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_26_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4724:3: (otherlv_92= 'x_prop' otherlv_93= '{' ( (lv_x_prop_94_0= RULE_STR ) ) (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )* otherlv_97= '}' )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==96) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalMyDsl.g:4725:4: otherlv_92= 'x_prop' otherlv_93= '{' ( (lv_x_prop_94_0= RULE_STR ) ) (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )* otherlv_97= '}'
                    {
                    otherlv_92=(Token)match(input,96,FOLLOW_36); 

                    				newLeafNode(otherlv_92, grammarAccess.getJournalCAccess().getX_propKeyword_27_0());
                    			
                    otherlv_93=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_93, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_27_1());
                    			
                    // InternalMyDsl.g:4733:4: ( (lv_x_prop_94_0= RULE_STR ) )
                    // InternalMyDsl.g:4734:5: (lv_x_prop_94_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4734:5: (lv_x_prop_94_0= RULE_STR )
                    // InternalMyDsl.g:4735:6: lv_x_prop_94_0= RULE_STR
                    {
                    lv_x_prop_94_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_x_prop_94_0, grammarAccess.getJournalCAccess().getX_propSTRTerminalRuleCall_27_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"x_prop",
                    							lv_x_prop_94_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:4751:4: (otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) ) )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==64) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // InternalMyDsl.g:4752:5: otherlv_95= ',' ( (lv_x_prop_96_0= RULE_STR ) )
                    	    {
                    	    otherlv_95=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_95, grammarAccess.getJournalCAccess().getCommaKeyword_27_3_0());
                    	    				
                    	    // InternalMyDsl.g:4756:5: ( (lv_x_prop_96_0= RULE_STR ) )
                    	    // InternalMyDsl.g:4757:6: (lv_x_prop_96_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:4757:6: (lv_x_prop_96_0= RULE_STR )
                    	    // InternalMyDsl.g:4758:7: lv_x_prop_96_0= RULE_STR
                    	    {
                    	    lv_x_prop_96_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_x_prop_96_0, grammarAccess.getJournalCAccess().getX_propSTRTerminalRuleCall_27_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJournalCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"x_prop",
                    	    								lv_x_prop_96_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);

                    otherlv_97=(Token)match(input,77,FOLLOW_116); 

                    				newLeafNode(otherlv_97, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_27_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4780:3: (otherlv_98= 'iana_prop' otherlv_99= '{' ( (lv_iana_prop_100_0= RULE_STR ) ) (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )* otherlv_103= '}' )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==97) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalMyDsl.g:4781:4: otherlv_98= 'iana_prop' otherlv_99= '{' ( (lv_iana_prop_100_0= RULE_STR ) ) (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )* otherlv_103= '}'
                    {
                    otherlv_98=(Token)match(input,97,FOLLOW_36); 

                    				newLeafNode(otherlv_98, grammarAccess.getJournalCAccess().getIana_propKeyword_28_0());
                    			
                    otherlv_99=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_99, grammarAccess.getJournalCAccess().getLeftCurlyBracketKeyword_28_1());
                    			
                    // InternalMyDsl.g:4789:4: ( (lv_iana_prop_100_0= RULE_STR ) )
                    // InternalMyDsl.g:4790:5: (lv_iana_prop_100_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4790:5: (lv_iana_prop_100_0= RULE_STR )
                    // InternalMyDsl.g:4791:6: lv_iana_prop_100_0= RULE_STR
                    {
                    lv_iana_prop_100_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_iana_prop_100_0, grammarAccess.getJournalCAccess().getIana_propSTRTerminalRuleCall_28_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"iana_prop",
                    							lv_iana_prop_100_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:4807:4: (otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) ) )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==64) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // InternalMyDsl.g:4808:5: otherlv_101= ',' ( (lv_iana_prop_102_0= RULE_STR ) )
                    	    {
                    	    otherlv_101=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_101, grammarAccess.getJournalCAccess().getCommaKeyword_28_3_0());
                    	    				
                    	    // InternalMyDsl.g:4812:5: ( (lv_iana_prop_102_0= RULE_STR ) )
                    	    // InternalMyDsl.g:4813:6: (lv_iana_prop_102_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:4813:6: (lv_iana_prop_102_0= RULE_STR )
                    	    // InternalMyDsl.g:4814:7: lv_iana_prop_102_0= RULE_STR
                    	    {
                    	    lv_iana_prop_102_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_iana_prop_102_0, grammarAccess.getJournalCAccess().getIana_propSTRTerminalRuleCall_28_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJournalCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"iana_prop",
                    	    								lv_iana_prop_102_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);

                    otherlv_103=(Token)match(input,77,FOLLOW_117); 

                    				newLeafNode(otherlv_103, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_28_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4836:3: (otherlv_104= 'description' ( (lv_description_105_0= RULE_STR ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==83) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalMyDsl.g:4837:4: otherlv_104= 'description' ( (lv_description_105_0= RULE_STR ) )
                    {
                    otherlv_104=(Token)match(input,83,FOLLOW_3); 

                    				newLeafNode(otherlv_104, grammarAccess.getJournalCAccess().getDescriptionKeyword_29_0());
                    			
                    // InternalMyDsl.g:4841:4: ( (lv_description_105_0= RULE_STR ) )
                    // InternalMyDsl.g:4842:5: (lv_description_105_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4842:5: (lv_description_105_0= RULE_STR )
                    // InternalMyDsl.g:4843:6: lv_description_105_0= RULE_STR
                    {
                    lv_description_105_0=(Token)match(input,RULE_STR,FOLLOW_35); 

                    						newLeafNode(lv_description_105_0, grammarAccess.getJournalCAccess().getDescriptionSTRTerminalRuleCall_29_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJournalCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_105_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_106=(Token)match(input,77,FOLLOW_2); 

            			newLeafNode(otherlv_106, grammarAccess.getJournalCAccess().getRightCurlyBracketKeyword_30());
            		

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
    // $ANTLR end "ruleJournalC"


    // $ANTLR start "entryRuleVacationC"
    // InternalMyDsl.g:4868:1: entryRuleVacationC returns [EObject current=null] : iv_ruleVacationC= ruleVacationC EOF ;
    public final EObject entryRuleVacationC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVacationC = null;


        try {
            // InternalMyDsl.g:4868:50: (iv_ruleVacationC= ruleVacationC EOF )
            // InternalMyDsl.g:4869:2: iv_ruleVacationC= ruleVacationC EOF
            {
             newCompositeNode(grammarAccess.getVacationCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVacationC=ruleVacationC();

            state._fsp--;

             current =iv_ruleVacationC; 
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
    // $ANTLR end "entryRuleVacationC"


    // $ANTLR start "ruleVacationC"
    // InternalMyDsl.g:4875:1: ruleVacationC returns [EObject current=null] : (otherlv_0= 'VacationC' otherlv_1= '{' otherlv_2= 'dtstamp' ( (lv_dtstamp_3_0= RULE_STR ) ) otherlv_4= 'uid' ( (lv_uid_5_0= RULE_STR ) ) (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )? (otherlv_8= 'organizer' ( (lv_organizer_9_0= RULE_STR ) ) )? (otherlv_10= 'url' ( (lv_url_11_0= RULE_STR ) ) )? (otherlv_12= 'contact' ( (lv_contact_13_0= RULE_STR ) ) )? (otherlv_14= 'dtend' ( (lv_dtend_15_0= RULE_STR ) ) )? (otherlv_16= 'attendee' otherlv_17= '{' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* otherlv_21= '}' )? (otherlv_22= 'comment' otherlv_23= '{' ( (lv_comment_24_0= RULE_STR ) ) (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )* otherlv_27= '}' )? (otherlv_28= 'freebusy' otherlv_29= '{' ( (lv_freebusy_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_freebusy_32_0= RULE_STR ) ) )* otherlv_33= '}' )? (otherlv_34= 'rstatus' otherlv_35= '{' ( (lv_rstatus_36_0= RULE_STR ) ) (otherlv_37= ',' ( (lv_rstatus_38_0= RULE_STR ) ) )* otherlv_39= '}' )? (otherlv_40= 'x_prop' otherlv_41= '{' ( (lv_x_prop_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_x_prop_44_0= RULE_STR ) ) )* otherlv_45= '}' )? (otherlv_46= 'iana_prop' otherlv_47= '{' ( (lv_iana_prop_48_0= RULE_STR ) ) (otherlv_49= ',' ( (lv_iana_prop_50_0= RULE_STR ) ) )* otherlv_51= '}' )? otherlv_52= '}' ) ;
    public final EObject ruleVacationC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_dtstamp_3_0=null;
        Token otherlv_4=null;
        Token lv_uid_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_organizer_9_0=null;
        Token otherlv_10=null;
        Token lv_url_11_0=null;
        Token otherlv_12=null;
        Token lv_contact_13_0=null;
        Token otherlv_14=null;
        Token lv_dtend_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_attendee_18_0=null;
        Token otherlv_19=null;
        Token lv_attendee_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_comment_24_0=null;
        Token otherlv_25=null;
        Token lv_comment_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token lv_freebusy_30_0=null;
        Token otherlv_31=null;
        Token lv_freebusy_32_0=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token lv_rstatus_36_0=null;
        Token otherlv_37=null;
        Token lv_rstatus_38_0=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token lv_x_prop_42_0=null;
        Token otherlv_43=null;
        Token lv_x_prop_44_0=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token lv_iana_prop_48_0=null;
        Token otherlv_49=null;
        Token lv_iana_prop_50_0=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        EObject lv_dtstart_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4881:2: ( (otherlv_0= 'VacationC' otherlv_1= '{' otherlv_2= 'dtstamp' ( (lv_dtstamp_3_0= RULE_STR ) ) otherlv_4= 'uid' ( (lv_uid_5_0= RULE_STR ) ) (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )? (otherlv_8= 'organizer' ( (lv_organizer_9_0= RULE_STR ) ) )? (otherlv_10= 'url' ( (lv_url_11_0= RULE_STR ) ) )? (otherlv_12= 'contact' ( (lv_contact_13_0= RULE_STR ) ) )? (otherlv_14= 'dtend' ( (lv_dtend_15_0= RULE_STR ) ) )? (otherlv_16= 'attendee' otherlv_17= '{' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* otherlv_21= '}' )? (otherlv_22= 'comment' otherlv_23= '{' ( (lv_comment_24_0= RULE_STR ) ) (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )* otherlv_27= '}' )? (otherlv_28= 'freebusy' otherlv_29= '{' ( (lv_freebusy_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_freebusy_32_0= RULE_STR ) ) )* otherlv_33= '}' )? (otherlv_34= 'rstatus' otherlv_35= '{' ( (lv_rstatus_36_0= RULE_STR ) ) (otherlv_37= ',' ( (lv_rstatus_38_0= RULE_STR ) ) )* otherlv_39= '}' )? (otherlv_40= 'x_prop' otherlv_41= '{' ( (lv_x_prop_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_x_prop_44_0= RULE_STR ) ) )* otherlv_45= '}' )? (otherlv_46= 'iana_prop' otherlv_47= '{' ( (lv_iana_prop_48_0= RULE_STR ) ) (otherlv_49= ',' ( (lv_iana_prop_50_0= RULE_STR ) ) )* otherlv_51= '}' )? otherlv_52= '}' ) )
            // InternalMyDsl.g:4882:2: (otherlv_0= 'VacationC' otherlv_1= '{' otherlv_2= 'dtstamp' ( (lv_dtstamp_3_0= RULE_STR ) ) otherlv_4= 'uid' ( (lv_uid_5_0= RULE_STR ) ) (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )? (otherlv_8= 'organizer' ( (lv_organizer_9_0= RULE_STR ) ) )? (otherlv_10= 'url' ( (lv_url_11_0= RULE_STR ) ) )? (otherlv_12= 'contact' ( (lv_contact_13_0= RULE_STR ) ) )? (otherlv_14= 'dtend' ( (lv_dtend_15_0= RULE_STR ) ) )? (otherlv_16= 'attendee' otherlv_17= '{' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* otherlv_21= '}' )? (otherlv_22= 'comment' otherlv_23= '{' ( (lv_comment_24_0= RULE_STR ) ) (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )* otherlv_27= '}' )? (otherlv_28= 'freebusy' otherlv_29= '{' ( (lv_freebusy_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_freebusy_32_0= RULE_STR ) ) )* otherlv_33= '}' )? (otherlv_34= 'rstatus' otherlv_35= '{' ( (lv_rstatus_36_0= RULE_STR ) ) (otherlv_37= ',' ( (lv_rstatus_38_0= RULE_STR ) ) )* otherlv_39= '}' )? (otherlv_40= 'x_prop' otherlv_41= '{' ( (lv_x_prop_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_x_prop_44_0= RULE_STR ) ) )* otherlv_45= '}' )? (otherlv_46= 'iana_prop' otherlv_47= '{' ( (lv_iana_prop_48_0= RULE_STR ) ) (otherlv_49= ',' ( (lv_iana_prop_50_0= RULE_STR ) ) )* otherlv_51= '}' )? otherlv_52= '}' )
            {
            // InternalMyDsl.g:4882:2: (otherlv_0= 'VacationC' otherlv_1= '{' otherlv_2= 'dtstamp' ( (lv_dtstamp_3_0= RULE_STR ) ) otherlv_4= 'uid' ( (lv_uid_5_0= RULE_STR ) ) (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )? (otherlv_8= 'organizer' ( (lv_organizer_9_0= RULE_STR ) ) )? (otherlv_10= 'url' ( (lv_url_11_0= RULE_STR ) ) )? (otherlv_12= 'contact' ( (lv_contact_13_0= RULE_STR ) ) )? (otherlv_14= 'dtend' ( (lv_dtend_15_0= RULE_STR ) ) )? (otherlv_16= 'attendee' otherlv_17= '{' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* otherlv_21= '}' )? (otherlv_22= 'comment' otherlv_23= '{' ( (lv_comment_24_0= RULE_STR ) ) (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )* otherlv_27= '}' )? (otherlv_28= 'freebusy' otherlv_29= '{' ( (lv_freebusy_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_freebusy_32_0= RULE_STR ) ) )* otherlv_33= '}' )? (otherlv_34= 'rstatus' otherlv_35= '{' ( (lv_rstatus_36_0= RULE_STR ) ) (otherlv_37= ',' ( (lv_rstatus_38_0= RULE_STR ) ) )* otherlv_39= '}' )? (otherlv_40= 'x_prop' otherlv_41= '{' ( (lv_x_prop_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_x_prop_44_0= RULE_STR ) ) )* otherlv_45= '}' )? (otherlv_46= 'iana_prop' otherlv_47= '{' ( (lv_iana_prop_48_0= RULE_STR ) ) (otherlv_49= ',' ( (lv_iana_prop_50_0= RULE_STR ) ) )* otherlv_51= '}' )? otherlv_52= '}' )
            // InternalMyDsl.g:4883:3: otherlv_0= 'VacationC' otherlv_1= '{' otherlv_2= 'dtstamp' ( (lv_dtstamp_3_0= RULE_STR ) ) otherlv_4= 'uid' ( (lv_uid_5_0= RULE_STR ) ) (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )? (otherlv_8= 'organizer' ( (lv_organizer_9_0= RULE_STR ) ) )? (otherlv_10= 'url' ( (lv_url_11_0= RULE_STR ) ) )? (otherlv_12= 'contact' ( (lv_contact_13_0= RULE_STR ) ) )? (otherlv_14= 'dtend' ( (lv_dtend_15_0= RULE_STR ) ) )? (otherlv_16= 'attendee' otherlv_17= '{' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* otherlv_21= '}' )? (otherlv_22= 'comment' otherlv_23= '{' ( (lv_comment_24_0= RULE_STR ) ) (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )* otherlv_27= '}' )? (otherlv_28= 'freebusy' otherlv_29= '{' ( (lv_freebusy_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_freebusy_32_0= RULE_STR ) ) )* otherlv_33= '}' )? (otherlv_34= 'rstatus' otherlv_35= '{' ( (lv_rstatus_36_0= RULE_STR ) ) (otherlv_37= ',' ( (lv_rstatus_38_0= RULE_STR ) ) )* otherlv_39= '}' )? (otherlv_40= 'x_prop' otherlv_41= '{' ( (lv_x_prop_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_x_prop_44_0= RULE_STR ) ) )* otherlv_45= '}' )? (otherlv_46= 'iana_prop' otherlv_47= '{' ( (lv_iana_prop_48_0= RULE_STR ) ) (otherlv_49= ',' ( (lv_iana_prop_50_0= RULE_STR ) ) )* otherlv_51= '}' )? otherlv_52= '}'
            {
            otherlv_0=(Token)match(input,130,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getVacationCAccess().getVacationCKeyword_0());
            		
            otherlv_1=(Token)match(input,79,FOLLOW_62); 

            			newLeafNode(otherlv_1, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,106,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getVacationCAccess().getDtstampKeyword_2());
            		
            // InternalMyDsl.g:4895:3: ( (lv_dtstamp_3_0= RULE_STR ) )
            // InternalMyDsl.g:4896:4: (lv_dtstamp_3_0= RULE_STR )
            {
            // InternalMyDsl.g:4896:4: (lv_dtstamp_3_0= RULE_STR )
            // InternalMyDsl.g:4897:5: lv_dtstamp_3_0= RULE_STR
            {
            lv_dtstamp_3_0=(Token)match(input,RULE_STR,FOLLOW_63); 

            					newLeafNode(lv_dtstamp_3_0, grammarAccess.getVacationCAccess().getDtstampSTRTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVacationCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dtstamp",
            						lv_dtstamp_3_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            otherlv_4=(Token)match(input,107,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getVacationCAccess().getUidKeyword_4());
            		
            // InternalMyDsl.g:4917:3: ( (lv_uid_5_0= RULE_STR ) )
            // InternalMyDsl.g:4918:4: (lv_uid_5_0= RULE_STR )
            {
            // InternalMyDsl.g:4918:4: (lv_uid_5_0= RULE_STR )
            // InternalMyDsl.g:4919:5: lv_uid_5_0= RULE_STR
            {
            lv_uid_5_0=(Token)match(input,RULE_STR,FOLLOW_118); 

            					newLeafNode(lv_uid_5_0, grammarAccess.getVacationCAccess().getUidSTRTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVacationCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uid",
            						lv_uid_5_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            // InternalMyDsl.g:4935:3: (otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==87) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalMyDsl.g:4936:4: otherlv_6= 'dtstart' ( (lv_dtstart_7_0= ruleDateT ) )
                    {
                    otherlv_6=(Token)match(input,87,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getVacationCAccess().getDtstartKeyword_6_0());
                    			
                    // InternalMyDsl.g:4940:4: ( (lv_dtstart_7_0= ruleDateT ) )
                    // InternalMyDsl.g:4941:5: (lv_dtstart_7_0= ruleDateT )
                    {
                    // InternalMyDsl.g:4941:5: (lv_dtstart_7_0= ruleDateT )
                    // InternalMyDsl.g:4942:6: lv_dtstart_7_0= ruleDateT
                    {

                    						newCompositeNode(grammarAccess.getVacationCAccess().getDtstartDateTParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_119);
                    lv_dtstart_7_0=ruleDateT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVacationCRule());
                    						}
                    						set(
                    							current,
                    							"dtstart",
                    							lv_dtstart_7_0,
                    							"xCalendar.MyDsl.DateT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:4960:3: (otherlv_8= 'organizer' ( (lv_organizer_9_0= RULE_STR ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==111) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalMyDsl.g:4961:4: otherlv_8= 'organizer' ( (lv_organizer_9_0= RULE_STR ) )
                    {
                    otherlv_8=(Token)match(input,111,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getVacationCAccess().getOrganizerKeyword_7_0());
                    			
                    // InternalMyDsl.g:4965:4: ( (lv_organizer_9_0= RULE_STR ) )
                    // InternalMyDsl.g:4966:5: (lv_organizer_9_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4966:5: (lv_organizer_9_0= RULE_STR )
                    // InternalMyDsl.g:4967:6: lv_organizer_9_0= RULE_STR
                    {
                    lv_organizer_9_0=(Token)match(input,RULE_STR,FOLLOW_120); 

                    						newLeafNode(lv_organizer_9_0, grammarAccess.getVacationCAccess().getOrganizerSTRTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVacationCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"organizer",
                    							lv_organizer_9_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:4984:3: (otherlv_10= 'url' ( (lv_url_11_0= RULE_STR ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==115) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalMyDsl.g:4985:4: otherlv_10= 'url' ( (lv_url_11_0= RULE_STR ) )
                    {
                    otherlv_10=(Token)match(input,115,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getVacationCAccess().getUrlKeyword_8_0());
                    			
                    // InternalMyDsl.g:4989:4: ( (lv_url_11_0= RULE_STR ) )
                    // InternalMyDsl.g:4990:5: (lv_url_11_0= RULE_STR )
                    {
                    // InternalMyDsl.g:4990:5: (lv_url_11_0= RULE_STR )
                    // InternalMyDsl.g:4991:6: lv_url_11_0= RULE_STR
                    {
                    lv_url_11_0=(Token)match(input,RULE_STR,FOLLOW_121); 

                    						newLeafNode(lv_url_11_0, grammarAccess.getVacationCAccess().getUrlSTRTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVacationCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_11_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:5008:3: (otherlv_12= 'contact' ( (lv_contact_13_0= RULE_STR ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==118) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalMyDsl.g:5009:4: otherlv_12= 'contact' ( (lv_contact_13_0= RULE_STR ) )
                    {
                    otherlv_12=(Token)match(input,118,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getVacationCAccess().getContactKeyword_9_0());
                    			
                    // InternalMyDsl.g:5013:4: ( (lv_contact_13_0= RULE_STR ) )
                    // InternalMyDsl.g:5014:5: (lv_contact_13_0= RULE_STR )
                    {
                    // InternalMyDsl.g:5014:5: (lv_contact_13_0= RULE_STR )
                    // InternalMyDsl.g:5015:6: lv_contact_13_0= RULE_STR
                    {
                    lv_contact_13_0=(Token)match(input,RULE_STR,FOLLOW_122); 

                    						newLeafNode(lv_contact_13_0, grammarAccess.getVacationCAccess().getContactSTRTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVacationCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"contact",
                    							lv_contact_13_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:5032:3: (otherlv_14= 'dtend' ( (lv_dtend_15_0= RULE_STR ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==127) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalMyDsl.g:5033:4: otherlv_14= 'dtend' ( (lv_dtend_15_0= RULE_STR ) )
                    {
                    otherlv_14=(Token)match(input,127,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getVacationCAccess().getDtendKeyword_10_0());
                    			
                    // InternalMyDsl.g:5037:4: ( (lv_dtend_15_0= RULE_STR ) )
                    // InternalMyDsl.g:5038:5: (lv_dtend_15_0= RULE_STR )
                    {
                    // InternalMyDsl.g:5038:5: (lv_dtend_15_0= RULE_STR )
                    // InternalMyDsl.g:5039:6: lv_dtend_15_0= RULE_STR
                    {
                    lv_dtend_15_0=(Token)match(input,RULE_STR,FOLLOW_123); 

                    						newLeafNode(lv_dtend_15_0, grammarAccess.getVacationCAccess().getDtendSTRTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVacationCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"dtend",
                    							lv_dtend_15_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:5056:3: (otherlv_16= 'attendee' otherlv_17= '{' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* otherlv_21= '}' )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==104) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalMyDsl.g:5057:4: otherlv_16= 'attendee' otherlv_17= '{' ( (lv_attendee_18_0= RULE_STR ) ) (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,104,FOLLOW_36); 

                    				newLeafNode(otherlv_16, grammarAccess.getVacationCAccess().getAttendeeKeyword_11_0());
                    			
                    otherlv_17=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalMyDsl.g:5065:4: ( (lv_attendee_18_0= RULE_STR ) )
                    // InternalMyDsl.g:5066:5: (lv_attendee_18_0= RULE_STR )
                    {
                    // InternalMyDsl.g:5066:5: (lv_attendee_18_0= RULE_STR )
                    // InternalMyDsl.g:5067:6: lv_attendee_18_0= RULE_STR
                    {
                    lv_attendee_18_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_attendee_18_0, grammarAccess.getVacationCAccess().getAttendeeSTRTerminalRuleCall_11_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVacationCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"attendee",
                    							lv_attendee_18_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:5083:4: (otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) ) )*
                    loop147:
                    do {
                        int alt147=2;
                        int LA147_0 = input.LA(1);

                        if ( (LA147_0==64) ) {
                            alt147=1;
                        }


                        switch (alt147) {
                    	case 1 :
                    	    // InternalMyDsl.g:5084:5: otherlv_19= ',' ( (lv_attendee_20_0= RULE_STR ) )
                    	    {
                    	    otherlv_19=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getVacationCAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalMyDsl.g:5088:5: ( (lv_attendee_20_0= RULE_STR ) )
                    	    // InternalMyDsl.g:5089:6: (lv_attendee_20_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:5089:6: (lv_attendee_20_0= RULE_STR )
                    	    // InternalMyDsl.g:5090:7: lv_attendee_20_0= RULE_STR
                    	    {
                    	    lv_attendee_20_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_attendee_20_0, grammarAccess.getVacationCAccess().getAttendeeSTRTerminalRuleCall_11_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getVacationCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"attendee",
                    	    								lv_attendee_20_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop147;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,77,FOLLOW_124); 

                    				newLeafNode(otherlv_21, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5112:3: (otherlv_22= 'comment' otherlv_23= '{' ( (lv_comment_24_0= RULE_STR ) ) (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )* otherlv_27= '}' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==93) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalMyDsl.g:5113:4: otherlv_22= 'comment' otherlv_23= '{' ( (lv_comment_24_0= RULE_STR ) ) (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,93,FOLLOW_36); 

                    				newLeafNode(otherlv_22, grammarAccess.getVacationCAccess().getCommentKeyword_12_0());
                    			
                    otherlv_23=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalMyDsl.g:5121:4: ( (lv_comment_24_0= RULE_STR ) )
                    // InternalMyDsl.g:5122:5: (lv_comment_24_0= RULE_STR )
                    {
                    // InternalMyDsl.g:5122:5: (lv_comment_24_0= RULE_STR )
                    // InternalMyDsl.g:5123:6: lv_comment_24_0= RULE_STR
                    {
                    lv_comment_24_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_comment_24_0, grammarAccess.getVacationCAccess().getCommentSTRTerminalRuleCall_12_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVacationCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"comment",
                    							lv_comment_24_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:5139:4: (otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) ) )*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==64) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // InternalMyDsl.g:5140:5: otherlv_25= ',' ( (lv_comment_26_0= RULE_STR ) )
                    	    {
                    	    otherlv_25=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getVacationCAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalMyDsl.g:5144:5: ( (lv_comment_26_0= RULE_STR ) )
                    	    // InternalMyDsl.g:5145:6: (lv_comment_26_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:5145:6: (lv_comment_26_0= RULE_STR )
                    	    // InternalMyDsl.g:5146:7: lv_comment_26_0= RULE_STR
                    	    {
                    	    lv_comment_26_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_comment_26_0, grammarAccess.getVacationCAccess().getCommentSTRTerminalRuleCall_12_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getVacationCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"comment",
                    	    								lv_comment_26_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,77,FOLLOW_125); 

                    				newLeafNode(otherlv_27, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5168:3: (otherlv_28= 'freebusy' otherlv_29= '{' ( (lv_freebusy_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_freebusy_32_0= RULE_STR ) ) )* otherlv_33= '}' )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==131) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalMyDsl.g:5169:4: otherlv_28= 'freebusy' otherlv_29= '{' ( (lv_freebusy_30_0= RULE_STR ) ) (otherlv_31= ',' ( (lv_freebusy_32_0= RULE_STR ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,131,FOLLOW_36); 

                    				newLeafNode(otherlv_28, grammarAccess.getVacationCAccess().getFreebusyKeyword_13_0());
                    			
                    otherlv_29=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_29, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalMyDsl.g:5177:4: ( (lv_freebusy_30_0= RULE_STR ) )
                    // InternalMyDsl.g:5178:5: (lv_freebusy_30_0= RULE_STR )
                    {
                    // InternalMyDsl.g:5178:5: (lv_freebusy_30_0= RULE_STR )
                    // InternalMyDsl.g:5179:6: lv_freebusy_30_0= RULE_STR
                    {
                    lv_freebusy_30_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_freebusy_30_0, grammarAccess.getVacationCAccess().getFreebusySTRTerminalRuleCall_13_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVacationCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"freebusy",
                    							lv_freebusy_30_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:5195:4: (otherlv_31= ',' ( (lv_freebusy_32_0= RULE_STR ) ) )*
                    loop151:
                    do {
                        int alt151=2;
                        int LA151_0 = input.LA(1);

                        if ( (LA151_0==64) ) {
                            alt151=1;
                        }


                        switch (alt151) {
                    	case 1 :
                    	    // InternalMyDsl.g:5196:5: otherlv_31= ',' ( (lv_freebusy_32_0= RULE_STR ) )
                    	    {
                    	    otherlv_31=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getVacationCAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalMyDsl.g:5200:5: ( (lv_freebusy_32_0= RULE_STR ) )
                    	    // InternalMyDsl.g:5201:6: (lv_freebusy_32_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:5201:6: (lv_freebusy_32_0= RULE_STR )
                    	    // InternalMyDsl.g:5202:7: lv_freebusy_32_0= RULE_STR
                    	    {
                    	    lv_freebusy_32_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_freebusy_32_0, grammarAccess.getVacationCAccess().getFreebusySTRTerminalRuleCall_13_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getVacationCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"freebusy",
                    	    								lv_freebusy_32_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop151;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,77,FOLLOW_126); 

                    				newLeafNode(otherlv_33, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5224:3: (otherlv_34= 'rstatus' otherlv_35= '{' ( (lv_rstatus_36_0= RULE_STR ) ) (otherlv_37= ',' ( (lv_rstatus_38_0= RULE_STR ) ) )* otherlv_39= '}' )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==120) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalMyDsl.g:5225:4: otherlv_34= 'rstatus' otherlv_35= '{' ( (lv_rstatus_36_0= RULE_STR ) ) (otherlv_37= ',' ( (lv_rstatus_38_0= RULE_STR ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,120,FOLLOW_36); 

                    				newLeafNode(otherlv_34, grammarAccess.getVacationCAccess().getRstatusKeyword_14_0());
                    			
                    otherlv_35=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_35, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalMyDsl.g:5233:4: ( (lv_rstatus_36_0= RULE_STR ) )
                    // InternalMyDsl.g:5234:5: (lv_rstatus_36_0= RULE_STR )
                    {
                    // InternalMyDsl.g:5234:5: (lv_rstatus_36_0= RULE_STR )
                    // InternalMyDsl.g:5235:6: lv_rstatus_36_0= RULE_STR
                    {
                    lv_rstatus_36_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_rstatus_36_0, grammarAccess.getVacationCAccess().getRstatusSTRTerminalRuleCall_14_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVacationCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"rstatus",
                    							lv_rstatus_36_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:5251:4: (otherlv_37= ',' ( (lv_rstatus_38_0= RULE_STR ) ) )*
                    loop153:
                    do {
                        int alt153=2;
                        int LA153_0 = input.LA(1);

                        if ( (LA153_0==64) ) {
                            alt153=1;
                        }


                        switch (alt153) {
                    	case 1 :
                    	    // InternalMyDsl.g:5252:5: otherlv_37= ',' ( (lv_rstatus_38_0= RULE_STR ) )
                    	    {
                    	    otherlv_37=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getVacationCAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalMyDsl.g:5256:5: ( (lv_rstatus_38_0= RULE_STR ) )
                    	    // InternalMyDsl.g:5257:6: (lv_rstatus_38_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:5257:6: (lv_rstatus_38_0= RULE_STR )
                    	    // InternalMyDsl.g:5258:7: lv_rstatus_38_0= RULE_STR
                    	    {
                    	    lv_rstatus_38_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_rstatus_38_0, grammarAccess.getVacationCAccess().getRstatusSTRTerminalRuleCall_14_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getVacationCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"rstatus",
                    	    								lv_rstatus_38_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop153;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,77,FOLLOW_55); 

                    				newLeafNode(otherlv_39, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5280:3: (otherlv_40= 'x_prop' otherlv_41= '{' ( (lv_x_prop_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_x_prop_44_0= RULE_STR ) ) )* otherlv_45= '}' )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==96) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // InternalMyDsl.g:5281:4: otherlv_40= 'x_prop' otherlv_41= '{' ( (lv_x_prop_42_0= RULE_STR ) ) (otherlv_43= ',' ( (lv_x_prop_44_0= RULE_STR ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,96,FOLLOW_36); 

                    				newLeafNode(otherlv_40, grammarAccess.getVacationCAccess().getX_propKeyword_15_0());
                    			
                    otherlv_41=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_41, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalMyDsl.g:5289:4: ( (lv_x_prop_42_0= RULE_STR ) )
                    // InternalMyDsl.g:5290:5: (lv_x_prop_42_0= RULE_STR )
                    {
                    // InternalMyDsl.g:5290:5: (lv_x_prop_42_0= RULE_STR )
                    // InternalMyDsl.g:5291:6: lv_x_prop_42_0= RULE_STR
                    {
                    lv_x_prop_42_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_x_prop_42_0, grammarAccess.getVacationCAccess().getX_propSTRTerminalRuleCall_15_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVacationCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"x_prop",
                    							lv_x_prop_42_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:5307:4: (otherlv_43= ',' ( (lv_x_prop_44_0= RULE_STR ) ) )*
                    loop155:
                    do {
                        int alt155=2;
                        int LA155_0 = input.LA(1);

                        if ( (LA155_0==64) ) {
                            alt155=1;
                        }


                        switch (alt155) {
                    	case 1 :
                    	    // InternalMyDsl.g:5308:5: otherlv_43= ',' ( (lv_x_prop_44_0= RULE_STR ) )
                    	    {
                    	    otherlv_43=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getVacationCAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalMyDsl.g:5312:5: ( (lv_x_prop_44_0= RULE_STR ) )
                    	    // InternalMyDsl.g:5313:6: (lv_x_prop_44_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:5313:6: (lv_x_prop_44_0= RULE_STR )
                    	    // InternalMyDsl.g:5314:7: lv_x_prop_44_0= RULE_STR
                    	    {
                    	    lv_x_prop_44_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_x_prop_44_0, grammarAccess.getVacationCAccess().getX_propSTRTerminalRuleCall_15_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getVacationCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"x_prop",
                    	    								lv_x_prop_44_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop155;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,77,FOLLOW_56); 

                    				newLeafNode(otherlv_45, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5336:3: (otherlv_46= 'iana_prop' otherlv_47= '{' ( (lv_iana_prop_48_0= RULE_STR ) ) (otherlv_49= ',' ( (lv_iana_prop_50_0= RULE_STR ) ) )* otherlv_51= '}' )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==97) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalMyDsl.g:5337:4: otherlv_46= 'iana_prop' otherlv_47= '{' ( (lv_iana_prop_48_0= RULE_STR ) ) (otherlv_49= ',' ( (lv_iana_prop_50_0= RULE_STR ) ) )* otherlv_51= '}'
                    {
                    otherlv_46=(Token)match(input,97,FOLLOW_36); 

                    				newLeafNode(otherlv_46, grammarAccess.getVacationCAccess().getIana_propKeyword_16_0());
                    			
                    otherlv_47=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_47, grammarAccess.getVacationCAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalMyDsl.g:5345:4: ( (lv_iana_prop_48_0= RULE_STR ) )
                    // InternalMyDsl.g:5346:5: (lv_iana_prop_48_0= RULE_STR )
                    {
                    // InternalMyDsl.g:5346:5: (lv_iana_prop_48_0= RULE_STR )
                    // InternalMyDsl.g:5347:6: lv_iana_prop_48_0= RULE_STR
                    {
                    lv_iana_prop_48_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_iana_prop_48_0, grammarAccess.getVacationCAccess().getIana_propSTRTerminalRuleCall_16_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVacationCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"iana_prop",
                    							lv_iana_prop_48_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:5363:4: (otherlv_49= ',' ( (lv_iana_prop_50_0= RULE_STR ) ) )*
                    loop157:
                    do {
                        int alt157=2;
                        int LA157_0 = input.LA(1);

                        if ( (LA157_0==64) ) {
                            alt157=1;
                        }


                        switch (alt157) {
                    	case 1 :
                    	    // InternalMyDsl.g:5364:5: otherlv_49= ',' ( (lv_iana_prop_50_0= RULE_STR ) )
                    	    {
                    	    otherlv_49=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_49, grammarAccess.getVacationCAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalMyDsl.g:5368:5: ( (lv_iana_prop_50_0= RULE_STR ) )
                    	    // InternalMyDsl.g:5369:6: (lv_iana_prop_50_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:5369:6: (lv_iana_prop_50_0= RULE_STR )
                    	    // InternalMyDsl.g:5370:7: lv_iana_prop_50_0= RULE_STR
                    	    {
                    	    lv_iana_prop_50_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_iana_prop_50_0, grammarAccess.getVacationCAccess().getIana_propSTRTerminalRuleCall_16_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getVacationCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"iana_prop",
                    	    								lv_iana_prop_50_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop157;
                        }
                    } while (true);

                    otherlv_51=(Token)match(input,77,FOLLOW_35); 

                    				newLeafNode(otherlv_51, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            otherlv_52=(Token)match(input,77,FOLLOW_2); 

            			newLeafNode(otherlv_52, grammarAccess.getVacationCAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleVacationC"


    // $ANTLR start "entryRuleTimeZoneC"
    // InternalMyDsl.g:5400:1: entryRuleTimeZoneC returns [EObject current=null] : iv_ruleTimeZoneC= ruleTimeZoneC EOF ;
    public final EObject entryRuleTimeZoneC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeZoneC = null;


        try {
            // InternalMyDsl.g:5400:50: (iv_ruleTimeZoneC= ruleTimeZoneC EOF )
            // InternalMyDsl.g:5401:2: iv_ruleTimeZoneC= ruleTimeZoneC EOF
            {
             newCompositeNode(grammarAccess.getTimeZoneCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeZoneC=ruleTimeZoneC();

            state._fsp--;

             current =iv_ruleTimeZoneC; 
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
    // $ANTLR end "entryRuleTimeZoneC"


    // $ANTLR start "ruleTimeZoneC"
    // InternalMyDsl.g:5407:1: ruleTimeZoneC returns [EObject current=null] : (otherlv_0= 'TimeZoneC' otherlv_1= '{' otherlv_2= 'tzid' ( (lv_tzid_3_0= RULE_STR ) ) (otherlv_4= 'last_mod' ( (lv_last_mod_5_0= RULE_STR ) ) )? (otherlv_6= 'tzurl' ( (lv_tzurl_7_0= RULE_STR ) ) )? (otherlv_8= 'x_prop' otherlv_9= '{' ( (lv_x_prop_10_0= RULE_STR ) ) (otherlv_11= ',' ( (lv_x_prop_12_0= RULE_STR ) ) )* otherlv_13= '}' )? (otherlv_14= 'iana_prop' otherlv_15= '{' ( (lv_iana_prop_16_0= RULE_STR ) ) (otherlv_17= ',' ( (lv_iana_prop_18_0= RULE_STR ) ) )* otherlv_19= '}' )? (otherlv_20= 'standardc' otherlv_21= '{' ( (lv_standardc_22_0= ruletzprop ) ) (otherlv_23= ',' ( (lv_standardc_24_0= ruletzprop ) ) )* otherlv_25= '}' )? (otherlv_26= 'daylightc' otherlv_27= '{' ( (lv_daylightc_28_0= ruletzprop ) ) (otherlv_29= ',' ( (lv_daylightc_30_0= ruletzprop ) ) )* otherlv_31= '}' )? otherlv_32= '}' ) ;
    public final EObject ruleTimeZoneC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_tzid_3_0=null;
        Token otherlv_4=null;
        Token lv_last_mod_5_0=null;
        Token otherlv_6=null;
        Token lv_tzurl_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_x_prop_10_0=null;
        Token otherlv_11=null;
        Token lv_x_prop_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_iana_prop_16_0=null;
        Token otherlv_17=null;
        Token lv_iana_prop_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        EObject lv_standardc_22_0 = null;

        EObject lv_standardc_24_0 = null;

        EObject lv_daylightc_28_0 = null;

        EObject lv_daylightc_30_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5413:2: ( (otherlv_0= 'TimeZoneC' otherlv_1= '{' otherlv_2= 'tzid' ( (lv_tzid_3_0= RULE_STR ) ) (otherlv_4= 'last_mod' ( (lv_last_mod_5_0= RULE_STR ) ) )? (otherlv_6= 'tzurl' ( (lv_tzurl_7_0= RULE_STR ) ) )? (otherlv_8= 'x_prop' otherlv_9= '{' ( (lv_x_prop_10_0= RULE_STR ) ) (otherlv_11= ',' ( (lv_x_prop_12_0= RULE_STR ) ) )* otherlv_13= '}' )? (otherlv_14= 'iana_prop' otherlv_15= '{' ( (lv_iana_prop_16_0= RULE_STR ) ) (otherlv_17= ',' ( (lv_iana_prop_18_0= RULE_STR ) ) )* otherlv_19= '}' )? (otherlv_20= 'standardc' otherlv_21= '{' ( (lv_standardc_22_0= ruletzprop ) ) (otherlv_23= ',' ( (lv_standardc_24_0= ruletzprop ) ) )* otherlv_25= '}' )? (otherlv_26= 'daylightc' otherlv_27= '{' ( (lv_daylightc_28_0= ruletzprop ) ) (otherlv_29= ',' ( (lv_daylightc_30_0= ruletzprop ) ) )* otherlv_31= '}' )? otherlv_32= '}' ) )
            // InternalMyDsl.g:5414:2: (otherlv_0= 'TimeZoneC' otherlv_1= '{' otherlv_2= 'tzid' ( (lv_tzid_3_0= RULE_STR ) ) (otherlv_4= 'last_mod' ( (lv_last_mod_5_0= RULE_STR ) ) )? (otherlv_6= 'tzurl' ( (lv_tzurl_7_0= RULE_STR ) ) )? (otherlv_8= 'x_prop' otherlv_9= '{' ( (lv_x_prop_10_0= RULE_STR ) ) (otherlv_11= ',' ( (lv_x_prop_12_0= RULE_STR ) ) )* otherlv_13= '}' )? (otherlv_14= 'iana_prop' otherlv_15= '{' ( (lv_iana_prop_16_0= RULE_STR ) ) (otherlv_17= ',' ( (lv_iana_prop_18_0= RULE_STR ) ) )* otherlv_19= '}' )? (otherlv_20= 'standardc' otherlv_21= '{' ( (lv_standardc_22_0= ruletzprop ) ) (otherlv_23= ',' ( (lv_standardc_24_0= ruletzprop ) ) )* otherlv_25= '}' )? (otherlv_26= 'daylightc' otherlv_27= '{' ( (lv_daylightc_28_0= ruletzprop ) ) (otherlv_29= ',' ( (lv_daylightc_30_0= ruletzprop ) ) )* otherlv_31= '}' )? otherlv_32= '}' )
            {
            // InternalMyDsl.g:5414:2: (otherlv_0= 'TimeZoneC' otherlv_1= '{' otherlv_2= 'tzid' ( (lv_tzid_3_0= RULE_STR ) ) (otherlv_4= 'last_mod' ( (lv_last_mod_5_0= RULE_STR ) ) )? (otherlv_6= 'tzurl' ( (lv_tzurl_7_0= RULE_STR ) ) )? (otherlv_8= 'x_prop' otherlv_9= '{' ( (lv_x_prop_10_0= RULE_STR ) ) (otherlv_11= ',' ( (lv_x_prop_12_0= RULE_STR ) ) )* otherlv_13= '}' )? (otherlv_14= 'iana_prop' otherlv_15= '{' ( (lv_iana_prop_16_0= RULE_STR ) ) (otherlv_17= ',' ( (lv_iana_prop_18_0= RULE_STR ) ) )* otherlv_19= '}' )? (otherlv_20= 'standardc' otherlv_21= '{' ( (lv_standardc_22_0= ruletzprop ) ) (otherlv_23= ',' ( (lv_standardc_24_0= ruletzprop ) ) )* otherlv_25= '}' )? (otherlv_26= 'daylightc' otherlv_27= '{' ( (lv_daylightc_28_0= ruletzprop ) ) (otherlv_29= ',' ( (lv_daylightc_30_0= ruletzprop ) ) )* otherlv_31= '}' )? otherlv_32= '}' )
            // InternalMyDsl.g:5415:3: otherlv_0= 'TimeZoneC' otherlv_1= '{' otherlv_2= 'tzid' ( (lv_tzid_3_0= RULE_STR ) ) (otherlv_4= 'last_mod' ( (lv_last_mod_5_0= RULE_STR ) ) )? (otherlv_6= 'tzurl' ( (lv_tzurl_7_0= RULE_STR ) ) )? (otherlv_8= 'x_prop' otherlv_9= '{' ( (lv_x_prop_10_0= RULE_STR ) ) (otherlv_11= ',' ( (lv_x_prop_12_0= RULE_STR ) ) )* otherlv_13= '}' )? (otherlv_14= 'iana_prop' otherlv_15= '{' ( (lv_iana_prop_16_0= RULE_STR ) ) (otherlv_17= ',' ( (lv_iana_prop_18_0= RULE_STR ) ) )* otherlv_19= '}' )? (otherlv_20= 'standardc' otherlv_21= '{' ( (lv_standardc_22_0= ruletzprop ) ) (otherlv_23= ',' ( (lv_standardc_24_0= ruletzprop ) ) )* otherlv_25= '}' )? (otherlv_26= 'daylightc' otherlv_27= '{' ( (lv_daylightc_28_0= ruletzprop ) ) (otherlv_29= ',' ( (lv_daylightc_30_0= ruletzprop ) ) )* otherlv_31= '}' )? otherlv_32= '}'
            {
            otherlv_0=(Token)match(input,132,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeZoneCAccess().getTimeZoneCKeyword_0());
            		
            otherlv_1=(Token)match(input,79,FOLLOW_127); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeZoneCAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,133,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeZoneCAccess().getTzidKeyword_2());
            		
            // InternalMyDsl.g:5427:3: ( (lv_tzid_3_0= RULE_STR ) )
            // InternalMyDsl.g:5428:4: (lv_tzid_3_0= RULE_STR )
            {
            // InternalMyDsl.g:5428:4: (lv_tzid_3_0= RULE_STR )
            // InternalMyDsl.g:5429:5: lv_tzid_3_0= RULE_STR
            {
            lv_tzid_3_0=(Token)match(input,RULE_STR,FOLLOW_128); 

            					newLeafNode(lv_tzid_3_0, grammarAccess.getTimeZoneCAccess().getTzidSTRTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeZoneCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tzid",
            						lv_tzid_3_0,
            						"xCalendar.MyDsl.STR");
            				

            }


            }

            // InternalMyDsl.g:5445:3: (otherlv_4= 'last_mod' ( (lv_last_mod_5_0= RULE_STR ) ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==110) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalMyDsl.g:5446:4: otherlv_4= 'last_mod' ( (lv_last_mod_5_0= RULE_STR ) )
                    {
                    otherlv_4=(Token)match(input,110,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTimeZoneCAccess().getLast_modKeyword_4_0());
                    			
                    // InternalMyDsl.g:5450:4: ( (lv_last_mod_5_0= RULE_STR ) )
                    // InternalMyDsl.g:5451:5: (lv_last_mod_5_0= RULE_STR )
                    {
                    // InternalMyDsl.g:5451:5: (lv_last_mod_5_0= RULE_STR )
                    // InternalMyDsl.g:5452:6: lv_last_mod_5_0= RULE_STR
                    {
                    lv_last_mod_5_0=(Token)match(input,RULE_STR,FOLLOW_129); 

                    						newLeafNode(lv_last_mod_5_0, grammarAccess.getTimeZoneCAccess().getLast_modSTRTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeZoneCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"last_mod",
                    							lv_last_mod_5_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:5469:3: (otherlv_6= 'tzurl' ( (lv_tzurl_7_0= RULE_STR ) ) )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==134) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // InternalMyDsl.g:5470:4: otherlv_6= 'tzurl' ( (lv_tzurl_7_0= RULE_STR ) )
                    {
                    otherlv_6=(Token)match(input,134,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTimeZoneCAccess().getTzurlKeyword_5_0());
                    			
                    // InternalMyDsl.g:5474:4: ( (lv_tzurl_7_0= RULE_STR ) )
                    // InternalMyDsl.g:5475:5: (lv_tzurl_7_0= RULE_STR )
                    {
                    // InternalMyDsl.g:5475:5: (lv_tzurl_7_0= RULE_STR )
                    // InternalMyDsl.g:5476:6: lv_tzurl_7_0= RULE_STR
                    {
                    lv_tzurl_7_0=(Token)match(input,RULE_STR,FOLLOW_130); 

                    						newLeafNode(lv_tzurl_7_0, grammarAccess.getTimeZoneCAccess().getTzurlSTRTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeZoneCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tzurl",
                    							lv_tzurl_7_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:5493:3: (otherlv_8= 'x_prop' otherlv_9= '{' ( (lv_x_prop_10_0= RULE_STR ) ) (otherlv_11= ',' ( (lv_x_prop_12_0= RULE_STR ) ) )* otherlv_13= '}' )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==96) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalMyDsl.g:5494:4: otherlv_8= 'x_prop' otherlv_9= '{' ( (lv_x_prop_10_0= RULE_STR ) ) (otherlv_11= ',' ( (lv_x_prop_12_0= RULE_STR ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,96,FOLLOW_36); 

                    				newLeafNode(otherlv_8, grammarAccess.getTimeZoneCAccess().getX_propKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getTimeZoneCAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMyDsl.g:5502:4: ( (lv_x_prop_10_0= RULE_STR ) )
                    // InternalMyDsl.g:5503:5: (lv_x_prop_10_0= RULE_STR )
                    {
                    // InternalMyDsl.g:5503:5: (lv_x_prop_10_0= RULE_STR )
                    // InternalMyDsl.g:5504:6: lv_x_prop_10_0= RULE_STR
                    {
                    lv_x_prop_10_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_x_prop_10_0, grammarAccess.getTimeZoneCAccess().getX_propSTRTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeZoneCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"x_prop",
                    							lv_x_prop_10_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:5520:4: (otherlv_11= ',' ( (lv_x_prop_12_0= RULE_STR ) ) )*
                    loop161:
                    do {
                        int alt161=2;
                        int LA161_0 = input.LA(1);

                        if ( (LA161_0==64) ) {
                            alt161=1;
                        }


                        switch (alt161) {
                    	case 1 :
                    	    // InternalMyDsl.g:5521:5: otherlv_11= ',' ( (lv_x_prop_12_0= RULE_STR ) )
                    	    {
                    	    otherlv_11=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getTimeZoneCAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:5525:5: ( (lv_x_prop_12_0= RULE_STR ) )
                    	    // InternalMyDsl.g:5526:6: (lv_x_prop_12_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:5526:6: (lv_x_prop_12_0= RULE_STR )
                    	    // InternalMyDsl.g:5527:7: lv_x_prop_12_0= RULE_STR
                    	    {
                    	    lv_x_prop_12_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_x_prop_12_0, grammarAccess.getTimeZoneCAccess().getX_propSTRTerminalRuleCall_6_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTimeZoneCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"x_prop",
                    	    								lv_x_prop_12_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop161;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,77,FOLLOW_131); 

                    				newLeafNode(otherlv_13, grammarAccess.getTimeZoneCAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5549:3: (otherlv_14= 'iana_prop' otherlv_15= '{' ( (lv_iana_prop_16_0= RULE_STR ) ) (otherlv_17= ',' ( (lv_iana_prop_18_0= RULE_STR ) ) )* otherlv_19= '}' )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==97) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // InternalMyDsl.g:5550:4: otherlv_14= 'iana_prop' otherlv_15= '{' ( (lv_iana_prop_16_0= RULE_STR ) ) (otherlv_17= ',' ( (lv_iana_prop_18_0= RULE_STR ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,97,FOLLOW_36); 

                    				newLeafNode(otherlv_14, grammarAccess.getTimeZoneCAccess().getIana_propKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getTimeZoneCAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMyDsl.g:5558:4: ( (lv_iana_prop_16_0= RULE_STR ) )
                    // InternalMyDsl.g:5559:5: (lv_iana_prop_16_0= RULE_STR )
                    {
                    // InternalMyDsl.g:5559:5: (lv_iana_prop_16_0= RULE_STR )
                    // InternalMyDsl.g:5560:6: lv_iana_prop_16_0= RULE_STR
                    {
                    lv_iana_prop_16_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    						newLeafNode(lv_iana_prop_16_0, grammarAccess.getTimeZoneCAccess().getIana_propSTRTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeZoneCRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"iana_prop",
                    							lv_iana_prop_16_0,
                    							"xCalendar.MyDsl.STR");
                    					

                    }


                    }

                    // InternalMyDsl.g:5576:4: (otherlv_17= ',' ( (lv_iana_prop_18_0= RULE_STR ) ) )*
                    loop163:
                    do {
                        int alt163=2;
                        int LA163_0 = input.LA(1);

                        if ( (LA163_0==64) ) {
                            alt163=1;
                        }


                        switch (alt163) {
                    	case 1 :
                    	    // InternalMyDsl.g:5577:5: otherlv_17= ',' ( (lv_iana_prop_18_0= RULE_STR ) )
                    	    {
                    	    otherlv_17=(Token)match(input,64,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getTimeZoneCAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:5581:5: ( (lv_iana_prop_18_0= RULE_STR ) )
                    	    // InternalMyDsl.g:5582:6: (lv_iana_prop_18_0= RULE_STR )
                    	    {
                    	    // InternalMyDsl.g:5582:6: (lv_iana_prop_18_0= RULE_STR )
                    	    // InternalMyDsl.g:5583:7: lv_iana_prop_18_0= RULE_STR
                    	    {
                    	    lv_iana_prop_18_0=(Token)match(input,RULE_STR,FOLLOW_51); 

                    	    							newLeafNode(lv_iana_prop_18_0, grammarAccess.getTimeZoneCAccess().getIana_propSTRTerminalRuleCall_7_3_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTimeZoneCRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"iana_prop",
                    	    								lv_iana_prop_18_0,
                    	    								"xCalendar.MyDsl.STR");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop163;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,77,FOLLOW_132); 

                    				newLeafNode(otherlv_19, grammarAccess.getTimeZoneCAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5605:3: (otherlv_20= 'standardc' otherlv_21= '{' ( (lv_standardc_22_0= ruletzprop ) ) (otherlv_23= ',' ( (lv_standardc_24_0= ruletzprop ) ) )* otherlv_25= '}' )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==135) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // InternalMyDsl.g:5606:4: otherlv_20= 'standardc' otherlv_21= '{' ( (lv_standardc_22_0= ruletzprop ) ) (otherlv_23= ',' ( (lv_standardc_24_0= ruletzprop ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,135,FOLLOW_36); 

                    				newLeafNode(otherlv_20, grammarAccess.getTimeZoneCAccess().getStandardcKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,79,FOLLOW_133); 

                    				newLeafNode(otherlv_21, grammarAccess.getTimeZoneCAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMyDsl.g:5614:4: ( (lv_standardc_22_0= ruletzprop ) )
                    // InternalMyDsl.g:5615:5: (lv_standardc_22_0= ruletzprop )
                    {
                    // InternalMyDsl.g:5615:5: (lv_standardc_22_0= ruletzprop )
                    // InternalMyDsl.g:5616:6: lv_standardc_22_0= ruletzprop
                    {

                    						newCompositeNode(grammarAccess.getTimeZoneCAccess().getStandardcTzpropParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_standardc_22_0=ruletzprop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimeZoneCRule());
                    						}
                    						add(
                    							current,
                    							"standardc",
                    							lv_standardc_22_0,
                    							"xCalendar.MyDsl.tzprop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:5633:4: (otherlv_23= ',' ( (lv_standardc_24_0= ruletzprop ) ) )*
                    loop165:
                    do {
                        int alt165=2;
                        int LA165_0 = input.LA(1);

                        if ( (LA165_0==64) ) {
                            alt165=1;
                        }


                        switch (alt165) {
                    	case 1 :
                    	    // InternalMyDsl.g:5634:5: otherlv_23= ',' ( (lv_standardc_24_0= ruletzprop ) )
                    	    {
                    	    otherlv_23=(Token)match(input,64,FOLLOW_133); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getTimeZoneCAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMyDsl.g:5638:5: ( (lv_standardc_24_0= ruletzprop ) )
                    	    // InternalMyDsl.g:5639:6: (lv_standardc_24_0= ruletzprop )
                    	    {
                    	    // InternalMyDsl.g:5639:6: (lv_standardc_24_0= ruletzprop )
                    	    // InternalMyDsl.g:5640:7: lv_standardc_24_0= ruletzprop
                    	    {

                    	    							newCompositeNode(grammarAccess.getTimeZoneCAccess().getStandardcTzpropParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_51);
                    	    lv_standardc_24_0=ruletzprop();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTimeZoneCRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"standardc",
                    	    								lv_standardc_24_0,
                    	    								"xCalendar.MyDsl.tzprop");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop165;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,77,FOLLOW_134); 

                    				newLeafNode(otherlv_25, grammarAccess.getTimeZoneCAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5663:3: (otherlv_26= 'daylightc' otherlv_27= '{' ( (lv_daylightc_28_0= ruletzprop ) ) (otherlv_29= ',' ( (lv_daylightc_30_0= ruletzprop ) ) )* otherlv_31= '}' )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==136) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // InternalMyDsl.g:5664:4: otherlv_26= 'daylightc' otherlv_27= '{' ( (lv_daylightc_28_0= ruletzprop ) ) (otherlv_29= ',' ( (lv_daylightc_30_0= ruletzprop ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,136,FOLLOW_36); 

                    				newLeafNode(otherlv_26, grammarAccess.getTimeZoneCAccess().getDaylightcKeyword_9_0());
                    			
                    otherlv_27=(Token)match(input,79,FOLLOW_133); 

                    				newLeafNode(otherlv_27, grammarAccess.getTimeZoneCAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalMyDsl.g:5672:4: ( (lv_daylightc_28_0= ruletzprop ) )
                    // InternalMyDsl.g:5673:5: (lv_daylightc_28_0= ruletzprop )
                    {
                    // InternalMyDsl.g:5673:5: (lv_daylightc_28_0= ruletzprop )
                    // InternalMyDsl.g:5674:6: lv_daylightc_28_0= ruletzprop
                    {

                    						newCompositeNode(grammarAccess.getTimeZoneCAccess().getDaylightcTzpropParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_daylightc_28_0=ruletzprop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimeZoneCRule());
                    						}
                    						add(
                    							current,
                    							"daylightc",
                    							lv_daylightc_28_0,
                    							"xCalendar.MyDsl.tzprop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:5691:4: (otherlv_29= ',' ( (lv_daylightc_30_0= ruletzprop ) ) )*
                    loop167:
                    do {
                        int alt167=2;
                        int LA167_0 = input.LA(1);

                        if ( (LA167_0==64) ) {
                            alt167=1;
                        }


                        switch (alt167) {
                    	case 1 :
                    	    // InternalMyDsl.g:5692:5: otherlv_29= ',' ( (lv_daylightc_30_0= ruletzprop ) )
                    	    {
                    	    otherlv_29=(Token)match(input,64,FOLLOW_133); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getTimeZoneCAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMyDsl.g:5696:5: ( (lv_daylightc_30_0= ruletzprop ) )
                    	    // InternalMyDsl.g:5697:6: (lv_daylightc_30_0= ruletzprop )
                    	    {
                    	    // InternalMyDsl.g:5697:6: (lv_daylightc_30_0= ruletzprop )
                    	    // InternalMyDsl.g:5698:7: lv_daylightc_30_0= ruletzprop
                    	    {

                    	    							newCompositeNode(grammarAccess.getTimeZoneCAccess().getDaylightcTzpropParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_51);
                    	    lv_daylightc_30_0=ruletzprop();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTimeZoneCRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"daylightc",
                    	    								lv_daylightc_30_0,
                    	    								"xCalendar.MyDsl.tzprop");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop167;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,77,FOLLOW_35); 

                    				newLeafNode(otherlv_31, grammarAccess.getTimeZoneCAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_32=(Token)match(input,77,FOLLOW_2); 

            			newLeafNode(otherlv_32, grammarAccess.getTimeZoneCAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleTimeZoneC"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0200000000000000L,0x0000020000004000L,0x0000000000000016L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000007FFFFF8040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000018000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001000000000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001F40000000022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000E000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xF800000000004000L,0x0000000000001FFEL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xF000000000004000L,0x0000000000001FFEL});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xE000000000004000L,0x0000000000001FFEL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xC000000000004000L,0x0000000000001FFEL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x8000000000004000L,0x0000000000001FFEL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004000L,0x0000000000001FFDL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004000L,0x0000000000001FF9L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000004000L,0x0000000000001FF1L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000004000L,0x0000000000001FE1L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x01F0000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000004000L,0x0000000000001FC1L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000004000L,0x0000000000001F81L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000004000L,0x0000000000001F01L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000004000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000004000L,0x0000000000001800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000004000L,0x0000000000001000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x00000000001C0000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x000000E000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000202000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x000000000C002000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000008002000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x00000003E0002000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x00000003C0002000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000380002000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000300002000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000200002000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000001800002000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000001000002000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000042000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0xFFFFF103648C2000L,0x0000000000000001L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0xFFFFF103640C2000L,0x0000000000000001L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0xFFFFE103640C2000L,0x0000000000000001L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0xFFFFC103640C2000L,0x0000000000000001L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0xFFFF8103640C2000L,0x0000000000000001L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0xFFFF0103640C2000L,0x0000000000000001L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0xFFFE0103640C2000L,0x0000000000000001L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0xFFFC0103640C2000L,0x0000000000000001L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0xFFF80103640C2000L,0x0000000000000001L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0xFFF00103640C2000L,0x0000000000000001L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0xFFE00103640C2000L,0x0000000000000001L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0xFFE00103600C2000L,0x0000000000000001L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0xFFE0010360082000L,0x0000000000000001L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0xFFE0000360082000L,0x0000000000000001L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0xFFC0000360082000L,0x0000000000000001L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0xFFC0000340082000L,0x0000000000000001L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0xFF80000340082000L,0x0000000000000001L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0xFF00000340082000L,0x0000000000000001L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0xFE00000340082000L,0x0000000000000001L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0xFC00000340082000L,0x0000000000000001L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0xF800000340082000L,0x0000000000000001L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0xF800000300082000L,0x0000000000000001L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0xF800000200082000L,0x0000000000000001L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0xF800000000082000L,0x0000000000000001L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0xF800000000002000L,0x0000000000000001L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0xF000000000002000L,0x0000000000000001L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0xE000000000002000L,0x0000000000000001L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0xC000000000002000L,0x0000000000000001L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x8000000000002000L,0x0000000000000001L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000001L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x07FFF103648C2000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x07FFF103640C2000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x07FFE103640C2000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x07FFC103640C2000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x07FF8103640C2000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x07FF0103640C2000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x07FE0103640C2000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x07FC0103640C2000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x07F80103640C2000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x07F00103640C2000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x07E00103640C2000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x07E00103600C2000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x07E0010360082000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x07E0000360082000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x07C0000360082000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x07C0000340082000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0780000340082000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0700000340082000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0600000340082000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0400000340082000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0000000340082000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0000000300082000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000000L,0x0000000200082000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000082000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x8148810320802000L,0x0000000000000008L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x8148810320002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000000L,0x8148010320002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000000000L,0x8140010320002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000000L,0x8100010320002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000000000L,0x0100010320002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000000000L,0x0100000320002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000000L,0x0100000300002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000000L,0x0100000300002000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000000L,0x0000400300002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000000L,0x0000000300002000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000000L,0x0000000300002000L,0x0000000000000180L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000000L,0x0000000200002000L,0x0000000000000180L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000180L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000100L});

}