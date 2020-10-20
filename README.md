# discordbot

## description

A simple bot created using Java and Maven to assist with managing discord servers. Hosted using heroku.

## demo

For a simple demo, join my test server and play around with the bot
https://discord.gg/NPQAGQa

## deployment

### set up a new bot

1. Create a new application on discord developers webpage (https://discord.com/developers/docs/intro)
2. Download source code
3. Create a heroku account
3. Download heroku CLI here (https://devcenter.heroku.com/articles/heroku-cli)
4. Type "heroku login" in the console to log in
5. Type "heroku create" to create a new application server on heroku
6. Type "heroku plugins:install heroku-cli-deploy"
7. Type "mvn clean compile assembly:single" to create executable bot jar
8. Create a config variable on heroku's site, name it BOT_TOKEN, and assign your bot's secret token as the config variable's value
9. Type "heroku deploy:jar target/discordbot-1.0-SNAPSHOT-jar-with-dependencies.jar --app <HEROKU_APPLICATION_NAME>" to deploy onto the server
10. Type "heroku ps:scale worker=1 --app <HEROKU_APPLICATION_NAME>" to create an instance of deployed bot

### update existing bot

1. Type "heroku login" in the console to log in
2. Type "mvn clean compile assembly:single" to create executable bot jar
3. Type "heroku deploy:jar target/discordbot-1.0-SNAPSHOT-jar-with-dependencies.jar --app <HEROKU_APPLICATION_NAME>" to deploy onto the server

