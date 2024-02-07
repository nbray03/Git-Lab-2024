package edu.unl.raikes.git;

public class GitLab {
    public static void main(String[] args) {
        GitLabHelper helper = new GitLabHelper(new String[]{"Peyton", "Nathan", "Jake"});
        helper.PrintWelcomeMessage();
    }
}
