public class Audience {

    private String name;
    private Money money;
    private Ticket ticket;

    public Audience(String name, Money money) {
        this.name = name;
        this.money = money;
    }

    public Money buy(Ticket ticket) {
        this.setTicket(ticket);
        this.money.minus(ticket.getFee());
        return ticket.getFee();
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

}
