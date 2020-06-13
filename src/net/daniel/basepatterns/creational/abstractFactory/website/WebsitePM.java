package net.daniel.basepatterns.creational.abstractFactory.website;

import net.daniel.basepatterns.creational.abstractFactory.team.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
