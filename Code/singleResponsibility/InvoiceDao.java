//package com.example.lld;
//
//public class InvoiceDao {
//    Invoice invoice;
//
//    public InvoiceDao(Invoice invoice) {
//        this.invoice = invoice;
//    }
//
//    public void saveToDB()
//    {
//        //save into DB
//    }
//
//    public void saveToFile()
//    {
//        //save into File
//    }
//}


package com.example.singleResponsibility;

interface InvoiceDao{
    public void save(Invoice invoice);
}
class DatabaseInvoiceDao implements InvoiceDao{

    public void save(Invoice invoice) {
        //save to DB
    }
}

class FileInvoiceDao implements InvoiceDao{

    public void save(Invoice invoice) {
        //save to file
    }
}

