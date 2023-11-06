import styles from './styles';
import React from "react";
import { View, Text, Button } from "react-native";

export default function Details({navigation}){
return(
    <View style={styles.container}>
        <Text>{navigation.getParam("content")}</Text>
    </View>
)
}

Details.navigationOptions=({navigation}) => ({
    title: navigation.getParam("title"),
    headerRight:(
        <Button  
        title="Comprar" 
        onPress={() => {} }
        disabled={navigation.getParam("stock")=== 0}
        />
    )
})