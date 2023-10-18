import java.util.*;

public class EmailManager {
  private PriorityQueue<Email> emails;

  public EmailManager() {
    emails = new PriorityQueue<>(Comparator.comparing(Email::getTimestamp).reversed());
  }

  public void insertEmail(Email email) {
    emails.add(email);
  }

  public Email searchEmail(String subject) {
    for (Email email : emails) {
      if (email.getSubject().equals(subject)) {
        return email;
      }
    }

    return null;
  }

  public void deleteEmail(Email email) {
    emails.remove(email);
  }

  public Email getNextEmail() {
    return emails.poll();
  }

  public void readEmail(Email email) {
    emails.remove(email);
  }

  public static void main(String[] args) {
    EmailManager manager = new EmailManager();

    manager.insertEmail(new Email("New project proposal", "John Doe", "2023-10-17"));
    manager.insertEmail(new Email("Meeting agenda", "Jane Doe", "2023-10-16"));
    manager.insertEmail(new Email("Invoice", "Acme Corp", "2023-10-15"));

    Email nextEmail = manager.getNextEmail();
    System.out.println("Next email: " + nextEmail.getSubject());

    Email emailToRead = manager.searchEmail("Meeting agenda");
    manager.readEmail(emailToRead);

    nextEmail = manager.getNextEmail();
    System.out.println("Next email: " + nextEmail.getSubject());
  }
}

class Email {
  private String subject;
  private String sender;
  private String timestamp;

  public Email(String subject, String sender, String timestamp) {
    this.subject = subject;
    this.sender = sender;
    this.timestamp = timestamp;
  }

  public String getSubject() {
    return subject;
  }

  public String getSender() {
    return sender;
  }

  public String getTimestamp() {
    return timestamp;
  }
}
