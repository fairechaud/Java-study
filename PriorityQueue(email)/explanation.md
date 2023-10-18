# Explanation - Solution

This program uses a PriorityQueue to store emails. The PriorityQueue is a data structure that maintains its elements in a sorted order. In this case, the emails are sorted by their timestamp, with the newest emails at the front of the queue.

The insertEmail() method adds a new email to the PriorityQueue. The searchEmail() method searches for an email with a given subject. The deleteEmail() method removes an email from the PriorityQueue.

The getNextEmail() method returns the newest email in the PriorityQueue. The readEmail() method removes an email from the PriorityQueue.

In this way, the finance official can always get the newest email by calling the getNextEmail() method. If the official wants to read an older email, they can use the searchEmail() method to find the email and then call the readEmail() method to remove it from the PriorityQueue.