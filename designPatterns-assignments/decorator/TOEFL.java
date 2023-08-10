package net.media.training.designpattern.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 10:41:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class TOEFL extends CriteriaDecorator{
    Criteria criteria;
    public  TOEFL(Criteria criteria){
        this.criteria=criteria;
    }
    public TOEFL(){}

    @Override
    public boolean evaluate(Application theApp) {
        System.out.println("TOEFL called");
        return criteria.evaluate(theApp) && theApp.getToefl() > 100;
    }
}
