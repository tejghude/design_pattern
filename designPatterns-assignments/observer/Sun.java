package net.media.training.designpattern.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sun {
    private boolean isUp;
    private final Robot robot;
    private final Person person;
    private final Dog dog;
    private final Cat cat;


    List<Character> characters = new ArrayList<Character>();

    public Sun(Robot robot, Person person, Dog dog, Cat cat) {
        this.robot = robot;
        this.person = person;
        this.dog = dog;
        this.cat = cat;
        characters.add(this.robot);
        characters.add(this.person);
        characters.add(this.dog);
        characters.add(this.cat);

    }


    public boolean isUp() {
        return isUp;
    }

    public void set() {
        isUp = false;
        for(Character character : characters){
            if(character.isOutdoors()) character.notifySunSet();
        }
//        if (robot.isOutdoors()) {
//            robot.notifySunSet();
//        }
//
//        if (person.isOutdoors()) {
//            person.notifySunSet();
//        }
//
//        if (dog.isOutdoors()) {
//            dog.notifySunSet();
//        }
//
//        if (cat.isOutdoors()) {
//            cat.notifySunSet();
//        }
    }

    public void rise() {
        isUp = true;
        for(Character character : characters){
            if(character.isOutdoors()) character.notifySunRose();
        }
//
//        if (robot.isOutdoors()) {
//            robot.notifySunRose();
//        }
//
//        if (person.isOutdoors()) {
//            person.notifySunRose();
//        }
//
//        if (dog.isOutdoors()) {
//            dog.notifySunRose();
//        }
//
//        if (cat.isOutdoors()) {
//            cat.notifySunRose();
//        }
    }
}