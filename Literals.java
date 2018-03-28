class Hotel {
    public int bookings;
    public void book() {
        bookings++;
    }
}

public class Literals extends Hotel {
    public void book() {
        bookings--;
    }
    
    public void book(int size) {
        book();
        super.book();
        bookings += size;
    }
    
    public static void main(String args[]) {
        Hotel hotel = new Literals();
        Hotel.book(2);
        System.out.print(hotel.bookings);
    }
}