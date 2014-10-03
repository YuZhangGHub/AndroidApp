package com.example.base;

public final class C {
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	// core settings (important)
	
	public static final class dir {
		public static final String base				= "/sdcard/exampleApp";
		public static final String faces			= base + "/faces";
		public static final String images			= base + "/images";
	}
	
	public static final class api {
		public static final String base				= "http://192.168.1.101:8001";
		public static final String index			= "/index/index";
		public static final String login			= "/index/login";
		public static final String logout			= "/index/logout";
		public static final String faceView 		= "/image/faceView";
		public static final String faceList 		= "/image/faceList";
		public static final String testLogin	    = "/test/login";
		public static final String testJson		    = "/test/json";
		public static final String testImage		= "/test/image";
//		public static final String commentList		= "/comment/commentList";
//		public static final String commentCreate	= "/comment/commentCreate";
//		public static final String customerView		= "/customer/customerView";
//		public static final String customerEdit		= "/customer/customerEdit";
//		public static final String fansAdd			= "/customer/fansAdd";
//		public static final String fansDel			= "/customer/fansDel";
		public static final String notice			= "/notify/notice";
	}
	
	public static final class task {
		public static final int index				= 1001;
		public static final int login				= 1002;
		public static final int logout				= 1003;
		public static final int testLogin			= 1004;
		public static final int testJson			= 1005;
		public static final int testImage			= 1006;
//		public static final int blogView			= 1007;
//		public static final int blogCreate			= 1008;
//		public static final int commentList			= 1009;
//		public static final int commentCreate		= 1010;
//		public static final int customerView		= 1011;
//		public static final int customerEdit		= 1012;
//		public static final int fansAdd				= 1013;
//		public static final int fansDel				= 1014;
		public static final int notice				= 1015;
	}
	
	public static final class err {
		public static final String network			= "缂�锟界��锟斤拷锟斤拷���锟�";
		public static final String message			= "濞�锟斤拷锟斤拷锟斤拷锟界��锟�";
		public static final String jsonFormat		= "濞�锟斤拷锟斤拷锟斤拷���锟斤拷锟斤拷锟界��锟�";
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	// intent & action settings
	
	public static final class intent {
		public static final class action {
//			public static final String EDITTEXT		= "com.app.demos.EDITTEXT";
//			public static final String EDITBLOG		= "com.app.demos.EDITBLOG";
		}
	}
	
	public static final class action {
		public static final class edittext {
//			public static final int CONFIG			= 2001;
//			public static final int COMMENT			= 2002;
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	// additional settings
	
	public static final class web {
		public static final String base				= "http://192.168.1.101:8002";
		public static final String index			= base + "/index.php";
		public static final String gomap			= base + "/gomap.php";
		public static final String formName         = "form_file";// 自己需要配置的表单, 文件的key  
	}
}