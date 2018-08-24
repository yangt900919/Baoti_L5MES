package cn.linkpal.model;

import java.util.List;

/**
 * 工艺流转卡实体及子表
 */
public class CardAndChilden {

    // 工艺流转卡实体
    private ProcessFlowCard ProcessFlowCard;

    // 卡片附件列表
    private List<CardAttachment> ListCardAttachment;

    // 流转卡工序信息列表
    private  List<CardProcessInformation> ListCardProcessInformationt;

    // 投料信息列表
    private List<FeedingInformation> ListFeedingInformation;

    // 生产任务
    private List<FlowCardProductionRequirement> ListFlowCardProductionRequirement;



    public cn.linkpal.model.ProcessFlowCard getProcessFlowCard() {
        return ProcessFlowCard;
    }

    public void setProcessFlowCard(cn.linkpal.model.ProcessFlowCard processFlowCard) {
        ProcessFlowCard = processFlowCard;
    }

    public List<CardAttachment> getListCardAttachment() {
        return ListCardAttachment;
    }

    public void setListCardAttachment(List<CardAttachment> listCardAttachment) {
        ListCardAttachment = listCardAttachment;
    }

    public List<CardProcessInformation> getListCardProcessInformationt() {
        return ListCardProcessInformationt;
    }

    public void setListCardProcessInformationt(List<CardProcessInformation> listCardProcessInformationt) {
        ListCardProcessInformationt = listCardProcessInformationt;
    }

    public List<FeedingInformation> getListFeedingInformation() {
        return ListFeedingInformation;
    }

    public void setListFeedingInformation(List<FeedingInformation> listFeedingInformation) {
        ListFeedingInformation = listFeedingInformation;
    }

    public List<FlowCardProductionRequirement> getListFlowCardProductionRequirement() {
        return ListFlowCardProductionRequirement;
    }

    public void setListFlowCardProductionRequirement(List<FlowCardProductionRequirement> listFlowCardProductionRequirement) {
        ListFlowCardProductionRequirement = listFlowCardProductionRequirement;
    }
}
