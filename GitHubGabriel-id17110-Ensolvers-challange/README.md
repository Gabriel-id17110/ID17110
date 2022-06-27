
	mysql version: 			8.0.29
	SpringBoot version:		v2.6.8


	application.properties => change username and password


			spring.jpa.hibernate.ddl-auto=update
			spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/notesexercisedb
	=>		spring.datasource.username=root 						
	=>		spring.datasource.password=root
			spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver



	run the database script "dataBase"

	open "index.html" file locate  ...GitHubGabriel-id17110-Ensolvers-challange\src\main\webapp