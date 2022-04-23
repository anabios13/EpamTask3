package Domain;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import javax.xml.stream.XMLStreamException;

import Objects.Deposit;


public class Runner {
    public static void main(String[] args) throws IOException, XMLStreamException {
        XmlValidator validator = new XmlValidator("file1.xml");
        if (validator.validate()) {
            XmlReader reader = new XmlReader();
            List<Deposit> deposits = reader.read("file1.xml");
            for (Deposit deposit : deposits) {
                System.out.println(deposit);
            }
        }
        else {
            System.out.println(validator.getError());
        }
    }
}

