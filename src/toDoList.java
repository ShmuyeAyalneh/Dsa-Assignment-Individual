public class toDoList {
    Node head;
    public toDoList(){
        this.head = null;
    }
    public void addToDo(Task task){
        Node node = new Node(task);
        if(head == null){
            head = node;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }
    public void markToDoAsCompleted(String title){
        Node current = head;
        while(current != null){
            if (current.task.getTitle().equals(title)){
                current.task.markCompleted();
                return;
            }
            current = current.next;
        }
        System.out.println("TasK not found.");
    }
    public void viewToDoList(){
        Node current = head;
        while(current != null){
            System.out.println("title: " + current.task.getTitle() +
                    " , description: " + current.task.getDescription() +
                            " ,completed: " + current.task.isCompleted()
                    );
            current = current.next;
        }
    }

    public static void main(String[] args) {
        toDoList doList = new toDoList();
        doList.addToDo(new Task("sport", "Task 1"));
        doList.addToDo(new Task("class", "Task 2"));
        doList.addToDo(new Task("Lunch", "Task 3"));
        doList.addToDo(new Task("Reading", "Task 4"));
        doList.addToDo(new Task("sport", "Task 5"));
        doList.addToDo(new Task("sleep", "Task  6"));
        doList.markToDoAsCompleted("Reading");
        doList.viewToDoList();

    }
}
