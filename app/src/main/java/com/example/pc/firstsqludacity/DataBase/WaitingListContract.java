package com.example.pc.firstsqludacity.DataBase;

import android.provider.BaseColumns;

/**
 * Created by PC on 7/27/2017.
 */

public class WaitingListContract  {



    public static final class Waitinglistentry implements BaseColumns{


        public static final String TABLE_NAME = "waitlist";
        public static final String COLUMN_GUEST_NAME = "guestName";
        public static final String COLUMN_PARTY_SIZE = "partySize";
        public static final String COLUMN_TIMESTAMP = "timestamp";
    }
}
