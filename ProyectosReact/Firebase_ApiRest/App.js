import { createNativeStackNavigator } from "@react-navigation/native-stack";
import { NavigationContainer } from "@react-navigation/native";
import Home from './screens/Home'
import UsersList from './screens/UsersList';
import CreateUserScreen from './screens/CreateUserScreen'
const Stack = createNativeStackNavigator();

function MyStack() {
    return (
        <Stack.Navigator>
          <Stack.Screen name="CreateUserScreen" component={CreateUserScreen} />
          <Stack.Screen name="UsersList" component={UsersList} />
        </Stack.Navigator>
      )
      }

export default function App2() {
    return (
     <NavigationContainer>
      <MyStack />
     </NavigationContainer>
    );
}