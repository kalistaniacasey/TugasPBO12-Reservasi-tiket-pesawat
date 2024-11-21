public class Main {
    public static void main(String[] args) {
        Ticket economy = new EconomyTicket("Nuna", 100);
        Ticket business = new BusinessTicket("Casey", 200);
        Ticket firstClass = new FirstClassTicket("Salma", 300);

        System.out.println("Economy Ticket:");
        economy.displayTicketInfo();

        System.out.println("\nBusiness Ticket:");
        business.displayTicketInfo();

        System.out.println("\nFirst Class Ticket:");
        firstClass.displayTicketInfo();
    }
}
