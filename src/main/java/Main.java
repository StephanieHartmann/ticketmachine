package main.java;

public class Main {

    public static void main(String[] args) {
        // testen der Ticketmachine
        // erstellen wir ein Objekt von TicketMachine
        TicketMachine ticketMachine = new TicketMachine(100);

        // Ausdruck vom ticket
        ticketMachine.printTicket();

        // Ausdruck vom price
        ticketMachine.showPrice();


        // second object
        TicketMachine sbbTicketMachine = new TicketMachine();
        // Ausdruck vom ticket
        sbbTicketMachine.printTicket();

    }

}
