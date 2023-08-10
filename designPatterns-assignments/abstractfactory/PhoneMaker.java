package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {
    public Case buildPhone(String phoneType) {
        Factory phoneFactory;
        if (phoneType.equals("Android")){
            phoneFactory = new AndroidFactory();
        }else {
            phoneFactory = new IphoneFactory();
        }

        Case phoneCase = phoneFactory.assembleCase();
        Screen phoneScreen = phoneFactory.assembleScreen();
        MotherBoard phoneMotherBoard = phoneFactory.assembleMotherboard();

        phoneCase.attachMotherBoard(phoneMotherBoard);
        phoneCase.attachScreen(phoneScreen);

        return phoneCase;

    }
}
