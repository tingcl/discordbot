# discordbot

## description

A simple bot created using Java and Maven to assist with managing discord servers. Hosted using heroku.

## deployment

1. mvn clean compile assembly:single
2. heroku plugins:install heroku-cli-deploy
3. heroku create
4. heroku deploy:jar target/discordbot-1.0-SNAPSHOT-jar-with-dependencies.jar --app polar-lowlands-80002
5. heroku ps:scale worker=1 --app polar-lowlands-80002
