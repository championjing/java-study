package com.rzwl.study.pattern.hAbstractFactory.factory;

/**
 * @author : championjing
 * @ClassName: Factory
 * @Description:
 * @Date: 7/19/2019 3:01 PM
 */
public abstract class Factory {
    
    public static Factory getFactory(String classname){
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("没有找到 "+classname + " 类");
            e.printStackTrace();
        }
        return factory;
    }
    
    public abstract Link createLink(String caption,String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title,String author);
}
