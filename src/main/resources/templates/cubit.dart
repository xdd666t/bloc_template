import 'package:bloc/bloc.dart';

import 'state.dart';

class $nameCubit extends Cubit<$nameState> {
  $nameCubit() : super($nameState().init());
}
