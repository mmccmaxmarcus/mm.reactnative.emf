import React from 'react' 
import {Text, FlatList, StyleSheet, View} from 'react-native'
export default props => { 


return (
	<View style = {styles.container}>
 		<Text style = {styles.title}> {props.title} </Text> 
 	</View>
)
const styles = create ({
	container: {
	 justifyContent: 'flex-start', 
	 marginBottom: 12, 
	 borderBottomRightRadius: 30, 
	 padding: 5, 
 	}, 	

	title: {
	 fontSize: 20, 
	 fontWeight: 'bold', 
 	}, 	
})