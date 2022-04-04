package com.company;

import java.util.*;

class QueueLinkedList<E> {
    private Queue<E> queuelist;

    //constructor dijalankn saat kita new queueLinkedList
    public QueueLinkedList() {
        queuelist = new LinkedList<>();
    }

    // fungsi buat nambahkan data
    public void enqueue(E todo) {
        queuelist.add(todo);
    }

    // fungsi buat menampilkan data
    public void displayList() {
        Iterator<E> iterator = queuelist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // fungsi untuk menampilkan yang pertama dikerjakan
    public void showCurrentTodo() {
        System.out.println(queuelist.peek());
    }

    // fungsi buat menghapus data
    public void dequeue() {
        queuelist.remove();
    }

    //fungsi untuk menampilkan list terakhir
    public void getlastTodo() {
      System.out.println(queuelist);
 }
}

public class Soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        QueueLinkedList<String> todolist = new QueueLinkedList<>();
        do {
            System.out.println("Program to do list Queue ");
            System.out.println("1. Masukkan to do list");
            System.out.println("2. Tampilkan seluruh to do list");
            System.out.println("3. Menghapus list yang telah diselesaikan");
            System.out.println("4. Menampilkan list tugas terbaru");
            System.out.println("5. Tugas berikutnya dikerjakan");
            System.out.println("6. Keluar");
            System.out.print("Masukkan inputtan kamu: ");
            input = scanner.next();

            if (input.equals("1")) {
                System.out.println("Silahkan masukkan to do list");
                String todoname = scanner.next();
                todolist.enqueue(todoname);
            } else if (input.equals("2")) {
                System.out.println("Daftar seluruh to do list");
                todolist.displayList();
            } else if (input.equals("3")) {
                System.out.println("Telah menghapus tugas yang diselesaikan ");
                todolist.dequeue();
            }else if (input.equals("4")){
                System.out.println("Daftar tugas terbaru ");
                todolist.getlastTodo();
            } else if (input.equals("5")) {
                System.out.println("List yang harus diselesaikan berikutnya");
                todolist.showCurrentTodo();
            }
        } while (!input.equals("6"));
        System.out.println("Kamu keluar dari program");

    }

}
