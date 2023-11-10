// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import {getFirestore} from "@firebase/firestore";

// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
const firebaseConfig = {
  apiKey: "AIzaSyACWNAX5V6IFzHV8B97MWraOWKbisVkpEA",
  authDomain: "reactnative-capgemini.appspot.com",
  projectId: "reactnative-capgemini",
  storageBucket: "reactnative-capgemini.appspot.com",
  messagingSenderId: "228016941999",
  appId: "1:228016941999:android:4347343899374a08bbdd5a"
};
const app = initializeApp(firebaseConfig);
export const firestore=getFirestore(app);


// anterior
// apiKey: "AIzaSyBPGmu2wwBDSTxpe7APXzayW5aXPlO9JCA",
// authDomain: "fir-demo-d3963.firebaseapp.com",
// projectId: "fir-demo-d3963",
// storageBucket: "fir-demo-d3963.appspot.com",
// messagingSenderId: "151778756971",
// appId: "1:151778756971:web:6a4008bc5608200925242e"



// appId: "1:419602277837:web:b3663946e1b60638139084"
//  appId: "1:151778756971:web:6a4008bc5608200925242e"
// Initialize Firebase
// const app = initializeApp(firebaseConfig);

// export const firestore=getFirestore(app);

// import firebase from "firebase";
// import "firebase/firestore";
// Initialize Firebase
// firebase.initializeApp(firebaseConfig);

// const db = firebase.firestore();

// export default {
//   firebase,
//   db
// };