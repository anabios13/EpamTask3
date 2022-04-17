package Domain;

import java.io.IOException;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import Objects.Deposit;


public class Runner {
    public static void main(String[] args) throws IOException, XMLStreamException {
        XmlValidator validator = new XmlValidator("file1.xml");
        if (validator.validate()) {
            XmlReader reader = new XmlReader();
            List<Deposit> deposits = reader.read("file1.xml");
//            Random random = new Random();
//            for (Deposit deposit : deposits) {
//                deposit.setCost((long) (deposit.getCost() * (1 + random.nextInt(100) / 100.0)));
//            }
////            Collections.sort(Deposits);
//            Collections.sort(deposits, new Comparator<Deposit>() {
//                @Override
//                public int compare(Deposit o1, Deposit o2) {
//                    return o2.getCost().compareTo(o1.getCost());s
//                }
//            });
            for (Deposit deposit : deposits) {
                System.out.println(deposit);
            }
        }
        else {
            System.out.println(validator.getError());
        }
    }
}

