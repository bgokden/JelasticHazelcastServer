package com.berkgokden;

/**
 * Created by berkgokden on 12/11/14.
 */
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class HazelcastClientClass {

    public static String[] call() {
        ClientConfig clientConfig1 = new ClientConfig();
        ClientConfig clientConfig2 = new ClientConfig();
        clientConfig1.addAddress("192.168.24.205:5701");
        clientConfig2.addAddress("192.168.24.226:5701");
        HazelcastInstance client1 = HazelcastClient.newHazelcastClient(clientConfig1);
        HazelcastInstance client2 = HazelcastClient.newHazelcastClient(clientConfig2);
        IMap map1 = client1.getMap("customers");
        IMap map2 = client2.getMap("customers");
        String[] result = new String[2];
        result[0] = ("Map1 Size:" + map1.size());
        result[1] = ("Map2 Size:" + map2.size());
        //System.out.println("Map1 Size:" + map1.size());
        //System.out.println("Map2 Size:" + map2.size());
        return result;
    }
}
