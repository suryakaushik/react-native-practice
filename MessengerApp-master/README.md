# MessengerApp
Messenger Application using React Native and Gifted Chat and Socket.IO


# Demo Screenshots
<img src="./outputs/chats.png" width="200" height="400" /> <img src="./outputs/image.png" width="200" height="400" /> <img src="./outputs/typing.png" width="200" height="400" /> <img src="./outputs/online.png" width="200" height="400" /> <img src="./outputs/images.png" width="200" height="400" /> <img src="./outputs/viewimage.png" width="200" height="400" /> <img src="./outputs/contacts.png" width="200" height="400" /> <img src="./outputs/profile.png" width="200" height="400" />


# Get Started

### Frontend setup
#### Change to mobile directory.
```cd mobile```

#### Install node packages.
```npm install```

#### Run below command to install app in emulator or mobile(make sure you already setup adb emulator Or connected to your mobile with USB and USB Debugging should be on and Allow install from unknown sources)
```npm run android```

#### Run the React Server
```npm run start```


### Backend setup

#### Database setup.
1.Create a database with name messenger.

2.Import messenger.sql dump file (located in backend/db/messenger.sql) in messenger db.

3.Provide your mysql credentials in backend/db/index.js

#### Change to backend directory.

```cd backend```

#### Install node packages.
```npm install```

#### Run Node Server
```npm start```