package com.VaultX.dao;

import java.sql.*;
import com.VaultX.service.*;

public class CheckConnection {
	public static void main(String[] args) {
		Connection conn = DBConnection.getConnection();
		
		System.out.println(conn);
	}
}
