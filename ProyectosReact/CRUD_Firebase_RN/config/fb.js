// import { initializeApp } from "firebase/app";
// import { getFirestore } from "firebase/firestore";
// import Constants from "expo-constants";

// Firebase config
// const firebaseConfig = {
//   apiKey: Constants.expoConfig.extra.apiKey,
//   authDomain: Constants.expoConfig.extra.authDomain,
//   projectId: Constants.expoConfig.extra.projectId,
//   storageBucket: Constants.expoConfig.extra.storageBucket,
//   messagingSenderId: Constants.expoConfig.extra.messagingSenderId,
//   appId: Constants.expoConfig.extra.appId,
//   databaseURL: Constants.expoConfig.extra.databaseURL,
//   //   @deprecated is deprecated Constants.manifest
// };

// // initialize firebase
// initializeApp(firebaseConfig);
// export const database = getFirestore();

// const firebaseConfig = {
//   apiKey: "AIzaSyACWNAX5V6IFzHV8B97MWraOWKbisVkpEA",
//   authDomain: "reactnative-capgemini.appspot.com",
//   projectId: "reactnative-capgemini",
//   storageBucket: "reactnative-capgemini.appspot.com",
//   messagingSenderId: "228016941999",
//   appId: "1:228016941999:android:4347343899374a08bbdd5a",

// };
// initializeApp(firebaseConfig);
// export const database=getFirestore();

//  databaseURL: Constants.expoConfig.extra.databaseURL,


import firebase from "firebase/compat/app";
import "firebase/compat/auth";
import "firebase/compat/firestore";

const firebaseConfig = {
  apiKey: "AIzaSyACWNAX5V6IFzHV8B97MWraOWKbisVkpEA",
  authDomain: "reactnative-capgemini.appspot.com",
  projectId: "reactnative-capgemini",
  storageBucket: "reactnative-capgemini.appspot.com",
  messagingSenderId: "228016941999",
  appId: "1:228016941999:android:4347343899374a08bbdd5a",
  measurementId: "",
};

if (!firebase.apps.length) {
  firebase.initializeApp(firebaseConfig);
}

const database = firebase.firestore();
const settings = { timestampsInSnapshots: true };
database.settings(settings);

// Enable experimentalForceLongPolling for Firestore
const firestoreConfig = {
  experimentalForceLongPolling: true,
};
const firestore = firebase.firestore(firebase.app());
firestore.settings(firestoreConfig);

export { firebase, database };