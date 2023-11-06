import React from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import styles from './styles';
import Box from './Box'

export default function App8() {

  return (
    <View style={styles.container}>
      <Box>#1</Box>
      <Box>#2</Box>
      <Box>#3</Box>
    </View>
  );
}