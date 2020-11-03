package paket.Access;

import java.lang.reflect.Array;

public class ConnectionManager {
    public static Connection newConnection(){
        Connection[] _connections= new Connection[5];
        for (int i = 0; i!= _connections.length ;i++)
        {
            if(_connections == null){
                _connections[i] = new Connection();
            }
            return _connections[i];
        }
        return null;
    }
}

