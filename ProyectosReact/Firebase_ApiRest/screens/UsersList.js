import React from "react";
import {View, Text, FlatList} from 'react-native';

import { useState, useEffect } from "react";
import { Button, StyleSheet } from "react-native";
import { ListItem, Avatar } from "react-native-elements";
import { ScrollView } from "react-native-gesture-handler";
import { addDoc, collection } from "@firebase/firestore";
import { firestore } from "../database/firebase";

const UsersList=() => {
   return (
        <View>
            <Text>Listado de Usuarios</Text>
        </View>
    )
}
// TypeError: 0, _firebase.firestore is not a function (it is Object)
const UsersList1=() => {
    const [data, setData]=useState();
    const usersCollection = firestore().collection('Users').get();
    setData(users.docs);
    console.log(usersCollection.get());
    return (
        <View>
            <Text>Listado de Usuarios</Text>
        </View>
    )
}
export default UsersList;


//Ejemplo1
// const UsersList=() => {
//     const [data, setData]=useState()

//     async function loadData(){
//         try{
//             const users =await firestore().collection('users').get()
//             setData(users.docs)
//         }catch(e){
//             console.log(e)
//         }
//     }

//     useEffect(() => {
//         loadData();
//     },[])

// function renderItem({item}){
//     return (
//         <View style={{flexDirection: 'row', margin:10}}>
//             <Text>{item.data().nombre}</Text>
//             <Text>{item.data().email}</Text>
//             <Text>{item.data().phone}</Text>
//         </View>
//     )
// }

// return (
//     <View style={{padding:10}}>
//         <Text>Listado de Usuarios</Text>
//         <FlatList data= {data} renderItem={renderItem} keyExtractor={item => item.nombre}>

//         </FlatList>
//     </View>
// )
// }

// export default UsersList;


//Ejemplo2
// const UserList = (props) => {
//     const [users, setUsers] = useState([]);  
//     useEffect(() => {
//         firestore.db.collection("users").onSnapshot((querySnapshot) => {
//         const users = [];
//         querySnapshot.docs.forEach((doc) => {
//           const { name, email, phone } = doc.data();
//           users.push({
//             id: doc.id,
//             name,
//             email,
//             phone,
//           });
//         });
//         setUsers(users);
//       });
//     }, []);
  
//     return (
//     <View>
//     <Text>Listado de Usuarios</Text>

//       <ScrollView>
//         <Button
//           onPress={() => props.navigation.navigate("CreateUserScreen")}
//           title="Create User"
//         />
//         {users.map((user) => {
//           return (
//             <ListItem
//               key={user.id}
//               bottomDivider
//               onPress={() => {
//                 props.navigation.navigate("UserDetailScreen", {
//                   userId: user.id,
//                 });
//               }}
//             >
//               <ListItem.Chevron />
//               <Avatar.Image source={require("./images/divertida.jpg")} size={50} />
//               <ListItem.Content>
//                 <ListItem.Title>{user.name}</ListItem.Title>
//                 <ListItem.Subtitle>{user.email}</ListItem.Subtitle>
//               </ListItem.Content>
//             </ListItem>
//           );
//         })}
//       </ScrollView>
//      </View>
//     );
//   };
  
//  export default UserList;

