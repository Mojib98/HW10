package Tamrin7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.Semaphore;

public class Inserting extends Thread{
    Connection connection;
    volatile int i;

    {
        try {
            connection = Singleton.getInstance().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    PreparedStatement preparedStatement;
    Semaphore semaphore = new Semaphore(5);


    @Override
    public void run() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String sql ="INSERT INTO test(test1, test2) values (?,?)";
        try {


            preparedStatement = connection.prepareStatement(sql);

            for (i =0;i<100;i++){

                System.out.println(Thread.currentThread().getName());
                preparedStatement.setInt(1,i);
                preparedStatement.setString(2,Thread.currentThread().getName());

                preparedStatement.execute();
                semaphore.release();
                //Thread.sleep(100);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
