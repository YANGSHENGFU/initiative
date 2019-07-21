package com.mit;

public class HttpConfig {

    public static  String HOST_NAME = "http://47.112.97.81:8006/";
    public static  String PIC_HOST_NAME = "http://47.112.97.81:8006/";

    public static String CURRENT_HOST = HOST_NAME;
    //public static String CURRENT_HOST = PIC_HOST_NAME;

    public static String INTERFACE_LODINF  = "UserInter/GetUserKey?" ;
    public static String INTERFACE  = "Room/RoomLookList?";
    public static String INTERFACE_uploadPhoto  = "Room/RoomLookUpImg?";
    public static String INTERFACE_checkOut = "Room/RoomLookUp?";
    public static String INTERFACE_roomClList = "Room/RoomClList?";
    public static String INTERFACE_roomClUp = "Room/RoomClUp?";
    public static String INTERFACE_arrangeCleanRoom = "Room/RoomClAdd?";
    public static String INTERFACE_CL_uploadPhoto  = "Room/RoomClUpImg?";
    public static String INTERFACE_floorList = "Room/FloorList?";
    public static String INTERFACE_rpriceList = "Room/RpriceList?";
    public static String INTERFACE_GetUserList = "UserInter/GetUserList?";
    public static String INTERFACE_RoomClAdd = "Room/RoomClAdd?";
    public static String INTERFACE_BAGGAGE = "Luggage/Add?" ;
    public static String INTERFACE_BAGGAGE_UPLOADPHOTO ="Luggage/UpImg?";
    public static String INTERFACE_RESERVATION_QUERY = "Luggage/ReserveList?";
    public static String INTERFACE_RESERVATION_FIND = "Luggage/List?";
    public static String INTERFACE_LUGGAGE_QUERY="Luggage/List?";
    public static String INTERFACE_DESK_NUMBER = "FoodCom/CzList?";
    public static String INTERFACE_REGION = "FoodCom/CzTwsList?";
    public static String INTERFACE_FLAVOR = "FoodCom/KwList?";
    public static String INTERFACE_PROCESSING_METHOD = "FoodCom/ZfList?";
    public static String INTERFACE_TABLE_INFO_CHIN = "FoodCh/CzList?";
    public static String INTERFACE_OPEN_TABLE = "FoodCh/CkzkAdd?";
    public static String INTERFACE_FOOD_CHINES_LIST= "FoodCh/BmList?";


    public static class Field{

        public static String user = "user" ;
        public static String pwd = "pwd" ;
        public static String mid = "mid";
        public static String key = "key";
        public static String rows = "rows";
        public static String timestamp = "timestamp";
        public static String page = "page";
        public static String look_id = "look_id";
        public static String img = "img";
        public static String room = "room";
        public static String floor = "floor";
        public static String type_class = "class";


        public static String tage = "tage";
        public static String hserver_name = "hserver_name";
        public static String server_memo = "server_memo";

        public static String arrange = "arrange"; //是否安排清洁
        public static String state = "state"; //清洁房间状态
        public static String state2 = "state2"; //清洁房间状态
        public static String onduty1n = "onduty1n"; // 安排清洁的人名字
        public static String onduty3n = "onduty3n"; // 被安排清洁的人名字
        public static String class_new = "class_new" ; // 房间类型

        public static String name = "name";
        public static String tel = "tel";
        public static String order_no = "order_no";
        public static String memo1 = "memo1";
        public static String xl_id = "xl_id";
        public static String kword = "kword";
        public static String mobile = "mobile";
        public static String cxbm = "cxbm";
        public static String tws = "tws"; // ctbm
        public static String ctbm = "ctbm";
        public static String czbm = "czbm";
        public static String czmc = "czmc";
        public static String rs = "rs";
        public static String pzrdm = "pzrdm";





        public static String errCode = "errCode" ;


    }

}
