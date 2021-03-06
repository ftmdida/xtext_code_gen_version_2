/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.MyDslSampleGrammarAccess;

public class MyDslSampleParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslSampleGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslSampleParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslSampleParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslSampleParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAgentAccess().getAlternatives(), "rule__Agent__Alternatives");
					put(grammarAccess.getRequestAccess().getAlternatives(), "rule__Request__Alternatives");
					put(grammarAccess.getSecurityPolicyAccess().getOperationListAlternatives_7_0_0(), "rule__SecurityPolicy__OperationListAlternatives_7_0_0");
					put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
					put(grammarAccess.getSubConditionAccess().getAlternatives(), "rule__SubCondition__Alternatives");
					put(grammarAccess.getHTTPMethodCheckAccess().getValueAlternatives_2_0(), "rule__HTTPMethodCheck__ValueAlternatives_2_0");
					put(grammarAccess.getHTTPParamLenCheckAccess().getAlternatives(), "rule__HTTPParamLenCheck__Alternatives");
					put(grammarAccess.getProtocolAccess().getAlternatives(), "rule__Protocol__Alternatives");
					put(grammarAccess.getUserAccess().getGroup(), "rule__User__Group__0");
					put(grammarAccess.getAttackerAccess().getGroup(), "rule__Attacker__Group__0");
					put(grammarAccess.getMaliciousRequestAccess().getGroup(), "rule__MaliciousRequest__Group__0");
					put(grammarAccess.getNormalRequestAccess().getGroup(), "rule__NormalRequest__Group__0");
					put(grammarAccess.getDefenderAccess().getGroup(), "rule__Defender__Group__0");
					put(grammarAccess.getSecurityPolicyListAccess().getGroup(), "rule__SecurityPolicyList__Group__0");
					put(grammarAccess.getSecurityPolicyAccess().getGroup(), "rule__SecurityPolicy__Group__0");
					put(grammarAccess.getSecurityPolicyAccess().getGroup_7(), "rule__SecurityPolicy__Group_7__0");
					put(grammarAccess.getSecurityPolicyAccess().getGroup_11(), "rule__SecurityPolicy__Group_11__0");
					put(grammarAccess.getSecurityPolicyAccess().getGroup_14(), "rule__SecurityPolicy__Group_14__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getConditionAccess().getGroup_4(), "rule__Condition__Group_4__0");
					put(grammarAccess.getProtocolCheckAccess().getGroup(), "rule__ProtocolCheck__Group__0");
					put(grammarAccess.getHTTPMethodCheckAccess().getGroup(), "rule__HTTPMethodCheck__Group__0");
					put(grammarAccess.getRegExpMatchAccess().getGroup(), "rule__RegExpMatch__Group__0");
					put(grammarAccess.getFrequencyCheckAccess().getGroup(), "rule__FrequencyCheck__Group__0");
					put(grammarAccess.getHTTPParamLenCheckAccess().getGroup_0(), "rule__HTTPParamLenCheck__Group_0__0");
					put(grammarAccess.getHTTPParamLenCheckAccess().getGroup_1(), "rule__HTTPParamLenCheck__Group_1__0");
					put(grammarAccess.getHTTPParamLenCheckAccess().getGroup_2(), "rule__HTTPParamLenCheck__Group_2__0");
					put(grammarAccess.getEndPointAccess().getGroup(), "rule__EndPoint__Group__0");
					put(grammarAccess.getIPAddressAccess().getGroup(), "rule__IPAddress__Group__0");
					put(grammarAccess.getHttpShieldModelAccess().getAgentsAssignment(), "rule__HttpShieldModel__AgentsAssignment");
					put(grammarAccess.getUserAccess().getTypeAssignment_0(), "rule__User__TypeAssignment_0");
					put(grammarAccess.getUserAccess().getNameAssignment_1(), "rule__User__NameAssignment_1");
					put(grammarAccess.getUserAccess().getFilenameAssignment_4(), "rule__User__FilenameAssignment_4");
					put(grammarAccess.getUserAccess().getSourceAssignment_6(), "rule__User__SourceAssignment_6");
					put(grammarAccess.getUserAccess().getRequestsAssignment_7(), "rule__User__RequestsAssignment_7");
					put(grammarAccess.getAttackerAccess().getTypeAssignment_0(), "rule__Attacker__TypeAssignment_0");
					put(grammarAccess.getAttackerAccess().getNameAssignment_1(), "rule__Attacker__NameAssignment_1");
					put(grammarAccess.getAttackerAccess().getFilenameAssignment_4(), "rule__Attacker__FilenameAssignment_4");
					put(grammarAccess.getAttackerAccess().getSourceAssignment_6(), "rule__Attacker__SourceAssignment_6");
					put(grammarAccess.getAttackerAccess().getRequestsAssignment_7(), "rule__Attacker__RequestsAssignment_7");
					put(grammarAccess.getMaliciousRequestAccess().getNameAssignment_1(), "rule__MaliciousRequest__NameAssignment_1");
					put(grammarAccess.getMaliciousRequestAccess().getSourceAssignment_4(), "rule__MaliciousRequest__SourceAssignment_4");
					put(grammarAccess.getMaliciousRequestAccess().getDestinationAssignment_6(), "rule__MaliciousRequest__DestinationAssignment_6");
					put(grammarAccess.getMaliciousRequestAccess().getPortAssignment_8(), "rule__MaliciousRequest__PortAssignment_8");
					put(grammarAccess.getMaliciousRequestAccess().getDataAssignment_10(), "rule__MaliciousRequest__DataAssignment_10");
					put(grammarAccess.getMaliciousRequestAccess().getProtocolAssignment_12(), "rule__MaliciousRequest__ProtocolAssignment_12");
					put(grammarAccess.getNormalRequestAccess().getNameAssignment_1(), "rule__NormalRequest__NameAssignment_1");
					put(grammarAccess.getNormalRequestAccess().getSourceAssignment_4(), "rule__NormalRequest__SourceAssignment_4");
					put(grammarAccess.getNormalRequestAccess().getDestinationAssignment_6(), "rule__NormalRequest__DestinationAssignment_6");
					put(grammarAccess.getNormalRequestAccess().getPortAssignment_8(), "rule__NormalRequest__PortAssignment_8");
					put(grammarAccess.getNormalRequestAccess().getDataAssignment_10(), "rule__NormalRequest__DataAssignment_10");
					put(grammarAccess.getNormalRequestAccess().getProtocolAssignment_12(), "rule__NormalRequest__ProtocolAssignment_12");
					put(grammarAccess.getDefenderAccess().getTypeAssignment_0(), "rule__Defender__TypeAssignment_0");
					put(grammarAccess.getDefenderAccess().getNameAssignment_1(), "rule__Defender__NameAssignment_1");
					put(grammarAccess.getDefenderAccess().getFilenameAssignment_4(), "rule__Defender__FilenameAssignment_4");
					put(grammarAccess.getDefenderAccess().getSourceAssignment_6(), "rule__Defender__SourceAssignment_6");
					put(grammarAccess.getDefenderAccess().getSecurityPolicylistAssignment_7(), "rule__Defender__SecurityPolicylistAssignment_7");
					put(grammarAccess.getSecurityPolicyListAccess().getNameAssignment_1(), "rule__SecurityPolicyList__NameAssignment_1");
					put(grammarAccess.getSecurityPolicyListAccess().getSecurityPoliciesAssignment_3(), "rule__SecurityPolicyList__SecurityPoliciesAssignment_3");
					put(grammarAccess.getSecurityPolicyListAccess().getConditionsAssignment_4(), "rule__SecurityPolicyList__ConditionsAssignment_4");
					put(grammarAccess.getSecurityPolicyAccess().getNameAssignment_1(), "rule__SecurityPolicy__NameAssignment_1");
					put(grammarAccess.getSecurityPolicyAccess().getEndPointAssignment_3(), "rule__SecurityPolicy__EndPointAssignment_3");
					put(grammarAccess.getSecurityPolicyAccess().getConditionlistAssignment_6(), "rule__SecurityPolicy__ConditionlistAssignment_6");
					put(grammarAccess.getSecurityPolicyAccess().getOperationListAssignment_7_0(), "rule__SecurityPolicy__OperationListAssignment_7_0");
					put(grammarAccess.getSecurityPolicyAccess().getConditionlistAssignment_7_1(), "rule__SecurityPolicy__ConditionlistAssignment_7_1");
					put(grammarAccess.getSecurityPolicyAccess().getTrueActionListAssignment_10(), "rule__SecurityPolicy__TrueActionListAssignment_10");
					put(grammarAccess.getSecurityPolicyAccess().getTrueActionListAssignment_11_1(), "rule__SecurityPolicy__TrueActionListAssignment_11_1");
					put(grammarAccess.getSecurityPolicyAccess().getFalseActionListAssignment_13(), "rule__SecurityPolicy__FalseActionListAssignment_13");
					put(grammarAccess.getSecurityPolicyAccess().getFalseActionListAssignment_14_1(), "rule__SecurityPolicy__FalseActionListAssignment_14_1");
					put(grammarAccess.getConditionAccess().getNameAssignment_1(), "rule__Condition__NameAssignment_1");
					put(grammarAccess.getConditionAccess().getSubConditionListAssignment_3(), "rule__Condition__SubConditionListAssignment_3");
					put(grammarAccess.getConditionAccess().getSubConditionListAssignment_4_1(), "rule__Condition__SubConditionListAssignment_4_1");
					put(grammarAccess.getProtocolCheckAccess().getNameAssignment_0(), "rule__ProtocolCheck__NameAssignment_0");
					put(grammarAccess.getProtocolCheckAccess().getValueAssignment_2(), "rule__ProtocolCheck__ValueAssignment_2");
					put(grammarAccess.getHTTPMethodCheckAccess().getNameAssignment_0(), "rule__HTTPMethodCheck__NameAssignment_0");
					put(grammarAccess.getHTTPMethodCheckAccess().getValueAssignment_2(), "rule__HTTPMethodCheck__ValueAssignment_2");
					put(grammarAccess.getRegExpMatchAccess().getNameAssignment_0(), "rule__RegExpMatch__NameAssignment_0");
					put(grammarAccess.getRegExpMatchAccess().getValueAssignment_2(), "rule__RegExpMatch__ValueAssignment_2");
					put(grammarAccess.getFrequencyCheckAccess().getNameAssignment_0(), "rule__FrequencyCheck__NameAssignment_0");
					put(grammarAccess.getFrequencyCheckAccess().getValueAssignment_2(), "rule__FrequencyCheck__ValueAssignment_2");
					put(grammarAccess.getHTTPParamLenCheckAccess().getNameAssignment_0_0(), "rule__HTTPParamLenCheck__NameAssignment_0_0");
					put(grammarAccess.getHTTPParamLenCheckAccess().getValueAssignment_0_2(), "rule__HTTPParamLenCheck__ValueAssignment_0_2");
					put(grammarAccess.getHTTPParamLenCheckAccess().getNameAssignment_1_0(), "rule__HTTPParamLenCheck__NameAssignment_1_0");
					put(grammarAccess.getHTTPParamLenCheckAccess().getValueAssignment_1_2(), "rule__HTTPParamLenCheck__ValueAssignment_1_2");
					put(grammarAccess.getHTTPParamLenCheckAccess().getNameAssignment_2_0(), "rule__HTTPParamLenCheck__NameAssignment_2_0");
					put(grammarAccess.getHTTPParamLenCheckAccess().getValueAssignment_2_2(), "rule__HTTPParamLenCheck__ValueAssignment_2_2");
					put(grammarAccess.getEndPointAccess().getPortAssignment_2(), "rule__EndPoint__PortAssignment_2");
					put(grammarAccess.getEndPointAccess().getProtocolAssignment_4(), "rule__EndPoint__ProtocolAssignment_4");
					put(grammarAccess.getDropRequestAccess().getActionAssignment(), "rule__DropRequest__ActionAssignment");
					put(grammarAccess.getBlockSenderAccess().getActionAssignment(), "rule__BlockSender__ActionAssignment");
					put(grammarAccess.getPassRequestAccess().getActionAssignment(), "rule__PassRequest__ActionAssignment");
					put(grammarAccess.getIPAddressAccess().getByte1Assignment_0(), "rule__IPAddress__Byte1Assignment_0");
					put(grammarAccess.getIPAddressAccess().getByte2Assignment_2(), "rule__IPAddress__Byte2Assignment_2");
					put(grammarAccess.getIPAddressAccess().getByte3Assignment_4(), "rule__IPAddress__Byte3Assignment_4");
					put(grammarAccess.getIPAddressAccess().getByte4Assignment_6(), "rule__IPAddress__Byte4Assignment_6");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslSampleParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslSampleParser) parser;
			typedParser.entryRuleHttpShieldModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDslSampleGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslSampleGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
