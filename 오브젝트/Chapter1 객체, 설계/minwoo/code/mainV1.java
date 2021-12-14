package study;

import java.time.LocalDateTime;
import java.util.*;

public class mainV1 {
    public static class Invitation {
        private LocalDateTime when;
    }

    public static class Ticket {
        private Long fee;

        public Ticket(Long fee) {
            this.fee = fee;
        }

        public Long getFee() {
            return fee;
        }
    }

    public static class Bag {
        private Long amount;
        private Invitation invitation;
        private Ticket ticket;

        public Bag(long amount) {
            this(null, amount);
        }

        public Bag(Invitation invitation, long amount) {
            this.invitation = invitation;
            this.amount = amount;
        }

        public boolean hasInvitation() {
            return invitation != null;
        }

        public boolean hasTicket() {
            return ticket != null;
        }

        public void setTicket(Ticket ticket) {
            this.ticket = ticket;
        }

        public void minusAmount(Long amount) {
            this.amount -= amount;
        }

        public void plusAmount(Long amount) {
            this.amount += amount;
        }
    }

    public static class Audience {
        private Bag bag;

        public Audience(Bag bag) {
            this.bag = bag;
        }

        public Bag getBag() {
            return bag;
        }
    }

    public static class TicketOffice {
        private Long amount;
        private List<Ticket> tickets = new ArrayList<>();

        public TicketOffice(Long amount, Ticket... tickets) {
            this.amount = amount;
            this.tickets.addAll(Arrays.asList(tickets));
        }

        public Ticket getTicket() {
            return tickets.remove(0);
        }

        public void minusAmount(Long amount) {
            this.amount -= amount;
        }

        public void plusAmount(Long amount) {
            this.amount += amount;
        }
    }

    public static class TicketSeller {
        private TicketOffice ticketOffice;

        public TicketSeller(TicketOffice ticketOffice) {
            this.ticketOffice = ticketOffice;
        }

        public TicketOffice getTicketOffice() {
            return ticketOffice;
        }
    }

    public static class Theater {
        private TicketSeller ticketSeller;

        public Theater(TicketSeller ticketSeller) {
            this.ticketSeller = ticketSeller;
        }

        public void enter(Audience audience) {
            if (audience.getBag().hasInvitation()) {
                Ticket ticket = ticketSeller.getTicketOffice().getTicket();
                audience.getBag().setTicket(ticket);

                System.out.println("enter: intivation");
            } else {
                Ticket ticket = ticketSeller.getTicketOffice().getTicket();
                audience.getBag().minusAmount(ticket.getFee());
                ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
                audience.getBag().setTicket(ticket);

                System.out.println("enter: buy ticket");
            }
        }
    }

    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(1000L);
        Ticket ticket2 = new Ticket(1000L);

        TicketOffice ticketOffice = new TicketOffice(0L, ticket1, ticket2);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater = new Theater(ticketSeller);

        Audience audience = new Audience(new Bag(2000));

        theater.enter(audience);
    }
}
