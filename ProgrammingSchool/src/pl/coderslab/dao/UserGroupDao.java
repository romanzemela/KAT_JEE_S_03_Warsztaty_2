package pl.coderslab.dao;

import pl.coderslab.entity.UserGroup;
import pl.coderslab.service.DbService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserGroupDao {


    public static int savetoDb(UserGroup group) {
        if (group.getId() == 0) {
            //add new
            return add(group);
        } else {
            //update
            return update(group);
        }
    }

    private static int add(UserGroup group) {

        try {

            String query = "Insert into user_group Values (null, ?)";
            List<String> params = new ArrayList<>();
            params.add(group.getName());

            int newId = DbService.insertIntoDatabase(query, params);
            group.setId(newId);
            return newId;

        } catch (SQLException e) {
            return 0;
        }
    }


    private static int update(UserGroup group) {

        try {

            String query = "Update user_group Set name = ? Where id = ?";
            List<String> params = new ArrayList<>();
            params.add(group.getName());
            params.add(String.valueOf(group.getId()));

            int count = DbService.executeQuery(query, params);
            return count;

        } catch (SQLException e) {
            return 0;
        }
    }

    public int delete(int id) throws SQLException {
        String query = "Delete from user_group where id = ?";
        List<String> params = new ArrayList<>();
        params.add(String.valueOf(id));

        return DbService.executeQuery(query, params);

    }

    public List<UserGroup> loadAll() throws SQLException {

        String query = "Select * from user_group";
        List<String[]> userGroups = DbService.getData(query, null);

        List<UserGroup> groupsList = new ArrayList<>();
        for (String[] row : userGroups) { // przepisanie wyników z listy String do listy uzytkownikow
            UserGroup ug = new UserGroup();
            ug.setId(Integer.parseInt(row[0]));
            ug.setName(row[1]);

            groupsList.add(ug); // dodane pozycji do listy uzytkownikow
        }

        return groupsList;
    }

    public UserGroup loadById(int id) throws SQLException {
        String query = "Select * from user_group where id=?";
        List<String> params = new ArrayList<>();
        params.add(String.valueOf(id));
        List<String[]> usergroup = DbService.getData(query, params);

        UserGroup ug = new UserGroup();
        ug.setId(Integer.parseInt(usergroup.get(0)[0]));
        ug.setName(usergroup.get(0)[1]);

        return ug;
    }

}