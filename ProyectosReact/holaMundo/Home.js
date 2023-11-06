import styles from './styles';
import React from "react";
import { View, Text, Button } from "react-native";

export default function Home({navigation}){
return(
    <View style={styles.container}>
       <Button title="1er Item" onPress={()=> 
        navigation.navigate("Details",{title:"1er Item", content:"1er contenido", stock: 1})}></Button>
       <Button title="2do Item" onPress={()=> 
        navigation.navigate("Details",{title:"2do Item", content:"2do contenido", stock: 0})}></Button>
       <Button title="3er Item" onPress={()=> 
        navigation.navigate("Details",{title:"3er Item", content:"1er contenido", stock: 12})}></Button>
    </View>
)
}

Home.navigationOptions={
    title: "Home"   
};