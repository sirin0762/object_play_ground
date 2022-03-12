import java.util.List;

public class TicketOffice {

    public List<Ticket> tickets;
    public Money amount;

    public TicketOffice(Money amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets = List.of(tickets);
    }

    public Ticket getTicket() {
        if(tickets.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return tickets.remove(0);
    }

    public void plusAmount(Money money) {
        this.amount.plus(money);
    }

}
