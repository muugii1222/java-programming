package office_hours.socialMedia_task;

/**
 Groups interface

 •Create an interface hasGroups with the following actions:

    -joinGroup(String group);
    -leaveGroup(String group);

 •Add a variable in FacebookUser to count the number of groups they are in and implement the 2 methods from Groups interface.

    -joinGroup prints "%usersName has joined%group" and increment the total number of groups
    -leaveGroup prints "%usersName has left %group" and decrement the total number of groups

 */


public interface Groups {

    void joinGroup(String groupName);
    void leaveGroup(String groupName);

}
