package Tamrin7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.Semaphore;

public class Inserting extends Thread{
    Connection connection;

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
    Semaphore semaphore = new Semaphore(4);


    @Override
    public void run() {
        String sql ="INSERT INTO test(test1, test2) values (?,?)";
        try {
            semaphore.acquire();
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i<1000;i++){
                System.out.println(Thread.currentThread().getName());
                preparedStatement.setInt(1,i);
                preparedStatement.setString(2,String.valueOf(i));
                preparedStatement.executeUpdate();
                semaphore.release();
                //Thread.sleep(100);
            }
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
