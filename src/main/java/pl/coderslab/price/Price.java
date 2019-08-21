package pl.coderslab.price;

import pl.coderslab.zlec.Zlec;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double priceItems;
    private double priceUse;
    private double sum;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPriceItems() {
        return priceItems;
    }

    public void setPriceItems(double priceItems) {
        this.priceItems = priceItems;
    }

    public double getPriceUse() {
        return priceUse;
    }

    public void setPriceUse(double priceUse) {
        this.priceUse = priceUse;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = priceItems+priceUse;
    }

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", priceItems=" + priceItems +
                ", priceUse=" + priceUse +
                ", sum=" + sum +
                '}';
    }
}
