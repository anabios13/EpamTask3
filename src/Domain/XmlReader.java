package Domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;


import Objects.Deposit;
import Objects.DepositType;

public class XmlReader {
    public List<Deposit> read(String fileName) throws FileNotFoundException {
        XMLStreamReader reader = null;
        try {
            List<Deposit> Deposits = new ArrayList<Deposit>();
            Deposit deposit = null;
            XMLInputFactory factory = XMLInputFactory.newFactory();
            reader = factory.createXMLStreamReader(new FileInputStream(fileName));
            while (reader.hasNext()) {
                int type = reader.next();
                switch (type) {
                    case XMLStreamConstants.START_ELEMENT: {
                        String tagName = reader.getLocalName();
                        if ("deposit".equals(tagName)) {
                            deposit = new Deposit();
                            deposit.setIdentity(reader.getAttributeValue(null, "id"));
                        } else if ("name".equals(tagName)) {
                            deposit.setName(reader.getElementText());
                        } else if ("country".equals(tagName)) {
                            deposit.setCountry(reader.getElementText());
                        } else if ("depositType".equals(tagName)) {
                            deposit.setDepositType(DepositType.valueOf(reader.getElementText()));
                        } else if ("depositor".equals(tagName)) {
                            deposit.setDepositor(reader.getElementText());
                        } else if ("accountID".equals(tagName)) {
                            deposit.setAccountID(Integer.parseInt(reader.getElementText()));
                        } else if ("amountOnDeposit".equals(tagName)) {
                            deposit.setAmountOnDeposit(Integer.parseInt(reader.getElementText()));
                        } else if ("profitability".equals(tagName)) {
                            deposit.setProfitability(Integer.parseInt(reader.getElementText()));
                        }
                        else if ("timeConstraints".equals(tagName)) {
                            deposit.setTimeConstraints(Integer.parseInt(reader.getElementText()));
                        }
                        break;
                    }
                    case XMLStreamConstants.END_ELEMENT: {
                        String tagName = reader.getLocalName();
                        if ("deposit".equals(tagName)) {
                            Deposits.add(deposit);
                        }
                        break;
                    }
                }
            }
            return Deposits;
        } catch (XMLStreamException e) {
            return null;
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
            }
        }
    }
}
