package org.xtext.example.mydsl.parser.antlr.internal; 

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
import org.xtext.example.mydsl.services.MyDslSampleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslSampleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'User'", "'{'", "'belongTo'", "'source: '", "'}'", "'Attacker'", "'MaliciousRequest'", "'destination: '", "'port: '", "'data: '", "'protocol: '", "'NormalRequest'", "'Defender'", "'SecurityPolicyList'", "'SecurityPolicy'", "'if'", "'('", "'&'", "'|'", "')'", "'then'", "'otherwise'", "'Condition'", "'isRequestProtocolEqualsTo'", "'isHTTPMethodEqualsTo'", "'GET'", "'POST'", "'HEAD'", "'DELETE'", "'PUT'", "'isParaContentMatchRegExp'", "'isRequestFrequencyLessThan'", "'isParaLenghtLessThan'", "'isParaLenghtGreaterThan'", "'isParaLenghtEqualsTo'", "'endpoint'", "','", "'drop'", "'block'", "'pass'", "'.'", "'HTTP'", "'HTTPS'", "'FTP'", "'SSH'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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


        public InternalMyDslSampleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslSampleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslSampleParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g"; }



     	private MyDslSampleGrammarAccess grammarAccess;
     	
        public InternalMyDslSampleParser(TokenStream input, MyDslSampleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "HttpShieldModel";	
       	}
       	
       	@Override
       	protected MyDslSampleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleHttpShieldModel"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:68:1: entryRuleHttpShieldModel returns [EObject current=null] : iv_ruleHttpShieldModel= ruleHttpShieldModel EOF ;
    public final EObject entryRuleHttpShieldModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpShieldModel = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:69:2: (iv_ruleHttpShieldModel= ruleHttpShieldModel EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:70:2: iv_ruleHttpShieldModel= ruleHttpShieldModel EOF
            {
             newCompositeNode(grammarAccess.getHttpShieldModelRule()); 
            pushFollow(FOLLOW_ruleHttpShieldModel_in_entryRuleHttpShieldModel75);
            iv_ruleHttpShieldModel=ruleHttpShieldModel();

            state._fsp--;

             current =iv_ruleHttpShieldModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpShieldModel85); 

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
    // $ANTLR end "entryRuleHttpShieldModel"


    // $ANTLR start "ruleHttpShieldModel"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:77:1: ruleHttpShieldModel returns [EObject current=null] : ( (lv_agents_0_0= ruleAgent ) )* ;
    public final EObject ruleHttpShieldModel() throws RecognitionException {
        EObject current = null;

        EObject lv_agents_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:80:28: ( ( (lv_agents_0_0= ruleAgent ) )* )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:81:1: ( (lv_agents_0_0= ruleAgent ) )*
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:81:1: ( (lv_agents_0_0= ruleAgent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==16||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:82:1: (lv_agents_0_0= ruleAgent )
            	    {
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:82:1: (lv_agents_0_0= ruleAgent )
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:83:3: lv_agents_0_0= ruleAgent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHttpShieldModelAccess().getAgentsAgentParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAgent_in_ruleHttpShieldModel130);
            	    lv_agents_0_0=ruleAgent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHttpShieldModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"agents",
            	            		lv_agents_0_0, 
            	            		"Agent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleHttpShieldModel"


    // $ANTLR start "entryRuleAgent"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:107:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:108:2: (iv_ruleAgent= ruleAgent EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:109:2: iv_ruleAgent= ruleAgent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_ruleAgent_in_entryRuleAgent166);
            iv_ruleAgent=ruleAgent();

            state._fsp--;

             current =iv_ruleAgent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgent176); 

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
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:116:1: ruleAgent returns [EObject current=null] : (this_User_0= ruleUser | this_Attacker_1= ruleAttacker | this_Defender_2= ruleDefender ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        EObject this_User_0 = null;

        EObject this_Attacker_1 = null;

        EObject this_Defender_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:119:28: ( (this_User_0= ruleUser | this_Attacker_1= ruleAttacker | this_Defender_2= ruleDefender ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:120:1: (this_User_0= ruleUser | this_Attacker_1= ruleAttacker | this_Defender_2= ruleDefender )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:120:1: (this_User_0= ruleUser | this_Attacker_1= ruleAttacker | this_Defender_2= ruleDefender )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 23:
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
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:121:5: this_User_0= ruleUser
                    {
                     
                            newCompositeNode(grammarAccess.getAgentAccess().getUserParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUser_in_ruleAgent223);
                    this_User_0=ruleUser();

                    state._fsp--;

                     
                            current = this_User_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:131:5: this_Attacker_1= ruleAttacker
                    {
                     
                            newCompositeNode(grammarAccess.getAgentAccess().getAttackerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAttacker_in_ruleAgent250);
                    this_Attacker_1=ruleAttacker();

                    state._fsp--;

                     
                            current = this_Attacker_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:141:5: this_Defender_2= ruleDefender
                    {
                     
                            newCompositeNode(grammarAccess.getAgentAccess().getDefenderParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDefender_in_ruleAgent277);
                    this_Defender_2=ruleDefender();

                    state._fsp--;

                     
                            current = this_Defender_2; 
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
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleUser"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:157:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:158:2: (iv_ruleUser= ruleUser EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:159:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_ruleUser_in_entryRuleUser312);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUser322); 

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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:166:1: ruleUser returns [EObject current=null] : ( ( (lv_type_0_0= 'User' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'belongTo' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= 'source: ' ( (lv_source_6_0= ruleIPAddress ) ) ( (lv_requests_7_0= ruleNormalRequest ) )* otherlv_8= '}' ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_filename_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_source_6_0 = null;

        EObject lv_requests_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:169:28: ( ( ( (lv_type_0_0= 'User' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'belongTo' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= 'source: ' ( (lv_source_6_0= ruleIPAddress ) ) ( (lv_requests_7_0= ruleNormalRequest ) )* otherlv_8= '}' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:170:1: ( ( (lv_type_0_0= 'User' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'belongTo' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= 'source: ' ( (lv_source_6_0= ruleIPAddress ) ) ( (lv_requests_7_0= ruleNormalRequest ) )* otherlv_8= '}' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:170:1: ( ( (lv_type_0_0= 'User' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'belongTo' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= 'source: ' ( (lv_source_6_0= ruleIPAddress ) ) ( (lv_requests_7_0= ruleNormalRequest ) )* otherlv_8= '}' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:170:2: ( (lv_type_0_0= 'User' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'belongTo' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= 'source: ' ( (lv_source_6_0= ruleIPAddress ) ) ( (lv_requests_7_0= ruleNormalRequest ) )* otherlv_8= '}'
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:170:2: ( (lv_type_0_0= 'User' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:171:1: (lv_type_0_0= 'User' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:171:1: (lv_type_0_0= 'User' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:172:3: lv_type_0_0= 'User'
            {
            lv_type_0_0=(Token)match(input,11,FOLLOW_11_in_ruleUser365); 

                    newLeafNode(lv_type_0_0, grammarAccess.getUserAccess().getTypeUserKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUserRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "User");
            	    

            }


            }

            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:185:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:186:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:186:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:187:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUser395); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUserRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUser412); 

                	newLeafNode(otherlv_2, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleUser424); 

                	newLeafNode(otherlv_3, grammarAccess.getUserAccess().getBelongToKeyword_3());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:211:1: ( (lv_filename_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:212:1: (lv_filename_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:212:1: (lv_filename_4_0= RULE_STRING )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:213:3: lv_filename_4_0= RULE_STRING
            {
            lv_filename_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUser441); 

            			newLeafNode(lv_filename_4_0, grammarAccess.getUserAccess().getFilenameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUserRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"filename",
                    		lv_filename_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleUser458); 

                	newLeafNode(otherlv_5, grammarAccess.getUserAccess().getSourceKeyword_5());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:233:1: ( (lv_source_6_0= ruleIPAddress ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:234:1: (lv_source_6_0= ruleIPAddress )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:234:1: (lv_source_6_0= ruleIPAddress )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:235:3: lv_source_6_0= ruleIPAddress
            {
             
            	        newCompositeNode(grammarAccess.getUserAccess().getSourceIPAddressParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleIPAddress_in_ruleUser479);
            lv_source_6_0=ruleIPAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUserRule());
            	        }
                   		set(
                   			current, 
                   			"source",
                    		lv_source_6_0, 
                    		"IPAddress");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:251:2: ( (lv_requests_7_0= ruleNormalRequest ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:252:1: (lv_requests_7_0= ruleNormalRequest )
            	    {
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:252:1: (lv_requests_7_0= ruleNormalRequest )
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:253:3: lv_requests_7_0= ruleNormalRequest
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserAccess().getRequestsNormalRequestParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNormalRequest_in_ruleUser500);
            	    lv_requests_7_0=ruleNormalRequest();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"requests",
            	            		lv_requests_7_0, 
            	            		"NormalRequest");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleUser513); 

                	newLeafNode(otherlv_8, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleAttacker"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:281:1: entryRuleAttacker returns [EObject current=null] : iv_ruleAttacker= ruleAttacker EOF ;
    public final EObject entryRuleAttacker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttacker = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:282:2: (iv_ruleAttacker= ruleAttacker EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:283:2: iv_ruleAttacker= ruleAttacker EOF
            {
             newCompositeNode(grammarAccess.getAttackerRule()); 
            pushFollow(FOLLOW_ruleAttacker_in_entryRuleAttacker549);
            iv_ruleAttacker=ruleAttacker();

            state._fsp--;

             current =iv_ruleAttacker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacker559); 

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
    // $ANTLR end "entryRuleAttacker"


    // $ANTLR start "ruleAttacker"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:290:1: ruleAttacker returns [EObject current=null] : ( ( (lv_type_0_0= 'Attacker' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'belongTo' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= 'source: ' ( (lv_source_6_0= ruleIPAddress ) ) ( (lv_requests_7_0= ruleMaliciousRequest ) )* otherlv_8= '}' ) ;
    public final EObject ruleAttacker() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_filename_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_source_6_0 = null;

        EObject lv_requests_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:293:28: ( ( ( (lv_type_0_0= 'Attacker' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'belongTo' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= 'source: ' ( (lv_source_6_0= ruleIPAddress ) ) ( (lv_requests_7_0= ruleMaliciousRequest ) )* otherlv_8= '}' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:294:1: ( ( (lv_type_0_0= 'Attacker' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'belongTo' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= 'source: ' ( (lv_source_6_0= ruleIPAddress ) ) ( (lv_requests_7_0= ruleMaliciousRequest ) )* otherlv_8= '}' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:294:1: ( ( (lv_type_0_0= 'Attacker' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'belongTo' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= 'source: ' ( (lv_source_6_0= ruleIPAddress ) ) ( (lv_requests_7_0= ruleMaliciousRequest ) )* otherlv_8= '}' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:294:2: ( (lv_type_0_0= 'Attacker' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'belongTo' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= 'source: ' ( (lv_source_6_0= ruleIPAddress ) ) ( (lv_requests_7_0= ruleMaliciousRequest ) )* otherlv_8= '}'
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:294:2: ( (lv_type_0_0= 'Attacker' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:295:1: (lv_type_0_0= 'Attacker' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:295:1: (lv_type_0_0= 'Attacker' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:296:3: lv_type_0_0= 'Attacker'
            {
            lv_type_0_0=(Token)match(input,16,FOLLOW_16_in_ruleAttacker602); 

                    newLeafNode(lv_type_0_0, grammarAccess.getAttackerAccess().getTypeAttackerKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttackerRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Attacker");
            	    

            }


            }

            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:309:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:310:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:310:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:311:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttacker632); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttackerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttackerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAttacker649); 

                	newLeafNode(otherlv_2, grammarAccess.getAttackerAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleAttacker661); 

                	newLeafNode(otherlv_3, grammarAccess.getAttackerAccess().getBelongToKeyword_3());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:335:1: ( (lv_filename_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:336:1: (lv_filename_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:336:1: (lv_filename_4_0= RULE_STRING )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:337:3: lv_filename_4_0= RULE_STRING
            {
            lv_filename_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttacker678); 

            			newLeafNode(lv_filename_4_0, grammarAccess.getAttackerAccess().getFilenameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttackerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"filename",
                    		lv_filename_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleAttacker695); 

                	newLeafNode(otherlv_5, grammarAccess.getAttackerAccess().getSourceKeyword_5());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:357:1: ( (lv_source_6_0= ruleIPAddress ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:358:1: (lv_source_6_0= ruleIPAddress )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:358:1: (lv_source_6_0= ruleIPAddress )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:359:3: lv_source_6_0= ruleIPAddress
            {
             
            	        newCompositeNode(grammarAccess.getAttackerAccess().getSourceIPAddressParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleIPAddress_in_ruleAttacker716);
            lv_source_6_0=ruleIPAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttackerRule());
            	        }
                   		set(
                   			current, 
                   			"source",
                    		lv_source_6_0, 
                    		"IPAddress");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:375:2: ( (lv_requests_7_0= ruleMaliciousRequest ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:376:1: (lv_requests_7_0= ruleMaliciousRequest )
            	    {
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:376:1: (lv_requests_7_0= ruleMaliciousRequest )
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:377:3: lv_requests_7_0= ruleMaliciousRequest
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttackerAccess().getRequestsMaliciousRequestParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMaliciousRequest_in_ruleAttacker737);
            	    lv_requests_7_0=ruleMaliciousRequest();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttackerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"requests",
            	            		lv_requests_7_0, 
            	            		"MaliciousRequest");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleAttacker750); 

                	newLeafNode(otherlv_8, grammarAccess.getAttackerAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleAttacker"


    // $ANTLR start "entryRuleMaliciousRequest"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:407:1: entryRuleMaliciousRequest returns [EObject current=null] : iv_ruleMaliciousRequest= ruleMaliciousRequest EOF ;
    public final EObject entryRuleMaliciousRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaliciousRequest = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:408:2: (iv_ruleMaliciousRequest= ruleMaliciousRequest EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:409:2: iv_ruleMaliciousRequest= ruleMaliciousRequest EOF
            {
             newCompositeNode(grammarAccess.getMaliciousRequestRule()); 
            pushFollow(FOLLOW_ruleMaliciousRequest_in_entryRuleMaliciousRequest788);
            iv_ruleMaliciousRequest=ruleMaliciousRequest();

            state._fsp--;

             current =iv_ruleMaliciousRequest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaliciousRequest798); 

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
    // $ANTLR end "entryRuleMaliciousRequest"


    // $ANTLR start "ruleMaliciousRequest"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:416:1: ruleMaliciousRequest returns [EObject current=null] : (otherlv_0= 'MaliciousRequest' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source: ' ( (lv_source_4_0= ruleIPAddress ) ) otherlv_5= 'destination: ' ( (lv_destination_6_0= ruleIPAddress ) ) otherlv_7= 'port: ' ( (lv_port_8_0= RULE_INT ) ) otherlv_9= 'data: ' ( (lv_data_10_0= RULE_STRING ) ) otherlv_11= 'protocol: ' ( (lv_protocol_12_0= ruleProtocol ) ) otherlv_13= '}' ) ;
    public final EObject ruleMaliciousRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_port_8_0=null;
        Token otherlv_9=null;
        Token lv_data_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_source_4_0 = null;

        EObject lv_destination_6_0 = null;

        Enumerator lv_protocol_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:419:28: ( (otherlv_0= 'MaliciousRequest' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source: ' ( (lv_source_4_0= ruleIPAddress ) ) otherlv_5= 'destination: ' ( (lv_destination_6_0= ruleIPAddress ) ) otherlv_7= 'port: ' ( (lv_port_8_0= RULE_INT ) ) otherlv_9= 'data: ' ( (lv_data_10_0= RULE_STRING ) ) otherlv_11= 'protocol: ' ( (lv_protocol_12_0= ruleProtocol ) ) otherlv_13= '}' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:420:1: (otherlv_0= 'MaliciousRequest' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source: ' ( (lv_source_4_0= ruleIPAddress ) ) otherlv_5= 'destination: ' ( (lv_destination_6_0= ruleIPAddress ) ) otherlv_7= 'port: ' ( (lv_port_8_0= RULE_INT ) ) otherlv_9= 'data: ' ( (lv_data_10_0= RULE_STRING ) ) otherlv_11= 'protocol: ' ( (lv_protocol_12_0= ruleProtocol ) ) otherlv_13= '}' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:420:1: (otherlv_0= 'MaliciousRequest' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source: ' ( (lv_source_4_0= ruleIPAddress ) ) otherlv_5= 'destination: ' ( (lv_destination_6_0= ruleIPAddress ) ) otherlv_7= 'port: ' ( (lv_port_8_0= RULE_INT ) ) otherlv_9= 'data: ' ( (lv_data_10_0= RULE_STRING ) ) otherlv_11= 'protocol: ' ( (lv_protocol_12_0= ruleProtocol ) ) otherlv_13= '}' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:420:3: otherlv_0= 'MaliciousRequest' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source: ' ( (lv_source_4_0= ruleIPAddress ) ) otherlv_5= 'destination: ' ( (lv_destination_6_0= ruleIPAddress ) ) otherlv_7= 'port: ' ( (lv_port_8_0= RULE_INT ) ) otherlv_9= 'data: ' ( (lv_data_10_0= RULE_STRING ) ) otherlv_11= 'protocol: ' ( (lv_protocol_12_0= ruleProtocol ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleMaliciousRequest835); 

                	newLeafNode(otherlv_0, grammarAccess.getMaliciousRequestAccess().getMaliciousRequestKeyword_0());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:424:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:425:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:425:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:426:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMaliciousRequest852); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMaliciousRequestAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMaliciousRequestRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMaliciousRequest869); 

                	newLeafNode(otherlv_2, grammarAccess.getMaliciousRequestAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleMaliciousRequest881); 

                	newLeafNode(otherlv_3, grammarAccess.getMaliciousRequestAccess().getSourceKeyword_3());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:450:1: ( (lv_source_4_0= ruleIPAddress ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:451:1: (lv_source_4_0= ruleIPAddress )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:451:1: (lv_source_4_0= ruleIPAddress )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:452:3: lv_source_4_0= ruleIPAddress
            {
             
            	        newCompositeNode(grammarAccess.getMaliciousRequestAccess().getSourceIPAddressParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleIPAddress_in_ruleMaliciousRequest902);
            lv_source_4_0=ruleIPAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMaliciousRequestRule());
            	        }
                   		set(
                   			current, 
                   			"source",
                    		lv_source_4_0, 
                    		"IPAddress");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleMaliciousRequest914); 

                	newLeafNode(otherlv_5, grammarAccess.getMaliciousRequestAccess().getDestinationKeyword_5());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:472:1: ( (lv_destination_6_0= ruleIPAddress ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:473:1: (lv_destination_6_0= ruleIPAddress )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:473:1: (lv_destination_6_0= ruleIPAddress )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:474:3: lv_destination_6_0= ruleIPAddress
            {
             
            	        newCompositeNode(grammarAccess.getMaliciousRequestAccess().getDestinationIPAddressParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleIPAddress_in_ruleMaliciousRequest935);
            lv_destination_6_0=ruleIPAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMaliciousRequestRule());
            	        }
                   		set(
                   			current, 
                   			"destination",
                    		lv_destination_6_0, 
                    		"IPAddress");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleMaliciousRequest947); 

                	newLeafNode(otherlv_7, grammarAccess.getMaliciousRequestAccess().getPortKeyword_7());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:494:1: ( (lv_port_8_0= RULE_INT ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:495:1: (lv_port_8_0= RULE_INT )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:495:1: (lv_port_8_0= RULE_INT )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:496:3: lv_port_8_0= RULE_INT
            {
            lv_port_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMaliciousRequest964); 

            			newLeafNode(lv_port_8_0, grammarAccess.getMaliciousRequestAccess().getPortINTTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMaliciousRequestRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"port",
                    		lv_port_8_0, 
                    		"INT");
            	    

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleMaliciousRequest981); 

                	newLeafNode(otherlv_9, grammarAccess.getMaliciousRequestAccess().getDataKeyword_9());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:516:1: ( (lv_data_10_0= RULE_STRING ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:517:1: (lv_data_10_0= RULE_STRING )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:517:1: (lv_data_10_0= RULE_STRING )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:518:3: lv_data_10_0= RULE_STRING
            {
            lv_data_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMaliciousRequest998); 

            			newLeafNode(lv_data_10_0, grammarAccess.getMaliciousRequestAccess().getDataSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMaliciousRequestRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"data",
                    		lv_data_10_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleMaliciousRequest1015); 

                	newLeafNode(otherlv_11, grammarAccess.getMaliciousRequestAccess().getProtocolKeyword_11());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:538:1: ( (lv_protocol_12_0= ruleProtocol ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:539:1: (lv_protocol_12_0= ruleProtocol )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:539:1: (lv_protocol_12_0= ruleProtocol )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:540:3: lv_protocol_12_0= ruleProtocol
            {
             
            	        newCompositeNode(grammarAccess.getMaliciousRequestAccess().getProtocolProtocolEnumRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleProtocol_in_ruleMaliciousRequest1036);
            lv_protocol_12_0=ruleProtocol();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMaliciousRequestRule());
            	        }
                   		set(
                   			current, 
                   			"protocol",
                    		lv_protocol_12_0, 
                    		"Protocol");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleMaliciousRequest1048); 

                	newLeafNode(otherlv_13, grammarAccess.getMaliciousRequestAccess().getRightCurlyBracketKeyword_13());
                

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
    // $ANTLR end "ruleMaliciousRequest"


    // $ANTLR start "entryRuleNormalRequest"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:568:1: entryRuleNormalRequest returns [EObject current=null] : iv_ruleNormalRequest= ruleNormalRequest EOF ;
    public final EObject entryRuleNormalRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalRequest = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:569:2: (iv_ruleNormalRequest= ruleNormalRequest EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:570:2: iv_ruleNormalRequest= ruleNormalRequest EOF
            {
             newCompositeNode(grammarAccess.getNormalRequestRule()); 
            pushFollow(FOLLOW_ruleNormalRequest_in_entryRuleNormalRequest1084);
            iv_ruleNormalRequest=ruleNormalRequest();

            state._fsp--;

             current =iv_ruleNormalRequest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalRequest1094); 

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
    // $ANTLR end "entryRuleNormalRequest"


    // $ANTLR start "ruleNormalRequest"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:577:1: ruleNormalRequest returns [EObject current=null] : (otherlv_0= 'NormalRequest' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source: ' ( (lv_source_4_0= ruleIPAddress ) ) otherlv_5= 'destination: ' ( (lv_destination_6_0= ruleIPAddress ) ) otherlv_7= 'port: ' ( (lv_port_8_0= RULE_INT ) ) otherlv_9= 'data: ' ( (lv_data_10_0= RULE_STRING ) ) otherlv_11= 'protocol: ' ( (lv_protocol_12_0= ruleProtocol ) ) otherlv_13= '}' ) ;
    public final EObject ruleNormalRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_port_8_0=null;
        Token otherlv_9=null;
        Token lv_data_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_source_4_0 = null;

        EObject lv_destination_6_0 = null;

        Enumerator lv_protocol_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:580:28: ( (otherlv_0= 'NormalRequest' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source: ' ( (lv_source_4_0= ruleIPAddress ) ) otherlv_5= 'destination: ' ( (lv_destination_6_0= ruleIPAddress ) ) otherlv_7= 'port: ' ( (lv_port_8_0= RULE_INT ) ) otherlv_9= 'data: ' ( (lv_data_10_0= RULE_STRING ) ) otherlv_11= 'protocol: ' ( (lv_protocol_12_0= ruleProtocol ) ) otherlv_13= '}' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:581:1: (otherlv_0= 'NormalRequest' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source: ' ( (lv_source_4_0= ruleIPAddress ) ) otherlv_5= 'destination: ' ( (lv_destination_6_0= ruleIPAddress ) ) otherlv_7= 'port: ' ( (lv_port_8_0= RULE_INT ) ) otherlv_9= 'data: ' ( (lv_data_10_0= RULE_STRING ) ) otherlv_11= 'protocol: ' ( (lv_protocol_12_0= ruleProtocol ) ) otherlv_13= '}' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:581:1: (otherlv_0= 'NormalRequest' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source: ' ( (lv_source_4_0= ruleIPAddress ) ) otherlv_5= 'destination: ' ( (lv_destination_6_0= ruleIPAddress ) ) otherlv_7= 'port: ' ( (lv_port_8_0= RULE_INT ) ) otherlv_9= 'data: ' ( (lv_data_10_0= RULE_STRING ) ) otherlv_11= 'protocol: ' ( (lv_protocol_12_0= ruleProtocol ) ) otherlv_13= '}' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:581:3: otherlv_0= 'NormalRequest' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source: ' ( (lv_source_4_0= ruleIPAddress ) ) otherlv_5= 'destination: ' ( (lv_destination_6_0= ruleIPAddress ) ) otherlv_7= 'port: ' ( (lv_port_8_0= RULE_INT ) ) otherlv_9= 'data: ' ( (lv_data_10_0= RULE_STRING ) ) otherlv_11= 'protocol: ' ( (lv_protocol_12_0= ruleProtocol ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleNormalRequest1131); 

                	newLeafNode(otherlv_0, grammarAccess.getNormalRequestAccess().getNormalRequestKeyword_0());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:585:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:586:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:586:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:587:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNormalRequest1148); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNormalRequestAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNormalRequestRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleNormalRequest1165); 

                	newLeafNode(otherlv_2, grammarAccess.getNormalRequestAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleNormalRequest1177); 

                	newLeafNode(otherlv_3, grammarAccess.getNormalRequestAccess().getSourceKeyword_3());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:611:1: ( (lv_source_4_0= ruleIPAddress ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:612:1: (lv_source_4_0= ruleIPAddress )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:612:1: (lv_source_4_0= ruleIPAddress )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:613:3: lv_source_4_0= ruleIPAddress
            {
             
            	        newCompositeNode(grammarAccess.getNormalRequestAccess().getSourceIPAddressParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleIPAddress_in_ruleNormalRequest1198);
            lv_source_4_0=ruleIPAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNormalRequestRule());
            	        }
                   		set(
                   			current, 
                   			"source",
                    		lv_source_4_0, 
                    		"IPAddress");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleNormalRequest1210); 

                	newLeafNode(otherlv_5, grammarAccess.getNormalRequestAccess().getDestinationKeyword_5());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:633:1: ( (lv_destination_6_0= ruleIPAddress ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:634:1: (lv_destination_6_0= ruleIPAddress )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:634:1: (lv_destination_6_0= ruleIPAddress )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:635:3: lv_destination_6_0= ruleIPAddress
            {
             
            	        newCompositeNode(grammarAccess.getNormalRequestAccess().getDestinationIPAddressParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleIPAddress_in_ruleNormalRequest1231);
            lv_destination_6_0=ruleIPAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNormalRequestRule());
            	        }
                   		set(
                   			current, 
                   			"destination",
                    		lv_destination_6_0, 
                    		"IPAddress");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleNormalRequest1243); 

                	newLeafNode(otherlv_7, grammarAccess.getNormalRequestAccess().getPortKeyword_7());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:655:1: ( (lv_port_8_0= RULE_INT ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:656:1: (lv_port_8_0= RULE_INT )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:656:1: (lv_port_8_0= RULE_INT )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:657:3: lv_port_8_0= RULE_INT
            {
            lv_port_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNormalRequest1260); 

            			newLeafNode(lv_port_8_0, grammarAccess.getNormalRequestAccess().getPortINTTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNormalRequestRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"port",
                    		lv_port_8_0, 
                    		"INT");
            	    

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleNormalRequest1277); 

                	newLeafNode(otherlv_9, grammarAccess.getNormalRequestAccess().getDataKeyword_9());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:677:1: ( (lv_data_10_0= RULE_STRING ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:678:1: (lv_data_10_0= RULE_STRING )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:678:1: (lv_data_10_0= RULE_STRING )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:679:3: lv_data_10_0= RULE_STRING
            {
            lv_data_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNormalRequest1294); 

            			newLeafNode(lv_data_10_0, grammarAccess.getNormalRequestAccess().getDataSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNormalRequestRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"data",
                    		lv_data_10_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleNormalRequest1311); 

                	newLeafNode(otherlv_11, grammarAccess.getNormalRequestAccess().getProtocolKeyword_11());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:699:1: ( (lv_protocol_12_0= ruleProtocol ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:700:1: (lv_protocol_12_0= ruleProtocol )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:700:1: (lv_protocol_12_0= ruleProtocol )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:701:3: lv_protocol_12_0= ruleProtocol
            {
             
            	        newCompositeNode(grammarAccess.getNormalRequestAccess().getProtocolProtocolEnumRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleProtocol_in_ruleNormalRequest1332);
            lv_protocol_12_0=ruleProtocol();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNormalRequestRule());
            	        }
                   		set(
                   			current, 
                   			"protocol",
                    		lv_protocol_12_0, 
                    		"Protocol");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleNormalRequest1344); 

                	newLeafNode(otherlv_13, grammarAccess.getNormalRequestAccess().getRightCurlyBracketKeyword_13());
                

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
    // $ANTLR end "ruleNormalRequest"


    // $ANTLR start "entryRuleDefender"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:729:1: entryRuleDefender returns [EObject current=null] : iv_ruleDefender= ruleDefender EOF ;
    public final EObject entryRuleDefender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefender = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:730:2: (iv_ruleDefender= ruleDefender EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:731:2: iv_ruleDefender= ruleDefender EOF
            {
             newCompositeNode(grammarAccess.getDefenderRule()); 
            pushFollow(FOLLOW_ruleDefender_in_entryRuleDefender1380);
            iv_ruleDefender=ruleDefender();

            state._fsp--;

             current =iv_ruleDefender; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefender1390); 

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
    // $ANTLR end "entryRuleDefender"


    // $ANTLR start "ruleDefender"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:738:1: ruleDefender returns [EObject current=null] : ( ( (lv_type_0_0= 'Defender' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'belongTo' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= 'source: ' ( (lv_source_6_0= ruleIPAddress ) ) ( (lv_securityPolicylist_7_0= ruleSecurityPolicyList ) ) otherlv_8= '}' ) ;
    public final EObject ruleDefender() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_filename_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_source_6_0 = null;

        EObject lv_securityPolicylist_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:741:28: ( ( ( (lv_type_0_0= 'Defender' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'belongTo' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= 'source: ' ( (lv_source_6_0= ruleIPAddress ) ) ( (lv_securityPolicylist_7_0= ruleSecurityPolicyList ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:742:1: ( ( (lv_type_0_0= 'Defender' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'belongTo' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= 'source: ' ( (lv_source_6_0= ruleIPAddress ) ) ( (lv_securityPolicylist_7_0= ruleSecurityPolicyList ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:742:1: ( ( (lv_type_0_0= 'Defender' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'belongTo' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= 'source: ' ( (lv_source_6_0= ruleIPAddress ) ) ( (lv_securityPolicylist_7_0= ruleSecurityPolicyList ) ) otherlv_8= '}' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:742:2: ( (lv_type_0_0= 'Defender' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'belongTo' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= 'source: ' ( (lv_source_6_0= ruleIPAddress ) ) ( (lv_securityPolicylist_7_0= ruleSecurityPolicyList ) ) otherlv_8= '}'
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:742:2: ( (lv_type_0_0= 'Defender' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:743:1: (lv_type_0_0= 'Defender' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:743:1: (lv_type_0_0= 'Defender' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:744:3: lv_type_0_0= 'Defender'
            {
            lv_type_0_0=(Token)match(input,23,FOLLOW_23_in_ruleDefender1433); 

                    newLeafNode(lv_type_0_0, grammarAccess.getDefenderAccess().getTypeDefenderKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefenderRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_0_0, "Defender");
            	    

            }


            }

            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:757:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:758:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:758:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:759:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefender1463); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDefenderAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefenderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDefender1480); 

                	newLeafNode(otherlv_2, grammarAccess.getDefenderAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDefender1492); 

                	newLeafNode(otherlv_3, grammarAccess.getDefenderAccess().getBelongToKeyword_3());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:783:1: ( (lv_filename_4_0= RULE_STRING ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:784:1: (lv_filename_4_0= RULE_STRING )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:784:1: (lv_filename_4_0= RULE_STRING )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:785:3: lv_filename_4_0= RULE_STRING
            {
            lv_filename_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefender1509); 

            			newLeafNode(lv_filename_4_0, grammarAccess.getDefenderAccess().getFilenameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefenderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"filename",
                    		lv_filename_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleDefender1526); 

                	newLeafNode(otherlv_5, grammarAccess.getDefenderAccess().getSourceKeyword_5());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:805:1: ( (lv_source_6_0= ruleIPAddress ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:806:1: (lv_source_6_0= ruleIPAddress )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:806:1: (lv_source_6_0= ruleIPAddress )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:807:3: lv_source_6_0= ruleIPAddress
            {
             
            	        newCompositeNode(grammarAccess.getDefenderAccess().getSourceIPAddressParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleIPAddress_in_ruleDefender1547);
            lv_source_6_0=ruleIPAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefenderRule());
            	        }
                   		set(
                   			current, 
                   			"source",
                    		lv_source_6_0, 
                    		"IPAddress");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:823:2: ( (lv_securityPolicylist_7_0= ruleSecurityPolicyList ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:824:1: (lv_securityPolicylist_7_0= ruleSecurityPolicyList )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:824:1: (lv_securityPolicylist_7_0= ruleSecurityPolicyList )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:825:3: lv_securityPolicylist_7_0= ruleSecurityPolicyList
            {
             
            	        newCompositeNode(grammarAccess.getDefenderAccess().getSecurityPolicylistSecurityPolicyListParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleSecurityPolicyList_in_ruleDefender1568);
            lv_securityPolicylist_7_0=ruleSecurityPolicyList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefenderRule());
            	        }
                   		set(
                   			current, 
                   			"securityPolicylist",
                    		lv_securityPolicylist_7_0, 
                    		"SecurityPolicyList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleDefender1580); 

                	newLeafNode(otherlv_8, grammarAccess.getDefenderAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleDefender"


    // $ANTLR start "entryRuleSecurityPolicyList"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:853:1: entryRuleSecurityPolicyList returns [EObject current=null] : iv_ruleSecurityPolicyList= ruleSecurityPolicyList EOF ;
    public final EObject entryRuleSecurityPolicyList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityPolicyList = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:854:2: (iv_ruleSecurityPolicyList= ruleSecurityPolicyList EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:855:2: iv_ruleSecurityPolicyList= ruleSecurityPolicyList EOF
            {
             newCompositeNode(grammarAccess.getSecurityPolicyListRule()); 
            pushFollow(FOLLOW_ruleSecurityPolicyList_in_entryRuleSecurityPolicyList1616);
            iv_ruleSecurityPolicyList=ruleSecurityPolicyList();

            state._fsp--;

             current =iv_ruleSecurityPolicyList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityPolicyList1626); 

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
    // $ANTLR end "entryRuleSecurityPolicyList"


    // $ANTLR start "ruleSecurityPolicyList"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:862:1: ruleSecurityPolicyList returns [EObject current=null] : (otherlv_0= 'SecurityPolicyList' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_securityPolicies_3_0= ruleSecurityPolicy ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' ) ;
    public final EObject ruleSecurityPolicyList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_securityPolicies_3_0 = null;

        EObject lv_conditions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:865:28: ( (otherlv_0= 'SecurityPolicyList' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_securityPolicies_3_0= ruleSecurityPolicy ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:866:1: (otherlv_0= 'SecurityPolicyList' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_securityPolicies_3_0= ruleSecurityPolicy ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:866:1: (otherlv_0= 'SecurityPolicyList' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_securityPolicies_3_0= ruleSecurityPolicy ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:866:3: otherlv_0= 'SecurityPolicyList' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_securityPolicies_3_0= ruleSecurityPolicy ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleSecurityPolicyList1663); 

                	newLeafNode(otherlv_0, grammarAccess.getSecurityPolicyListAccess().getSecurityPolicyListKeyword_0());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:870:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:871:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:871:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:872:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSecurityPolicyList1680); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSecurityPolicyListAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSecurityPolicyListRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSecurityPolicyList1697); 

                	newLeafNode(otherlv_2, grammarAccess.getSecurityPolicyListAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:892:1: ( (lv_securityPolicies_3_0= ruleSecurityPolicy ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:893:1: (lv_securityPolicies_3_0= ruleSecurityPolicy )
            	    {
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:893:1: (lv_securityPolicies_3_0= ruleSecurityPolicy )
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:894:3: lv_securityPolicies_3_0= ruleSecurityPolicy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSecurityPolicyListAccess().getSecurityPoliciesSecurityPolicyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSecurityPolicy_in_ruleSecurityPolicyList1718);
            	    lv_securityPolicies_3_0=ruleSecurityPolicy();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSecurityPolicyListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"securityPolicies",
            	            		lv_securityPolicies_3_0, 
            	            		"SecurityPolicy");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:910:3: ( (lv_conditions_4_0= ruleCondition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:911:1: (lv_conditions_4_0= ruleCondition )
            	    {
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:911:1: (lv_conditions_4_0= ruleCondition )
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:912:3: lv_conditions_4_0= ruleCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSecurityPolicyListAccess().getConditionsConditionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCondition_in_ruleSecurityPolicyList1740);
            	    lv_conditions_4_0=ruleCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSecurityPolicyListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conditions",
            	            		lv_conditions_4_0, 
            	            		"Condition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleSecurityPolicyList1753); 

                	newLeafNode(otherlv_5, grammarAccess.getSecurityPolicyListAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleSecurityPolicyList"


    // $ANTLR start "entryRuleSecurityPolicy"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:940:1: entryRuleSecurityPolicy returns [EObject current=null] : iv_ruleSecurityPolicy= ruleSecurityPolicy EOF ;
    public final EObject entryRuleSecurityPolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityPolicy = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:941:2: (iv_ruleSecurityPolicy= ruleSecurityPolicy EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:942:2: iv_ruleSecurityPolicy= ruleSecurityPolicy EOF
            {
             newCompositeNode(grammarAccess.getSecurityPolicyRule()); 
            pushFollow(FOLLOW_ruleSecurityPolicy_in_entryRuleSecurityPolicy1789);
            iv_ruleSecurityPolicy=ruleSecurityPolicy();

            state._fsp--;

             current =iv_ruleSecurityPolicy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityPolicy1799); 

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
    // $ANTLR end "entryRuleSecurityPolicy"


    // $ANTLR start "ruleSecurityPolicy"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:949:1: ruleSecurityPolicy returns [EObject current=null] : (otherlv_0= 'SecurityPolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_endPoint_3_0= ruleEndPoint ) ) otherlv_4= 'if' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) ( ( ( (lv_operationList_7_1= '&' | lv_operationList_7_2= '|' ) ) ) ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' otherlv_10= 'then' ( (lv_trueActionList_11_0= ruleAction ) ) (otherlv_12= '&' ( (lv_trueActionList_13_0= ruleAction ) ) )* otherlv_14= 'otherwise' ( (lv_falseActionList_15_0= ruleAction ) ) (otherlv_16= '&' ( (lv_falseActionList_17_0= ruleAction ) ) )* otherlv_18= '}' ) ;
    public final EObject ruleSecurityPolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_operationList_7_1=null;
        Token lv_operationList_7_2=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_endPoint_3_0 = null;

        EObject lv_trueActionList_11_0 = null;

        EObject lv_trueActionList_13_0 = null;

        EObject lv_falseActionList_15_0 = null;

        EObject lv_falseActionList_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:952:28: ( (otherlv_0= 'SecurityPolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_endPoint_3_0= ruleEndPoint ) ) otherlv_4= 'if' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) ( ( ( (lv_operationList_7_1= '&' | lv_operationList_7_2= '|' ) ) ) ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' otherlv_10= 'then' ( (lv_trueActionList_11_0= ruleAction ) ) (otherlv_12= '&' ( (lv_trueActionList_13_0= ruleAction ) ) )* otherlv_14= 'otherwise' ( (lv_falseActionList_15_0= ruleAction ) ) (otherlv_16= '&' ( (lv_falseActionList_17_0= ruleAction ) ) )* otherlv_18= '}' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:953:1: (otherlv_0= 'SecurityPolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_endPoint_3_0= ruleEndPoint ) ) otherlv_4= 'if' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) ( ( ( (lv_operationList_7_1= '&' | lv_operationList_7_2= '|' ) ) ) ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' otherlv_10= 'then' ( (lv_trueActionList_11_0= ruleAction ) ) (otherlv_12= '&' ( (lv_trueActionList_13_0= ruleAction ) ) )* otherlv_14= 'otherwise' ( (lv_falseActionList_15_0= ruleAction ) ) (otherlv_16= '&' ( (lv_falseActionList_17_0= ruleAction ) ) )* otherlv_18= '}' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:953:1: (otherlv_0= 'SecurityPolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_endPoint_3_0= ruleEndPoint ) ) otherlv_4= 'if' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) ( ( ( (lv_operationList_7_1= '&' | lv_operationList_7_2= '|' ) ) ) ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' otherlv_10= 'then' ( (lv_trueActionList_11_0= ruleAction ) ) (otherlv_12= '&' ( (lv_trueActionList_13_0= ruleAction ) ) )* otherlv_14= 'otherwise' ( (lv_falseActionList_15_0= ruleAction ) ) (otherlv_16= '&' ( (lv_falseActionList_17_0= ruleAction ) ) )* otherlv_18= '}' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:953:3: otherlv_0= 'SecurityPolicy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_endPoint_3_0= ruleEndPoint ) ) otherlv_4= 'if' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) ( ( ( (lv_operationList_7_1= '&' | lv_operationList_7_2= '|' ) ) ) ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' otherlv_10= 'then' ( (lv_trueActionList_11_0= ruleAction ) ) (otherlv_12= '&' ( (lv_trueActionList_13_0= ruleAction ) ) )* otherlv_14= 'otherwise' ( (lv_falseActionList_15_0= ruleAction ) ) (otherlv_16= '&' ( (lv_falseActionList_17_0= ruleAction ) ) )* otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleSecurityPolicy1836); 

                	newLeafNode(otherlv_0, grammarAccess.getSecurityPolicyAccess().getSecurityPolicyKeyword_0());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:957:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:958:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:958:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:959:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSecurityPolicy1853); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSecurityPolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSecurityPolicyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSecurityPolicy1870); 

                	newLeafNode(otherlv_2, grammarAccess.getSecurityPolicyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:979:1: ( (lv_endPoint_3_0= ruleEndPoint ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:980:1: (lv_endPoint_3_0= ruleEndPoint )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:980:1: (lv_endPoint_3_0= ruleEndPoint )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:981:3: lv_endPoint_3_0= ruleEndPoint
            {
             
            	        newCompositeNode(grammarAccess.getSecurityPolicyAccess().getEndPointEndPointParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEndPoint_in_ruleSecurityPolicy1891);
            lv_endPoint_3_0=ruleEndPoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSecurityPolicyRule());
            	        }
                   		set(
                   			current, 
                   			"endPoint",
                    		lv_endPoint_3_0, 
                    		"EndPoint");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleSecurityPolicy1903); 

                	newLeafNode(otherlv_4, grammarAccess.getSecurityPolicyAccess().getIfKeyword_4());
                
            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleSecurityPolicy1915); 

                	newLeafNode(otherlv_5, grammarAccess.getSecurityPolicyAccess().getLeftParenthesisKeyword_5());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1005:1: ( (otherlv_6= RULE_ID ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1006:1: (otherlv_6= RULE_ID )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1006:1: (otherlv_6= RULE_ID )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1007:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSecurityPolicyRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSecurityPolicy1935); 

            		newLeafNode(otherlv_6, grammarAccess.getSecurityPolicyAccess().getConditionlistConditionCrossReference_6_0()); 
            	

            }


            }

            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1018:2: ( ( ( (lv_operationList_7_1= '&' | lv_operationList_7_2= '|' ) ) ) ( (otherlv_8= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=28 && LA8_0<=29)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1018:3: ( ( (lv_operationList_7_1= '&' | lv_operationList_7_2= '|' ) ) ) ( (otherlv_8= RULE_ID ) )
            	    {
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1018:3: ( ( (lv_operationList_7_1= '&' | lv_operationList_7_2= '|' ) ) )
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1019:1: ( (lv_operationList_7_1= '&' | lv_operationList_7_2= '|' ) )
            	    {
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1019:1: ( (lv_operationList_7_1= '&' | lv_operationList_7_2= '|' ) )
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1020:1: (lv_operationList_7_1= '&' | lv_operationList_7_2= '|' )
            	    {
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1020:1: (lv_operationList_7_1= '&' | lv_operationList_7_2= '|' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==28) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==29) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1021:3: lv_operationList_7_1= '&'
            	            {
            	            lv_operationList_7_1=(Token)match(input,28,FOLLOW_28_in_ruleSecurityPolicy1956); 

            	                    newLeafNode(lv_operationList_7_1, grammarAccess.getSecurityPolicyAccess().getOperationListAmpersandKeyword_7_0_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getSecurityPolicyRule());
            	            	        }
            	                   		addWithLastConsumed(current, "operationList", lv_operationList_7_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1033:8: lv_operationList_7_2= '|'
            	            {
            	            lv_operationList_7_2=(Token)match(input,29,FOLLOW_29_in_ruleSecurityPolicy1985); 

            	                    newLeafNode(lv_operationList_7_2, grammarAccess.getSecurityPolicyAccess().getOperationListVerticalLineKeyword_7_0_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getSecurityPolicyRule());
            	            	        }
            	                   		addWithLastConsumed(current, "operationList", lv_operationList_7_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1048:2: ( (otherlv_8= RULE_ID ) )
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1049:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1049:1: (otherlv_8= RULE_ID )
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1050:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSecurityPolicyRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSecurityPolicy2021); 

            	    		newLeafNode(otherlv_8, grammarAccess.getSecurityPolicyAccess().getConditionlistConditionCrossReference_7_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleSecurityPolicy2035); 

                	newLeafNode(otherlv_9, grammarAccess.getSecurityPolicyAccess().getRightParenthesisKeyword_8());
                
            otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleSecurityPolicy2047); 

                	newLeafNode(otherlv_10, grammarAccess.getSecurityPolicyAccess().getThenKeyword_9());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1069:1: ( (lv_trueActionList_11_0= ruleAction ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1070:1: (lv_trueActionList_11_0= ruleAction )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1070:1: (lv_trueActionList_11_0= ruleAction )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1071:3: lv_trueActionList_11_0= ruleAction
            {
             
            	        newCompositeNode(grammarAccess.getSecurityPolicyAccess().getTrueActionListActionParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleAction_in_ruleSecurityPolicy2068);
            lv_trueActionList_11_0=ruleAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSecurityPolicyRule());
            	        }
                   		add(
                   			current, 
                   			"trueActionList",
                    		lv_trueActionList_11_0, 
                    		"Action");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1087:2: (otherlv_12= '&' ( (lv_trueActionList_13_0= ruleAction ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1087:4: otherlv_12= '&' ( (lv_trueActionList_13_0= ruleAction ) )
            	    {
            	    otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleSecurityPolicy2081); 

            	        	newLeafNode(otherlv_12, grammarAccess.getSecurityPolicyAccess().getAmpersandKeyword_11_0());
            	        
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1091:1: ( (lv_trueActionList_13_0= ruleAction ) )
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1092:1: (lv_trueActionList_13_0= ruleAction )
            	    {
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1092:1: (lv_trueActionList_13_0= ruleAction )
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1093:3: lv_trueActionList_13_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSecurityPolicyAccess().getTrueActionListActionParserRuleCall_11_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleSecurityPolicy2102);
            	    lv_trueActionList_13_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSecurityPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"trueActionList",
            	            		lv_trueActionList_13_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_14=(Token)match(input,32,FOLLOW_32_in_ruleSecurityPolicy2116); 

                	newLeafNode(otherlv_14, grammarAccess.getSecurityPolicyAccess().getOtherwiseKeyword_12());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1113:1: ( (lv_falseActionList_15_0= ruleAction ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1114:1: (lv_falseActionList_15_0= ruleAction )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1114:1: (lv_falseActionList_15_0= ruleAction )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1115:3: lv_falseActionList_15_0= ruleAction
            {
             
            	        newCompositeNode(grammarAccess.getSecurityPolicyAccess().getFalseActionListActionParserRuleCall_13_0()); 
            	    
            pushFollow(FOLLOW_ruleAction_in_ruleSecurityPolicy2137);
            lv_falseActionList_15_0=ruleAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSecurityPolicyRule());
            	        }
                   		add(
                   			current, 
                   			"falseActionList",
                    		lv_falseActionList_15_0, 
                    		"Action");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1131:2: (otherlv_16= '&' ( (lv_falseActionList_17_0= ruleAction ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1131:4: otherlv_16= '&' ( (lv_falseActionList_17_0= ruleAction ) )
            	    {
            	    otherlv_16=(Token)match(input,28,FOLLOW_28_in_ruleSecurityPolicy2150); 

            	        	newLeafNode(otherlv_16, grammarAccess.getSecurityPolicyAccess().getAmpersandKeyword_14_0());
            	        
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1135:1: ( (lv_falseActionList_17_0= ruleAction ) )
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1136:1: (lv_falseActionList_17_0= ruleAction )
            	    {
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1136:1: (lv_falseActionList_17_0= ruleAction )
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1137:3: lv_falseActionList_17_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSecurityPolicyAccess().getFalseActionListActionParserRuleCall_14_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleSecurityPolicy2171);
            	    lv_falseActionList_17_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSecurityPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"falseActionList",
            	            		lv_falseActionList_17_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleSecurityPolicy2185); 

                	newLeafNode(otherlv_18, grammarAccess.getSecurityPolicyAccess().getRightCurlyBracketKeyword_15());
                

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
    // $ANTLR end "ruleSecurityPolicy"


    // $ANTLR start "entryRuleCondition"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1165:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1166:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1167:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition2221);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition2231); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1174:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subConditionList_3_0= ruleSubCondition ) ) (otherlv_4= '&' ( (lv_subConditionList_5_0= ruleSubCondition ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_subConditionList_3_0 = null;

        EObject lv_subConditionList_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1177:28: ( (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subConditionList_3_0= ruleSubCondition ) ) (otherlv_4= '&' ( (lv_subConditionList_5_0= ruleSubCondition ) ) )* otherlv_6= '}' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1178:1: (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subConditionList_3_0= ruleSubCondition ) ) (otherlv_4= '&' ( (lv_subConditionList_5_0= ruleSubCondition ) ) )* otherlv_6= '}' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1178:1: (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subConditionList_3_0= ruleSubCondition ) ) (otherlv_4= '&' ( (lv_subConditionList_5_0= ruleSubCondition ) ) )* otherlv_6= '}' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1178:3: otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subConditionList_3_0= ruleSubCondition ) ) (otherlv_4= '&' ( (lv_subConditionList_5_0= ruleSubCondition ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleCondition2268); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1182:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1183:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1183:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1184:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCondition2285); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCondition2302); 

                	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1204:1: ( (lv_subConditionList_3_0= ruleSubCondition ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1205:1: (lv_subConditionList_3_0= ruleSubCondition )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1205:1: (lv_subConditionList_3_0= ruleSubCondition )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1206:3: lv_subConditionList_3_0= ruleSubCondition
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getSubConditionListSubConditionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSubCondition_in_ruleCondition2323);
            lv_subConditionList_3_0=ruleSubCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	        }
                   		add(
                   			current, 
                   			"subConditionList",
                    		lv_subConditionList_3_0, 
                    		"SubCondition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1222:2: (otherlv_4= '&' ( (lv_subConditionList_5_0= ruleSubCondition ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1222:4: otherlv_4= '&' ( (lv_subConditionList_5_0= ruleSubCondition ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleCondition2336); 

            	        	newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getAmpersandKeyword_4_0());
            	        
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1226:1: ( (lv_subConditionList_5_0= ruleSubCondition ) )
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1227:1: (lv_subConditionList_5_0= ruleSubCondition )
            	    {
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1227:1: (lv_subConditionList_5_0= ruleSubCondition )
            	    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1228:3: lv_subConditionList_5_0= ruleSubCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionAccess().getSubConditionListSubConditionParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSubCondition_in_ruleCondition2357);
            	    lv_subConditionList_5_0=ruleSubCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subConditionList",
            	            		lv_subConditionList_5_0, 
            	            		"SubCondition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleCondition2371); 

                	newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAction"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1256:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1257:2: (iv_ruleAction= ruleAction EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1258:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction2407);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction2417); 

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
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1265:1: ruleAction returns [EObject current=null] : (this_DropRequest_0= ruleDropRequest | this_BlockSender_1= ruleBlockSender | this_PassRequest_2= rulePassRequest ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_DropRequest_0 = null;

        EObject this_BlockSender_1 = null;

        EObject this_PassRequest_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1268:28: ( (this_DropRequest_0= ruleDropRequest | this_BlockSender_1= ruleBlockSender | this_PassRequest_2= rulePassRequest ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1269:1: (this_DropRequest_0= ruleDropRequest | this_BlockSender_1= ruleBlockSender | this_PassRequest_2= rulePassRequest )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1269:1: (this_DropRequest_0= ruleDropRequest | this_BlockSender_1= ruleBlockSender | this_PassRequest_2= rulePassRequest )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt12=1;
                }
                break;
            case 49:
                {
                alt12=2;
                }
                break;
            case 50:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1270:5: this_DropRequest_0= ruleDropRequest
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getDropRequestParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDropRequest_in_ruleAction2464);
                    this_DropRequest_0=ruleDropRequest();

                    state._fsp--;

                     
                            current = this_DropRequest_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1280:5: this_BlockSender_1= ruleBlockSender
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getBlockSenderParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBlockSender_in_ruleAction2491);
                    this_BlockSender_1=ruleBlockSender();

                    state._fsp--;

                     
                            current = this_BlockSender_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1290:5: this_PassRequest_2= rulePassRequest
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getPassRequestParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePassRequest_in_ruleAction2518);
                    this_PassRequest_2=rulePassRequest();

                    state._fsp--;

                     
                            current = this_PassRequest_2; 
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleSubCondition"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1306:1: entryRuleSubCondition returns [EObject current=null] : iv_ruleSubCondition= ruleSubCondition EOF ;
    public final EObject entryRuleSubCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubCondition = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1307:2: (iv_ruleSubCondition= ruleSubCondition EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1308:2: iv_ruleSubCondition= ruleSubCondition EOF
            {
             newCompositeNode(grammarAccess.getSubConditionRule()); 
            pushFollow(FOLLOW_ruleSubCondition_in_entryRuleSubCondition2553);
            iv_ruleSubCondition=ruleSubCondition();

            state._fsp--;

             current =iv_ruleSubCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubCondition2563); 

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
    // $ANTLR end "entryRuleSubCondition"


    // $ANTLR start "ruleSubCondition"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1315:1: ruleSubCondition returns [EObject current=null] : (this_ProtocolCheck_0= ruleProtocolCheck | this_HTTPMethodCheck_1= ruleHTTPMethodCheck | this_RegExpMatch_2= ruleRegExpMatch | this_FrequencyCheck_3= ruleFrequencyCheck | this_HTTPParamLenCheck_4= ruleHTTPParamLenCheck ) ;
    public final EObject ruleSubCondition() throws RecognitionException {
        EObject current = null;

        EObject this_ProtocolCheck_0 = null;

        EObject this_HTTPMethodCheck_1 = null;

        EObject this_RegExpMatch_2 = null;

        EObject this_FrequencyCheck_3 = null;

        EObject this_HTTPParamLenCheck_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1318:28: ( (this_ProtocolCheck_0= ruleProtocolCheck | this_HTTPMethodCheck_1= ruleHTTPMethodCheck | this_RegExpMatch_2= ruleRegExpMatch | this_FrequencyCheck_3= ruleFrequencyCheck | this_HTTPParamLenCheck_4= ruleHTTPParamLenCheck ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1319:1: (this_ProtocolCheck_0= ruleProtocolCheck | this_HTTPMethodCheck_1= ruleHTTPMethodCheck | this_RegExpMatch_2= ruleRegExpMatch | this_FrequencyCheck_3= ruleFrequencyCheck | this_HTTPParamLenCheck_4= ruleHTTPParamLenCheck )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1319:1: (this_ProtocolCheck_0= ruleProtocolCheck | this_HTTPMethodCheck_1= ruleHTTPMethodCheck | this_RegExpMatch_2= ruleRegExpMatch | this_FrequencyCheck_3= ruleFrequencyCheck | this_HTTPParamLenCheck_4= ruleHTTPParamLenCheck )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt13=1;
                }
                break;
            case 35:
                {
                alt13=2;
                }
                break;
            case 41:
                {
                alt13=3;
                }
                break;
            case 42:
                {
                alt13=4;
                }
                break;
            case 43:
            case 44:
            case 45:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1320:5: this_ProtocolCheck_0= ruleProtocolCheck
                    {
                     
                            newCompositeNode(grammarAccess.getSubConditionAccess().getProtocolCheckParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleProtocolCheck_in_ruleSubCondition2610);
                    this_ProtocolCheck_0=ruleProtocolCheck();

                    state._fsp--;

                     
                            current = this_ProtocolCheck_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1330:5: this_HTTPMethodCheck_1= ruleHTTPMethodCheck
                    {
                     
                            newCompositeNode(grammarAccess.getSubConditionAccess().getHTTPMethodCheckParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHTTPMethodCheck_in_ruleSubCondition2637);
                    this_HTTPMethodCheck_1=ruleHTTPMethodCheck();

                    state._fsp--;

                     
                            current = this_HTTPMethodCheck_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1340:5: this_RegExpMatch_2= ruleRegExpMatch
                    {
                     
                            newCompositeNode(grammarAccess.getSubConditionAccess().getRegExpMatchParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRegExpMatch_in_ruleSubCondition2664);
                    this_RegExpMatch_2=ruleRegExpMatch();

                    state._fsp--;

                     
                            current = this_RegExpMatch_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1350:5: this_FrequencyCheck_3= ruleFrequencyCheck
                    {
                     
                            newCompositeNode(grammarAccess.getSubConditionAccess().getFrequencyCheckParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFrequencyCheck_in_ruleSubCondition2691);
                    this_FrequencyCheck_3=ruleFrequencyCheck();

                    state._fsp--;

                     
                            current = this_FrequencyCheck_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1360:5: this_HTTPParamLenCheck_4= ruleHTTPParamLenCheck
                    {
                     
                            newCompositeNode(grammarAccess.getSubConditionAccess().getHTTPParamLenCheckParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleHTTPParamLenCheck_in_ruleSubCondition2718);
                    this_HTTPParamLenCheck_4=ruleHTTPParamLenCheck();

                    state._fsp--;

                     
                            current = this_HTTPParamLenCheck_4; 
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
    // $ANTLR end "ruleSubCondition"


    // $ANTLR start "entryRuleProtocolCheck"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1376:1: entryRuleProtocolCheck returns [EObject current=null] : iv_ruleProtocolCheck= ruleProtocolCheck EOF ;
    public final EObject entryRuleProtocolCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocolCheck = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1377:2: (iv_ruleProtocolCheck= ruleProtocolCheck EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1378:2: iv_ruleProtocolCheck= ruleProtocolCheck EOF
            {
             newCompositeNode(grammarAccess.getProtocolCheckRule()); 
            pushFollow(FOLLOW_ruleProtocolCheck_in_entryRuleProtocolCheck2753);
            iv_ruleProtocolCheck=ruleProtocolCheck();

            state._fsp--;

             current =iv_ruleProtocolCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocolCheck2763); 

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
    // $ANTLR end "entryRuleProtocolCheck"


    // $ANTLR start "ruleProtocolCheck"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1385:1: ruleProtocolCheck returns [EObject current=null] : ( ( (lv_name_0_0= 'isRequestProtocolEqualsTo' ) ) otherlv_1= '(' ( (lv_value_2_0= ruleProtocol ) ) otherlv_3= ')' ) ;
    public final EObject ruleProtocolCheck() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1388:28: ( ( ( (lv_name_0_0= 'isRequestProtocolEqualsTo' ) ) otherlv_1= '(' ( (lv_value_2_0= ruleProtocol ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1389:1: ( ( (lv_name_0_0= 'isRequestProtocolEqualsTo' ) ) otherlv_1= '(' ( (lv_value_2_0= ruleProtocol ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1389:1: ( ( (lv_name_0_0= 'isRequestProtocolEqualsTo' ) ) otherlv_1= '(' ( (lv_value_2_0= ruleProtocol ) ) otherlv_3= ')' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1389:2: ( (lv_name_0_0= 'isRequestProtocolEqualsTo' ) ) otherlv_1= '(' ( (lv_value_2_0= ruleProtocol ) ) otherlv_3= ')'
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1389:2: ( (lv_name_0_0= 'isRequestProtocolEqualsTo' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1390:1: (lv_name_0_0= 'isRequestProtocolEqualsTo' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1390:1: (lv_name_0_0= 'isRequestProtocolEqualsTo' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1391:3: lv_name_0_0= 'isRequestProtocolEqualsTo'
            {
            lv_name_0_0=(Token)match(input,34,FOLLOW_34_in_ruleProtocolCheck2806); 

                    newLeafNode(lv_name_0_0, grammarAccess.getProtocolCheckAccess().getNameIsRequestProtocolEqualsToKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProtocolCheckRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "isRequestProtocolEqualsTo");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleProtocolCheck2831); 

                	newLeafNode(otherlv_1, grammarAccess.getProtocolCheckAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1408:1: ( (lv_value_2_0= ruleProtocol ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1409:1: (lv_value_2_0= ruleProtocol )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1409:1: (lv_value_2_0= ruleProtocol )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1410:3: lv_value_2_0= ruleProtocol
            {
             
            	        newCompositeNode(grammarAccess.getProtocolCheckAccess().getValueProtocolEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleProtocol_in_ruleProtocolCheck2852);
            lv_value_2_0=ruleProtocol();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProtocolCheckRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Protocol");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleProtocolCheck2864); 

                	newLeafNode(otherlv_3, grammarAccess.getProtocolCheckAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleProtocolCheck"


    // $ANTLR start "entryRuleHTTPMethodCheck"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1438:1: entryRuleHTTPMethodCheck returns [EObject current=null] : iv_ruleHTTPMethodCheck= ruleHTTPMethodCheck EOF ;
    public final EObject entryRuleHTTPMethodCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHTTPMethodCheck = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1439:2: (iv_ruleHTTPMethodCheck= ruleHTTPMethodCheck EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1440:2: iv_ruleHTTPMethodCheck= ruleHTTPMethodCheck EOF
            {
             newCompositeNode(grammarAccess.getHTTPMethodCheckRule()); 
            pushFollow(FOLLOW_ruleHTTPMethodCheck_in_entryRuleHTTPMethodCheck2900);
            iv_ruleHTTPMethodCheck=ruleHTTPMethodCheck();

            state._fsp--;

             current =iv_ruleHTTPMethodCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHTTPMethodCheck2910); 

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
    // $ANTLR end "entryRuleHTTPMethodCheck"


    // $ANTLR start "ruleHTTPMethodCheck"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1447:1: ruleHTTPMethodCheck returns [EObject current=null] : ( ( (lv_name_0_0= 'isHTTPMethodEqualsTo' ) ) otherlv_1= '(' ( ( (lv_value_2_1= 'GET' | lv_value_2_2= 'POST' | lv_value_2_3= 'HEAD' | lv_value_2_4= 'DELETE' | lv_value_2_5= 'PUT' ) ) ) otherlv_3= ')' ) ;
    public final EObject ruleHTTPMethodCheck() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;
        Token lv_value_2_4=null;
        Token lv_value_2_5=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1450:28: ( ( ( (lv_name_0_0= 'isHTTPMethodEqualsTo' ) ) otherlv_1= '(' ( ( (lv_value_2_1= 'GET' | lv_value_2_2= 'POST' | lv_value_2_3= 'HEAD' | lv_value_2_4= 'DELETE' | lv_value_2_5= 'PUT' ) ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1451:1: ( ( (lv_name_0_0= 'isHTTPMethodEqualsTo' ) ) otherlv_1= '(' ( ( (lv_value_2_1= 'GET' | lv_value_2_2= 'POST' | lv_value_2_3= 'HEAD' | lv_value_2_4= 'DELETE' | lv_value_2_5= 'PUT' ) ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1451:1: ( ( (lv_name_0_0= 'isHTTPMethodEqualsTo' ) ) otherlv_1= '(' ( ( (lv_value_2_1= 'GET' | lv_value_2_2= 'POST' | lv_value_2_3= 'HEAD' | lv_value_2_4= 'DELETE' | lv_value_2_5= 'PUT' ) ) ) otherlv_3= ')' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1451:2: ( (lv_name_0_0= 'isHTTPMethodEqualsTo' ) ) otherlv_1= '(' ( ( (lv_value_2_1= 'GET' | lv_value_2_2= 'POST' | lv_value_2_3= 'HEAD' | lv_value_2_4= 'DELETE' | lv_value_2_5= 'PUT' ) ) ) otherlv_3= ')'
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1451:2: ( (lv_name_0_0= 'isHTTPMethodEqualsTo' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1452:1: (lv_name_0_0= 'isHTTPMethodEqualsTo' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1452:1: (lv_name_0_0= 'isHTTPMethodEqualsTo' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1453:3: lv_name_0_0= 'isHTTPMethodEqualsTo'
            {
            lv_name_0_0=(Token)match(input,35,FOLLOW_35_in_ruleHTTPMethodCheck2953); 

                    newLeafNode(lv_name_0_0, grammarAccess.getHTTPMethodCheckAccess().getNameIsHTTPMethodEqualsToKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHTTPMethodCheckRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "isHTTPMethodEqualsTo");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleHTTPMethodCheck2978); 

                	newLeafNode(otherlv_1, grammarAccess.getHTTPMethodCheckAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1470:1: ( ( (lv_value_2_1= 'GET' | lv_value_2_2= 'POST' | lv_value_2_3= 'HEAD' | lv_value_2_4= 'DELETE' | lv_value_2_5= 'PUT' ) ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1471:1: ( (lv_value_2_1= 'GET' | lv_value_2_2= 'POST' | lv_value_2_3= 'HEAD' | lv_value_2_4= 'DELETE' | lv_value_2_5= 'PUT' ) )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1471:1: ( (lv_value_2_1= 'GET' | lv_value_2_2= 'POST' | lv_value_2_3= 'HEAD' | lv_value_2_4= 'DELETE' | lv_value_2_5= 'PUT' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1472:1: (lv_value_2_1= 'GET' | lv_value_2_2= 'POST' | lv_value_2_3= 'HEAD' | lv_value_2_4= 'DELETE' | lv_value_2_5= 'PUT' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1472:1: (lv_value_2_1= 'GET' | lv_value_2_2= 'POST' | lv_value_2_3= 'HEAD' | lv_value_2_4= 'DELETE' | lv_value_2_5= 'PUT' )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt14=1;
                }
                break;
            case 37:
                {
                alt14=2;
                }
                break;
            case 38:
                {
                alt14=3;
                }
                break;
            case 39:
                {
                alt14=4;
                }
                break;
            case 40:
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
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1473:3: lv_value_2_1= 'GET'
                    {
                    lv_value_2_1=(Token)match(input,36,FOLLOW_36_in_ruleHTTPMethodCheck2998); 

                            newLeafNode(lv_value_2_1, grammarAccess.getHTTPMethodCheckAccess().getValueGETKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHTTPMethodCheckRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1485:8: lv_value_2_2= 'POST'
                    {
                    lv_value_2_2=(Token)match(input,37,FOLLOW_37_in_ruleHTTPMethodCheck3027); 

                            newLeafNode(lv_value_2_2, grammarAccess.getHTTPMethodCheckAccess().getValuePOSTKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHTTPMethodCheckRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1497:8: lv_value_2_3= 'HEAD'
                    {
                    lv_value_2_3=(Token)match(input,38,FOLLOW_38_in_ruleHTTPMethodCheck3056); 

                            newLeafNode(lv_value_2_3, grammarAccess.getHTTPMethodCheckAccess().getValueHEADKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHTTPMethodCheckRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1509:8: lv_value_2_4= 'DELETE'
                    {
                    lv_value_2_4=(Token)match(input,39,FOLLOW_39_in_ruleHTTPMethodCheck3085); 

                            newLeafNode(lv_value_2_4, grammarAccess.getHTTPMethodCheckAccess().getValueDELETEKeyword_2_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHTTPMethodCheckRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1521:8: lv_value_2_5= 'PUT'
                    {
                    lv_value_2_5=(Token)match(input,40,FOLLOW_40_in_ruleHTTPMethodCheck3114); 

                            newLeafNode(lv_value_2_5, grammarAccess.getHTTPMethodCheckAccess().getValuePUTKeyword_2_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHTTPMethodCheckRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_2_5, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleHTTPMethodCheck3142); 

                	newLeafNode(otherlv_3, grammarAccess.getHTTPMethodCheckAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleHTTPMethodCheck"


    // $ANTLR start "entryRuleRegExpMatch"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1548:1: entryRuleRegExpMatch returns [EObject current=null] : iv_ruleRegExpMatch= ruleRegExpMatch EOF ;
    public final EObject entryRuleRegExpMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegExpMatch = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1549:2: (iv_ruleRegExpMatch= ruleRegExpMatch EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1550:2: iv_ruleRegExpMatch= ruleRegExpMatch EOF
            {
             newCompositeNode(grammarAccess.getRegExpMatchRule()); 
            pushFollow(FOLLOW_ruleRegExpMatch_in_entryRuleRegExpMatch3178);
            iv_ruleRegExpMatch=ruleRegExpMatch();

            state._fsp--;

             current =iv_ruleRegExpMatch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegExpMatch3188); 

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
    // $ANTLR end "entryRuleRegExpMatch"


    // $ANTLR start "ruleRegExpMatch"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1557:1: ruleRegExpMatch returns [EObject current=null] : ( ( (lv_name_0_0= 'isParaContentMatchRegExp' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleRegExpMatch() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1560:28: ( ( ( (lv_name_0_0= 'isParaContentMatchRegExp' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1561:1: ( ( (lv_name_0_0= 'isParaContentMatchRegExp' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1561:1: ( ( (lv_name_0_0= 'isParaContentMatchRegExp' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1561:2: ( (lv_name_0_0= 'isParaContentMatchRegExp' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1561:2: ( (lv_name_0_0= 'isParaContentMatchRegExp' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1562:1: (lv_name_0_0= 'isParaContentMatchRegExp' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1562:1: (lv_name_0_0= 'isParaContentMatchRegExp' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1563:3: lv_name_0_0= 'isParaContentMatchRegExp'
            {
            lv_name_0_0=(Token)match(input,41,FOLLOW_41_in_ruleRegExpMatch3231); 

                    newLeafNode(lv_name_0_0, grammarAccess.getRegExpMatchAccess().getNameIsParaContentMatchRegExpKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRegExpMatchRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "isParaContentMatchRegExp");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleRegExpMatch3256); 

                	newLeafNode(otherlv_1, grammarAccess.getRegExpMatchAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1580:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1581:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1581:1: (lv_value_2_0= RULE_STRING )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1582:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRegExpMatch3273); 

            			newLeafNode(lv_value_2_0, grammarAccess.getRegExpMatchAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRegExpMatchRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleRegExpMatch3290); 

                	newLeafNode(otherlv_3, grammarAccess.getRegExpMatchAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleRegExpMatch"


    // $ANTLR start "entryRuleFrequencyCheck"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1610:1: entryRuleFrequencyCheck returns [EObject current=null] : iv_ruleFrequencyCheck= ruleFrequencyCheck EOF ;
    public final EObject entryRuleFrequencyCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrequencyCheck = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1611:2: (iv_ruleFrequencyCheck= ruleFrequencyCheck EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1612:2: iv_ruleFrequencyCheck= ruleFrequencyCheck EOF
            {
             newCompositeNode(grammarAccess.getFrequencyCheckRule()); 
            pushFollow(FOLLOW_ruleFrequencyCheck_in_entryRuleFrequencyCheck3326);
            iv_ruleFrequencyCheck=ruleFrequencyCheck();

            state._fsp--;

             current =iv_ruleFrequencyCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrequencyCheck3336); 

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
    // $ANTLR end "entryRuleFrequencyCheck"


    // $ANTLR start "ruleFrequencyCheck"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1619:1: ruleFrequencyCheck returns [EObject current=null] : ( ( (lv_name_0_0= 'isRequestFrequencyLessThan' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleFrequencyCheck() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1622:28: ( ( ( (lv_name_0_0= 'isRequestFrequencyLessThan' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1623:1: ( ( (lv_name_0_0= 'isRequestFrequencyLessThan' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1623:1: ( ( (lv_name_0_0= 'isRequestFrequencyLessThan' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1623:2: ( (lv_name_0_0= 'isRequestFrequencyLessThan' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1623:2: ( (lv_name_0_0= 'isRequestFrequencyLessThan' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1624:1: (lv_name_0_0= 'isRequestFrequencyLessThan' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1624:1: (lv_name_0_0= 'isRequestFrequencyLessThan' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1625:3: lv_name_0_0= 'isRequestFrequencyLessThan'
            {
            lv_name_0_0=(Token)match(input,42,FOLLOW_42_in_ruleFrequencyCheck3379); 

                    newLeafNode(lv_name_0_0, grammarAccess.getFrequencyCheckAccess().getNameIsRequestFrequencyLessThanKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFrequencyCheckRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "isRequestFrequencyLessThan");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleFrequencyCheck3404); 

                	newLeafNode(otherlv_1, grammarAccess.getFrequencyCheckAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1642:1: ( (lv_value_2_0= RULE_INT ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1643:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1643:1: (lv_value_2_0= RULE_INT )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1644:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFrequencyCheck3421); 

            			newLeafNode(lv_value_2_0, grammarAccess.getFrequencyCheckAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFrequencyCheckRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleFrequencyCheck3438); 

                	newLeafNode(otherlv_3, grammarAccess.getFrequencyCheckAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleFrequencyCheck"


    // $ANTLR start "entryRuleHTTPParamLenCheck"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1672:1: entryRuleHTTPParamLenCheck returns [EObject current=null] : iv_ruleHTTPParamLenCheck= ruleHTTPParamLenCheck EOF ;
    public final EObject entryRuleHTTPParamLenCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHTTPParamLenCheck = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1673:2: (iv_ruleHTTPParamLenCheck= ruleHTTPParamLenCheck EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1674:2: iv_ruleHTTPParamLenCheck= ruleHTTPParamLenCheck EOF
            {
             newCompositeNode(grammarAccess.getHTTPParamLenCheckRule()); 
            pushFollow(FOLLOW_ruleHTTPParamLenCheck_in_entryRuleHTTPParamLenCheck3474);
            iv_ruleHTTPParamLenCheck=ruleHTTPParamLenCheck();

            state._fsp--;

             current =iv_ruleHTTPParamLenCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHTTPParamLenCheck3484); 

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
    // $ANTLR end "entryRuleHTTPParamLenCheck"


    // $ANTLR start "ruleHTTPParamLenCheck"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1681:1: ruleHTTPParamLenCheck returns [EObject current=null] : ( ( ( (lv_name_0_0= 'isParaLenghtLessThan' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) | ( ( (lv_name_4_0= 'isParaLenghtGreaterThan' ) ) otherlv_5= '(' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' ) | ( ( (lv_name_8_0= 'isParaLenghtEqualsTo' ) ) otherlv_9= '(' ( (lv_value_10_0= RULE_INT ) ) otherlv_11= ')' ) ) ;
    public final EObject ruleHTTPParamLenCheck() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token lv_value_10_0=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1684:28: ( ( ( ( (lv_name_0_0= 'isParaLenghtLessThan' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) | ( ( (lv_name_4_0= 'isParaLenghtGreaterThan' ) ) otherlv_5= '(' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' ) | ( ( (lv_name_8_0= 'isParaLenghtEqualsTo' ) ) otherlv_9= '(' ( (lv_value_10_0= RULE_INT ) ) otherlv_11= ')' ) ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1685:1: ( ( ( (lv_name_0_0= 'isParaLenghtLessThan' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) | ( ( (lv_name_4_0= 'isParaLenghtGreaterThan' ) ) otherlv_5= '(' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' ) | ( ( (lv_name_8_0= 'isParaLenghtEqualsTo' ) ) otherlv_9= '(' ( (lv_value_10_0= RULE_INT ) ) otherlv_11= ')' ) )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1685:1: ( ( ( (lv_name_0_0= 'isParaLenghtLessThan' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) | ( ( (lv_name_4_0= 'isParaLenghtGreaterThan' ) ) otherlv_5= '(' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' ) | ( ( (lv_name_8_0= 'isParaLenghtEqualsTo' ) ) otherlv_9= '(' ( (lv_value_10_0= RULE_INT ) ) otherlv_11= ')' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt15=1;
                }
                break;
            case 44:
                {
                alt15=2;
                }
                break;
            case 45:
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
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1685:2: ( ( (lv_name_0_0= 'isParaLenghtLessThan' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1685:2: ( ( (lv_name_0_0= 'isParaLenghtLessThan' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1685:3: ( (lv_name_0_0= 'isParaLenghtLessThan' ) ) otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')'
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1685:3: ( (lv_name_0_0= 'isParaLenghtLessThan' ) )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1686:1: (lv_name_0_0= 'isParaLenghtLessThan' )
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1686:1: (lv_name_0_0= 'isParaLenghtLessThan' )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1687:3: lv_name_0_0= 'isParaLenghtLessThan'
                    {
                    lv_name_0_0=(Token)match(input,43,FOLLOW_43_in_ruleHTTPParamLenCheck3528); 

                            newLeafNode(lv_name_0_0, grammarAccess.getHTTPParamLenCheckAccess().getNameIsParaLenghtLessThanKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHTTPParamLenCheckRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "isParaLenghtLessThan");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleHTTPParamLenCheck3553); 

                        	newLeafNode(otherlv_1, grammarAccess.getHTTPParamLenCheckAccess().getLeftParenthesisKeyword_0_1());
                        
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1704:1: ( (lv_value_2_0= RULE_INT ) )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1705:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1705:1: (lv_value_2_0= RULE_INT )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1706:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHTTPParamLenCheck3570); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getHTTPParamLenCheckAccess().getValueINTTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHTTPParamLenCheckRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleHTTPParamLenCheck3587); 

                        	newLeafNode(otherlv_3, grammarAccess.getHTTPParamLenCheckAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1727:6: ( ( (lv_name_4_0= 'isParaLenghtGreaterThan' ) ) otherlv_5= '(' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' )
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1727:6: ( ( (lv_name_4_0= 'isParaLenghtGreaterThan' ) ) otherlv_5= '(' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1727:7: ( (lv_name_4_0= 'isParaLenghtGreaterThan' ) ) otherlv_5= '(' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')'
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1727:7: ( (lv_name_4_0= 'isParaLenghtGreaterThan' ) )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1728:1: (lv_name_4_0= 'isParaLenghtGreaterThan' )
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1728:1: (lv_name_4_0= 'isParaLenghtGreaterThan' )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1729:3: lv_name_4_0= 'isParaLenghtGreaterThan'
                    {
                    lv_name_4_0=(Token)match(input,44,FOLLOW_44_in_ruleHTTPParamLenCheck3613); 

                            newLeafNode(lv_name_4_0, grammarAccess.getHTTPParamLenCheckAccess().getNameIsParaLenghtGreaterThanKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHTTPParamLenCheckRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_4_0, "isParaLenghtGreaterThan");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleHTTPParamLenCheck3638); 

                        	newLeafNode(otherlv_5, grammarAccess.getHTTPParamLenCheckAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1746:1: ( (lv_value_6_0= RULE_INT ) )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1747:1: (lv_value_6_0= RULE_INT )
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1747:1: (lv_value_6_0= RULE_INT )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1748:3: lv_value_6_0= RULE_INT
                    {
                    lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHTTPParamLenCheck3655); 

                    			newLeafNode(lv_value_6_0, grammarAccess.getHTTPParamLenCheckAccess().getValueINTTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHTTPParamLenCheckRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleHTTPParamLenCheck3672); 

                        	newLeafNode(otherlv_7, grammarAccess.getHTTPParamLenCheckAccess().getRightParenthesisKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1769:6: ( ( (lv_name_8_0= 'isParaLenghtEqualsTo' ) ) otherlv_9= '(' ( (lv_value_10_0= RULE_INT ) ) otherlv_11= ')' )
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1769:6: ( ( (lv_name_8_0= 'isParaLenghtEqualsTo' ) ) otherlv_9= '(' ( (lv_value_10_0= RULE_INT ) ) otherlv_11= ')' )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1769:7: ( (lv_name_8_0= 'isParaLenghtEqualsTo' ) ) otherlv_9= '(' ( (lv_value_10_0= RULE_INT ) ) otherlv_11= ')'
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1769:7: ( (lv_name_8_0= 'isParaLenghtEqualsTo' ) )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1770:1: (lv_name_8_0= 'isParaLenghtEqualsTo' )
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1770:1: (lv_name_8_0= 'isParaLenghtEqualsTo' )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1771:3: lv_name_8_0= 'isParaLenghtEqualsTo'
                    {
                    lv_name_8_0=(Token)match(input,45,FOLLOW_45_in_ruleHTTPParamLenCheck3698); 

                            newLeafNode(lv_name_8_0, grammarAccess.getHTTPParamLenCheckAccess().getNameIsParaLenghtEqualsToKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHTTPParamLenCheckRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_8_0, "isParaLenghtEqualsTo");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleHTTPParamLenCheck3723); 

                        	newLeafNode(otherlv_9, grammarAccess.getHTTPParamLenCheckAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1788:1: ( (lv_value_10_0= RULE_INT ) )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1789:1: (lv_value_10_0= RULE_INT )
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1789:1: (lv_value_10_0= RULE_INT )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1790:3: lv_value_10_0= RULE_INT
                    {
                    lv_value_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHTTPParamLenCheck3740); 

                    			newLeafNode(lv_value_10_0, grammarAccess.getHTTPParamLenCheckAccess().getValueINTTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHTTPParamLenCheckRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_10_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,30,FOLLOW_30_in_ruleHTTPParamLenCheck3757); 

                        	newLeafNode(otherlv_11, grammarAccess.getHTTPParamLenCheckAccess().getRightParenthesisKeyword_2_3());
                        

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
    // $ANTLR end "ruleHTTPParamLenCheck"


    // $ANTLR start "entryRuleEndPoint"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1818:1: entryRuleEndPoint returns [EObject current=null] : iv_ruleEndPoint= ruleEndPoint EOF ;
    public final EObject entryRuleEndPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndPoint = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1819:2: (iv_ruleEndPoint= ruleEndPoint EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1820:2: iv_ruleEndPoint= ruleEndPoint EOF
            {
             newCompositeNode(grammarAccess.getEndPointRule()); 
            pushFollow(FOLLOW_ruleEndPoint_in_entryRuleEndPoint3794);
            iv_ruleEndPoint=ruleEndPoint();

            state._fsp--;

             current =iv_ruleEndPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEndPoint3804); 

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
    // $ANTLR end "entryRuleEndPoint"


    // $ANTLR start "ruleEndPoint"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1827:1: ruleEndPoint returns [EObject current=null] : (otherlv_0= 'endpoint' otherlv_1= '(' ( (lv_port_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_protocol_4_0= ruleProtocol ) ) otherlv_5= ')' ) ;
    public final EObject ruleEndPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_port_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_protocol_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1830:28: ( (otherlv_0= 'endpoint' otherlv_1= '(' ( (lv_port_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_protocol_4_0= ruleProtocol ) ) otherlv_5= ')' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1831:1: (otherlv_0= 'endpoint' otherlv_1= '(' ( (lv_port_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_protocol_4_0= ruleProtocol ) ) otherlv_5= ')' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1831:1: (otherlv_0= 'endpoint' otherlv_1= '(' ( (lv_port_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_protocol_4_0= ruleProtocol ) ) otherlv_5= ')' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1831:3: otherlv_0= 'endpoint' otherlv_1= '(' ( (lv_port_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_protocol_4_0= ruleProtocol ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleEndPoint3841); 

                	newLeafNode(otherlv_0, grammarAccess.getEndPointAccess().getEndpointKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleEndPoint3853); 

                	newLeafNode(otherlv_1, grammarAccess.getEndPointAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1839:1: ( (lv_port_2_0= RULE_INT ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1840:1: (lv_port_2_0= RULE_INT )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1840:1: (lv_port_2_0= RULE_INT )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1841:3: lv_port_2_0= RULE_INT
            {
            lv_port_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEndPoint3870); 

            			newLeafNode(lv_port_2_0, grammarAccess.getEndPointAccess().getPortINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEndPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"port",
                    		lv_port_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleEndPoint3887); 

                	newLeafNode(otherlv_3, grammarAccess.getEndPointAccess().getCommaKeyword_3());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1861:1: ( (lv_protocol_4_0= ruleProtocol ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1862:1: (lv_protocol_4_0= ruleProtocol )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1862:1: (lv_protocol_4_0= ruleProtocol )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1863:3: lv_protocol_4_0= ruleProtocol
            {
             
            	        newCompositeNode(grammarAccess.getEndPointAccess().getProtocolProtocolEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleProtocol_in_ruleEndPoint3908);
            lv_protocol_4_0=ruleProtocol();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEndPointRule());
            	        }
                   		set(
                   			current, 
                   			"protocol",
                    		lv_protocol_4_0, 
                    		"Protocol");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleEndPoint3920); 

                	newLeafNode(otherlv_5, grammarAccess.getEndPointAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleEndPoint"


    // $ANTLR start "entryRuleDropRequest"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1891:1: entryRuleDropRequest returns [EObject current=null] : iv_ruleDropRequest= ruleDropRequest EOF ;
    public final EObject entryRuleDropRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropRequest = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1892:2: (iv_ruleDropRequest= ruleDropRequest EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1893:2: iv_ruleDropRequest= ruleDropRequest EOF
            {
             newCompositeNode(grammarAccess.getDropRequestRule()); 
            pushFollow(FOLLOW_ruleDropRequest_in_entryRuleDropRequest3956);
            iv_ruleDropRequest=ruleDropRequest();

            state._fsp--;

             current =iv_ruleDropRequest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropRequest3966); 

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
    // $ANTLR end "entryRuleDropRequest"


    // $ANTLR start "ruleDropRequest"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1900:1: ruleDropRequest returns [EObject current=null] : ( (lv_action_0_0= 'drop' ) ) ;
    public final EObject ruleDropRequest() throws RecognitionException {
        EObject current = null;

        Token lv_action_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1903:28: ( ( (lv_action_0_0= 'drop' ) ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1904:1: ( (lv_action_0_0= 'drop' ) )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1904:1: ( (lv_action_0_0= 'drop' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1905:1: (lv_action_0_0= 'drop' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1905:1: (lv_action_0_0= 'drop' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1906:3: lv_action_0_0= 'drop'
            {
            lv_action_0_0=(Token)match(input,48,FOLLOW_48_in_ruleDropRequest4008); 

                    newLeafNode(lv_action_0_0, grammarAccess.getDropRequestAccess().getActionDropKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDropRequestRule());
            	        }
                   		setWithLastConsumed(current, "action", lv_action_0_0, "drop");
            	    

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
    // $ANTLR end "ruleDropRequest"


    // $ANTLR start "entryRuleBlockSender"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1927:1: entryRuleBlockSender returns [EObject current=null] : iv_ruleBlockSender= ruleBlockSender EOF ;
    public final EObject entryRuleBlockSender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockSender = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1928:2: (iv_ruleBlockSender= ruleBlockSender EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1929:2: iv_ruleBlockSender= ruleBlockSender EOF
            {
             newCompositeNode(grammarAccess.getBlockSenderRule()); 
            pushFollow(FOLLOW_ruleBlockSender_in_entryRuleBlockSender4056);
            iv_ruleBlockSender=ruleBlockSender();

            state._fsp--;

             current =iv_ruleBlockSender; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockSender4066); 

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
    // $ANTLR end "entryRuleBlockSender"


    // $ANTLR start "ruleBlockSender"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1936:1: ruleBlockSender returns [EObject current=null] : ( (lv_action_0_0= 'block' ) ) ;
    public final EObject ruleBlockSender() throws RecognitionException {
        EObject current = null;

        Token lv_action_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1939:28: ( ( (lv_action_0_0= 'block' ) ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1940:1: ( (lv_action_0_0= 'block' ) )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1940:1: ( (lv_action_0_0= 'block' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1941:1: (lv_action_0_0= 'block' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1941:1: (lv_action_0_0= 'block' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1942:3: lv_action_0_0= 'block'
            {
            lv_action_0_0=(Token)match(input,49,FOLLOW_49_in_ruleBlockSender4108); 

                    newLeafNode(lv_action_0_0, grammarAccess.getBlockSenderAccess().getActionBlockKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBlockSenderRule());
            	        }
                   		setWithLastConsumed(current, "action", lv_action_0_0, "block");
            	    

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
    // $ANTLR end "ruleBlockSender"


    // $ANTLR start "entryRulePassRequest"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1963:1: entryRulePassRequest returns [EObject current=null] : iv_rulePassRequest= rulePassRequest EOF ;
    public final EObject entryRulePassRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassRequest = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1964:2: (iv_rulePassRequest= rulePassRequest EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1965:2: iv_rulePassRequest= rulePassRequest EOF
            {
             newCompositeNode(grammarAccess.getPassRequestRule()); 
            pushFollow(FOLLOW_rulePassRequest_in_entryRulePassRequest4156);
            iv_rulePassRequest=rulePassRequest();

            state._fsp--;

             current =iv_rulePassRequest; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePassRequest4166); 

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
    // $ANTLR end "entryRulePassRequest"


    // $ANTLR start "rulePassRequest"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1972:1: rulePassRequest returns [EObject current=null] : ( (lv_action_0_0= 'pass' ) ) ;
    public final EObject rulePassRequest() throws RecognitionException {
        EObject current = null;

        Token lv_action_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1975:28: ( ( (lv_action_0_0= 'pass' ) ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1976:1: ( (lv_action_0_0= 'pass' ) )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1976:1: ( (lv_action_0_0= 'pass' ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1977:1: (lv_action_0_0= 'pass' )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1977:1: (lv_action_0_0= 'pass' )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1978:3: lv_action_0_0= 'pass'
            {
            lv_action_0_0=(Token)match(input,50,FOLLOW_50_in_rulePassRequest4208); 

                    newLeafNode(lv_action_0_0, grammarAccess.getPassRequestAccess().getActionPassKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPassRequestRule());
            	        }
                   		setWithLastConsumed(current, "action", lv_action_0_0, "pass");
            	    

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
    // $ANTLR end "rulePassRequest"


    // $ANTLR start "entryRuleIPAddress"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:1999:1: entryRuleIPAddress returns [EObject current=null] : iv_ruleIPAddress= ruleIPAddress EOF ;
    public final EObject entryRuleIPAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIPAddress = null;


        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2000:2: (iv_ruleIPAddress= ruleIPAddress EOF )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2001:2: iv_ruleIPAddress= ruleIPAddress EOF
            {
             newCompositeNode(grammarAccess.getIPAddressRule()); 
            pushFollow(FOLLOW_ruleIPAddress_in_entryRuleIPAddress4256);
            iv_ruleIPAddress=ruleIPAddress();

            state._fsp--;

             current =iv_ruleIPAddress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIPAddress4266); 

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
    // $ANTLR end "entryRuleIPAddress"


    // $ANTLR start "ruleIPAddress"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2008:1: ruleIPAddress returns [EObject current=null] : ( ( (lv_byte1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_byte2_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_byte3_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_byte4_6_0= RULE_INT ) ) ) ;
    public final EObject ruleIPAddress() throws RecognitionException {
        EObject current = null;

        Token lv_byte1_0_0=null;
        Token otherlv_1=null;
        Token lv_byte2_2_0=null;
        Token otherlv_3=null;
        Token lv_byte3_4_0=null;
        Token otherlv_5=null;
        Token lv_byte4_6_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2011:28: ( ( ( (lv_byte1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_byte2_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_byte3_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_byte4_6_0= RULE_INT ) ) ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2012:1: ( ( (lv_byte1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_byte2_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_byte3_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_byte4_6_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2012:1: ( ( (lv_byte1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_byte2_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_byte3_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_byte4_6_0= RULE_INT ) ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2012:2: ( (lv_byte1_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_byte2_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_byte3_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_byte4_6_0= RULE_INT ) )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2012:2: ( (lv_byte1_0_0= RULE_INT ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2013:1: (lv_byte1_0_0= RULE_INT )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2013:1: (lv_byte1_0_0= RULE_INT )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2014:3: lv_byte1_0_0= RULE_INT
            {
            lv_byte1_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIPAddress4308); 

            			newLeafNode(lv_byte1_0_0, grammarAccess.getIPAddressAccess().getByte1INTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIPAddressRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"byte1",
                    		lv_byte1_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleIPAddress4325); 

                	newLeafNode(otherlv_1, grammarAccess.getIPAddressAccess().getFullStopKeyword_1());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2034:1: ( (lv_byte2_2_0= RULE_INT ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2035:1: (lv_byte2_2_0= RULE_INT )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2035:1: (lv_byte2_2_0= RULE_INT )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2036:3: lv_byte2_2_0= RULE_INT
            {
            lv_byte2_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIPAddress4342); 

            			newLeafNode(lv_byte2_2_0, grammarAccess.getIPAddressAccess().getByte2INTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIPAddressRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"byte2",
                    		lv_byte2_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleIPAddress4359); 

                	newLeafNode(otherlv_3, grammarAccess.getIPAddressAccess().getFullStopKeyword_3());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2056:1: ( (lv_byte3_4_0= RULE_INT ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2057:1: (lv_byte3_4_0= RULE_INT )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2057:1: (lv_byte3_4_0= RULE_INT )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2058:3: lv_byte3_4_0= RULE_INT
            {
            lv_byte3_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIPAddress4376); 

            			newLeafNode(lv_byte3_4_0, grammarAccess.getIPAddressAccess().getByte3INTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIPAddressRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"byte3",
                    		lv_byte3_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,51,FOLLOW_51_in_ruleIPAddress4393); 

                	newLeafNode(otherlv_5, grammarAccess.getIPAddressAccess().getFullStopKeyword_5());
                
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2078:1: ( (lv_byte4_6_0= RULE_INT ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2079:1: (lv_byte4_6_0= RULE_INT )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2079:1: (lv_byte4_6_0= RULE_INT )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2080:3: lv_byte4_6_0= RULE_INT
            {
            lv_byte4_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIPAddress4410); 

            			newLeafNode(lv_byte4_6_0, grammarAccess.getIPAddressAccess().getByte4INTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIPAddressRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"byte4",
                    		lv_byte4_6_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleIPAddress"


    // $ANTLR start "ruleProtocol"
    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2104:1: ruleProtocol returns [Enumerator current=null] : ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'FTP' ) | (enumLiteral_3= 'SSH' ) ) ;
    public final Enumerator ruleProtocol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2106:28: ( ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'FTP' ) | (enumLiteral_3= 'SSH' ) ) )
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2107:1: ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'FTP' ) | (enumLiteral_3= 'SSH' ) )
            {
            // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2107:1: ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'FTP' ) | (enumLiteral_3= 'SSH' ) )
            int alt16=4;
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
            case 55:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2107:2: (enumLiteral_0= 'HTTP' )
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2107:2: (enumLiteral_0= 'HTTP' )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2107:4: enumLiteral_0= 'HTTP'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleProtocol4465); 

                            current = grammarAccess.getProtocolAccess().getHTTPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getProtocolAccess().getHTTPEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2113:6: (enumLiteral_1= 'HTTPS' )
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2113:6: (enumLiteral_1= 'HTTPS' )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2113:8: enumLiteral_1= 'HTTPS'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_53_in_ruleProtocol4482); 

                            current = grammarAccess.getProtocolAccess().getHTTPSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getProtocolAccess().getHTTPSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2119:6: (enumLiteral_2= 'FTP' )
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2119:6: (enumLiteral_2= 'FTP' )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2119:8: enumLiteral_2= 'FTP'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_54_in_ruleProtocol4499); 

                            current = grammarAccess.getProtocolAccess().getFTPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getProtocolAccess().getFTPEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2125:6: (enumLiteral_3= 'SSH' )
                    {
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2125:6: (enumLiteral_3= 'SSH' )
                    // ../org.xtext.example.mydslsample/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDslSample.g:2125:8: enumLiteral_3= 'SSH'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_55_in_ruleProtocol4516); 

                            current = grammarAccess.getProtocolAccess().getSSHEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getProtocolAccess().getSSHEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleProtocol"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleHttpShieldModel_in_entryRuleHttpShieldModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpShieldModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_ruleHttpShieldModel130 = new BitSet(new long[]{0x0000000000810802L});
    public static final BitSet FOLLOW_ruleAgent_in_entryRuleAgent166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgent176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_ruleAgent223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_ruleAgent250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefender_in_ruleAgent277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleUser365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUser395 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUser412 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUser424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUser441 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUser458 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIPAddress_in_ruleUser479 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_ruleNormalRequest_in_ruleUser500 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_15_in_ruleUser513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_entryRuleAttacker549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacker559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAttacker602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttacker632 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttacker649 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAttacker661 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttacker678 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAttacker695 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIPAddress_in_ruleAttacker716 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_ruleMaliciousRequest_in_ruleAttacker737 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleAttacker750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaliciousRequest_in_entryRuleMaliciousRequest788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaliciousRequest798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMaliciousRequest835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMaliciousRequest852 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMaliciousRequest869 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMaliciousRequest881 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIPAddress_in_ruleMaliciousRequest902 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMaliciousRequest914 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIPAddress_in_ruleMaliciousRequest935 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMaliciousRequest947 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMaliciousRequest964 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMaliciousRequest981 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMaliciousRequest998 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMaliciousRequest1015 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleProtocol_in_ruleMaliciousRequest1036 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMaliciousRequest1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalRequest_in_entryRuleNormalRequest1084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalRequest1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleNormalRequest1131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNormalRequest1148 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNormalRequest1165 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNormalRequest1177 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIPAddress_in_ruleNormalRequest1198 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNormalRequest1210 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIPAddress_in_ruleNormalRequest1231 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNormalRequest1243 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNormalRequest1260 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNormalRequest1277 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNormalRequest1294 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNormalRequest1311 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleProtocol_in_ruleNormalRequest1332 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNormalRequest1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefender_in_entryRuleDefender1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefender1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDefender1433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefender1463 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDefender1480 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDefender1492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefender1509 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDefender1526 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIPAddress_in_ruleDefender1547 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleSecurityPolicyList_in_ruleDefender1568 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDefender1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityPolicyList_in_entryRuleSecurityPolicyList1616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityPolicyList1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSecurityPolicyList1663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSecurityPolicyList1680 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSecurityPolicyList1697 = new BitSet(new long[]{0x0000000202008000L});
    public static final BitSet FOLLOW_ruleSecurityPolicy_in_ruleSecurityPolicyList1718 = new BitSet(new long[]{0x0000000202008000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleSecurityPolicyList1740 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_15_in_ruleSecurityPolicyList1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityPolicy_in_entryRuleSecurityPolicy1789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityPolicy1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSecurityPolicy1836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSecurityPolicy1853 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSecurityPolicy1870 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleEndPoint_in_ruleSecurityPolicy1891 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSecurityPolicy1903 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSecurityPolicy1915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSecurityPolicy1935 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_28_in_ruleSecurityPolicy1956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_29_in_ruleSecurityPolicy1985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSecurityPolicy2021 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_30_in_ruleSecurityPolicy2035 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSecurityPolicy2047 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleSecurityPolicy2068 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_28_in_ruleSecurityPolicy2081 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleSecurityPolicy2102 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_32_in_ruleSecurityPolicy2116 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleSecurityPolicy2137 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_28_in_ruleSecurityPolicy2150 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleSecurityPolicy2171 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_15_in_ruleSecurityPolicy2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition2221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCondition2268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCondition2285 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCondition2302 = new BitSet(new long[]{0x00003E0C00000000L});
    public static final BitSet FOLLOW_ruleSubCondition_in_ruleCondition2323 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_28_in_ruleCondition2336 = new BitSet(new long[]{0x00003E0C00000000L});
    public static final BitSet FOLLOW_ruleSubCondition_in_ruleCondition2357 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_15_in_ruleCondition2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropRequest_in_ruleAction2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockSender_in_ruleAction2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassRequest_in_ruleAction2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubCondition_in_entryRuleSubCondition2553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubCondition2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocolCheck_in_ruleSubCondition2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHTTPMethodCheck_in_ruleSubCondition2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegExpMatch_in_ruleSubCondition2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrequencyCheck_in_ruleSubCondition2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHTTPParamLenCheck_in_ruleSubCondition2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocolCheck_in_entryRuleProtocolCheck2753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocolCheck2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleProtocolCheck2806 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleProtocolCheck2831 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleProtocol_in_ruleProtocolCheck2852 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleProtocolCheck2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHTTPMethodCheck_in_entryRuleHTTPMethodCheck2900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHTTPMethodCheck2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleHTTPMethodCheck2953 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleHTTPMethodCheck2978 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_36_in_ruleHTTPMethodCheck2998 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_37_in_ruleHTTPMethodCheck3027 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_38_in_ruleHTTPMethodCheck3056 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_39_in_ruleHTTPMethodCheck3085 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_40_in_ruleHTTPMethodCheck3114 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleHTTPMethodCheck3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegExpMatch_in_entryRuleRegExpMatch3178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegExpMatch3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRegExpMatch3231 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRegExpMatch3256 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRegExpMatch3273 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRegExpMatch3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrequencyCheck_in_entryRuleFrequencyCheck3326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrequencyCheck3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFrequencyCheck3379 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFrequencyCheck3404 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFrequencyCheck3421 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleFrequencyCheck3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHTTPParamLenCheck_in_entryRuleHTTPParamLenCheck3474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHTTPParamLenCheck3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleHTTPParamLenCheck3528 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleHTTPParamLenCheck3553 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHTTPParamLenCheck3570 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleHTTPParamLenCheck3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleHTTPParamLenCheck3613 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleHTTPParamLenCheck3638 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHTTPParamLenCheck3655 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleHTTPParamLenCheck3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleHTTPParamLenCheck3698 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleHTTPParamLenCheck3723 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHTTPParamLenCheck3740 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleHTTPParamLenCheck3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndPoint_in_entryRuleEndPoint3794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEndPoint3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleEndPoint3841 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEndPoint3853 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEndPoint3870 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleEndPoint3887 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleProtocol_in_ruleEndPoint3908 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEndPoint3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropRequest_in_entryRuleDropRequest3956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropRequest3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDropRequest4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockSender_in_entryRuleBlockSender4056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockSender4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleBlockSender4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassRequest_in_entryRulePassRequest4156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePassRequest4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePassRequest4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIPAddress_in_entryRuleIPAddress4256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIPAddress4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIPAddress4308 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleIPAddress4325 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIPAddress4342 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleIPAddress4359 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIPAddress4376 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleIPAddress4393 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIPAddress4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleProtocol4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleProtocol4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleProtocol4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleProtocol4516 = new BitSet(new long[]{0x0000000000000002L});

}