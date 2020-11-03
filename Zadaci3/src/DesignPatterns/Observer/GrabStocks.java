package DesignPatterns.Observer;

public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(400);
        stockGrabber.setAAPLPrice(500);
        stockGrabber.setGOOGPrice(600);

        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.unregister(observer1);

        stockGrabber.setIBMPrice(100);
        stockGrabber.setAAPLPrice(200);
        stockGrabber.setGOOGPrice(300);
    }
}
