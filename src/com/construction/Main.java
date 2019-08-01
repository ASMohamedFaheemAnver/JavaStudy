package com.construction;

import com.construction.operation.BillCalculater;
import com.construction.operation.OperationFactory;
import com.construction.inputReader.CmdLineInput;
import com.construction.inputReader.InputReader;

import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws SQLException {
        InputReader arg = new CmdLineInput(args);
        OperationFactory factory = new OperationFactory();
        BillCalculater x = factory.getInstance(arg.get());
        System.out.println(x.calculate());
    }
}